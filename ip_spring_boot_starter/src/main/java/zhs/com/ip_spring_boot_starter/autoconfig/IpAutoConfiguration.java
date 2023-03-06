package zhs.com.ip_spring_boot_starter.autoconfig;

import zhs.com.ip_spring_boot_starter.service.IpCountService;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
public class IpAutoConfiguration {

    @Bean
    public IpCountService ipCountService(){
        return new IpCountService();

    }
}
