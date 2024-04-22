package asteric.in.Day2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import asteric.in.Day2.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
