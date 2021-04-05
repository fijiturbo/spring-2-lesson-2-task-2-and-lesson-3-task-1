package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Order;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomOrder;

@RepositoryRestResource(path = "order", collectionResourceRel = "orderList", excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {


}
