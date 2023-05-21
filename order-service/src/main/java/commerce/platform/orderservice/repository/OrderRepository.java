package commerce.platform.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import commerce.platform.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
