package com.example.jpaStreamer.controller;

import com.example.jpaStreamer.entity.SoftwareSales;
import com.example.jpaStreamer.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesController{

    @Autowired
    SalesService salesService;


    @PostMapping("/addSoftware")
    public SoftwareSales addSoftware(@RequestBody SoftwareSales softwareSales)
    {
      return   salesService.addSales(softwareSales);

    }


    @GetMapping("/getSoftware")
    public List<SoftwareSales> getSoftware()
    {
        return  salesService.getSales();
    }

    @GetMapping("/getSoftware/currency/{cur}")
    public List<SoftwareSales> getSoftwareByCurrency(@PathVariable String cur)
    {
        return  salesService.getSalesByCurrency(cur);
    }
}
