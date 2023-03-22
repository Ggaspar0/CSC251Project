public class Policy{

   /*This class is used to instantiate objects which represent an insurance policy, each object represents the policy of a single policyholder
   This class contains functions used to calculate elements of a policy, which are necessary to determine policy price. Policy price is also
   calculated within this class*/

    //Class attributes

    private int policyNumber ;                  // Policy Number
    private String providerName;                // Provider Name
    private String policyHolderFirstName;       // POlicyholder’s First Name
    private String policyHolderLastName;        // Policyholder’s Last Name
    private int policyHolderAge;                // Policyholder’s Age
    private String smokingStatus;               // Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
    private double policyHolderHeight;          // Policyholder’s Height (in inches)
    private double policyHolderWeight;          // Policyholder’s Weight (in pounds)
    private final double HOLDER_BMI;            // Policyholder's body mass index based on weight and height
    private final double POLICY_PRICE;          // Total price of the policy


                                       //Constructors
    
    //a no-arguments constructor that initializes all attributes to default values provided
    Policy(){

        policyNumber = 0;
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge=0;
        smokingStatus = "";
        policyHolderHeight = 0;
        policyHolderWeight = 0;
        HOLDER_BMI =calculateBMI(policyHolderWeight,policyHolderHeight);
        POLICY_PRICE =calculatePrice(policyHolderAge,smokingStatus, HOLDER_BMI);
    }

    //a constructor that accepts values for all attributes as arguments and initializes the object attributes accordingly
    Policy(int policyNum, String provider, String holderFName, String holderLName, int age, String smokerStatus, double holderHeight, double holderWeight){

        policyNumber = policyNum;
        providerName = provider;
        policyHolderFirstName = holderFName;
        policyHolderLastName = holderLName;
        policyHolderAge = age;
        smokingStatus = smokerStatus;
        policyHolderHeight = holderHeight;
        policyHolderWeight = holderWeight;
        HOLDER_BMI =calculateBMI(policyHolderWeight,policyHolderHeight);
        POLICY_PRICE =calculatePrice(policyHolderAge,smokingStatus, HOLDER_BMI);
    }

               //getters
    
    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    public String getSmokingStatus() {
            return smokingStatus;
    }

    public double getPolicyHolderHeight() {
            return policyHolderHeight;
    }

    public double getPolicyHolderWeight() {
            return policyHolderWeight;
    }

    public double getHOLDER_BMI(){
            return HOLDER_BMI;
    }

    public double getPOLICY_PRICE(){
            return POLICY_PRICE;
    }



                        //setters
        
    public void setPolicyNumber(int pNum) {
            policyNumber = pNum;
        }

    public void setProviderName(String provider) {
            providerName = provider;
        }

    public void setPolicyHolderFirstName(String holderFName) {
            policyHolderFirstName = holderFName;
        }

    public void setPolicyHolderLastName(String holderLName) {
            policyHolderLastName = holderLName;
        }

    public void setPolicyHolderAge(int age) {
            policyHolderAge = age;
        }

    public void setSmokingStatus(String smokeStatus) {
            smokingStatus = smokeStatus;
        }

    public void setPolicyHolderHeight(double holderHeight) {
            policyHolderHeight = holderHeight;
        }

    public void setPolicyHolderWeight(double holderWeight) {
            policyHolderWeight = holderWeight;
        }

                                                               //Class Methods

        //a method that accepts the policyholder's weight and height, calcultes the body mass index of the user, and returns the value   
        public static double calculateBMI(double weight, double height){
            return (weight*703)/(height*height);//a pre-defined formula used to determine body mass index
        }
        

        //a method that accepts the policyholder's age, smoking status and their BMI, and returns a calculated policy price based on conditional parameters
        public static double calculatePrice(int age, String smokeStatus, double BMI){
        return 600 + (age>50?75:0) + (smokeStatus.equals("smoker")?100:0) + (BMI>35?(BMI-35)*20:0);
            
        //base cost of the policy is $600
        //if customer is over 50, an additional $75 is added to base, otherwise $0 is added
        //if smoking status is "smoker", an additional $100 is added to base, otherwise $0 is added
        //for each point of BMI over 35 points, additional amount of money is added to the base, amount determined by pre-defined formula(BMI-35)*20
        }

    }//end Policy class