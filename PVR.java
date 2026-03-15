class PVR {

    String name;
    String location;
    String city;
    int screens;
    int seats;
    double ticketPrice;
    boolean foodCourt;
    boolean parking;
    String owner;
    String establishedYear;
    String technology;
    String soundSystem;
    String screenType;
    String bookingType;
    String website;
    String contact;
    String country;
    String manager;
    String category;
    String rating;

    PVR(String name,String location,String city,int screens,int seats,double ticketPrice,
        boolean foodCourt,boolean parking,String owner,String establishedYear,
        String technology,String soundSystem,String screenType,String bookingType,
        String website,String contact,String country,String manager,String category,String rating){

        this.name=name;
        this.location=location;
        this.city=city;
        this.screens=screens;
        this.seats=seats;
        this.ticketPrice=ticketPrice;
        this.foodCourt=foodCourt;
        this.parking=parking;
        this.owner=owner;
        this.establishedYear=establishedYear;
        this.technology=technology;
        this.soundSystem=soundSystem;
        this.screenType=screenType;
        this.bookingType=bookingType;
        this.website=website;
        this.contact=contact;
        this.country=country;
        this.manager=manager;
        this.category=category;
        this.rating=rating;
    }

    void display(){
        System.out.println(name);
        System.out.println(location);
        System.out.println(city);
        System.out.println(screens);
        System.out.println(seats);
        System.out.println(ticketPrice);
        System.out.println(foodCourt);
        System.out.println(parking);
        System.out.println(owner);
        System.out.println(establishedYear);
        System.out.println(technology);
        System.out.println(soundSystem);
        System.out.println(screenType);
        System.out.println(bookingType);
        System.out.println(website);
        System.out.println(contact);
        System.out.println(country);
        System.out.println(manager);
        System.out.println(category);
        System.out.println(rating);
    }
}