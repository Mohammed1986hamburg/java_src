
package de.mhd.app.ws.service.impl;

import de.mhd.app.ws.UserRepository;
import de.mhd.app.ws.io.entity.UserEntity;
import de.mhd.app.ws.service.UserService;
import de.mhd.app.ws.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author mohammed
 */

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        
        
        /**
         * check if exist by email
         * @return RuntimeException("Record already exists")
         */
        UserEntity existUserByEmail = userRepository.findByEmail(user.getEmail());
        if(existUserByEmail != null) throw new RuntimeException("Record already exists");
       
        /**
         * create new user
         */
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        
        userEntity.setEncryptedPassword("test password");
        userEntity.setUserId("test userId");
        
        UserEntity storedUserDetails = userRepository.save(userEntity);
        
        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValue);
        
        
        System.out.println("UserServiceImpl createUser done");
        return returnValue;
    }
    
}
