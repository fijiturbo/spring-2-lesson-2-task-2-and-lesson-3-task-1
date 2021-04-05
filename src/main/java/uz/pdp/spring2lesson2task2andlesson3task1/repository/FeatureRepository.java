package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Feature;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomFeature;

@RepositoryRestResource(path = "feature", collectionResourceRel = "featureList", excerptProjection = CustomFeature.class)
public interface FeatureRepository extends JpaRepository<Feature, Integer> {


}
