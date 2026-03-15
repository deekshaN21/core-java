class iPhone {

    String model;
    String color;
    int storage;
    double price;
    String processor;
    int cameraMP;
    double screenSize;
    int batteryCapacity;
    String operatingSystem;
    boolean faceID;
    boolean waterResistant;
    String manufacturer;

    iPhone(String model,String color,int storage,double price,String processor,
           int cameraMP,double screenSize,int batteryCapacity,String operatingSystem,
           boolean faceID,boolean waterResistant,String manufacturer){

        this.model = model;
        this.color = color;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.cameraMP = cameraMP;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.faceID = faceID;
        this.waterResistant = waterResistant;
        this.manufacturer = manufacturer;

        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("Processor: " + processor);
        System.out.println("Camera MP: " + cameraMP);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Face ID: " + faceID);
        System.out.println("Water Resistant: " + waterResistant);
        System.out.println("Manufacturer: " + manufacturer);
    }
}