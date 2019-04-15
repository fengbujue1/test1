package main.java.com.fengbujue.test.testSpring.javaWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Bean(name = "car")
    public Car getCar(Engine engine)
    {
        Car car = new Car();
        car.setEngine(engine);
        return car;
    }
    @Bean(name = "engine")
    public Engine getEngine()
    {
        return new Engine("1号");
    }
}
