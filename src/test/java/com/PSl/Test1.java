package com.PSl;

public class Test1 {
    public Test1( int empNo, int salary, String name) {
        this.adress = adress;
        this.empNo = empNo;
        this.salary = salary;
        this.name = name;
    }

    Adrress adress;
    private int empNo;
    private int salary;
    private String name;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "adress=" + adress +
                ", empNo=" + empNo +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
