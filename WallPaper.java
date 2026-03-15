class WallPaper {

    String brand;
    String color;
    String design;
    String material;
    String pattern;
    double price;
    double width;
    double height;
    boolean waterproof;
    boolean washable;
    String texture;
    String theme;
    String roomType;
    String manufacturer;
    String country;
    String packaging;
    int rollNumber;
    String installationType;
    String durability;
    String finish;

    WallPaper(String brand,String color,String design,String material,String pattern,
              double price,double width,double height,boolean waterproof,boolean washable,
              String texture,String theme,String roomType,String manufacturer,String country,
              String packaging,int rollNumber,String installationType,String durability,String finish){

        this.brand = brand;
        this.color = color;
        this.design = design;
        this.material = material;
        this.pattern = pattern;
        this.price = price;
        this.width = width;
        this.height = height;
        this.waterproof = waterproof;
        this.washable = washable;
        this.texture = texture;
        this.theme = theme;
        this.roomType = roomType;
        this.manufacturer = manufacturer;
        this.country = country;
        this.packaging = packaging;
        this.rollNumber = rollNumber;
        this.installationType = installationType;
        this.durability = durability;
        this.finish = finish;
    }

    void display(){

        System.out.println(brand);
        System.out.println(color);
        System.out.println(design);
        System.out.println(material);
        System.out.println(pattern);
        System.out.println(price);
        System.out.println(width);
        System.out.println(height);
        System.out.println(waterproof);
        System.out.println(washable);
        System.out.println(texture);
        System.out.println(theme);
        System.out.println(roomType);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(packaging);
        System.out.println(rollNumber);
        System.out.println(installationType);
        System.out.println(durability);
        System.out.println(finish);
    }
}