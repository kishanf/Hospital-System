package com.novus.hospital.entity;
import java.util.List;

import javax.ejb.Local;

@Local
public interface AdminServiceLocal {
	
	void createAdmin(Admin admin);
	
	void editAdmin(Admin admin);
	
	void removeAdmin(Admin admin);
	

	List<Admin> findAllAdmins() throws Exception; 

}