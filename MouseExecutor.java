class MouseExecutor {

   public static void main(String[] args){

      String brand = Mouse.getBrand();
      String model = Mouse.getModel();
      int price = Mouse.getPrice();
      String connectivity = Mouse.getConnectivity();
      int dpi = Mouse.getDPI();
      boolean bluetooth = Mouse.getBluetoothSupport();
      String color = Mouse.getColor();
      String battery = Mouse.getBatteryType();
      int buttons = Mouse.getNumberOfButtons();
      boolean silentClick = Mouse.getSilentClick();
      int warranty = Mouse.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Connectivity: " + connectivity);
      System.out.println("DPI: " + dpi);
      System.out.println("Bluetooth Support: " + bluetooth);
      System.out.println("Color: " + color);
      System.out.println("Battery Type: " + battery);
      System.out.println("Number Of Buttons: " + buttons);
      System.out.println("Silent Click: " + silentClick);
      System.out.println("Warranty: " + warranty + " Year");
   }
}
