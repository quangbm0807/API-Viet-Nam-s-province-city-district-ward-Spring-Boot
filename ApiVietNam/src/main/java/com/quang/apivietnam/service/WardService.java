package com.quang.apivietnam.service;

import com.quang.apivietnam.model.Ward;
import com.quang.apivietnam.repository.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardService {
    @Autowired
    WardRepository repository;

    public List<Ward> getAll() {
        return repository.findAll();
    }

    public Ward findByID(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
