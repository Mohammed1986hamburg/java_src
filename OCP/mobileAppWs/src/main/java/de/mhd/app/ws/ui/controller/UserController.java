package de.mhd.app.ws.ui.controller;

import de.mhd.app.ws.service.UserService;
import de.mhd.app.ws.shared.dto.UserDto;
import de.mhd.app.ws.ui.model.request.UserDetailsRequestModel;
import de.mhd.app.ws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("users")     //            http://localhost:1986/users
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"/", ""})
    public String getUser() {

        return "Hi Mohammed1, get user was called";

    }

    //@Valid 
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

//     **********************************************
//    // to get info from URI
//    @GetMapping("/{name}")    // must the same varible name of under parameter 
//    public String getUser(@PathVariable String name) {
//
//        return String.format("Hi %s, get user was called", name) ;
//    }
//     **********************************************
//      // to send json, only by sending object
//      @GetMapping({"/", ""})
//        public test getUser() {
//
//
//        return new test(2, "ahmad");
//
//    }
//     **********************************************
//to use   ResponseEntity<>(returnValue, HttpStatus.CREATED)
//        @PostMapping("/test")
//        public ResponseEntity<UserRest> myTestCreateUser(@RequestBody UserDetailsRequestModel UserDetails) {
//
//        UserRest returnValue = new UserRest();
//
//        UserDto userDto = new UserDto();
//        BeanUtils.copyProperties(UserDetails, userDto);
//
//        UserDto createdUser = userService.createUser(userDto); 
//        BeanUtils.copyProperties(createdUser, returnValue);
//
//        return new ResponseEntity<>(returnValue, HttpStatus.CREATED);
//
//    }
//      Get all or by id     >>>>>    HttpStatus.OK           Code: 200 OK
//      put                  >>>>>    HttpStatus.OK           Code: 200 OK
//      post                 >>>>>    HttpStatus.CREATED      Code: 201 CREATED and 409 CONFLICT
//      Delete                >>>>>    HttpStatus.NO_CONTENT  Code: 204 NO CONTENT
//1. Create :
//HTTP Method: POST, URL: /user/article
//HTTP Response Status Code: 201 CREATED and 409 CONFLICT
//
//2. Read :
//HTTP Method: GET, URL: /user/article/{id} (Fetches article by id)
//HTTP Method: GET, URL: /user/articles (Fetches all articles)
//HTTP Response Status Code: 200 OK
//
//3. Update :
//HTTP Method: PUT, URL: /user/article
//HTTP Response Status Code: 200 OK
//
//4. Delete :
//HTTP Method: DELETE, URL: /user/article/{id}
//HTTP Response Status Code: 204 NO CONTENT
//     **********************************************
