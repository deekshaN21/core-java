class HairStraightenerExecutor {

   public static void main(String[] args){

      String brand = HairStraightener.getBrand();
      String model = HairStraightener.getModel();
      int price = HairStraightener.getPrice();
      String plateMaterial = HairStraightener.getPlateMaterial();
      int maxTemp = HairStraightener.getMaxTemperature();
      int minTemp = HairStraightener.getMinTemperature();
      int heatUpTime = HairStraightener.getHeatUpTime();
      boolean tempControl = HairStraightener.getTemperatureControl();
      boolean autoShut = HairStraightener.getAutoShutOff();
      boolean swivelCord = HairStraightener.getSwivelCord();
      double cordLength = HairStraightener.getCordLength();
      boolean warranty = HairStraightener.getWarranty();
      String color = HairStraightener.getColor();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Plate Material: " + plateMaterial);
      System.out.println("Minimum Temperature: " + minTemp + "°C");
      System.out.println("Maximum Temperature: " + maxTemp + "°C");
      System.out.println("Heat Up Time: " + heatUpTime + " Seconds");
      System.out.println("Temperature Control: " + tempControl);
      System.out.println("Auto Shut-Off: " + autoShut);
      System.out.println("Swivel Cord: " + swivelCord);
      System.out.println("Cord Length: " + cordLength + " Meters");
      System.out.println("Warranty Available: " + warranty);
      System.out.println("Color: " + color);
   }
}
