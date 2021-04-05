package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Attachment;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFirstname();

    String getLastname();

    String getEmail();

    String getPhoneNumber();

    Attachment getPhoto();
}
