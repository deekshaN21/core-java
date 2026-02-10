class SpotifyUser {

    static void createSpotifyAccount(String userName, String email, boolean premiumUser){
	

        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Premium User: " + premiumUser);
    }


    public static void main(String[] args) {
	   createSpotifyAccount("deeksha","deeksha.spotify@gmail.com", true);
	}
}
