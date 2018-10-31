/**
 * 
 */
package com.exmp.cloud.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.exmp.springcloud.model.Dept;

/**
 * @des
 * @author yinjunwu
 * @date 2018年10月30日
 * @version 0.0.1
 */
@Mapper
public interface DeptDao{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}