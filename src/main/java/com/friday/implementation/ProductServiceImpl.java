package com.friday.implementation;

import com.friday.dto.CompanyDTO;
import com.friday.dto.ProductDTO;
import com.friday.entity.Category;
import com.friday.entity.Company;
import com.friday.entity.Product;
import com.friday.enums.Status;
import com.friday.repository.ProductRepository;
import com.friday.service.ProductService;
import com.friday.util.MapperUtil;
import org.springframework.stereotype.Component;


import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {

    private MapperUtil mapperUtil;
    private ProductRepository productRepository;

    public ProductServiceImpl(MapperUtil mapperUtil, ProductRepository productRepository) {
        this.mapperUtil = mapperUtil;
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO save(ProductDTO dto) {
        dto.setProductStatus(Status.ACTIVE);
        Product product=mapperUtil.convert(dto, new Product());
        Product save=productRepository.save(product);
        return mapperUtil.convert(save, new ProductDTO());


    }

    @Override
    public ProductDTO update(ProductDTO dto) throws Exception {
        Product product = productRepository.findById(dto.getId()).orElseThrow(()->new Exception("Product doesn't exist!"));

        Product convertedProduct = mapperUtil.convert(dto, new Product());
        Product updatedProduct = productRepository.save(convertedProduct);

        return mapperUtil.convert(productRepository.findById(dto.getId()), new ProductDTO());
    }

    @Override
    public void delete(long id) {
        Optional<Product> product= productRepository.findById(id);

        if(product.isPresent()) {
            product.get().setEnabled(false);
            product.get().setStatus(Status.PASSIVE);
            productRepository.save(product.get());
        }
}
}
