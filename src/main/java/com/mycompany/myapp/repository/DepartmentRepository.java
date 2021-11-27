package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Department;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends Neo4jRepository<Department, String> {}
