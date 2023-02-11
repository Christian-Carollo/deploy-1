package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/basic")
public class BasicController {

    @Value("${myCustomEnvs.devName}")
    String devName;

    @GetMapping("/name")
    public String getDevName(){
        return devName;
    }
}
