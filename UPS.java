class UPS {

   static String getBrand(){
      return "APC";
   }

   static String getModel(){
      return "APC BX1100C-IN";
   }

   static int getPrice(){
      return 5999;
   }

   static int getCapacity(){
      return 1100;   // VA
   }

   static int getOutputPower(){
      return 660;   // Watts
   }

   static String getBatteryType(){
      return "Sealed Lead Acid";
   }

   static int getBackupTime(){
      return 20;   // Minutes (approx)
   }

   static boolean getOverloadProtection(){
      return true;
   }

   static boolean getSurgeProtection(){
      return true;
   }

   static String getColor(){
      return "Black";
   }

   static int getWarranty(){
      return 2;   // Years
   }
}
