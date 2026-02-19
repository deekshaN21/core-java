class GroomerExecutor {

   public static void main(String[] args){

      String brand = Groomer.getBrand();
      String model = Groomer.getModel();
      int price = Groomer.getPrice();
      int batteryCapacity = Groomer.getBatteryCapacity();
      int chargingTime = Groomer.getChargingTime();
      int runtime = Groomer.getRuntime();
      String bladeMaterial = Groomer.getBladeMaterial();
      boolean waterproof = Groomer.getWaterproof();
      int warranty = Groomer.getWarranty();
      String color = Groomer.getColor();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
      System.out.println("Charging Time: " + chargingTime + " Hours");
      System.out.println("Runtime: " + runtime + " Minutes");
      System.out.println("Blade Material: " + bladeMaterial);
      System.out.println("Waterproof: " + waterproof);
      System.out.println("Warranty: " + warranty + " Year(s)");
      System.out.println("Color: " + color);
   }
}
