class IceCream {

    String brand;
    String flavor;
    String color;
    double price;
    double weight;
    String type;
    boolean sugarFree;
    boolean dairyFree;
    String packaging;
    int quantity;
    String manufacturer;
    String expiryDate;

    IceCream(String brand,String flavor,String color,double price,double weight,
             String type,boolean sugarFree,boolean dairyFree,String packaging,
             int quantity,String manufacturer,String expiryDate){

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.sugarFree = sugarFree;
        this.dairyFree = dairyFree;
        this.packaging = packaging;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Sugar Free: " + sugarFree);
        System.out.println("Dairy Free: " + dairyFree);
        System.out.println("Packaging: " + packaging);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}