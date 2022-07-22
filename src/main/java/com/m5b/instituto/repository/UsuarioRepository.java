/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5b.instituto.repository;

import com.m5b.instituto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Genesis
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
