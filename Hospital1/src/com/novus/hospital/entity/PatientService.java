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
public class PatientService implements PatientServiceRemote, PatientServiceLocal{

    /**
     * Default constructor. 
     */
    public PatientService() {
    }

    @PersistenceContext(unitName = "Hospital1")
    private EntityManager em = UtilityJPA.getEntityManager();
    
    protected EntityManager getEntityManager() {
    	return em;
    }
    
    

	public List<Patient> findAllPatients() throws Exception {
		TypedQuery<Patient> query = em.createNamedQuery("Patient.findAll", Patient.class);
		List<Patient>listPatient = query.getResultList();
		return listPatient;
	}


	@Override
	public void createPatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void editPatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

}
