package byAJ.Securex.setup;

import byAJ.Securex.models.Roles;
import byAJ.Securex.models.Users;
import byAJ.Securex.repositories.RolesRepository;
import byAJ.Securex.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    RolesRepository roleRepo;
    @Autowired
    UsersRepository userRepo;

    @Override
    public void run(String... strings) {
        Roles role = new Roles();
        role.setRoleName("USER");
        roleRepo.save(role);

        Users user = new Users();
        user.setUserName("user");
        user.setPassword("password");
        user.AddRole(roleRepo.findRolesByRoleName("USER"));
        userRepo.save(user);
         user = new Users();
           user.setUserName("user1");
           user.setPassword("pass");
           user.AddRole(roleRepo.findRolesByRoleName("USER"));
           userRepo.save(user);
    }
}