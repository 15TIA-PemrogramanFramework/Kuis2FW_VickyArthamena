/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.service;

import com.Kuis_1084.entity.Indentitas;
import com.Kuis_1084.repo.IndentitasRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC35
 */
@Service("indentitasService")
@Transactional
public class IndentitasService {
    @Autowired
    private IndentitasRepo repo;
    
    public Indentitas insert(Indentitas indentitas){
        return repo.save(indentitas);
    }
    
    public Indentitas update(Indentitas indentitas) {
        return repo.save(indentitas);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Indentitas getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Indentitas> getAll(){
        return repo.findAllIndentitas();
    }
}
