package lk.ijse.gdse68.jwt.repository;

import lk.ijse.gdse68.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String username);

    boolean existsByEmail(String username);

    int deleteByEmail(String username);
}
