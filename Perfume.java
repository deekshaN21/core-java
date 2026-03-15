class Perfume {

    String brand;
    String fragranceName;
    String scentType;
    double quantity;
    double price;
    String color;
    boolean longLasting;
    String gender;
    String originCountry;
    String bottleShape;
    String manufacturer;
    String expiryDate;

    Perfume(String brand,String fragranceName,String scentType,double quantity,
            double price,String color,boolean longLasting,String gender,
            String originCountry,String bottleShape,String manufacturer,String expiryDate){

        this.brand = brand;
        this.fragranceName = fragranceName;
        this.scentType = scentType;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.longLasting = longLasting;
        this.gender = gender;
        this.originCountry = originCountry;
        this.bottleShape = bottleShape;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Fragrance Name: " + fragranceName);
        System.out.println("Scent Type: " + scentType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Long Lasting: " + longLasting);
        System.out.println("Gender: " + gender);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Bottle Shape: " + bottleShape);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}