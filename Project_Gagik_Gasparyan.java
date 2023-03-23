import java.util.Scanner; //import needed to create and use the scanner object which reads user input

public class Project_Gagik_Gasparyan {//class demonstrating attributes and behaviors of the Policy class

    public static void main(String[] s){  

               //scanner object is created and named "getInput"
    Scanner getInput = new Scanner(System.in);

    //These are the variables in the main method that will store input values
    int policyNumber, holderAge;
    double holderHeight, holderWeight;
    String providerName, holderFName, holderLName, smokerStatus;

   //a series of prompts in the form of output text, followed by the scanner object to read and save the input
    System.out.print("Please enter the Policy Number: ");
        policyNumber = getInput.nextInt();

    System.out.print("Please enter the Provider Name: ");
                      getInput.nextLine();//clear input buffer
        providerName= getInput.nextLine();

    System.out.print("Please enter the Policyholder's First Name: ");
        holderFName = getInput.nextLine();

    System.out.print("Please enter the Policyholder's Last Name: ");
        holderLName=getInput.nextLine();

    System.out.print("Please enter the Policyholder's Age: ");
        holderAge= getInput.nextInt();

    System.out.print("Please enter the Policyholder's Smoking status(smoker/non-smoker): ");
                     getInput.nextLine();//clear input buffer
        smokerStatus=getInput.nextLine();

    System.out.print("Please enter the Policyholder's height(in inches): ");
        holderHeight= getInput.nextDouble();

    System.out.print("Please enter the Policyholder's weight(in pounds): ");
        holderWeight= getInput.nextDouble();
        
        
    //now that all the values have been collected from the user, we instantiate a Policy object using all the arguments necessary
    //this instance of the Policy class will be named "policy_1"
    Policy policy_1 = new Policy(policyNumber,providerName,holderFName,holderLName,holderAge,smokerStatus,holderHeight,holderWeight);

    //display all the information about policy_1, along with formatting
    System.out.println("Policy Number: "+ policy_1.getPolicyNumber());
    System.out.println("\nProvider Name: "+ policy_1.getProviderName());
    System.out.println("\nPolicyholder's First Name: "+ policy_1.getPolicyHolderFirstName());
    System.out.println("\nPolicyholder's Last Name: "+ policy_1.getPolicyHolderLastName());
    System.out.println("\nPolicyholder's Age: "+ policy_1.getPolicyHolderAge());
    System.out.println("\nPolicyholder's Smoking Status: "+ policy_1.getSmokingStatus());
    System.out.printf("\nPolicyholder's Height: %.1f\n", policy_1.getPolicyHolderHeight());
    System.out.printf("\nPolicyholder's Weight: %.1f\n", policy_1.getPolicyHolderWeight());
    System.out.printf("\nPolicyholder;s BMI: %.2f\n", policy_1.getHOLDER_BMI());
    System.out.printf("\nPolicy Price: $%.2f\n", policy_1.getPOLICY_PRICE());
    }//end main
}//end Project_Gagik_Gasparyan class