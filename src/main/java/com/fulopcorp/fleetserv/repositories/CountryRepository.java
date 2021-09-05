package com.fulopcorp.fleetserv.repositories;

import com.fulopcorp.fleetserv.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
