package com.group4.incidentmanagement.service;

import com.group4.incidentmanagement.dao.IncidentRepository;
import com.group4.incidentmanagement.dao.UserRepository;
import com.group4.incidentmanagement.entities.Incident;
import com.group4.incidentmanagement.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentServiceImpl implements IncidentService {

    @Autowired
    private IncidentRepository incidentRepo;
    @Autowired
    private UserRepository userRepo;

    @Override
    public Incident saveIncident(Incident incident) {

        User foundUser = userRepo.findUserByUserNameAndDepartment(incident.getUser().getUserName(), incident.getUser().getDepartment());
        System.out.println(foundUser);
        if (foundUser != null) {
            incident.setUser(foundUser);
        }
        return incidentRepo.save(incident);
    }

    @Override
    public Incident getIncidentDetailsByUserId(Integer userId) {
        return null;
    }

    @Override
    public Incident updateIncident(Incident incident) {
    	Optional<Incident> inci = incidentRepo.findById(incident.getId());
    	if(inci.isPresent()) {
    		if(inci.get().getUser().getUserId() == incident.getUser().getUserId()) {
    			return incidentRepo.save(incident);
    		}
    	}
    	return incident;
        
    }

    @Override
    public void deleteIncidentById(Integer incidentId) {
        incidentRepo.deleteById(incidentId);
    }
    @Override
    public Incident getIncidentById(Integer incidentId){
        Optional<Incident> incident = incidentRepo.findById(incidentId);
        if(incident.isPresent())
            return incident.get();
        else return null;
    }

    @Override
    public List<Incident> getAllIncidents() {
        Iterable<Incident> incidents = incidentRepo.findAll();
        return new ArrayList<>(makeCollection(incidents));
    }

    public static <E> Collection<E> makeCollection(Iterable<E> iter) {
        Collection<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }
}
