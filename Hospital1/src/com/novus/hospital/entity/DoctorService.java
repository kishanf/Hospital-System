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
 * Session Bean implementation class PatientService
 */
@Stateless
@Local
@Remote 
public class DoctorService implements DoctorServiceRemote, DoctorServiceLocal{

    /**
     * Default constructor. 
     */
    public DoctorService() {
    }

    @PersistenceContext(unitName = "Hospital1")
    private EntityManager em = UtilityJPA.getEntityManager();
    
    protected EntityManager getEntityManager() {
    	return em;
    }
    
    

	public List<Doctor> findAllDoctors() throws Exception {
		TypedQuery<Doctor> query = em.createNamedQuery("Doctor.findAll", Doctor.class);
		List<Doctor>listDoctor = query.getResultList();
		return listDoctor;
	}
	public List<Department> findAllDepartments() throws Exception {
		TypedQuery<Department> query = em.createNamedQuery("Department.findAll", Department.class);
		List<Department>listDepartment = query.getResultList();
		return listDepartment;
	}



	@Override
	public void createDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void editDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void removeDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Doctor> findAllDoctor() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
		
	}


