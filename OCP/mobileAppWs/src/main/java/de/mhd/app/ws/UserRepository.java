package de.mhd.app.ws;

import de.mhd.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mohammed
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
    UserEntity findByEmail(String email);
    
}
