class UPSExecutor {

   public static void main(String[] args){

      String brand = UPS.getBrand();
      String model = UPS.getModel();
      int price = UPS.getPrice();
      int capacity = UPS.getCapacity();
      int outputPower = UPS.getOutputPower();
      String battery = UPS.getBatteryType();
      int backup = UPS.getBackupTime();
      boolean overload = UPS.getOverloadProtection();
      boolean surge = UPS.getSurgeProtection();
      String color = UPS.getColor();
      int warranty = UPS.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Capacity: " + capacity + " VA");
      System.out.println("Output Power: " + outputPower + " Watts");
      System.out.println("Battery Type: " + battery);
      System.out.println("Backup Time: " + backup + " Minutes");
      System.out.println("Overload Protection: " + overload);
      System.out.println("Surge Protection: " + surge);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
