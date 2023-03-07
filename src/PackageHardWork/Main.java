package PackageHardWork;

public class Main {

    public static void main(String[] args) {

        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными ");
        EmployeeBook object = new EmployeeBook();
        object.printAllList();
        System.out.println();
        System.out.println("Посчитать сумму затрат в месяц");
        System.out.println(object.sumSalary());
        System.out.println();
        System.out.println("Найти сотрудника с минимальной заплатой");
        object.findMinimalSalary();
        System.out.println();
        System.out.println("Найти сотрудника с максимальной зарплатой");
        object.findMaximumSalary();
        System.out.println();
        System.out.println("Подсчитать среднее значение зарплат");
        System.out.println(object.countAverageSalary());
        System.out.println();
        System.out.println("Получить Ф. И. О. всех сотрудников");
        object.getFioEmployees();
        System.out.println();
        System.out.println("Проиндексируйте зарплату");
        object.indexSalary(5.68);
        System.out.println();
        System.out.println("Найти сотрудника с минимальной зарплатой по департаменту");
        System.out.println(object.employeeMinSalary(1));
        System.out.println();
        System.out.println("Найти сотрудника с максимальной зарплатой по департаменту");
        System.out.println(object.employeeMaxSalary(2));
        System.out.println();
        System.out.println("Найти cумму затрат на зарплату по отделу");
        System.out.println(object.departmentalСost(1));
        System.out.println();
        System.out.println("Найти cреднюю зарплату по отделу");
        System.out.println(object.AverageSalaryByDepartment(2));
        System.out.println();
        System.out.println("Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра");
        object.indexSalary2(1,9.598);
        System.out.println();
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела)");
        object.printEmployees(2);
        System.out.println();
        System.out.println("Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        object.printNumberEmployees(26845);
        System.out.println();
        System.out.println("Получить в качестве параметра число и найти всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        object.printNumberEmployees2(98548);
        System.out.println();
        System.out.println("Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).\n" +
                "Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда " +
                "с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.");
        object.addNewEmployee("Елена Васильевна Вакуленко",2,65485);
        System.out.println();
        System.out.println("Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве)");
        object.deleteEmployee(5);
        System.out.println();
        System.out.println("5. Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись): \n" +
                "Изменить зарплату и изменить отдел");
        object.changeEmployee("Пётр Михайлович Вакуленко",5);
        System.out.println();
        object.changeEmployee1("Алена Петровна Свободная",95874);
        System.out.println();
        System.out.println("Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников)");
        object.printFioDepartment();




    }
}