package main.java.com.fengbujue.test;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("aa")
public class AA {
    @RequestMapping("aaa")
    public String aa(){
        return "hello";
    }
}
