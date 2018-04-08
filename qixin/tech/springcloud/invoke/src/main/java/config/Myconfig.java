package config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * Created by qixin on 2018/1/21.
 */
public class Myconfig {
    @Bean
    public IRule getRule() {
        return new MyRule();
    }
}
