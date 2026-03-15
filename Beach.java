class Beach {

    String name;
    String location;
    String country;
    double length;
    String sandColor;
    String waterType;
    boolean crowded;
    boolean clean;
    String famousFor;
    int visitorsPerDay;
    String nearbyCity;
    double entryFee;

    Beach(String name,String location,String country,double length,String sandColor,
          String waterType,boolean crowded,boolean clean,String famousFor,
          int visitorsPerDay,String nearbyCity,double entryFee){

        this.name = name;
        this.location = location;
        this.country = country;
        this.length = length;
        this.sandColor = sandColor;
        this.waterType = waterType;
        this.crowded = crowded;
        this.clean = clean;
        this.famousFor = famousFor;
        this.visitorsPerDay = visitorsPerDay;
        this.nearbyCity = nearbyCity;
        this.entryFee = entryFee;

        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Country: " + country);
        System.out.println("Length: " + length);
        System.out.println("Sand Color: " + sandColor);
        System.out.println("Water Type: " + waterType);
        System.out.println("Crowded: " + crowded);
        System.out.println("Clean: " + clean);
        System.out.println("Famous For: " + famousFor);
        System.out.println("Visitors Per Day: " + visitorsPerDay);
        System.out.println("Nearby City: " + nearbyCity);
        System.out.println("Entry Fee: " + entryFee);
    }
}