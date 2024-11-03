public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public boolean addEmployee(Employee e) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = e;
                return true;
            }
        }
        return false;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getID() == id) {
                employees[i] = null;
                return;
            }
        }
    }

    public Employee getEmployeeByID(int ID) {
        for (Employee employee : employees) {
            if (employee.getID() == ID) {
                return employee;
            }
        }
        return null;
    }

    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                int salary = employee.getSalary();
                employee.setSalary((int) (salary + salary * percent));
            }
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getSalariesSum() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public int minimalSalaryEmployee() {
        int minimal = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minimal) {
                    minimal = employee.getSalary();
                }
            }
        }
        return minimal;
    }

    public int maximalSalaryEmployee() {
        int maximal = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maximal) {
                    maximal = employee.getSalary();
                }
            }
        }
        return maximal;
    }

    public double getAverageSalary() {
        double total = getSalariesSum();
        return total / employees.length;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int minimalSalaryEmployeeByDepartment(int department) {
        int minimal = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentID() == department) {
                if (employee.getSalary() < minimal) {
                    minimal = employee.getSalary();
                }
            }
        }
        return minimal;
    }

    public int maximalSalaryEmployeeByDepartment(int department) {
        int maximal = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentID() == department) {
                if (employee.getSalary() >= maximal) {
                    maximal = employee.getSalary();
                }
            }
        }
        return maximal;
    }

    public int getSalariesSumByDepartment(int department) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentID() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public double getAverageSalaryByDepartment(int department) {
        double total = 0;
        double counter = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentID() == department) {
                total += employee.getSalary();
                counter++;
            }
        }

        return total / counter;
    }

    public void indexSalaryByDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentID() == department) {
                int salary = employee.getSalary();
                employee.setSalary((int) (salary + salary * percent));
            }
        }
    }

    public void printEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmentID() == department) {
                System.out.println(employee);
            }
        }
    }

    public void printSalariesSmallerThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    public void printSalariesBiggerThan(int salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
}