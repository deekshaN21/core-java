class camera{
     static String Brand;
     static String model;
     static String price;
     static String resolution;
     static String lensType;
     static String sensorType;
     static String opticalZoom;
     static String videoResolution;
     static String batteryCapacity;
     static String weight;
     
     public static boolean createCamera(String brand,String Model,String Price,String videoreso,String lens, String sensor,String optical,String videores,String battery, String weight){
     boolean iscameraCreated=false;
     boolean isBrand=false;
     boolean isModel=false;
     boolean isPrice=false;
     boolean isvideoreso=false;
     boolean islens=false;
     boolean issensor=false;
     boolean isoptical=false;
     boolean isvideaores=false;
     boolean isbattery=false;
     boolean isweight=false;
     
     
     if(brand!=null && !brand.isEmpty()){
        System.out.println("");
        isBrand=true;
     }
     else{
       System.out.println("brand name is invalid");
       }
     
      if(Model!=null && !Model.isEmpty()){
        System.out.println("");
        isModel=true;
     }
     else{
       System.out.println("model name is invalid");
       }
       
     if(Price!=null && !Price.isEmpty()){
        System.out.println("");
        isPrice=true;
     }
     else{
       System.out.println("price is invalid");
       }
       
       
      if(videoreso!=null && !videoreso.isEmpty()){
        System.out.println("");
        isvideoreso=true;
     }
     else{
       System.out.println("video resolution is invalid");
       }
       
     if(lens!=null && !lens.isEmpty()){
        System.out.println("");
        islens=true;
     }
     else{
       System.out.println("lens name is invalid");
       }
       
      if(sensor!=null && !sensor.isEmpty()){
        System.out.println("");
        issensor=true;
     }
     else{
       System.out.println("sensor name is invalid");
       }
       
     if(optical!=null && !optical.isEmpty()){
        System.out.println("");
        isoptical=true;
     }
     else{
       System.out.println("optical is invalid");
       }
       
      if(videores!=null && !videores.isEmpty()){
        System.out.println("");
        isvideaores=true;
     }
     else{
       System.out.println("videores is invalid");
       }
       
     if(battery!=null && !battery.isEmpty()){
        System.out.println("");
        isbattery=true;
     }
     else{
       System.out.println("battery is invalid");
       }
       
     if(weight!=null && !weight.isEmpty()){
        System.out.println("");
        isweight=true;
     }
     else{
       System.out.println("weight is invalid");
       }
       
    if (isBrand == true && 
        isModel == true && 
        isPrice == true && 
        isvideoreso == true && 
        islens == true && 
        issensor == true && 
        isoptical == true && 
        isvideaores == true && 
        isbattery == true && 
        isweight == true) {
			

        iscameraCreated = true;
    }
    return iscameraCreated;
}
       
       public static void getCameraDetails() {

        System.out.println("The brand is: " + Brand);
        System.out.println("The model is: " + model);
        System.out.println("The price is: " + price);
        System.out.println("The resolution is: " + resolution);
        System.out.println("The lens type is: " + lensType);
        System.out.println("The sensor type is: " + sensorType);
        System.out.println("The optical zoom is: " + opticalZoom);
        System.out.println("The video resolution is: " + videoResolution);
        System.out.println("The battery capacity is: " + batteryCapacity);
        System.out.println("WiFi enabled: " + weight);
    }
}
