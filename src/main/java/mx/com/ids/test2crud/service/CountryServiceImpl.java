package mx.com.ids.test2crud.service;


import mx.com.ids.test2crud.exception.ResourceNotFoundException;
import mx.com.ids.test2crud.model.Country;
import mx.com.ids.test2crud.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public Country updateCountry(Country country) {
        Optional<Country> countryDb = this.countryRepository.findById(country.getCountryId());
        if (countryDb.isPresent()){
            Country countryUpdate = countryDb.get();
            countryUpdate.setCountryId(country.getCountryId());
            countryUpdate.setCountryCode(country.getCountryCode());
            countryUpdate.setName(country.getName());
            countryRepository.save(countryUpdate);
            return countryUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + country.getCountryId());
        }
    }

    @Override
    public List<Country> getAllCountry() {
        return this.countryRepository.findAll();
    }

    @Override
    public Country getCountryById(long countryId) {
        Optional<Country> countryDb = this.countryRepository.findById(countryId);
        if(countryDb.isPresent()){
            return countryDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + countryId);
        }
    }

    @Override
    public void deleteCountry(long countryId) {
        Optional<Country> countryDb = this.countryRepository.findById(countryId);
        if(countryDb.isPresent()){
            this.countryRepository.delete(countryDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id: " + countryId);
        }
    }
}
