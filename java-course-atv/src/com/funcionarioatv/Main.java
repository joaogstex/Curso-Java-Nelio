package com.funcionarioatv;

import com.funcionarioatv.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        es.registrarFuncionario();
    }
}
