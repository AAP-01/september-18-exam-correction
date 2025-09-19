/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 10.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        //if (age >= 16) then{
        //    System.out.println(fullname + " can drive.");
        //}else{
        //    int yearsUntilSixteen = 16 - age;
        //    System.out.println(fullname + " must wait " + yearsUntilSixteen + " more years before they can drive.");
        
        // corrected code below
        if(age >= 16) {
            System.out.println(fullname + " can drive.");
            return true;
        }
        else {
            int yearsUntilSixteen = 16 - age;
            System.out.println(fullname + " must wait " + yearsUntilSixteen + " more year(s) before they can drive.");
            return false;
        }
    }
    
    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        //1. Get values of unpaidHours and hourlyWage
        //2. Set taxRate to 30%
        //3. Set Gross to unpaidHours * hourlyWage
        //4. Set Deductions to Gross * taxRate
        //5. Set netSalary to Gross - Deductions
        
        // corrected code below
        double taxRate = 0.30;
        double Gross = (unpaidHours * hourlyWage);
        double Deductions = (Gross * taxRate);
        double netSalary = (Gross - Deductions);
        
        return netSalary;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        //System.out.println(fullname + " has received a wire transfer of " + netSalary + " $CAD.");
        
    //unpaidHours = 0.0;
        
        // corrected code below
        double netSalary = calculatePay();
        System.out.println(fullname + " has received a wire transfer of " + netSalary + " $CAD.");
        unpaidHours = 0.0;
    }
}