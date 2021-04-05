package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Detail;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomDetail;

@RepositoryRestResource(path = "detail", collectionResourceRel = "detailList", excerptProjection = CustomDetail.class)
public interface DetailRepository extends JpaRepository<Detail, Integer> {


}
