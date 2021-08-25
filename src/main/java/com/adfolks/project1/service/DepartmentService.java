package com.adfolks.project1.service;

import com.adfolks.project1.entity.Department;

import java.util.List;


public interface DepartmentService {

   public Department saveDepartment(Department department);

   List<Department> fetchDepartment();

   Department fetchDepartmentById(Long departmentId);

   void deleteDepartmentByID(Long departmentId);

   Department fetchDepartmentByName(String departmentName);
}
