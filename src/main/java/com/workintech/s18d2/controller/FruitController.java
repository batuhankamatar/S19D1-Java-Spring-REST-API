package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/fruit")
@Validated
public class FruitController {
    private final FruitService fruitService;

    @GetMapping
    public List<Fruit> getByPriceAsc() {
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit getById(@PathVariable @Positive Long id) {
        return fruitService.getById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getByPriceDesc() {
        return fruitService.getByPriceDesc();
    }

    @PostMapping
    public Fruit save(@RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }

    @GetMapping("/name/{name}")
    public List<Fruit> searchByName(@PathVariable String name) {
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable Long id) {
        return fruitService.delete(id);
    }
}