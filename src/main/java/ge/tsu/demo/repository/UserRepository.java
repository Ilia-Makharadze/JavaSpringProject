package ge.tsu.demo.repository;

import java.util.Optional;
import ge.tsu.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
