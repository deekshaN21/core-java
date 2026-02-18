class ChargerExecutor {

   public static void main(String[] args){

      String brand = Charger.getBrand();
      String model = Charger.getModel();
      int price = Charger.getPrice();
      int wattage = Charger.getWattage();
      String type = Charger.getType();
      String cableType = Charger.getCableType();
      boolean fastCharging = Charger.getFastChargingSupport();
      String color = Charger.getColor();
      int warranty = Charger.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Wattage: " + wattage + "W");
      System.out.println("Type: " + type);
      System.out.println("Cable Type: " + cableType);
      System.out.println("Fast Charging Support: " + fastCharging);
      System.out.println("Color: " + color);
      System.out.println("Warranty: " + warranty + " Year(s)");
   }
}
