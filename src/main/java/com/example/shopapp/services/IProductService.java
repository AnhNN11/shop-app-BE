package com.example.shopapp.services;

import com.example.shopapp.dtos.ProductDTO;
import com.example.shopapp.exceptions.DataNotFoundException;
import com.example.shopapp.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    public Product createProduct(ProductDTO productDTO) throws DataNotFoundException;
    Product getProductById(long id) throws DataNotFoundException;
    Page<Product> getAllProducts(PageRequest pageRequest);

    Product updateProduct(long id,ProductDTO productDTO) throws DataNotFoundException;
    void deleteProduct(long id);

    boolean existByName(String name);
}
