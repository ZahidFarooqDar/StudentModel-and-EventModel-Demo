package com.example.University.Event.Management.repository;

import com.example.University.Event.Management.model.EventManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEventRepository extends JpaRepository<EventManagement, Integer> {
    public List<EventManagement> findByEventdate(String date);
}

