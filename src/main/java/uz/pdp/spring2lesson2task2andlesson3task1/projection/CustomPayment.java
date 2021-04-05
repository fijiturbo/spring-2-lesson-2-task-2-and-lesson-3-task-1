package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.*;

import java.util.Date;

@Projection(types = Payment.class)
public interface CustomPayment {

    Integer getId();

    double getPrice();

    Integer getUser();

    Integer getInvoice();

    Date getDate();

}
