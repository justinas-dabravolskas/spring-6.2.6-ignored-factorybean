package org.example.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Component2Factory implements FactoryBean<Component2> {
    @Override
    public Component2 getObject() {
        return new Component2(){};
    }

    @Override
    public Class<?> getObjectType() {
        return Component2.class;
    }
}
