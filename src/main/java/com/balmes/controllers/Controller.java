package com.balmes.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.balmes.model.Estudiant;
import com.balmes.services.*;

@RestController
@RequestMapping("/estudiants")
public class Controller {

    @Autowired
    private EstudiantService estudiantService;

    //Ver todos los Usuarios
    @GetMapping
    public ResponseEntity<List<Estudiant>> getAllEstudiants() {
        List<Estudiant> estudiants = estudiantService.getStudents();
        return new ResponseEntity<>(estudiants, HttpStatus.OK);
    }

}