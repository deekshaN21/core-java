class FastTrackFPodsExecutor {

   public static void main(String[] args){

      String color = FastTrackFPods.getColor();
      String model = FastTrackFPods.getModel();
      int playTime = FastTrackFPods.getPlayTime();
      String driverSize = FastTrackFPods.getDriverSize();
      String micType = FastTrackFPods.getMicType();
      String waterResistance = FastTrackFPods.getWaterResistance();
      String bluetoothVersion = FastTrackFPods.getBluetoothVersion();
      String chargingTech = FastTrackFPods.getChargingTechnology();
      String fastChargeInfo = FastTrackFPods.getFastChargeInfo();
      int warranty = FastTrackFPods.getWarranty();
      String type = FastTrackFPods.getType();
      String connectivity = FastTrackFPods.getConnectivity();
      boolean microphone = FastTrackFPods.getMicrophone();
      int numberOfItems = FastTrackFPods.getNumberOfItems();
      String packageContains = FastTrackFPods.getPackageContains();

      System.out.println("Color: " + color);
      System.out.println("Model: " + model);
      System.out.println("Playtime: " + playTime + " Hours");
      System.out.println("Driver Size: " + driverSize);
      System.out.println("Mic Type: " + micType);
      System.out.println("Water Resistance: " + waterResistance);
      System.out.println("Bluetooth Version: " + bluetoothVersion);
      System.out.println("Charging Technology: " + chargingTech);
      System.out.println("Fast Charge Info: " + fastChargeInfo);
      System.out.println("Warranty: " + warranty + " Year");
      System.out.println("Type: " + type);
      System.out.println("Connectivity: " + connectivity);
      System.out.println("Microphone Available: " + microphone);
      System.out.println("Number Of Items: " + numberOfItems);
      System.out.println("Package Contains: " + packageContains);
   }
}
