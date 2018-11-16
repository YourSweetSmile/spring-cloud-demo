package com.exam.cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.exmp.springcloud.model.Dept;


@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long deptno);

	public List<Dept> findAll();
}
