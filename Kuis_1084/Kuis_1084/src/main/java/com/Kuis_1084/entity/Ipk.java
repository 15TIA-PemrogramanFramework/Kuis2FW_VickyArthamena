/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author PC35
 */
@Entity
@Table (name = "ipk")
public class Ipk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String Nilai;
    @Column(length = 100, nullable = false)
    private String Tahun;
    @ManyToOne
    private Indentitas indentitas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNilai() {
        return Nilai;
    }

    public void setNilai(String Nilai) {
        this.Nilai = Nilai;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String Tahun) {
        this.Tahun = Tahun;
    }

    public Indentitas getIndentitas() {
        return indentitas;
    }

    public void setIndentitas(Indentitas indentitas) {
        this.indentitas = indentitas;
    }
    
    
}
