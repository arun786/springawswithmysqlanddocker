package com.arun.springawswithmysqlanddocker.repository;

import com.arun.springawswithmysqlanddocker.model.Pricing;

import java.util.List;

public interface PricingDao {

    List<Pricing> getPricing();
}
