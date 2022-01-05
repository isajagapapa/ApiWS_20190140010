/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author ongen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "datamahasiswa")
class DataMahasiswa {
    @Id
    private Long nim;
    private String nama;
    private String alamat;
    private String programstudi;
    private String fakultas;
}
