class FanExecutor {

   public static void main(String[] args){

      String brand = Fan.getBrand();
      String model = Fan.getModel();
      int price = Fan.getPrice();
      int power = Fan.getPower();
      int blades = Fan.getBladeCount();
      int speed = Fan.getSpeedLevels();
      boolean remote = Fan.getRemoteControl();
      String color = Fan.getColor();
      String type = Fan.getType();
      int warranty = Fan.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Power: " + power + " Watts");
      System.out.println("Blade Count: " + blades);
      System.out.println("Speed Levels: " + speed);
      System.out.println("Remote Control: " + remote);
      System.out.println("Color: " + color);
      System.out.println("Type: " + type);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
