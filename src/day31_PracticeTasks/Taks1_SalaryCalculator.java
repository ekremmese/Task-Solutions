package day31_PracticeTasks;

public class Taks1_SalaryCalculator {
    /*
    1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

     */

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public Taks1_SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-federalTax()-stateTax();
    }

    @Override
    public String toString() {
        return "Taks1_SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }

    public static void main(String[] args) {

        Taks1_SalaryCalculator salary1 = new Taks1_SalaryCalculator(12,0.10,0.20,40);
        double salaryNet = salary1.salaryAfterTax();
        System.out.println(salaryNet);

    }
}
