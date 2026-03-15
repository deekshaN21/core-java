class Chocolate {

    String brand;
    String flavor;
    String type;
    double weight;
    double price;
    String color;
    boolean sugarFree;
    String originCountry;
    String packaging;
    int quantity;
    String manufacturer;
    String expiryDate;

    Chocolate(String brand,String flavor,String type,double weight,double price,
              String color,boolean sugarFree,String originCountry,
              String packaging,int quantity,String manufacturer,String expiryDate){

        this.brand = brand;
        this.flavor = flavor;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.sugarFree = sugarFree;
        this.originCountry = originCountry;
        this.packaging = packaging;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Sugar Free: " + sugarFree);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Packaging: " + packaging);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}