package com.example.MyFastProduct.controller;


import com.example.MyFastProduct.model.Product;
import com.example.MyFastProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }




    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }


    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable long id) {
        return productService.getProduct(id);
    }


    @GetMapping("/get/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PostMapping("/update")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }


}
