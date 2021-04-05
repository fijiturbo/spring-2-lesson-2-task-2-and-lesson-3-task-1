package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.User;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomUser;

@RepositoryRestResource(path = "user", collectionResourceRel = "userList", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {

}
