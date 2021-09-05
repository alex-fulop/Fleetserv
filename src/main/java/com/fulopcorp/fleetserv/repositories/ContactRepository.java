package com.fulopcorp.fleetserv.repositories;

import com.fulopcorp.fleetserv.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
