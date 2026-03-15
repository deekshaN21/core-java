class Toxic {

    String name;
    String type;
    String chemicalName;
    String color;
    String smell;
    double toxicityLevel;
    double quantity;
    boolean flammable;
    boolean harmful;
    String usage;
    String manufacturer;
    String country;
    String storageType;
    String containerType;
    String safetyLevel;
    String handlingInstruction;
    int batchNumber;
    String hazardClass;
    String disposalMethod;
    String expiryDate;

    Toxic(String name,String type,String chemicalName,String color,String smell,
          double toxicityLevel,double quantity,boolean flammable,boolean harmful,
          String usage,String manufacturer,String country,String storageType,
          String containerType,String safetyLevel,String handlingInstruction,
          int batchNumber,String hazardClass,String disposalMethod,String expiryDate){

        this.name=name;
        this.type=type;
        this.chemicalName=chemicalName;
        this.color=color;
        this.smell=smell;
        this.toxicityLevel=toxicityLevel;
        this.quantity=quantity;
        this.flammable=flammable;
        this.harmful=harmful;
        this.usage=usage;
        this.manufacturer=manufacturer;
        this.country=country;
        this.storageType=storageType;
        this.containerType=containerType;
        this.safetyLevel=safetyLevel;
        this.handlingInstruction=handlingInstruction;
        this.batchNumber=batchNumber;
        this.hazardClass=hazardClass;
        this.disposalMethod=disposalMethod;
        this.expiryDate=expiryDate;
    }

    void display(){
        System.out.println(name);
        System.out.println(type);
        System.out.println(chemicalName);
        System.out.println(color);
        System.out.println(smell);
        System.out.println(toxicityLevel);
        System.out.println(quantity);
        System.out.println(flammable);
        System.out.println(harmful);
        System.out.println(usage);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(storageType);
        System.out.println(containerType);
        System.out.println(safetyLevel);
        System.out.println(handlingInstruction);
        System.out.println(batchNumber);
        System.out.println(hazardClass);
        System.out.println(disposalMethod);
        System.out.println(expiryDate);
    }
}