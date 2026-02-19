class MixerExecutor {

   public static void main(String[] args){

      String brand = Mixer.getBrand();
      String model = Mixer.getModel();
      int price = Mixer.getPrice();
      int power = Mixer.getPower();
      int jars = Mixer.getNumberOfJars();
      String bodyMaterial = Mixer.getBodyMaterial();
      String bladeMaterial = Mixer.getBladeMaterial();
      boolean overload = Mixer.getOverloadProtection();
      String color = Mixer.getColor();
      int warranty = Mixer.getWarranty();
      int motorWarranty = Mixer.getMotorWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Power: " + power + " Watts");
      System.out.println("Number of Jars: " + jars);
      System.out.println("Body Material: " + bodyMaterial);
      System.out.println("Blade Material: " + bladeMaterial);
      System.out.println("Overload Protection: " + overload);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
      System.out.println("Motor Warranty: " + motorWarranty + " Years");
   }
}
