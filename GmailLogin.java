class GmailLogin {


    public static void main(String[] args) {
    createGmailAccount("deeksha@gmail.com","gmail@123", true, true);
	}
	public static void createGmailAccount(String emailId, String password,boolean twoStepVerification,boolean loginVerified){
	

 
        System.out.println("Email ID: " + emailId);
        System.out.println("Password Verified: " + loginVerified);
        System.out.println("Two-Step Verification: " + twoStepVerification);
		System.out.println("Two-Step Verification: " + password);
    }
}
