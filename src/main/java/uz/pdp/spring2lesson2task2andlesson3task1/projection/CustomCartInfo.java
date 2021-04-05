package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.CartInfo;

@Projection(types = CartInfo.class)
public interface CustomCartInfo {

    Integer getId();

    Integer getProduct();

    Integer getCart();

    double getQty();
}
