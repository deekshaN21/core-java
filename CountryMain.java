class CountryMain {

    public static void main(String[] args) {

        String[] countries = {
            "India","USA","Canada","Australia",
            "Germany","Brazil","Japan",
            "South Africa","Mexico","China"
        };

        for (String country : countries) {

            System.out.println("States in " + country + " :");

            String[] states = Country.findStatesByCountry(country);

            Country.displayStates(states);

            System.out.println("----------------------------------");
        }
    }
}