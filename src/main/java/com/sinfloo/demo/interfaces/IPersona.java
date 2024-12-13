package com.sinfloo.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.Persona;


@Repository
public interface IPersona extends JpaRepository<Persona, Integer>{
       
}
