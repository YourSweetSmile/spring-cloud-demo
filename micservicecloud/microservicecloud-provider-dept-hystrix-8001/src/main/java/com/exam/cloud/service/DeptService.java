package com.exam.cloud.service;

import java.util.List;

import com.exmp.springcloud.model.Dept;


public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
