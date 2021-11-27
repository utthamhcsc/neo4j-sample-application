package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Task;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the Task entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TaskRepository extends Neo4jRepository<Task, String> {}
