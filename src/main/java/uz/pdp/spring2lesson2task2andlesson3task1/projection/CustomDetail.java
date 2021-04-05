package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.*;

@Projection(types = Detail.class)
public interface CustomDetail {

    Integer getId();

    Integer getProduct();

    Integer getFeature();

    String getValue();
}
