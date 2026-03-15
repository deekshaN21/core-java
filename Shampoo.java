class Shampoo {

    String brand;
    String type;
    String fragrance;
    String color;
    double price;
    double quantity;
    boolean antiDandruff;
    boolean herbal;
    String packaging;
    String hairType;
    String manufacturer;
    String expiryDate;

    Shampoo(String brand,String type,String fragrance,String color,double price,
            double quantity,boolean antiDandruff,boolean herbal,String packaging,
            String hairType,String manufacturer,String expiryDate){

        this.brand = brand;
        this.type = type;
        this.fragrance = fragrance;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.antiDandruff = antiDandruff;
        this.herbal = herbal;
        this.packaging = packaging;
        this.hairType = hairType;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Anti Dandruff: " + antiDandruff);
        System.out.println("Herbal: " + herbal);
        System.out.println("Packaging: " + packaging);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}