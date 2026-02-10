class PinterestLogin {

    static void createPintrestAccount(String email, String userName, String password, boolean twoFactorAuth, boolean termsAccepted) {
		System.out.println("email is : "+ email);
		System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
		System.out.println("twoFactorAuth: " + twoFactorAuth);
		System.out.println("termsAccepted: " + termsAccepted);
    }
    public static void main(String[] args){
	     createPintrestAccount("deeksha@pinterest.com","deeksha_pins","pin@123", true, true);
	}
}


