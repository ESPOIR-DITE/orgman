package ac.za.cput.adp3.xyzcongolmerate.service.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.impl.UserRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.user.UserService;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class UserServiceImpl implements UserService {

    private UserRepositoryImpl userRepository;
    private static UserServiceImpl userService = null;

    private UserServiceImpl() {
        this.userRepository = UserRepositoryImpl.getUserRepository();
    }

    public static UserServiceImpl getUserService() {
        if (userService == null) userService = new UserServiceImpl();
        return userService;
    }

    @Override
    public User create(User d) {
        return this.userRepository.create(d);
    }

    @Override
    public User read(String userEmail) {
        return this.userRepository.read(userEmail);
    }

    @Override
    public User update(User user) {
        return this.userRepository.update(user);
    }

    @Override
    public void delete(String userEmail) {
        this.userRepository.delete(userEmail);
    }

    @Override
    public Set<User> getAll() {
        return this.userRepository.getAll();
    }
}
