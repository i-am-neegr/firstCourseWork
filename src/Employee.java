import java.util.Objects;

public class Employee {

    final private String fullName;
    private int departmentID;
    private int salary;
    final private int ID;

    static int counterID = 1;

    public Employee(String fullName, int departmentID, int salary) {
        this.fullName = fullName;
        this.departmentID = departmentID;
        this.salary = salary;
        this.ID = counterID++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public int getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public static int getCounterID() {
        return counterID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentID == employee.departmentID && salary == employee.salary && ID == employee.ID && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, ID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", departmentID=" + departmentID +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }
}
