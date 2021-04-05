package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Cart;

import java.util.Date;

@Projection(types = Cart.class)
public interface CustomCart {

    Integer getId();

    Integer getCustomer();

    Date getCreatedDate();

}
