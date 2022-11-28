package day10_PracticeTasks;

public class Task6_Loans {

    public static void main(String[] args) {

        /*
        Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

         */

        int salary = 60001;
        int creditScore = 750;

        String loanStatus = (salary > 60000 && creditScore > 650) ? "Loan Approved" : "Load Denied";
        System.out.println(loanStatus);

    }
}
