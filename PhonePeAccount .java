class PhonePeAccount {

    public static void main(String[] args) {
    createPhonePeAccount("9876543210",1234, true ,"Deeksha", "123456789012L","State Bank of India","SBIN0001234", 25000.75);
	}
	public static void createPhonePeAccount(String mobileNumber, int upiPin ,boolean pinVerified,String accountHolderName, long accountNumber String bankName,String ifscCode, double balance){
	

        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI PIN Verified: " + pinVerified);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Balance: ₹" + balance);
    }
}
