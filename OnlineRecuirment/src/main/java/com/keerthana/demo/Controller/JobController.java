package com.keerthana.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.Model.Job;

import com.keerthana.demo.ServiceImpl.JobServiceImpl;

@RestController
@RequestMapping("/job")
@CrossOrigin("*")
public class JobController {

	@Autowired
	JobServiceImpl jobservice;
	
	@PostMapping
	public String insertEmpl(@RequestBody Job pay) {
		String msg="";
		try {
			jobservice.addPay(pay);
			msg="Success";
		}catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
		
	}
	@GetMapping("{id}")
	public Job getJoblById(@PathVariable("id") int id) {
		return jobservice.getJob(id);
	}
	@GetMapping("/all")
	public List<Job> getPayrolls() {
		return jobservice.getAllPayroll();
	}
	@PutMapping
	public String updationPayroll(@RequestBody Job pay) {
		String msg="";
		try {
			jobservice.updatePayroll(pay);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	@DeleteMapping("{id}")
	public String deletePayrollById(@PathVariable("id") int id) {
		String msg="";
		try {
			jobservice.deletePayroll(id);
			msg="Success";
		} catch (Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
	
}
