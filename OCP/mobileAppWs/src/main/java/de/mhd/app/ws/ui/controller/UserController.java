package de.mhd.app.ws.ui.controller;

import de.mhd.app.ws.service.UserService;
import de.mhd.app.ws.shared.dto.UserDto;
import de.mhd.app.ws.ui.model.request.UserDetailsRequestModel;
import de.mhd.app.ws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mohammed
 */
@RestController
@RequestMapping("users")      //            http://localhost:8080/users
public class UserController {
    
    @Autowired
    UserService userService; 

    @GetMapping
    public String getUser() {

        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel UserDetails) {
        
        UserRest returnValue = new UserRest();
        
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(UserDetails, userDto);
        
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        
        return returnValue;
        
    }

    @PutMapping
    public String updateUser() {

        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {

        return "delete user was called";
    }

}
