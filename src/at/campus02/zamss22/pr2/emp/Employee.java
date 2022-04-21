package at.campus02.zamss22.pr2.emp;

import java.util.Objects;

public class Employee {
    private int empNumber; // das ist ein attribut - gehört zur klasse Employee
    private String name; // jede instanz oder objekt von employee hat alle diese
    private double salary; // eigenschaften ( alternativ auch attribute oder member genannt)
    private String department;

    public Employee(int empNumber, String name, double salary, String department) { // Parameters
        this.empNumber = empNumber; //das bedeutet: this attribute ist gleich meine Methode parameter
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // neue methode soll überprüfen ob zwei mitarbeiter*innen im gleichen department arbeiten
    // true zurückliefern falls ja, sonst false
    public boolean compareDepartment(Employee e) {
        if (department.equals(e.department)) {
            return true;
        }
        return false;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // that is an o letter and not 0 ziro
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;        // department.equals(employee.department) anether way to write department compairing code
        return empNumber == employee.empNumber && department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, department);
    }
}
