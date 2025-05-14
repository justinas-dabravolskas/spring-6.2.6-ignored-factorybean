package org.example.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SlowInit {
    public SlowInit(){
        try {
            //make sure that singletonLock is taken for a second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
