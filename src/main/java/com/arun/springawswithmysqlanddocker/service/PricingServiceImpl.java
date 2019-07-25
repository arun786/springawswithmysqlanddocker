package com.arun.springawswithmysqlanddocker.service;

import com.arun.springawswithmysqlanddocker.model.Pricing;
import com.arun.springawswithmysqlanddocker.repository.PricingDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PricingServiceImpl implements PricingService {

    private PricingDao pricingDao;

    @Override
    public List<Pricing> getPricing() {
        return pricingDao.getPricing();
    }
}
