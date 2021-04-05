package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Blog;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomBlog;

@RepositoryRestResource(path = "blog", collectionResourceRel = "blogList", excerptProjection = CustomBlog.class)
public interface BlogRepository extends JpaRepository<Blog, Integer> {


}
