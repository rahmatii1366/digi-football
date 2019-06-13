package ir.piana.business.digifootball.core.rest.service;

import io.reactivex.Single;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohamad Rahmati (rahmatii1366@gmail.com)
 * Date: 6/13/2019 11:29 AM
 **/
@RestController
@RequestMapping("user")
public class UserRest {
    @RequestMapping()
    public Single<String> sayHello() {
        return Single.just("welcome user!");
    }
}
