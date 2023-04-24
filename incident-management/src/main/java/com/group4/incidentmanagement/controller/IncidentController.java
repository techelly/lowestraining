package com.group4.incidentmanagement.controller;

import com.group4.incidentmanagement.entities.Incident;
import com.group4.incidentmanagement.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class IncidentController {
    @Autowired
    private IncidentService incidentService;

    @GetMapping("/getallincidents")
    List<Incident> getAllIncidents() {
        return incidentService.getAllIncidents();
    }


    //Create or save or add
    //http://localhost:8080/addincident
    @PostMapping("/addincident")
    public Incident createIncident(@RequestBody Incident incident) {
        return incidentService.saveIncident(incident);
    }

    //Retrieve or get student on the basis of Primary Key
    //http://localhost:8080/getstudentbyid/1
    @GetMapping("/getincidentbyid/{id}")
    public Incident retrieveIncident(@PathVariable("id") Integer incidentId)
    {
        return incidentService.getIncidentById(incidentId);
    }
}
