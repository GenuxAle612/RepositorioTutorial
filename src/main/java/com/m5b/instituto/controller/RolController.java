/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m5b.instituto.controller;

import com.m5b.instituto.model.Rol;
import com.m5b.instituto.service.RolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Genesis
 */
@RestController
@RequestMapping("/api/rol")
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping("/listar")
    public ResponseEntity<List<Rol>> listarRol() {
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Rol> crearRol(@RequestBody Rol r) {
        return new ResponseEntity<>(rolService.create(r), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Rol> eliminarRol(@PathVariable Integer id) {
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Rol> actualizarRol(@PathVariable Integer id, @RequestBody Rol r) {
        Rol rol = rolService.findById(id);
        if (rol == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                rol.setActividades(r.getActividades());
                rol.setEstado(r.getEstado());
                rol.setRol(r.getRol());
                return new ResponseEntity<>(rolService.create(r),HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

}
