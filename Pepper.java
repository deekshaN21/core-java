class Pepper {

    String name;
    String type;
    String color;
    String origin;
    String flavor;
    double price;
    double weight;
    boolean organic;
    boolean spicy;
    String packaging;
    String brand;
    String manufacturer;
    String country;
    String usage;
    String quality;
    int quantity;
    String storageType;
    String grade;
    String exportQuality;
    String expiryDate;

    Pepper(String name,String type,String color,String origin,String flavor,
           double price,double weight,boolean organic,boolean spicy,String packaging,
           String brand,String manufacturer,String country,String usage,String quality,
           int quantity,String storageType,String grade,String exportQuality,String expiryDate){

        this.name=name;
        this.type=type;
        this.color=color;
        this.origin=origin;
        this.flavor=flavor;
        this.price=price;
        this.weight=weight;
        this.organic=organic;
        this.spicy=spicy;
        this.packaging=packaging;
        this.brand=brand;
        this.manufacturer=manufacturer;
        this.country=country;
        this.usage=usage;
        this.quality=quality;
        this.quantity=quantity;
        this.storageType=storageType;
        this.grade=grade;
        this.exportQuality=exportQuality;
        this.expiryDate=expiryDate;
    }

    void display(){

        System.out.println(name);
        System.out.println(type);
        System.out.println(color);
        System.out.println(origin);
        System.out.println(flavor);
        System.out.println(price);
        System.out.println(weight);
        System.out.println(organic);
        System.out.println(spicy);
        System.out.println(packaging);
        System.out.println(brand);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(quantity);
        System.out.println(storageType);
        System.out.println(grade);
        System.out.println(exportQuality);
        System.out.println(expiryDate);
    }
}