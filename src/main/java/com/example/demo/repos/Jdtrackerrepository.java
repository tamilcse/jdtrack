package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.jdtrack;

@Repository
public interface Jdtrackerrepository extends JpaRepository<jdtrack, Long>{

}
