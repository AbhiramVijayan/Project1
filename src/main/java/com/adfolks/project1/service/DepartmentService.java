package com.adfolks.project1.service;

import com.adfolks.project1.entity.Department;


public interface DepartmentService {

   public Department saveDepartment(Department department);

   Iterable<Department> fetchDepartment();

   Department fetchDepartmentById(Long departmentId);

   void deleteDepartmentByID(Long departmentId);

//   Department fetchDepartmentByName(String departmentName);
}
