package com.arun.springawswithmysqlanddocker.repository;

import com.arun.springawswithmysqlanddocker.model.Pricing;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class PricingDaoImpl implements PricingDao {

    private JdbcTemplate jdbcTemplate;


    @Override
    public List<Pricing> getPricing() {
        return jdbcTemplate.query("select * from pricing", (rs, rn) -> {
            Pricing pricing = new Pricing();
            pricing.setDescription(rs.getString("description"));
            pricing.setId(rs.getString("id"));
            return pricing;
        });
    }
}
