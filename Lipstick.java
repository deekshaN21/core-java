class Lipstick {

    String brand;
    String shadeName;
    String color;
    String type;
    double price;
    double weight;
    boolean matte;
    boolean waterproof;
    String skinTone;
    String packaging;
    String manufacturer;
    String expiryDate;

    Lipstick(String brand,String shadeName,String color,String type,double price,
             double weight,boolean matte,boolean waterproof,String skinTone,
             String packaging,String manufacturer,String expiryDate){

        this.brand = brand;
        this.shadeName = shadeName;
        this.color = color;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.matte = matte;
        this.waterproof = waterproof;
        this.skinTone = skinTone;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Shade Name: " + shadeName);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Matte: " + matte);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Skin Tone: " + skinTone);
        System.out.println("Packaging: " + packaging);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}