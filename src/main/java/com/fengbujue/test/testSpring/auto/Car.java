package main.java.com.fengbujue.test.testSpring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;
    public void drive(){
        engine.start();
        System.out.println("车子出发了");
    }

}
