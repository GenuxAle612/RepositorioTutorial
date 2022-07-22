/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.m5b.instituto.service;

import com.m5b.instituto.model.Usuario;
import java.util.List;

/**
 *
 * @author Genesis
 */
public interface UsuarioService {
    public Usuario create (Usuario u);
    public Usuario findById(Integer id);
    public List<Usuario> findAll();
    public void delete(Integer id);
}
