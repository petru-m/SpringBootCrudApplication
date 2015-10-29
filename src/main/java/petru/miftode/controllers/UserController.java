package petru.miftode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import petru.miftode.entity.User;
import petru.miftode.repository.UserRepository;

/**
 * Created by petru on 29.10.2015.
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return userRepository.findUserById(id);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user, @PathVariable Long id){
        User updateUser = userRepository.findUserById(id);
        updateUser.setFirst_name(user.getFirst_name());
        updateUser.setLast_name(user.getLast_name());
        updateUser.setEmail(user.getEmail());
        return userRepository.save(updateUser);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id){
         userRepository.delete(id);
    }
}
