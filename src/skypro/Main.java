package skypro;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        addEmployee(new Employee("Владимир1", "Соколов", "Дмитриевич", 1, 100_000f));
        addEmployee(new Employee("Владимир2", "Соколов", "Дмитриевич", 1, 200_000f));
        addEmployee(new Employee("Владимир3", "Соколов", "Дмитриевич", 1, 300_000f));
        addEmployee(new Employee("Владимир4", "Соколов", "Дмитриевич", 1, 400_000f));
        addEmployee(new Employee("Владимир5", "Соколов", "Дмитриевич", 1, 500_000f));
        printEmployees();
        System.out.println("Суммаррная трата на зп сотрудников: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной зп: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной зп: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зп: " + calculateAverageSalary());
        printFullNames();
    }


    public static void printEmployees() {
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee);
            }


        }

    }
    public  static float calculateTotalSalary(){
        float sum = 0;
        for ( Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = null;
        float minSalary = Float.MAX_VALUE;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary(){
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        int employeeCount = 0;
        for(Employee employee : employees){
            if (employee != null){
                employeeCount++;
            }
        }
        return calculateTotalSalary() / employeeCount;
    }

    public static void printFullNames(){
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getFullName());
            }
        }

    }
    private static boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }

        }
        return false;

    }
}


