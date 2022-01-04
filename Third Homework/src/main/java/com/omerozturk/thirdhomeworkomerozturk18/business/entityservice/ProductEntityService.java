package com.omerozturk.thirdhomeworkomerozturk18.business.entityservice;

import com.omerozturk.thirdhomeworkomerozturk18.dataAccess.repository.ProductDao;
import com.omerozturk.thirdhomeworkomerozturk18.entities.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@Service
public class ProductEntityService {

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(String id){
        Optional<Product> optionalProduct = productDao.findById(id);
        Product product = null;
        if (optionalProduct.isPresent()){
            product = optionalProduct.get();
        }
        return product;
    }
    public Product save(Product product){
        product = productDao.save(product);

        return product;
    }

    public void delete(Product product){
        productDao.delete(product);
    }

    public void deleteById(String id){
        productDao.deleteById(id);
    }

    public long count(){
        return productDao.count();
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllByPriceBetween(priceGe, priceLe);
    }

    public List<Product> getAllByCategoryId(String id){
        return productDao.getAllByCategoryId(id);
    }
}