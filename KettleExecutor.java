class KettleExecutor {

   public static void main(String[] args){

      String brand = Kettle.getBrand();
      String model = Kettle.getModel();
      int price = Kettle.getPrice();
      double capacity = Kettle.getCapacity();
      int power = Kettle.getPower();
      String material = Kettle.getBodyMaterial();
      boolean autoCut = Kettle.getAutoCutOff();
      boolean dryBoil = Kettle.getDryBoilProtection();
      String color = Kettle.getColor();
      int warranty = Kettle.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Capacity: " + capacity + " Litres");
      System.out.println("Power: " + power + " Watts");
      System.out.println("Body Material: " + material);
      System.out.println("Auto Cut-Off: " + autoCut);
      System.out.println("Dry Boil Protection: " + dryBoil);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Year");
   }
}
