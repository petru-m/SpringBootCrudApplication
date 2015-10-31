package petru.miftode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import petru.miftode.entity.User;
import petru.miftode.repository.UserRepository;



/**
 * Created by petru on 29.10.2015.
 */

public class StartupRunner implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user=new User();
        user.setFirst_name("Petru");
        user.setLast_name("Miftode");
        user.setEmail("petru.miftode@assist.ro");
        userRepository.save(user);
    }
}
