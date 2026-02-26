class Elevator {

    static String brandName;
    static String modelName;
    static String capacity;
    static String floorsServed;
    static String type;
    static String safetyFeatures;
    static String installationYear;

    public static boolean createElevator(String elevatorBrandName,
                                         String elevatorModelName,
                                         String elevatorCapacity,
                                         String elevatorFloorsServed,
                                         String elevatorType,
                                         String elevatorSafetyFeatures,
                                         String elevatorInstallationYear) {

        boolean isElevatorCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isCapacityValid = false;
        boolean isFloorsValid = false;
        boolean isTypeValid = false;
        boolean isSafetyValid = false;
        boolean isYearValid = false;

        if (elevatorBrandName != null && !elevatorBrandName.isEmpty()) isBrandValid = true;
        if (elevatorModelName != null && !elevatorModelName.isEmpty()) isModelValid = true;
        if (elevatorCapacity != null && !elevatorCapacity.isEmpty()) isCapacityValid = true;
        if (elevatorFloorsServed != null && !elevatorFloorsServed.isEmpty()) isFloorsValid = true;
        if (elevatorType != null && !elevatorType.isEmpty()) isTypeValid = true;
        if (elevatorSafetyFeatures != null && !elevatorSafetyFeatures.isEmpty()) isSafetyValid = true;
        if (elevatorInstallationYear != null && !elevatorInstallationYear.isEmpty()) isYearValid = true;

        if (isBrandValid && isModelValid && isCapacityValid && isFloorsValid &&
            isTypeValid && isSafetyValid && isYearValid) {

            brandName = elevatorBrandName;
            modelName = elevatorModelName;
            capacity = elevatorCapacity;
            floorsServed = elevatorFloorsServed;
            type = elevatorType;
            safetyFeatures = elevatorSafetyFeatures;
            installationYear = elevatorInstallationYear;

            isElevatorCreated = true;
        }

        return isElevatorCreated;
    }

    public static void getElevator() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Floors Served: " + floorsServed);
        System.out.println("Type: " + type);
        System.out.println("Safety Features: " + safetyFeatures);
        System.out.println("Installation Year: " + installationYear);
        System.out.println("-----------------------------------");
    }
}