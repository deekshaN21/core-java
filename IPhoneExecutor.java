class IPhoneExecutor {

   public static void main(String[] args){

      String brand = IPhone.getBrand();
      String model = IPhone.getModel();
      int price = IPhone.getPrice();
      int storage = IPhone.getStorage();
      int ram = IPhone.getRam();
      String processor = IPhone.getProcessor();
      double displaySize = IPhone.getDisplaySize();
      String displayType = IPhone.getDisplayType();
      int battery = IPhone.getBatteryCapacity();
      boolean support5G = IPhone.get5GSupport();
      boolean faceId = IPhone.getFaceId();
      String os = IPhone.getOperatingSystem();
      int warranty = IPhone.getWarranty();

      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Price: " + price);
      System.out.println("Storage: " + storage + " GB");
      System.out.println("RAM: " + ram + " GB");
      System.out.println("Processor: " + processor);
      System.out.println("Display Size: " + displaySize + " inches");
      System.out.println("Display Type: " + displayType);
      System.out.println("Battery Capacity: " + battery + " mAh");
      System.out.println("5G Support: " + support5G);
      System.out.println("Face ID: " + faceId);
      System.out.println("Operating System: " + os);
      System.out.println("Warranty: " + warranty + " Year");
   }
}
