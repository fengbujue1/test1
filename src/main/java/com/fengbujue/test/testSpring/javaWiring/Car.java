package main.java.com.fengbujue.test.testSpring.javaWiring;


public class Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("1号车子出发了");
    }

}
