package uz.pdp.online.m6l2task2datarestpcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.m6l2task2datarestpcmarket.entity.Product;
import uz.pdp.online.m6l2task2datarestpcmarket.projection.CustomProduct;


@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
