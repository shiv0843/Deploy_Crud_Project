package com.CRUD_Operations.CRUD;

import com.CRUD_Operations.CRUD.Entity.Employee;
import com.CRUD_Operations.CRUD.Repository.EmpDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

	}
}
