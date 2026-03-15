class Serum {

    String brand;
    String type;
    String skinType;
    String ingredient;
    double quantity;
    double price;
    String color;
    boolean fragranceFree;
    boolean dermatologistTested;
    String usage;
    String manufacturer;
    String expiryDate;

    Serum(String brand,String type,String skinType,String ingredient,double quantity,
          double price,String color,boolean fragranceFree,boolean dermatologistTested,
          String usage,String manufacturer,String expiryDate){

        this.brand = brand;
        this.type = type;
        this.skinType = skinType;
        this.ingredient = ingredient;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.fragranceFree = fragranceFree;
        this.dermatologistTested = dermatologistTested;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Ingredient: " + ingredient);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Fragrance Free: " + fragranceFree);
        System.out.println("Dermatologist Tested: " + dermatologistTested);
        System.out.println("Usage: " + usage);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}