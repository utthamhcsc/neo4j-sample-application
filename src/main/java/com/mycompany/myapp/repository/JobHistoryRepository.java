package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.JobHistory;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the JobHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobHistoryRepository extends Neo4jRepository<JobHistory, String> {}
