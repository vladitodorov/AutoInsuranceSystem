package org.todorov.ais.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.todorov.ais.model.entity.RoleEntity;
import org.todorov.ais.model.entity.UserEntity;
import org.todorov.ais.repository.RoleRepository;
import org.todorov.ais.repository.UserRepository;

import java.util.List;
import java.util.Set;

@Component
public class DBInit implements CommandLineRunner {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public DBInit(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        //INSERT INITIAL ROLES
        if(roleRepository.count() == 0){
            RoleEntity roleAdmin = new RoleEntity("ADMIN");
            roleRepository.save(roleAdmin);
            RoleEntity roleManager = new RoleEntity("MANAGER");
            roleRepository.save(roleManager);
            RoleEntity roleUser = new RoleEntity(("USER"));
            roleRepository.save(roleUser);
        }

        //INSERT SYSTEM ADMINISTRATOR
        if(userRepository.count() == 0){
            List<RoleEntity> roles = roleRepository.findAll();
            UserEntity administrator = new UserEntity("administrator", passwordEncoder.encode("admin"),"Vladislav","","Todorov","vktod81@gmail.com",roles);
            userRepository.save(administrator);
        }
    }
}
