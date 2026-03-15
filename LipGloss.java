class LipGloss {

    String brand;
    String shadeName;
    String color;
    String finish;
    double price;
    double weight;
    boolean shiny;
    boolean waterproof;
    String flavor;
    String packaging;
    String manufacturer;
    String expiryDate;

    LipGloss(String brand,String shadeName,String color,String finish,double price,
             double weight,boolean shiny,boolean waterproof,String flavor,
             String packaging,String manufacturer,String expiryDate){

        this.brand = brand;
        this.shadeName = shadeName;
        this.color = color;
        this.finish = finish;
        this.price = price;
        this.weight = weight;
        this.shiny = shiny;
        this.waterproof = waterproof;
        this.flavor = flavor;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Shade Name: " + shadeName);
        System.out.println("Color: " + color);
        System.out.println("Finish: " + finish);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shiny: " + shiny);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Flavor: " + flavor);
        System.out.println("Packaging: " + packaging);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}