package com.keerthana.demo.Repoisatory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.keerthana.demo.Model.Application;


@Repository
public interface AppRepo extends JpaRepository<Application, Integer>{

}
