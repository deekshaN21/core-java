class ZeptoUser {

    static void createZeptoUser(String userName, String mobile,String location,boolean expressDelivery){

        System.out.println("User Name: " + userName);
        System.out.println("Mobile: " + mobile);
        System.out.println("Location: " + location);
        System.out.println("Express Delivery: " + expressDelivery);
    }
    
	public static void main(String[] args){
	    createZeptoUser("deeksha","9988774455","Bengaluru", true);
	}
}