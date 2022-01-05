/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
 * @author ongen
 */
@Controller
@RestController
@CrossOrigin
@RequestMapping("/datamahasiswa")
public class DataMahasiswaController {
    @Autowired
    private DataMahasiswaRepository datamahasiswa;
    
    @GetMapping("/mahasiswa")
    public List<DataMahasiswa> getAllDataMahasiswa(){
        return datamahasiswa.findAll();
    }
    @GetMapping ("/mahasiswa/{nim}")
    public DataMahasiswa getDataMahasiswaById(@PathVariable Long nim){
        return datamahasiswa.findById(nim).get();
    }
    
    @PostMapping ("/mahasiswa")
    public DataMahasiswa SimpanDataMahasiswaDetails(@RequestBody DataMahasiswa d){
        return datamahasiswa.save(d);
    }
    
    @PutMapping("/mahasiswa")
    public DataMahasiswa updateDataMahasiswa(@RequestBody DataMahasiswa d){
        return datamahasiswa.save(d);
    }
    
    @DeleteMapping("/mahasiswa/{nim}")
    public ResponseEntity<HttpStatus> deleteDataMahasiswaById(@PathVariable Long nim){
        datamahasiswa.deleteById(nim);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
