class RapidoLogin {

    static void createRapidoAccount(String mobileNumber, String otp,boolean otpVerified, boolean termsAccepted) {

        System.out.println("Login Requirements");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("OTP: " + otp);
        System.out.println("OTP Verified: " + otpVerified);
        System.out.println("Terms Accepted: " + termsAccepted);
    }

    public static void main(String[] args) {
        createRapidoAccount("9966332211", "123", true, true);
    }
}
