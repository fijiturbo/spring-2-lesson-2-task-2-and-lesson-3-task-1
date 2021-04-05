package uz.pdp.spring2lesson2task2andlesson3task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Attachment;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Blog;

import java.util.List;

@Projection(types = Blog.class)
public interface CustomBlog {

    Integer getId();

    String getTitle();

    String getBody();

    List<Attachment> getPhotos();

}
