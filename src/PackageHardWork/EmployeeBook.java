package PackageHardWork;


public class EmployeeBook {
    private Employee[] emloyees = new Employee[11];

    public EmployeeBook() {
        emloyees[0] = new Employee("Иван Иванович Иванов", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[1] = new Employee("Иван Александрович Петров", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[2] = new Employee("Пётр Михайлович Вакуленко", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[3] = new Employee("Алена Петровна Свободная", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[4] = new Employee("Лариса Игоревна Сидорова", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[5] = new Employee("Роман Александрович Губенков", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[6] = new Employee("Максим Васильевич Лентяй", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[7] = new Employee("Алексей Денисович Прошуров", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[8] = new Employee("Денис Михайлович Юзенков", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
        emloyees[9] = new Employee("Василий Александрович Садоводов", generateRandomInt(1, 6), generateRandomInt(15000, 150000));
    }


    public double sumSalary() {

        double sum = 0;
        for (int i = 0; i < 10; i++) {
            if (emloyees[i] != null) {
                sum = sum + emloyees[i].getSalary();
            }
        }
        return sum;
    }

    private int generateRandomInt(int from, int to) {
        java.util.Random random = new java.util.Random();
        return random.nextInt(from, to);
    }


    public void printAllList() {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null) {
                System.out.println(emloyees[i]);
            }

        }
    }

    public void findMinimalSalary() {
        double min = Double.MAX_VALUE;
        int number = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getSalary() < min) {
                min = emloyees[i].getSalary();
                number = i;
            }

        }
        System.out.println(emloyees[number]);
    }

    public void findMaximumSalary() {
        double max = -1;
        int number = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getSalary() > max) {
                max = emloyees[i].getSalary();
                number = i;
            }
        }
        System.out.println(emloyees[number]);
    }

    public double countAverageSalary() {
        double average = 0;
        return sumSalary() / emloyees.length;
    }

    public void getFioEmployees() {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null) {
                System.out.println(emloyees[i].getFullName());
            }
        }
    }

    public void indexSalary(double index) {

        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null) {
                emloyees[i].setSalary((emloyees[i].getSalary() * index / 100) + emloyees[i].getSalary());
                System.out.println(emloyees[i]);
            }
        }

    }

    public Employee employeeMinSalary(int department) {
        double minSalary = emloyees[0].getSalary();
        Employee employee = null;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getSalary() < minSalary && emloyees[i].getDepartment() == department) {
                minSalary = emloyees[i].getSalary();
                employee = emloyees[i];
            }

        }
        return employee;
    }

    public Employee employeeMaxSalary(int department) {
        double minSalary = Double.MIN_VALUE;
        Employee employee = null;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getSalary() > minSalary && emloyees[i].getDepartment() == department) {
                minSalary = emloyees[i].getSalary();
                employee = emloyees[i];
            }

        }
        return employee;
    }

    public double departmentalСost(int department) {
        double sum = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getDepartment() == department) {
                sum += emloyees[i].getSalary();

            }
        }
        return sum;
    }

    public double AverageSalaryByDepartment(int department) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getDepartment() == department) {
                sum = (sum + emloyees[i].getSalary());
                count++;

            }
        }
        return sum / count;
    }

    public void indexSalary2(int department, double indexSalary) {

        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getDepartment() == department) {
                emloyees[i].setSalary((emloyees[i].getSalary() * indexSalary / 100) + emloyees[i].getSalary());
                System.out.println(emloyees[i]);
            }
        }
    }

    public void printEmployees(int department) {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getDepartment() == department) {
                System.out.println(emloyees[i].getId() + " " + emloyees[i].getFullName() + " " + emloyees[i].getSalary());
            }
        }

    }

    public void printNumberEmployees(int number) {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getSalary() < number) {
                System.out.println(emloyees[i].getId() + " " + emloyees[i].getFullName() + " " + emloyees[i].getSalary());
            }
        }
    }

    public void printNumberEmployees2(int number) {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getSalary() >= number) {
                System.out.println(emloyees[i].getId() + " " + emloyees[i].getFullName() + " " + emloyees[i].getSalary());
            }
        }
    }

    public void addNewEmployee(String name, int department, double salary) {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] == null) {
                emloyees[i] = new Employee(name, department, salary);
                System.out.println(emloyees[i]);
            }
        }

    }

    public void deleteEmployee(int Id) {

        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getId() == Id) {
                emloyees[i] = null;
            }
            System.out.println(emloyees[i]);
        }
    }

    public void changeEmployee(String name, int department) {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getFullName().equals(name)) {
                emloyees[i].setDepartment(department);
                System.out.println(emloyees[i]);
            }
        }
    }

    public void changeEmployee1(String name, double salary) {
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getFullName().equals(name)) {
                emloyees[i].setSalary(salary);
                System.out.println(emloyees[i]);
            }
        }
    }

    public void printFioDepartment() {
        int number = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null && emloyees[i].getDepartment() > number) {
                number = emloyees[i].getDepartment();
            }
        }
        for (int i = 1; i <= number; i++) {
            System.out.println("Департамент " + i + " : ");
            for (int j = 0; j < emloyees.length; j++) {
                if (emloyees[j] != null && emloyees[j].getDepartment() == i) {
                    System.out.println(emloyees[j].getFullName());
                }
            }
        }

    }
}





