class Movie {

    String title;
    String director;
    String hero;
    String heroine;
    String genre;
    int duration;
    double budget;
    double rating;
    String language;
    String releaseDate;
    String productionCompany;
    boolean hit;

    Movie(String title,String director,String hero,String heroine,String genre,
          int duration,double budget,double rating,String language,
          String releaseDate,String productionCompany,boolean hit){

        this.title = title;
        this.director = director;
        this.hero = hero;
        this.heroine = heroine;
        this.genre = genre;
        this.duration = duration;
        this.budget = budget;
        this.rating = rating;
        this.language = language;
        this.releaseDate = releaseDate;
        this.productionCompany = productionCompany;
        this.hit = hit;

        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Hero: " + hero);
        System.out.println("Heroine: " + heroine);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration);
        System.out.println("Budget: " + budget);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Production Company: " + productionCompany);
        System.out.println("Hit: " + hit);
    }
}