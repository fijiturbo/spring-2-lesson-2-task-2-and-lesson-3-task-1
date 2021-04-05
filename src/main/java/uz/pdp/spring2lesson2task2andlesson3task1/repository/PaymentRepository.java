package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Payment;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomPayment;

@RepositoryRestResource(path = "payment", collectionResourceRel = "paymentList", excerptProjection = CustomPayment.class)
public interface PaymentRepository extends JpaRepository<Payment, Integer> {


}
