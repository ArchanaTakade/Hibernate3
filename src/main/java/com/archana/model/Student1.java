package com.archana.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student1 {
	@Id
	private int rollNo;
	private String name;
	private int mobile;
	
	@ManyToMany
	/*@JoinTable
	(name = "std_batch_details",
			joinColumns= {@JoinColumn(name="s_r")},
			inverseJoinColumns = {@JoinCloumn(name="b_i")}
			)*/
	private List<Batch>batches = new ArrayList<Batch>();

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public List<Batch> getBatches() {
		return batches;
	}

	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mobile=" + mobile + ", batches=" + batches + "]";
	}

	
	

	
}
