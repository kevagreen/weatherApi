package com.tts.weather.demo.repository;

import com.tts.weather.demo.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZipCodeRepository extends CrudRepository<ZipCode,Long> {

    List<ZipCode> findAll();
    List<ZipCode> findByZipCode(String zipCode);
    void deleteById(Long id);


}
