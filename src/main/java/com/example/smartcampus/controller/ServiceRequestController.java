package com.example.smartcampus.controller;


import com.example.smartcampus.model.ServiceRequest;
import com.example.smartcampus.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/requests")
@CrossOrigin(origins = "*")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestService serviceRequestService;

    @PostMapping
    public ServiceRequest createRequest(@RequestBody ServiceRequest request) {
        return serviceRequestService.createRequest(request);
    }

    @GetMapping
    public List<ServiceRequest> getAllRequests(){
        return serviceRequestService.getAllRequests();
    }

    @GetMapping("/student/{studentId}")
    public List<ServiceRequest> getRequestsByStudent(@PathVariable Long studentId){
        return serviceRequestService.getRequestsByStudent(studentId);
    }

    @PutMapping("/{id}/status")
    public ServiceRequest updateStatus(
            @PathVariable Long id,
            @RequestParam String status
    ){
        return serviceRequestService.updateStatus(id, status);
    }
}
