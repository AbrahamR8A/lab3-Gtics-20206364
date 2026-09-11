package com.pucp.lab3.controller;

import com.pucp.lab3.entity.Employee;
import com.pucp.lab3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeControler {
    @Autowired
    private EmployeeRepository employeeRepository;

}
