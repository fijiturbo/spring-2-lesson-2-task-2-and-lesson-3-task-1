package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.*;

import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Integer getCustomer();

    Date getDate();

    Integer getCart();
}
