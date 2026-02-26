class Forever24 {

    static String brandName;
    static String clothType;
    static String size;
    static String color;
    static String material;
    static String price;
    static String gender;
    static String season;
    static String pattern;
    static String fit;
    static String sleeveType;
    static String occasion;

    public static boolean createCloth(String clothBrandName,
                                      String clothTypeName,
                                      String clothSize,
                                      String clothColor,
                                      String clothMaterial,
                                      String clothPrice,
                                      String clothGender,
                                      String clothSeason,
                                      String clothPattern,
                                      String clothFit,
                                      String clothSleeveType,
                                      String clothOccasion) {

        boolean isClothCreated = false;

        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isMaterialValid = false;
        boolean isPriceValid = false;
        boolean isGenderValid = false;
        boolean isSeasonValid = false;
        boolean isPatternValid = false;
        boolean isFitValid = false;
        boolean isSleeveTypeValid = false;
        boolean isOccasionValid = false;

        if (clothBrandName != null && !clothBrandName.isEmpty()) isBrandValid = true;
        if (clothTypeName != null && !clothTypeName.isEmpty()) isTypeValid = true;
        if (clothSize != null && !clothSize.isEmpty()) isSizeValid = true;
        if (clothColor != null && !clothColor.isEmpty()) isColorValid = true;
        if (clothMaterial != null && !clothMaterial.isEmpty()) isMaterialValid = true;
        if (clothPrice != null && !clothPrice.isEmpty()) isPriceValid = true;
        if (clothGender != null && !clothGender.isEmpty()) isGenderValid = true;
        if (clothSeason != null && !clothSeason.isEmpty()) isSeasonValid = true;
        if (clothPattern != null && !clothPattern.isEmpty()) isPatternValid = true;
        if (clothFit != null && !clothFit.isEmpty()) isFitValid = true;
        if (clothSleeveType != null && !clothSleeveType.isEmpty()) isSleeveTypeValid = true;
        if (clothOccasion != null && !clothOccasion.isEmpty()) isOccasionValid = true;

        if (isBrandValid && isTypeValid && isSizeValid && isColorValid && isMaterialValid &&
            isPriceValid && isGenderValid && isSeasonValid && isPatternValid && isFitValid &&
            isSleeveTypeValid && isOccasionValid) {

            brandName = clothBrandName;
            clothType = clothTypeName;
            size = clothSize;
            color = clothColor;
            material = clothMaterial;
            price = clothPrice;
            gender = clothGender;
            season = clothSeason;
            pattern = clothPattern;
            fit = clothFit;
            sleeveType = clothSleeveType;
            occasion = clothOccasion;

            isClothCreated = true;
        }

        return isClothCreated;
    }

    public static void getCloth() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Cloth Type: " + clothType);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Gender: " + gender);
        System.out.println("Season: " + season);
        System.out.println("Pattern: " + pattern);
        System.out.println("Fit: " + fit);
        System.out.println("Sleeve Type: " + sleeveType);
        System.out.println("Occasion: " + occasion);
        System.out.println("-----------------------------------");
    }
}