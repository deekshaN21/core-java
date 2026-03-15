class Toothbrush {

    String brand;
    String color;
    String bristleType;
    String handleMaterial;
    double price;
    double length;
    boolean softBristles;
    boolean electric;
    String usage;
    String packaging;
    String manufacturer;
    String originCountry;

    Toothbrush(String brand,String color,String bristleType,String handleMaterial,
               double price,double length,boolean softBristles,boolean electric,
               String usage,String packaging,String manufacturer,String originCountry){

        this.brand = brand;
        this.color = color;
        this.bristleType = bristleType;
        this.handleMaterial = handleMaterial;
        this.price = price;
        this.length = length;
        this.softBristles = softBristles;
        this.electric = electric;
        this.usage = usage;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Bristle Type: " + bristleType);
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Soft Bristles: " + softBristles);
        System.out.println("Electric: " + electric);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging: " + packaging);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}