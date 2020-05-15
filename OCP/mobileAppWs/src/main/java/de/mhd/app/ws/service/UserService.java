package de.mhd.app.ws.service;

import de.mhd.app.ws.shared.dto.UserDto;

/**
 *
 * @author mohammed
 */
public interface UserService {
    
    UserDto createUser(UserDto user);
    
    
}
