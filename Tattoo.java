class Tattoo {

    String designName;
    String artistName;
    String inkColor;
    String bodyLocation;
    double size;
    double price;
    String style;
    boolean permanent;
    String studioName;
    int duration;
    String aftercare;
    String country;

    Tattoo(String designName,String artistName,String inkColor,String bodyLocation,
           double size,double price,String style,boolean permanent,
           String studioName,int duration,String aftercare,String country){

        this.designName = designName;
        this.artistName = artistName;
        this.inkColor = inkColor;
        this.bodyLocation = bodyLocation;
        this.size = size;
        this.price = price;
        this.style = style;
        this.permanent = permanent;
        this.studioName = studioName;
        this.duration = duration;
        this.aftercare = aftercare;
        this.country = country;

        System.out.println("Design Name: " + designName);
        System.out.println("Artist Name: " + artistName);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Body Location: " + bodyLocation);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Style: " + style);
        System.out.println("Permanent: " + permanent);
        System.out.println("Studio Name: " + studioName);
        System.out.println("Duration: " + duration);
        System.out.println("Aftercare: " + aftercare);
        System.out.println("Country: " + country);
    }
}