// 11. Write a java program to accept n employee names from user, store them into the

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class ProgramTask8 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees[i] = new Employee(name);
        }

        System.out.println("\nEmployee Names:");
        for (Employee emp : employees) {
            System.out.println(emp.name);
        }

        scanner.close();
    }
}