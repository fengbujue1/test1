package main.java.com.fengbujue.test.testSpring.xmlWiring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CarConfig.class)
public class test {

    @Autowired
    Car car;
    @Test
    public  void test()
    {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Car car = (Car) context.getBean("car");
        car.drive();
    }
}
