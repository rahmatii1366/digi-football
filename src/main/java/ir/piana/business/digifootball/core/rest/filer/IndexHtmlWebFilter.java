package ir.piana.business.digifootball.core.rest.filer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @author Mohamad Rahmati (rahmatii1366@gmail.com)
 * Date: 6/12/2019 4:19 PM
 **/
@Component
@PropertySource("classpath:/application.properties")
public class IndexHtmlWebFilter implements WebFilter {
    @Value("${spring.webflux.static-path-pattern.default}")
    private String index;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        if (exchange.getRequest().getURI().getPath().equals("/")) {
            return chain.filter(exchange.mutate().request(
                    exchange.getRequest().mutate().path(index).build())
                    .build());
        }

        return chain.filter(exchange);
    }
}

