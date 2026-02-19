class ProjectorExecutor {

   public static void main(String[] args){

      String brand = Projector.getBrand();
      String model = Projector.getModel();
      int price = Projector.getPrice();
      int brightness = Projector.getBrightness();
      String resolution = Projector.getResolution();
      String technology = Projector.getDisplayTechnology();
      boolean hdmi = Projector.getHDMISupport();
      boolean wifi = Projector.getWifiSupport();
      String lampLife = Projector.getLampLife();
      String color = Projector.getColor();
      int warranty = Projector.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Brightness: " + brightness + " Lumens");
      System.out.println("Resolution: " + resolution);
      System.out.println("Display Technology: " + technology);
      System.out.println("HDMI Support: " + hdmi);
      System.out.println("WiFi Support: " + wifi);
      System.out.println("Lamp Life: " + lampLife);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
