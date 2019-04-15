package main.java.com.fengbujue.test.testSpring.xmlWiring;


public class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("发动机"+name+"启动了");
    }
}
