package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Cart;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomCart;

@RepositoryRestResource(path = "cart", collectionResourceRel = "cartList", excerptProjection = CustomCart.class)
public interface CartRepository extends JpaRepository<Cart, Integer> {


}
