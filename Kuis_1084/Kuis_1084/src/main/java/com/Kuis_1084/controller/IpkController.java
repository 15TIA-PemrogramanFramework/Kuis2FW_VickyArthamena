/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.controller;

import com.Kuis_1084.entity.Ipk;
import com.Kuis_1084.repo.IpkRepo;
import com.Kuis_1084.service.IpkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC35
 */

@RestController
@RequestMapping("/ipk")
public class IpkController {
    
    @Autowired
    private IpkService ipkService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Ipk insertOrUpdate(@RequestBody Ipk ipk){
        return ipkService.insertOrUpdate(ipk);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk> findAll(){
        return ipkService.findAll();
    }
}
