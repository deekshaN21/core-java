class TelegramLogin {


    static void createTelegramLogin(String mobileNumber,int otp, boolean otpVerified,boolean termsAccepted){

        System.out.println("Login Requirements");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("OTP: " + otp);
        System.out.println("OTP Verified: " + otpVerified);
        System.out.println("Terms Accepted: " + termsAccepted);
    }
    
	public static void main(String[] args){
	   createTelegramLogin("9988774455", 1234, true,true);
	  }
}

