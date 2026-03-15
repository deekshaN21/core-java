class Mango {

    String variety;
    String color;
    double weight;
    double price;
    String taste;
    String origin;
    boolean ripe;
    String season;
    String size;
    int quantity;
    String seller;
    String quality;

    Mango(String variety,String color,double weight,double price,String taste,
          String origin,boolean ripe,String season,String size,
          int quantity,String seller,String quality){

        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.taste = taste;
        this.origin = origin;
        this.ripe = ripe;
        this.season = season;
        this.size = size;
        this.quantity = quantity;
        this.seller = seller;
        this.quality = quality;

        System.out.println("Variety: " + variety);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Taste: " + taste);
        System.out.println("Origin: " + origin);
        System.out.println("Ripe: " + ripe);
        System.out.println("Season: " + season);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("Seller: " + seller);
        System.out.println("Quality: " + quality);
    }
}