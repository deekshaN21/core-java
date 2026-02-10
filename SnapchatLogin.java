class SnapchatLogin {


    static void createSnapchatAccount(String userName, String email,String password, boolean otpVerification,boolean loginVerified) {

        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Password Verified: " + loginVerified);
        System.out.println("OTP Verification: " + otpVerification);
    }

    public static void main(String[] args) { 
	     createSnapchatAccount("deeksha_snap","deeksha@snapchat.com","snap@123",true,true);
    }
}
