class ZomatoAccount {

    static void createZomatoAccount(String email, String password , boolean loginVerified ,String userName,long mobileNumber ,boolean premiumUser, double walletBalance){

        System.out.println("Login Details");
        System.out.println("Email: " + email);
        System.out.println("Password Verified: " + loginVerified);
        System.out.println("Account Details");
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Premium User: " + premiumUser);
        System.out.println("Wallet Balance: ₹" + walletBalance);

    }
    
	public static void main(String[] args){
	    createZomatoAccount("deeksha@zomato.com","zomato@123", true, "deeksha", 9966554477L, true , 1500.0 );
	}
}
		
