class ToasterExecutor {

   public static void main(String[] args){

      String brand = Toaster.getBrand();
      String model = Toaster.getModel();
      int price = Toaster.getPrice();
      int power = Toaster.getPower();
      int slots = Toaster.getNumberOfSlots();
      boolean autoPop = Toaster.getAutoPopUp();
      boolean defrost = Toaster.getDefrostFunction();
      boolean reheat = Toaster.getReheatFunction();
      String material = Toaster.getBodyMaterial();
      String color = Toaster.getColor();
      int warranty = Toaster.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Power: " + power + " Watts");
      System.out.println("Number of Slots: " + slots);
      System.out.println("Auto Pop-Up: " + autoPop);
      System.out.println("Defrost Function: " + defrost);
      System.out.println("Reheat Function: " + reheat);
      System.out.println("Body Material: " + material);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
