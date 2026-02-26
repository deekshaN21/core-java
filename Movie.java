class Movie {

    static String movieName;
    static String director;
    static String producer;
    static String genre;
    static String releaseYear;
    static String rating;
    static String language;

    public static boolean createMovie(String name, String dir, String prod,
                                      String type, String year,
                                      String movieRating, String lang) {

        boolean isMovieCreated = false;

        boolean isName = false;
        boolean isDirector = false;
        boolean isProducer = false;
        boolean isGenre = false;
        boolean isYear = false;
        boolean isRating = false;
        boolean isLanguage = false;

        if(name != null && !name.isEmpty()){
            System.out.println("");
            isName = true;
        } else {
            System.out.println("Movie name is invalid");
        }

        if(dir != null && !dir.isEmpty()){
            System.out.println("");
            isDirector = true;
        } else {
            System.out.println("Director name is invalid");
        }

        if(prod != null && !prod.isEmpty()){
            System.out.println("");
            isProducer = true;
        } else {
            System.out.println("Producer name is invalid");
        }

        if(type != null && !type.isEmpty()){
            System.out.println("");
            isGenre = true;
        } else {
            System.out.println("Genre is invalid");
        }

        if(year != null && !year.isEmpty()){
            System.out.println("");
            isYear = true;
        } else {
            System.out.println("Release year is invalid");
        }

        if(movieRating != null && !movieRating.isEmpty()){
            System.out.println("");
            isRating = true;
        } else {
            System.out.println("Rating is invalid");
        }

        if(lang != null && !lang.isEmpty()){
            System.out.println("");
            isLanguage = true;
        } else {
            System.out.println("Language is invalid");
        }

        if(isName == true && isDirector == true && isProducer == true &&
           isGenre == true && isYear == true &&
           isRating == true && isLanguage == true){

            movieName = name;
            director = dir;
            producer = prod;
            genre = type;
            releaseYear = year;
            rating = movieRating;
            language = lang;

            isMovieCreated = true;
        }

        return isMovieCreated;
    }

    public static void getMovieDetails(){

        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Producer: " + producer);
        System.out.println("Genre: " + genre);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
    }
}