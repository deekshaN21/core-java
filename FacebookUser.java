class FacebookUser {


    public static void main(String[] args) {
	createFacebookAccount("deeksha@gamil.com", true, "deeksha","fb@12345","fb_45hj67_89token", "FB_987654321");
	}
	public static void createFacebookAccount(String email,boolean emailLoginSame,String userName,String password,String accessToken,String userId){
	


        System.out.println("Email: " + email);
        System.out.println("Email login same: " + emailLoginSame);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Access Token: " + accessToken);
        System.out.println("User ID: " + userId);
    }
}
