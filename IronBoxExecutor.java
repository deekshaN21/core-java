class IronBoxExecutor {

   public static void main(String[] args){

      String brand = IronBox.getBrand();
      String model = IronBox.getModel();
      int price = IronBox.getPrice();
      int power = IronBox.getPower();
      String soleplate = IronBox.getSoleplateMaterial();
      boolean steam = IronBox.getSteamFunction();
      boolean tempControl = IronBox.getTemperatureControl();
      boolean autoShut = IronBox.getAutoShutOff();
      String color = IronBox.getColor();
      int warranty = IronBox.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Power: " + power + " Watts");
      System.out.println("Soleplate Material: " + soleplate);
      System.out.println("Steam Function: " + steam);
      System.out.println("Temperature Control: " + tempControl);
      System.out.println("Auto Shut-Off: " + autoShut);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
