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
 * Session Bean implementation class DepartmentService
 */
@Stateless
@Local
@Remote
public class DepartmentService implements DepartmentServiceRemote, DepartmentServiceLocal {

    /**
     * Default constructor. 
     */
    public DepartmentService() {
        // TODO Auto-generated constructor stub
    }
    @PersistenceContext(unitName = "Hospital1")
    private EntityManager em = UtilityJPA.getEntityManager();
    
    protected EntityManager getEntityManager() {
    	return em;
    }
    
	
	public List<Department> findAllDepartments() throws Exception {
		TypedQuery<Department> query = em.createNamedQuery("Department.findAll", Department.class);
		List<Department>listDepartment = query.getResultList();
		return listDepartment;
		
	}


	@Override
	public void createDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void editDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}

	
}