package com.hiddenfounders.recrutement.shop.service;

import com.hiddenfounders.recrutement.shop.model.Shop;
import com.hiddenfounders.recrutement.shop.repository.ShopRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopService {


    private final ShopRepository repository;

    public ShopService(ShopRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(path = "/shop/all", method = RequestMethod.GET)
    public List<Shop> all() {
        return repository.findAll();
    }

    @RequestMapping(path = "/shop/{id}", method = RequestMethod.GET)
    public Shop byId(@PathVariable String id) {
        return repository.findOne(id);
    }
}
