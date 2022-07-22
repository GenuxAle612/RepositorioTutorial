/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5b.instituto.service;

import com.m5b.instituto.model.Rol;
import com.m5b.instituto.repository.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Genesis
 */
@Service
public class RolServiceImpl implements RolService{
    
    @Autowired
    RolRepository rolRepository;
    
    @Override
    public Rol create(Rol r) {
        return rolRepository.save(r);
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id).orElse(new Rol());
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }
    
}
