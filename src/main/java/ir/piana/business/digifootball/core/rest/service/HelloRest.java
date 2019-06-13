package ir.piana.business.digifootball.core.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohamad Rahmati (rahmatii1366@gmail.com)
 * Date: 6/13/2019 11:29 AM
 **/
@RestController
@RequestMapping("hello")
public class HelloRest {
    @RequestMapping()
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return String.format("Hello %s", name);
    }
}
