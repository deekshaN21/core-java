class CoffeeMakerExecutor {

   public static void main(String[] args){

      String brand = CoffeeMaker.getBrand();
      String model = CoffeeMaker.getModel();
      int price = CoffeeMaker.getPrice();
      int power = CoffeeMaker.getPower();
      int capacity = CoffeeMaker.getCapacity();
      String type = CoffeeMaker.getType();
      boolean autoShut = CoffeeMaker.getAutoShutOff();
      boolean waterIndicator = CoffeeMaker.getWaterLevelIndicator();
      String material = CoffeeMaker.getBodyMaterial();
      String color = CoffeeMaker.getColor();
      int warranty = CoffeeMaker.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Power: " + power + " Watts");
      System.out.println("Capacity: " + capacity + " Cups");
      System.out.println("Type: " + type);
      System.out.println("Auto Shut-Off: " + autoShut);
      System.out.println("Water Level Indicator: " + waterIndicator);
      System.out.println("Body Material: " + material);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
