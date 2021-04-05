package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.*;

import java.util.Date;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    Integer getCustomer();

    String getMessage();

    Date getDate();

    double getMark();

    Integer getProduct();

}
