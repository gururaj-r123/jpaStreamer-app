package com.example.jpaStreamer.service;

import com.example.jpaStreamer.entity.SoftwareSales;
import com.example.jpaStreamer.repository.SoftwareSalesRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.stream.Collectors;

@Service
public class SalesService {

    @Autowired
    JPAStreamer jpaStreamer;

    @Autowired
    SoftwareSalesRepository softwareSalesRepository;


    public SoftwareSales addSales(SoftwareSales softwareSales)
    {
        return  softwareSalesRepository.save(softwareSales);
    }


    public List<SoftwareSales> getSales()
    {
        return jpaStreamer.stream(SoftwareSales.class).collect(Collectors.toList());
    }


    public List<SoftwareSales> getSalesByCurrency(String currency)
    {
        return jpaStreamer.stream(SoftwareSales.class).filter(s->s.getCurrency().equals(currency))
                .collect(Collectors.toList());
    }


}
