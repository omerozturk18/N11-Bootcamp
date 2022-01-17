package com.omerozturk.secondHomeWork.service.entityservice;

import com.omerozturk.secondHomeWork.dao.ProductDao;
import com.omerozturk.secondHomeWork.dto.CountOfProductCommentsDto;
import com.omerozturk.secondHomeWork.dto.ProductDetailDto;
import com.omerozturk.secondHomeWork.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ProductEntityService {

    @Autowired
    private ProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Product findById(Long id){
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

    public void deleteById(Long id){
        productDao.deleteById(id);
    }

    public long count(){
        return productDao.count();
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe){
        return productDao.findAllByPriceBetween(priceGe, priceLe);
    }

    public List<Product> findAllProductCategoryBreaking(Long breaking) {
        return productDao.findAllByCategory_Breaking(breaking);
    }

    public List<CountOfProductCommentsDto> findAllCountOfProductComments() {
        return productDao.findAllCountOfProductComments();
    }
    public List<Product> getAllByCategoryId(Long id){
        return productDao.getAllByCategory_Id(id);
    }
}