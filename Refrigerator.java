class Refrigerator {

    static String brandName;
    static String modelName;
    static String capacity;
    static String energyRating;
    static String type;
    static String color;
    static String numberOfDoors;
    static String compressorType;
    static String warranty;
    static String installationYear;

    public static boolean createRefrigerator(String refrigeratorBrandName,
                                             String refrigeratorModelName,
                                             String refrigeratorCapacity,
                                             String refrigeratorEnergyRating,
                                             String refrigeratorType,
                                             String refrigeratorColor,
                                             String refrigeratorNumberOfDoors,
                                             String refrigeratorCompressorType,
                                             String refrigeratorWarranty,
                                             String refrigeratorInstallationYear) {

        boolean isRefrigeratorCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isEnergyValid = false;
        boolean isTypeValid = false;
        boolean isColorValid = false;
        boolean isDoorsValid = false;
        boolean isCompressorValid = false;
        boolean isWarrantyValid = false;
        boolean isYearValid = false;

        if (refrigeratorBrandName != null && !refrigeratorBrandName.isEmpty()) isBrandValid = true;
        if (refrigeratorModelName != null && !refrigeratorModelName.isEmpty()) isModelValid = true;
        if (refrigeratorCapacity != null && !refrigeratorCapacity.isEmpty()) isCapacityValid = true;
        if (refrigeratorEnergyRating != null && !refrigeratorEnergyRating.isEmpty()) isEnergyValid = true;
        if (refrigeratorType != null && !refrigeratorType.isEmpty()) isTypeValid = true;
        if (refrigeratorColor != null && !refrigeratorColor.isEmpty()) isColorValid = true;
        if (refrigeratorNumberOfDoors != null && !refrigeratorNumberOfDoors.isEmpty()) isDoorsValid = true;
        if (refrigeratorCompressorType != null && !refrigeratorCompressorType.isEmpty()) isCompressorValid = true;
        if (refrigeratorWarranty != null && !refrigeratorWarranty.isEmpty()) isWarrantyValid = true;
        if (refrigeratorInstallationYear != null && !refrigeratorInstallationYear.isEmpty()) isYearValid = true;

        if (isBrandValid && isModelValid && isCapacityValid && isEnergyValid &&
            isTypeValid && isColorValid && isDoorsValid && isCompressorValid &&
            isWarrantyValid && isYearValid) {

            brandName = refrigeratorBrandName;
            modelName = refrigeratorModelName;
            capacity = refrigeratorCapacity;
            energyRating = refrigeratorEnergyRating;
            type = refrigeratorType;
            color = refrigeratorColor;
            numberOfDoors = refrigeratorNumberOfDoors;
            compressorType = refrigeratorCompressorType;
            warranty = refrigeratorWarranty;
            installationYear = refrigeratorInstallationYear;

            isRefrigeratorCreated = true;
        }

        return isRefrigeratorCreated;
    }

    public static void getRefrigeratorDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Number Of Doors: " + numberOfDoors);
        System.out.println("Compressor Type: " + compressorType);
        System.out.println("Warranty: " + warranty);
        System.out.println("Installation Year: " + installationYear);
        System.out.println("-----------------------------------");
    }
}