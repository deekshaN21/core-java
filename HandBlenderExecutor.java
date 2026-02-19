class HandBlenderExecutor {

   public static void main(String[] args){

      String brand = HandBlender.getBrand();
      String model = HandBlender.getModel();
      int price = HandBlender.getPrice();
      int power = HandBlender.getPower();
      String bladeMaterial = HandBlender.getBladeMaterial();
      String bodyMaterial = HandBlender.getBodyMaterial();
      int speed = HandBlender.getSpeedSettings();
      boolean turbo = HandBlender.getTurboMode();
      boolean detachable = HandBlender.getDetachableShaft();
      String color = HandBlender.getColor();
      int warranty = HandBlender.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Power: " + power + " Watts");
      System.out.println("Blade Material: " + bladeMaterial);
      System.out.println("Body Material: " + bodyMaterial);
      System.out.println("Speed Settings: " + speed);
      System.out.println("Turbo Mode: " + turbo);
      System.out.println("Detachable Shaft: " + detachable);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
