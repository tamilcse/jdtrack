package com.example.demo.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;


@Data
@Entity
@Table(name = "jd_master")
public class jdtrack implements Serializable 
{
		private static final long serialVersionUID = 1L;

	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
        @Temporal(TemporalType.TIMESTAMP)
	    @CreatedDate
		private Date jdcdate;
        private String jpsk;
		private String jssk;
        private String jobdesc;
		private String minexp;
		private String maxexp;
		private String reqtype;
		private String reqmail;
		private String div;
		private String dept;
		private String status;
		private String general;
		private String group;
		private String cname;
		@Temporal(TemporalType.TIMESTAMP)
	    @CreatedDate
		private String adatejoin;
		private String recruitment;
		private String sdfv;
		private String ffbiz;
		private String prstatus;
		private String prcreatedon;
		private String priority;
		private String ageing;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
