class PlayStore {

    static String appName;
    static String developerName;
    static String category;
    static String rating;
    static String downloads;
    static String size;
    static String version;
    static String price;
    static String requiredOS;

    public static boolean createApp(String name, String developer, String categoryType,
                                    String ratingValue, String downloadCount,
                                    String appSize, String appVersion,
                                    String appPrice, String osRequired) {

        boolean isAppCreated = false;

        boolean isName = false;
        boolean isDeveloper = false;
        boolean isCategory = false;
        boolean isRating = false;
        boolean isDownloads = false;
        boolean isSize = false;
        boolean isVersion = false;
        boolean isPrice = false;
        boolean isOS = false;

        if(name != null && !name.isEmpty()){
            System.out.println("");
            isName = true;
        } else {
            System.out.println("App name is invalid");
        }

        if(developer != null && !developer.isEmpty()){
            System.out.println("");
            isDeveloper = true;
        } else {
            System.out.println("Developer name is invalid");
        }

        if(categoryType != null && !categoryType.isEmpty()){
            System.out.println("");
            isCategory = true;
        } else {
            System.out.println("Category is invalid");
        }

        if(ratingValue != null && !ratingValue.isEmpty()){
            System.out.println("");
            isRating = true;
        } else {
            System.out.println("Rating is invalid");
        }

        if(downloadCount != null && !downloadCount.isEmpty()){
            System.out.println("");
            isDownloads = true;
        } else {
            System.out.println("Downloads count is invalid");
        }

        if(appSize != null && !appSize.isEmpty()){
            System.out.println("");
            isSize = true;
        } else {
            System.out.println("App size is invalid");
        }

        if(appVersion != null && !appVersion.isEmpty()){
            System.out.println("");
            isVersion = true;
        } else {
            System.out.println("Version is invalid");
        }

        if(appPrice != null && !appPrice.isEmpty()){
            System.out.println("");
            isPrice = true;
        } else {
            System.out.println("Price is invalid");
        }

        if(osRequired != null && !osRequired.isEmpty()){
            System.out.println("");
            isOS = true;
        } else {
            System.out.println("Required OS is invalid");
        }

        if(isName == true && isDeveloper == true && isCategory == true &&
           isRating == true && isDownloads == true && isSize == true &&
           isVersion == true && isPrice == true && isOS == true){

            appName = name;
            developerName = developer;
            category = categoryType;
            rating = ratingValue;
            downloads = downloadCount;
            size = appSize;
            version = appVersion;
            price = appPrice;
            requiredOS = osRequired;

            isAppCreated = true;
        }

        return isAppCreated;
    }

    public static void getAppDetails(){

        System.out.println("App Name: " + appName);
        System.out.println("Developer: " + developerName);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);
        System.out.println("Downloads: " + downloads);
        System.out.println("Size: " + size);
        System.out.println("Version: " + version);
        System.out.println("Price: " + price);
        System.out.println("Required OS: " + requiredOS);
    }
}