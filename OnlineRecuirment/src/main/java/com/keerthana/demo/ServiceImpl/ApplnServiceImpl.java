package com.keerthana.demo.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.Application;
import com.keerthana.demo.Model.Job;
import com.keerthana.demo.Repoisatory.AppRepo;
import com.keerthana.demo.Service.ApplnService;

import jakarta.persistence.EntityManager;

@Service
public class ApplnServiceImpl implements ApplnService{

	@Autowired
	AppRepo emprepo;
	
	@Autowired
	EntityManager eman;



	public Application getApplication(int id){
		return emprepo.findById(id).get();
	}

	public List<Application> getAllApplication() {
		return emprepo.findAll();
	}

	

	public void deleteApplication(int id) {
		emprepo.deleteById(id);
		
	}



	
	@Override
	public String addEmp(Application emp, int pId) {
		Job py=eman.find(Job.class, pId);
		if(py!=null) {
			emp.setJob(py);
		emprepo.save(emp);
			return "saved";
			
		}else {
			return "no";
		}

}

	


	public String updateApplication(Application emp, int eid) {
		Application em=eman.find(Application.class, eid);
		
		
		if(em!=null) {
			em.setUsername(emp.getUsername());
			em.setCity(emp.getCity());
			em.setQualification(emp.getQualification());
			em.setEmail(emp.getEmail());
			em.setExperience(emp.getExperience());
			em.setAge(emp.getAge());
			emprepo.save(em);
			return "saved";
		}else {
			return "no";
		}
		
	}
	
	
}
