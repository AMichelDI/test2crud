package mx.com.ids.test2crud.service;




import mx.com.ids.test2crud.model.Country;

import java.util.List;

public interface CountryService {
    Country createCountry(Country country);
    Country updateCountry(Country country);
    List<Country> getAllCountry();
    Country getCountryById(long countryId);
    void deleteCountry(long id);
}
