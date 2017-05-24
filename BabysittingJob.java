/*S.McDonald 11/12/2016
BabysittingJob.java
This program creates a BabysittingJob class that contains certain data fields to be used in
the calculation and presentation of a specific babysitters name, hourly wage, hours worked, number-
of children watched, an employee number which is specific to an employee, a job number, and the total
fee. 
*/


public class BabysittingJob
{
   //data fields
   private int jobNum;
   private int employeeNum;
   private String employeeName;
   private int numChild;
   private int numHours;
   private int seqNum;
   private int fee;
   
   public BabysittingJob(int jobNum, int employeeNum, int numChild, int numHours)
   {
      this.jobNum = jobNum;
      this.employeeNum = employeeNum;
      this.numChild = numChild;
      this.numHours = numHours;
      
      //determine the babysitter name and fee for the job
      determineBabysitter();
      calculateFee();
   
   }//constructor
   
   public static int createJobNum(int year, int seqNum)
   {
      year = year % 2000; //year % 2000 will produce the last 2 digits of the year
      return Integer.parseInt(year * 10000 + seqNum + ""); //(year * 10000 + seqNum + "") will create the job number
   
   }//createJobNum method
   
   private void determineBabysitter()
   {
      if(employeeNum == 1) //if the employee number is 1, the employee is Cindy
         employeeName = "Cindy";
      else
         if(employeeNum == 2) //if the employee number is 2, the employee is Greg
            employeeName = "Greg";
      else
         if(employeeNum == 3) //if the employee number is 3, the employee is Marcia
            employeeName = "Marcia";
   
   }//determineBabysitter method
   
   private void calculateFee()
   {
      if(employeeNum == 1)
         fee = numHours * 7 * numChild; //if the employee number is 1, Cindy's hourly wage is $7 per child
      else
         if(employeeNum > 1 && numChild == 1) //if the employee number is greater than 1 & only 1 child -
            fee = numHours * 9 * numChild; //Greg and Marcia's hourly wage is $9
      else
         if(employeeNum > 1 && numChild > 1) //if the employee number is greater than 1 & more than 1 child
            fee = (numHours * 9) + ((--numChild) * numHours * 4); //Greg and Marcia charge an additional $4 per hour per child
   
   }//calculateFee method
   
   //output
   public void jobDetails()
   {
      System.out.println(":Babysitting Job Details:");
      System.out.println("");
      System.out.println("Job Number: " + jobNum);
      System.out.println("Employee Number: " + employeeNum);
      System.out.println("Employee Name: " + employeeName);
      System.out.println("Number of Children to be Watched: " + numChild);
      System.out.println("Number of Hours in the Job: " + numHours);
      System.out.println("The total Fee is: $" + fee);
   
   }//jobDetails method

}//class