package com.countryservice.demo.controller;

import com.countryservice.demo.beans.Country;
import com.countryservice.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class CountryController {
//CountryService countryService=new countryService();

    @Autowired
    CountryService countryService;

    @GetMapping("/getcountries")
    public List getCountries()
    {
        return countryService.getAllCountries();
    }

    @GetMapping("/getcountries/{id}")
    public Country getCountryById(@PathVariable(value="id") int id)
    {
        return countryService.getCountrybyID(id);

    }
    @GetMapping("/getcountries/countryname")
    public Country getCountryByName(@RequestParam(value="name") String countryName)
    {
        return countryService.getCountrybyName(countryName);

    }
    @PostMapping("/addcountry")
            public Country addCountry(@RequestBody Country country)
    {
          return countryService.addCountry(country);
    }
    @PutMapping("/updatecountry")
    public Country updateCountry(@RequestBody Country country)
    {
        return countryService.addCountry(country);
    }
    @DeleteMapping("/deletecountry/{id}")
    public AddResponse deleteCountry(@PathVariable(value="id")  int id)
    {
        return countryService.deleteCountry(id);
    }
}
