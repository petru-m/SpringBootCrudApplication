package petru.miftode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import petru.miftode.entity.User;

/**
 * Created by petru on 29.10.2015.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    public User findUserById(Long id);

}
