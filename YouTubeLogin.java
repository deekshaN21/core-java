class YouTubeLogin {

    static void createYouTubeLogin(String emailId,String password ,boolean googleAccountLinked,boolean loginVerified){

        System.out.println("Login Requirements");
        System.out.println("Email ID: " + emailId);
        System.out.println("Password Verified: " + loginVerified);
        System.out.println("Google Account Linked: " + googleAccountLinked);
    }
    public static void main(String[] args){
	    createYouTubeLogin("deeksha@gmail.com","youtube@123", true, true);
	}
}