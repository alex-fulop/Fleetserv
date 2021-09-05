package com.fulopcorp.fleetserv.repositories;

import com.fulopcorp.fleetserv.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
