class FridgeExecutor {

   public static void main(String[] args){

      String brand = Fridge.getBrand();
      String model = Fridge.getModel();
      int price = Fridge.getPrice();
      int capacity = Fridge.getCapacity();
      int starRating = Fridge.getStarRating();
      String type = Fridge.getType();
      boolean inverter = Fridge.getInverterTechnology();
      String defrosting = Fridge.getDefrostingType();
      String color = Fridge.getColor();
      int doors = Fridge.getNumberOfDoors();
      int warranty = Fridge.getWarranty();
      int compressorWarranty = Fridge.getCompressorWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Capacity: " + capacity + " Litres");
      System.out.println("Star Rating: " + starRating + " Star");
      System.out.println("Type: " + type);
      System.out.println("Inverter Technology: " + inverter);
      System.out.println("Defrosting Type: " + defrosting);
      System.out.println("Color: " + color);
      System.out.println("Number of Doors: " + doors);
      System.out.println("Warranty: " + warranty + " Year");
      System.out.println("Compressor Warranty: " + compressorWarranty + " Years");
   }
}
