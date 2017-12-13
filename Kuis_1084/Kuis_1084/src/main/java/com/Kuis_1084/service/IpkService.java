/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis_1084.service;

import com.Kuis_1084.entity.Ipk;
import com.Kuis_1084.repo.IpkRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC35
 */
@Service("ipkService")
@Transactional
public class IpkService {
    @Autowired
    private IpkRepo repo;

    public Ipk insertOrUpdate(Ipk ipk) {
        return repo.save(ipk);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Ipk> findAll() {
        return repo.findAllIpk();
    }

   
}
