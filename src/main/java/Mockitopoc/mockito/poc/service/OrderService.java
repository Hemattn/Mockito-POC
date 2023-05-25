package Mockitopoc.mockito.poc.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
    @Autowired
    private ProductService productService;
    public String getProductName(){
        return  productService.getProductName();
    }
}
