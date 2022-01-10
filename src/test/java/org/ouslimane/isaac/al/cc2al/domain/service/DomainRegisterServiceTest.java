package org.ouslimane.isaac.al.cc2al.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ouslimane.isaac.al.cc2al.domain.register.Register;
import org.ouslimane.isaac.al.cc2al.domain.repository.RegisterRepository;
import org.ouslimane.isaac.al.cc2al.domain.user.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class DomainRegisterServiceTest {

    private RegisterRepository registerRepository;
    private DomainRegisterService registerService;

    @BeforeEach
    void setUp(){
        registerRepository = mock(RegisterRepository.class);
        registerService = new DomainRegisterService(registerRepository);
    }

    @Test
    void shouldCreateRegister_thenSaveIt(){
        UserRepository userRepository = new InMemoryUserRepository();
        final UserId userId = userRepository.nextId();
        final EmailAddress emailAddress = new EmailAddress("JackSmith@muges.fr");
        final User user = User.of(userId, "Jack","Smith",emailAddress);
        final Job electrician = new Job("electrician");
        final Job plumber = new Job("plumber");
        final List<Job> jobList = Arrays.asList(electrician,plumber);
        final Provider provider = Provider.ofNoProject(user);
        final UUID id = registerService.createRegister(provider);

        verify(registerRepository).save(any(Register.class));

        assertNotNull(id);

    }


}