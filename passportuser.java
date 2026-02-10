class passportuser{

   
    public static void main(String[] args){
	createpassportAccount("deeksha21@gmail.com", true ,"Deeksha" ,"dee243/%$$%%*^","45674564gj_56fghj_hjb45656","deeksha21@gmail.com");
	}
	public static void createpassportAccount(String email, boolean emainloginSamne , String userName ,String password,String token, String userId){

	
	System.out.println("user infomartion");
	System.out.println("user email :" + email);
	System.out.println("use email login same:" + emainloginSamne);
	System.out.println("user name:" + userName);
	System.out.println("user password:" + password);
	System.out.println("user Token :" + token);
	System.out.println("user id:" + userId);
	}
}
	