class CameraExecutor {

   public static void main(String[] args){

      String brand = Camera.getBrand();
      String model = Camera.getModel();
      int price = Camera.getPrice();
      int megapixel = Camera.getMegapixel();
      String sensor = Camera.getSensorType();
      boolean wifi = Camera.getWifi();
      boolean bluetooth = Camera.getBluetooth();
      String videoResolution = Camera.getVideoResolution();
      int zoom = Camera.getZoom();
      String displayType = Camera.getDisplayType();
      double displaySize = Camera.getDisplaySize();
      String battery = Camera.getBatteryType();
      int warranty = Camera.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Megapixel: " + megapixel + " MP");
      System.out.println("Sensor Type: " + sensor);
      System.out.println("WiFi: " + wifi);
      System.out.println("Bluetooth: " + bluetooth);
      System.out.println("Video Resolution: " + videoResolution);
      System.out.println("Zoom: " + zoom + "x");
      System.out.println("Display Type: " + displayType);
      System.out.println("Display Size: " + displaySize + " inches");
      System.out.println("Battery Type: " + battery);
      System.out.println("Warranty: " + warranty + " Years");
   }
}
