public class Main {

    public static void main(String[] args) {
        EmployeeBook Book = new EmployeeBook();
        fillByEmployees(Book);

        printSeparator();
        Book.printEmployees();
        printSeparator();

        System.out.println(Book.minimalSalaryEmployee());
        System.out.println(Book.maximalSalaryEmployee());
        System.out.println(Book.getAverageSalary());

        printSeparator();
        Book.indexSalary(0.5);
        Book.printEmployees();
        printSeparator();

        System.out.println(Book.minimalSalaryEmployee());
        System.out.println(Book.maximalSalaryEmployee());
        System.out.println(Book.getAverageSalary());

        printSeparator();
        System.out.println(Book.addEmployee(new Employee("Dave", 2, 11_000)));
        Book.removeEmployee(7);
        Book.printEmployees();
        printSeparator();
        Book.addEmployee(new Employee("Kirk", 4, 200_000));
        Book.printEmployees();
        printSeparator();

        System.out.println(Book.getEmployeeByID(12));
        System.out.println(Book.getSalariesSum());
        printSeparator();
        Book.printSalariesSmallerThan(54000);
        printSeparator();
        Book.printSalariesBiggerThan(54000);
        printSeparator();

        System.out.println(Book.minimalSalaryEmployeeByDepartment(4));
        System.out.println(Book.maximalSalaryEmployeeByDepartment(4));
        System.out.println(Book.getAverageSalaryByDepartment(4));
        System.out.println(Book.getSalariesSumByDepartment(4));
        printSeparator();

        Book.printEmployeesByDepartment(4);
        printSeparator();
        Book.indexSalaryByDepartment(0.5, 4);
        Book.printEmployeesByDepartment(4);
    }

    public static void fillByEmployees(EmployeeBook book) {
        for (int i = 0; i < book.getEmployees().length; i++) {
            Employee employee = new Employee("Michael" + i, i % 5 + 1, 6_000 * (i + 1));
            book.addEmployee(employee);
        }
    }

    public static void printSeparator() {
        System.out.println("------------------------------------------------------------------");
    }
}