package org.ouslimane.isaac.al.cc2al.infrastructure;

import org.ouslimane.isaac.al.cc2al.domain.repository.RegisterRepository;
import org.ouslimane.isaac.al.cc2al.domain.service.DomainRegisterService;
import org.ouslimane.isaac.al.cc2al.domain.service.RegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    RegisterService registerService(RegisterRepository registerRepository){
        return new DomainRegisterService(registerRepository);
    }

}
