class NetflixLogin {


    public static void main(String[] args) {
	
	createNetflixAccount("deeksha@netflix.com","netflix@123",true,true);
	}
	public static void createNetflixAccount(String emailId, String password,boolean subscriptionActive,boolean loginVerified){

        System.out.println("Login Requirements");
        System.out.println("Email ID: " + emailId);
        System.out.println("Password Verified: " + loginVerified);
        System.out.println("Subscription Active: " + subscriptionActive);
    }
}
