package main.java.com.fengbujue.test.testSpring.xmlWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("applicationContext.xml")
public class CarConfig {
    @Bean(name = "car")
    public Car getCar(Engine engine)
    {
        Car car = new Car();
        car.setEngine(engine);
        return car;
    }
}
