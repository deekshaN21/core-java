class PowerBankExecutor {

   public static void main(String[] args){

      String brand = PowerBank.getBrand();
      String model = PowerBank.getModel();
      int capacity = PowerBank.getCapacity();
      int price = PowerBank.getPrice();
      boolean fastCharging = PowerBank.getFastCharging();
      String outputPorts = PowerBank.getOutputPorts();
      String inputType = PowerBank.getInputType();
      boolean ledIndicator = PowerBank.getLedIndicator();
      String color = PowerBank.getColor();
      String batteryType = PowerBank.getBatteryType();
      int warranty = PowerBank.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Capacity: " + capacity + " mAh");
      System.out.println("Price: " + price);
      System.out.println("Fast Charging: " + fastCharging);
      System.out.println("Output Ports: " + outputPorts);
      System.out.println("Input Type: " + inputType);
      System.out.println("LED Indicator: " + ledIndicator);
      System.out.println("Color: " + color);
      System.out.println("Battery Type: " + batteryType);
      System.out.println("Warranty: " + warranty + " Year");
   }
}
