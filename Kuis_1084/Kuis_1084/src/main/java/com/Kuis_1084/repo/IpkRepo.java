/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.repo;

import com.Kuis_1084.entity.Ipk;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC35
 */
public interface IpkRepo extends CrudRepository<Ipk, Long>{
    
    @Query("select p from Ipk p")
    public List<Ipk> findAllIpk();
    

    
}
