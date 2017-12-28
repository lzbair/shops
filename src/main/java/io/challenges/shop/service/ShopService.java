package io.challenges.shop.service;

import io.challenges.shop.repository.ShopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ShopService {


    private final ShopRepository repository;

    public ShopService(ShopRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(path = "/shop/all", method = RequestMethod.GET)
    public ResponseEntity all() {
        return ResponseEntity.ok(repository.findAll());
    }

    @RequestMapping(path = "/shop/{id}", method = RequestMethod.GET)
    public ResponseEntity byId(@PathVariable String id) {
        return ResponseEntity.ok(repository.findOne(id));
    }
}
