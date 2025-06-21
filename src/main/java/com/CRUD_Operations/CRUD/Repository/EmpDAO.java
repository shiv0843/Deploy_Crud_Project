package com.CRUD_Operations.CRUD.Repository;

import com.CRUD_Operations.CRUD.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDAO extends JpaRepository<Employee, Long>
{

}
