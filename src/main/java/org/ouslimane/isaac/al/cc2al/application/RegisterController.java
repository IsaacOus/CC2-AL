package org.ouslimane.isaac.al.cc2al.application;

import org.ouslimane.isaac.al.cc2al.application.request.AddProviderRequest;
import org.ouslimane.isaac.al.cc2al.application.request.CreateProviderRequest;
import org.ouslimane.isaac.al.cc2al.application.request.CreateRegisterRequest;
import org.ouslimane.isaac.al.cc2al.application.response.CreateRegisterResponse;
import org.ouslimane.isaac.al.cc2al.domain.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService){
        this.registerService = registerService;
    }

    @PostMapping
    CreateRegisterResponse createRegister(@RequestBody CreateProviderRequest request){
        UUID id = registerService.createRegister(request.getProvider());
        return new CreateRegisterResponse(id);
    }

    @PostMapping(value = "/{id}/providers")
    void addProvider(@PathVariable UUID id, @RequestBody AddProviderRequest request){
        registerService.addProvider(id, request.getProvider());
    }

    @PostMapping("/{id}/complete")
    void completeRegister(@PathVariable UUID id){
        registerService.completeRegister(id);
    }

}
