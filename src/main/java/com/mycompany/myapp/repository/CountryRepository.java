package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Country;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the Country entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CountryRepository extends Neo4jRepository<Country, String> {}
