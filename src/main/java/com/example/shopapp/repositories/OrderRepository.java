package com.example.shopapp.repositories;

import com.example.shopapp.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order,Long> {

}
