package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Job;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the Job entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobRepository extends Neo4jRepository<Job, String> {}
