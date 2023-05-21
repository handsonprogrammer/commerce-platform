package commerce.platform.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import commerce.platform.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
