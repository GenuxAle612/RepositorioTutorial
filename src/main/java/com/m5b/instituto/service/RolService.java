/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5b.instituto.service;

import com.m5b.instituto.model.Rol;
import java.util.List;

/**
 *
 * @author Genesis
 */
public interface RolService {
    public Rol create (Rol r);
    public Rol findById(Integer id);
    public List<Rol> findAll();
    public void delete(Integer id);
}
