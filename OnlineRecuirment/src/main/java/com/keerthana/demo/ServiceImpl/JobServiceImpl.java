package com.keerthana.demo.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.Job;

import com.keerthana.demo.Repoisatory.JobRepo;

@Service
public class JobServiceImpl {
	
	@Autowired
	JobRepo jarepo;

	public void addPay(Job pay) {
		
		jarepo.save(pay);
		
	}

	public Job getJob(int id) {
		return jarepo.findById(id).get();
	}

	public List<Job> getAllPayroll() {
		return jarepo.findAll();
	}

	public void updatePayroll(Job pay) {
		jarepo.save(pay);
		
	}

	public void deletePayroll(int id) {
		jarepo.deleteById(id);
		
	}

}
