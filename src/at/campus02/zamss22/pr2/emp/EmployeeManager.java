package at.campus02.zamss22.pr2.emp;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees; // = new ArrayList<>();// or we do it in constructor

    // anther way how we can den Arraylist writing
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee empi : employees) {
            if (empi.getEmpNumber() == number) {
                return empi;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        ArrayList<Employee> erg = new ArrayList<>();

        for (Employee e : employees) {
            if (e.getDepartment().equals(department)) {
                erg.add(e);
            }
        }
        return erg;
    }

    public Employee findByMaxSalary() {
        Employee highestE = null; // highestE is the employee which has the highest salary
        double highestSalary = 0; // oder -1

        for (Employee e : employees) {// e is employee
            if (e.getSalary() > highestSalary) {
                highestSalary = e.getSalary();
                highestE = e;
            }
        }
        return highestE;
    }
}
