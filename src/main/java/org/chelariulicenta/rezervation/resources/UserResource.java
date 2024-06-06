package org.chelariulicenta.rezervation.resources;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "UserFeignClient", url = "http://localhost:8090/api/user")
public interface UserResource {

    @GetMapping("/getUser/{id}")
    VUser getUserById(@PathVariable("id") Integer id);

    @GetMapping("/getAllUsers")
    List<VUser> getUsers();

    @DeleteMapping("/deleteUserById/{id}")
    void deleteUserById(@PathVariable("id") Integer id);

    @DeleteMapping("/deleteUserByEmail/{email}")
    void deleteUserByEmail(@PathVariable("email") String email);

    //USERI NORMALI
    @PostMapping("/saveUser")
    void saveUser(@RequestBody VUser user);

}
