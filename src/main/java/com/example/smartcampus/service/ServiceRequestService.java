package com.example.smartcampus.service;

import com.example.smartcampus.model.ServiceRequest;

import java.util.List;

public interface ServiceRequestService {

    ServiceRequest createRequest(ServiceRequest request);

    List<ServiceRequest> getRequestsByStudent(Long studentId);

    List<ServiceRequest> getAllRequests();

    ServiceRequest updateStatus(Long requestId,String status);

}
