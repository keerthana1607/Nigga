package com.keerthana.demo.Repoisatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keerthana.demo.Model.Job;


@Repository
public interface JobRepo extends JpaRepository<Job, Integer> {

}
