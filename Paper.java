class Paper {

    String brand;
    String type;
    String color;
    String size;
    String usage;
    double price;
    int quantity;
    double weight;
    boolean recyclable;
    boolean waterproof;
    String texture;
    String manufacturer;
    String country;
    String packaging;
    String quality;
    int pages;
    String finish;
    String thickness;
    String category;
    String expiryDate;

    Paper(String brand,String type,String color,String size,String usage,
          double price,int quantity,double weight,boolean recyclable,boolean waterproof,
          String texture,String manufacturer,String country,String packaging,
          String quality,int pages,String finish,String thickness,
          String category,String expiryDate){

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.usage = usage;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.recyclable = recyclable;
        this.waterproof = waterproof;
        this.texture = texture;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packaging = packaging;
        this.quality = quality;
        this.pages = pages;
        this.finish = finish;
        this.thickness = thickness;
        this.category = category;
        this.expiryDate = expiryDate;
    }

    void display(){

        System.out.println(brand);
        System.out.println(type);
        System.out.println(color);
        System.out.println(size);
        System.out.println(usage);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(weight);
        System.out.println(recyclable);
        System.out.println(waterproof);
        System.out.println(texture);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(packaging);
        System.out.println(quality);
        System.out.println(pages);
        System.out.println(finish);
        System.out.println(thickness);
        System.out.println(category);
        System.out.println(expiryDate);
    }
}