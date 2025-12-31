package com.example.smartcampus.repository;

import com.example.smartcampus.model.ServiceRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRequestRepository extends JpaRepository<ServiceRequest,Long> {
    List<ServiceRequest> findByStudentId(Long studentid);
    List<ServiceRequest> findByStatus(String status);

}
