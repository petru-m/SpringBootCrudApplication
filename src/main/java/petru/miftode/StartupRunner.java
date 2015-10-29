package petru.miftode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import petru.miftode.entity.User;
import petru.miftode.repository.UserRepository;

import javax.sql.DataSource;

/**
 * Created by petru on 29.10.2015.
 */

public class StartupRunner implements CommandLineRunner{
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... args) throws Exception {
        /*logger.info("Hello World!");
        logger.info("dataSource " + dataSource.toString());*/

        User user=new User();
        user.setFirst_name("Petru");
        user.setLast_name("Miftode");
        user.setEmail("petru.miftode@asssit.ro");
        userRepository.save(user);
    }
}
