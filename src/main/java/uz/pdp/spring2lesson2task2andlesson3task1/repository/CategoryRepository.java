package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Category;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomCategory;

@RepositoryRestResource(path = "category", collectionResourceRel = "categoryList", excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {


}
