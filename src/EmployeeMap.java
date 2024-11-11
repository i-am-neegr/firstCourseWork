import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private final Map<String, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee emp) {
        employeeMap.put(emp.getFullName(), emp);
    }

    public void removeEmployee(Employee emp) {
        employeeMap.remove(emp.getFullName());
    }

    public void removeEmployee(String empFullName) {
        employeeMap.remove(empFullName);
    }

    public Employee getEmployee(String empFullName) {
        return employeeMap.get(empFullName);
    }

    public void printAllEmployees() {
        for (Employee emp : employeeMap.values()) {
            System.out.println(emp);
        }
    }
}
