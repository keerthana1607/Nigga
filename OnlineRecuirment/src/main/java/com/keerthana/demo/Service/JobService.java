package com.keerthana.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keerthana.demo.Model.Job;




@Service
public interface JobService {
	
	
	public void addPay(Job pay);
	public Job getJob(int id);
	public List<Job> getAllPayroll();
	public void updatePayroll(Job pay);
	public void deletePayroll(int id);
}
