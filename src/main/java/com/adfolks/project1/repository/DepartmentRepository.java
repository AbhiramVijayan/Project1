package com.adfolks.project1.repository;

import com.adfolks.project1.entity.Department;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface DepartmentRepository  extends ElasticsearchRepository<Department,Long> {


    Department findByDepartmentName(String departmentName);
}
