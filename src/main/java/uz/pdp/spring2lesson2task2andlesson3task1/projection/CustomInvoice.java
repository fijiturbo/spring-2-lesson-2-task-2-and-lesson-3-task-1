package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.*;

import java.util.Date;

@Projection(types = Invoice.class)
public interface CustomInvoice {

    Integer getId();

    Integer getCustomer();

    Integer getOrder();

    double getPrice();

    Date getCreatedDate();

    Date getDueDate();

    Integer getOrderStatus();
}
