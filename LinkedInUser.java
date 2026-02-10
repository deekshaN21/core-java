class LinkedInUser {

    public static void main(String[] args) {
	createLinkedAccount("deeksha","deeksha@linkedin","Bengaluru",350,true);
	}
	public static void createLinkedAccount(String name, String email, String location ,int connections , boolean openToWork){
	

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Location: " + location);
        System.out.println("Connections: " + connections);
        System.out.println("Open To Work: " + openToWork);
    }
}
