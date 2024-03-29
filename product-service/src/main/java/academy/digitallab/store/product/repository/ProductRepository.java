package academy.digitallab.store.product.repository;


import academy.digitallab.store.product.repository.entity.Category;
import academy.digitallab.store.product.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
