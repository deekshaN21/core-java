class OvenExecutor {

   public static void main(String[] args){

      String brand = Oven.getBrand();
      String model = Oven.getModel();
      int price = Oven.getPrice();
      int capacity = Oven.getCapacity();
      String type = Oven.getType();
      int power = Oven.getPowerConsumption();
      boolean autoCook = Oven.getAutoCookMenu();
      boolean childLock = Oven.getChildLock();
      String control = Oven.getControlType();
      String color = Oven.getColor();
      int warranty = Oven.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Capacity: " + capacity + " Litres");
      System.out.println("Type: " + type);
      System.out.println("Power Consumption: " + power + " Watts");
      System.out.println("Auto Cook Menu: " + autoCook);
      System.out.println("Child Lock: " + childLock);
      System.out.println("Control Type: " + control);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Year");
   }
}
