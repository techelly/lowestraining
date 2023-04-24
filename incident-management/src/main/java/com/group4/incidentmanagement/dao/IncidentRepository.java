package com.group4.incidentmanagement.dao;

import com.group4.incidentmanagement.entities.Incident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends CrudRepository<Incident, Integer> {

}
