package com.CRUD_Operations.CRUD.Controller;

import com.CRUD_Operations.CRUD.Entity.Employee;
import com.CRUD_Operations.CRUD.Repository.EmpDAO;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpDAO dao;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/add/emp")
  public String EmpAdd(Model model, String id, String name, String password){

        Employee emp = new Employee(Long.parseLong(id), name, password);
        dao.save(emp);
        model.addAttribute("msg", "Employee Add Successful");
        return "index";
  }
    //display of Employee list

    @GetMapping("/emp")
    public String empshow(@NotNull Model model){
       List<Employee> list= dao.findAll();
       model.addAttribute("list", list);
        return "report";
    }

    //Delete Emp
  @GetMapping("/emp/delete/{id}")
  public String Del(Model model, @PathVariable Long id){
        dao.deleteById(id);
        List<Employee> list = dao.findAll();
        model.addAttribute("list", list);
     return "report";
  }
  //Update
  @GetMapping("/emp/update/{id}")
    public String update(Model model,@PathVariable Long id){
      Employee emp =   dao.getById(id);
        model.addAttribute("emp", emp);
      return  "index";
  }


}


