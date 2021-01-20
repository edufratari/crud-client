package com.github.edufratari.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.edufratari.crudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}