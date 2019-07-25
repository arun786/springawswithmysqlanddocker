package com.arun.springawswithmysqlanddocker.controller;

import com.arun.springawswithmysqlanddocker.model.Pricing;
import com.arun.springawswithmysqlanddocker.service.PricingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PricingController {

    private PricingService pricingService;

    @GetMapping("/pricings/v1/pricing")
    ResponseEntity<List<Pricing>> getPricing() {
        List<Pricing> pricing = pricingService.getPricing();
        return ResponseEntity.ok(pricing);
    }
}
