package dev.posadskiy.spring.balancer;

import dev.posadskiy.spring.balancer.giver.PayPalGiver;
import dev.posadskiy.spring.balancer.storage.LocalStorage;
import dev.posadskiy.spring.balancer.storage.SiteStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public PayPalGiver payPalGiver() {
        PayPalGiver giver = new PayPalGiver();
        giver.setStorage(siteStorage());
        return giver;
    }

    @Bean
    public SiteStorage siteStorage() {
        return new SiteStorage();
    }

    @Bean
    public LocalStorage localStorage() {
        return new LocalStorage();
    }

}
