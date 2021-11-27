package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Region;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the Region entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RegionRepository extends Neo4jRepository<Region, String> {}
