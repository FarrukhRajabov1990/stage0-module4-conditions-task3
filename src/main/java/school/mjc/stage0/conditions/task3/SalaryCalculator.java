package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0 && salary <= 10000) {
            float taxes = (float) salary * 15 / 100;
            System.out.println(salary - taxes);
        } else if (salary > 10000 && salary <= 20000) {
            float taxes = (float) salary * 18 / 100;
            System.out.println(salary - taxes);
        } else if (salary > 20000){
            float taxes = (float) salary * 20 / 100;
            System.out.println(salary - taxes);
        } else {
            System.out.println("wrong input!");
        }
    }
}
