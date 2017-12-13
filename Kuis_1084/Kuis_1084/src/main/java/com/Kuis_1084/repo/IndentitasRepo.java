
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.repo;

import com.Kuis_1084.entity.Indentitas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC35
 */
public interface IndentitasRepo extends CrudRepository<Indentitas, Long> {
    
    @Query("select c from Indentitas c")
    public List<Indentitas> findAllIndentitas();
}
