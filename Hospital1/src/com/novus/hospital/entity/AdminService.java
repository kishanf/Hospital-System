package com.novus.hospital.entity;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.novus.hospital.utility.UtilityJPA;



/**
 * Session Bean implementation class AdminService
 */
@Stateless
@Local
@Remote 
public class AdminService implements AdminServiceRemote, AdminServiceLocal{

    /**
     * Default constructor. 
     */
    public AdminService() {
    }

    @PersistenceContext(unitName = "Hospital1")
    private EntityManager em = UtilityJPA.getEntityManager();
    
    protected EntityManager getEntityManager() {
    	return em;
    }
    
    
	@Override
	public void createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void editAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}


	
	public List<Admin> findAllAdmins() throws Exception {
		TypedQuery<Admin> query = em.createNamedQuery("Admin.findAll", Admin.class);
		List<Admin>listAdmin = query.getResultList();
		return listAdmin;
		
	}

	
	}


