/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.controller;

import com.Kuis_1084.entity.Indentitas;
import com.Kuis_1084.service.IndentitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC35
 */
@RestController
@RequestMapping("/indentitas")
public class IndentitasController {
    
    @Autowired
    private IndentitasService indentitasService;

    @RequestMapping(method = RequestMethod.POST)
    public Indentitas insert(@RequestBody Indentitas indentitas) {
        return indentitasService.insert(indentitas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Indentitas update(@RequestBody Indentitas indentitas) {
        return indentitasService.update(indentitas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return indentitasService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Indentitas getById(@PathVariable("id") Long id){
        return indentitasService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Indentitas> getAll(){
        return indentitasService.getAll();
    }
    
}
