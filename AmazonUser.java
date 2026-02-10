class AmazonUser {
     public static void main(String[] args) {
	 createAmazonAccount("deeksha@amazon.com","DeekshaN", true , "AMZ12345");
	 }
	 
     public static void createAmazonAccount(String email, String userName, boolean primeUser, String userId){
	 

        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Prime User: " + primeUser);
        System.out.println("User ID: " + userId);
    }

}