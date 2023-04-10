import java.util.*; //import needed to create and use the scanner object which reads user input or files
import java.util.ArrayList;
import java.io.*;

public class Project_Gagik_Gasparyan {//class demonstrating attributes and behaviors of the Policy class

    public static void main(String[] s){  

    try {

    //These are the variables in the main method that will store input values
    int policyNumber, holderAge;
    double holderHeight=0.0, holderWeight=0.0;
    String providerName, holderFName, holderLName, smokerStatus;
    ArrayList<Policy> policyList = new ArrayList<Policy>();

    //create a file object and link to the file txt in directory
    //create a scanner and pass in the file object reference
    File policyInformation = new File("PolicyInformation.txt");
    Scanner readPolicyInformation = new Scanner(policyInformation);
    //continue reading while there is any data left to read
    while (readPolicyInformation.hasNext()){
    
      policyNumber = readPolicyInformation.nextInt();
      providerName = readPolicyInformation.nextLine();
      holderFName = readPolicyInformation.nextLine();              
      holderLName = readPolicyInformation.nextLine();           
      holderAge = readPolicyInformation.nextInt();     
      smokerStatus = readPolicyInformation.nextLine();     
      holderHeight = readPolicyInformation.nextInt();     
      holderWeight = readPolicyInformation.nextInt();     
         //if there is a blank line next read in blank line
         if(readPolicyInformation.hasNext()){
            readPolicyInformation.nextLine();
         }
         //create a policy object and pass values into the parameters
         Policy policy = new Policy(policyNumber, providerName, holderFName, holderLName, holderAge, smokerStatus, holderHeight, holderWeight);
         policyList.add(policy);//add the newly created policy object to the array list
   
    }readPolicyInformation.close();//close the file
    
    for(int i=0; i < policyList.size(); i++){
    
    System.out.println("\nPolicy Number: "+ policyList.get(i).getPolicyNumber());
    System.out.println("\nProvider Name: "+ policyList.get(i).getProviderName());
    System.out.println("\nPolicyholder's First Name: "+ policyList.get(i).getPolicyHolderFirstName());
    System.out.println("\nPolicyholder's Last Name: "+ policyList.get(i).getPolicyHolderLastName());
    System.out.println("\nPolicyholder's Age: "+ policyList.get(i).getPolicyHolderAge());
    System.out.println("\nPolicyholder's Smoking Status: "+ policyList.get(i).getSmokingStatus());
    System.out.printf("\nPolicyholder's Height: %.1f\n", policyList.get(i).getPolicyHolderHeight());
    System.out.printf("\nPolicyholder's Weight: %.1f\n", policyList.get(i).getPolicyHolderWeight());
    System.out.printf("\nPolicyholder;s BMI: %.2f\n", policyList.get(i).getHOLDER_BMI());
    System.out.printf("\nPolicy Price: $%.2f\n", policyList.get(i).getPOLICY_PRICE());
    
    }
  
        
    }catch(IOException ex){
    System.out.println("Error reading file"+ ex.getMessage());
    }

    }//end main
} //end Project_Gagik_Gasparyan class