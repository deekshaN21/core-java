class RedCrossBlood{
	 
   public static void main(String[] args){
   createDonorAccount("baba@gmai.com", 12345 ,"baba" ,"guru", "babaguru", 101 , "baba1221guru","baba1221guru");
   }
  
   public static void createDonorAccount(String emailId, int donorId, String firstName,String lastname, String userName , int zipcode , String password , String repeatPassword){
   
   
   System.out.println("the donor email id is:" + emailId);
   System.out.println("the donor id is :" + donorId);
   System.out.println("the firstName of the user is :"+ firstName);
   System.out.println("the lastname of the user is :"+ lastname);
   System.out.println("the userName of the user is :"+ userName);
   System.out.println(" zipcode of the user is :"+ zipcode);
   System.out.println("the password of the user is :"+ password);
   System.out.println("the  repeat password of the user is :"+ repeatPassword);
   
   }
  
}  
   
   
   
   