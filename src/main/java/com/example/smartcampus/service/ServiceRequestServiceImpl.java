package com.example.smartcampus.service;

import com.example.smartcampus.model.ServiceRequest;
import com.example.smartcampus.repository.ServiceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServiceRequestServiceImpl implements ServiceRequestService {

    @Autowired
    private ServiceRequestRepository serviceRequestRepository;

    @Override
    public ServiceRequest createRequest(ServiceRequest request){
        request.setStatus("PENDING");
        request.setCreatedAt(LocalDateTime.now());
        return serviceRequestRepository.save(request);
    }

    @Override
    public List<ServiceRequest> getRequestsByStudent(Long studentId){
        return serviceRequestRepository.findByStudentId(studentId);
    }

    @Override
    public List<ServiceRequest> getAllRequests(){
        return serviceRequestRepository.findAll();
    }

    @Override
    public ServiceRequest updateStatus(Long requestId,String status){
        ServiceRequest req = serviceRequestRepository.findById(requestId)
                .orElseThrow(()->new RuntimeException("Request not found"));
        req.setStatus(status);
        return serviceRequestRepository.save(req);
    }
}
