class Trophy {

    String name;
    String type;
    String material;
    String color;
    double height;
    double weight;
    double price;
    String event;
    String winner;
    String organization;
    String country;
    String manufacturer;
    String design;
    String shape;
    String finish;
    boolean engraved;
    boolean handmade;
    int year;
    String packaging;
    String category;

    Trophy(String name,String type,String material,String color,double height,double weight,
           double price,String event,String winner,String organization,String country,
           String manufacturer,String design,String shape,String finish,
           boolean engraved,boolean handmade,int year,String packaging,String category){

        this.name=name;
        this.type=type;
        this.material=material;
        this.color=color;
        this.height=height;
        this.weight=weight;
        this.price=price;
        this.event=event;
        this.winner=winner;
        this.organization=organization;
        this.country=country;
        this.manufacturer=manufacturer;
        this.design=design;
        this.shape=shape;
        this.finish=finish;
        this.engraved=engraved;
        this.handmade=handmade;
        this.year=year;
        this.packaging=packaging;
        this.category=category;
    }

    void display(){
        System.out.println(name);
        System.out.println(type);
        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(event);
        System.out.println(winner);
        System.out.println(organization);
        System.out.println(country);
        System.out.println(manufacturer);
        System.out.println(design);
        System.out.println(shape);
        System.out.println(finish);
        System.out.println(engraved);
        System.out.println(handmade);
        System.out.println(year);
        System.out.println(packaging);
        System.out.println(category);
    }
}