class ACExecutor {

   public static void main(String[] args){

      String brand = AC.getBrand();
      String model = AC.getModel();
      int price = AC.getPrice();
      double capacity = AC.getCapacity();
      int starRating = AC.getStarRating();
      String type = AC.getType();
      boolean inverter = AC.getInverterTechnology();
      boolean wifi = AC.getWifiSupport();
      String coolingCapacity = AC.getCoolingCapacity();
      String refrigerant = AC.getRefrigerantType();
      int warranty = AC.getWarranty();
      int compressorWarranty = AC.getCompressorWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Capacity: " + capacity + " Ton");
      System.out.println("Star Rating: " + starRating + " Star");
      System.out.println("Type: " + type);
      System.out.println("Inverter Technology: " + inverter);
      System.out.println("WiFi Support: " + wifi);
      System.out.println("Cooling Capacity: " + coolingCapacity);
      System.out.println("Refrigerant Type: " + refrigerant);
      System.out.println("Warranty: " + warranty + " Year");
      System.out.println("Compressor Warranty: " + compressorWarranty + " Years");
   }
}
