package com.microservice.erp2017.service.repo;

import com.microservice.erp2017.model.T_CompanyAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author reza
 */
@Repository("CompanyAddressRepo")
public interface CompanyAddressRepo extends JpaRepository<T_CompanyAddress, String>{
    
}
