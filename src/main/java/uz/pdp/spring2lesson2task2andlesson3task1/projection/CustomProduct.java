package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Attachment;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Product;

import java.util.List;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getDescription();

    Integer getCategory();

    double getPrice();

    List<Attachment> getPhotos();
}
