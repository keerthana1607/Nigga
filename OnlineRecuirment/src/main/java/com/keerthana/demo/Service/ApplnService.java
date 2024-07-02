package com.keerthana.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.Application;



@Service
public interface ApplnService {

	
	String addEmp(Application emp, int pId);
	public Application getApplication(int id);
	public List<Application> getAllApplication();
	public void deleteApplication(int id);
	public String updateApplication(Application emp, int eid);
}
