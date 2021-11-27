package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Location;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the Location entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LocationRepository extends Neo4jRepository<Location, String> {}
