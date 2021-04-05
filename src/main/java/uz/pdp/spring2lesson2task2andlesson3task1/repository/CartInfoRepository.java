package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.CartInfo;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomCartInfo;

@RepositoryRestResource(path = "cartInfo", collectionResourceRel = "cartInfoList", excerptProjection = CustomCartInfo.class)
public interface CartInfoRepository extends JpaRepository<CartInfo, Integer> {


}
