package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Feature;

@Projection(types = Feature.class)
public interface CustomFeature {

    Integer getId();

    String getName();

    String getType();

    Integer getCategory();

}
