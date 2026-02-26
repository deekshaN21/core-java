class Girias {

    static String brand;
    static String model;
    static String price;
    static String capacity;
    static String type;
    static String warranty;
    static String spinSpeed;
    static String energyRating;
    static String inverterTechnology;
    static String color;

    public static boolean createWashingMachine(
            String brandName,
            String modelName,
            String priceAmount,
            String machineCapacity,
            String washingType,
            String warrantyYears,
            String spinSpeedRPM,
            String energyStarRating,
            String inverterFeature,
            String machineColor) {

        boolean isCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;
        boolean isSpinSpeedValid = false;
        boolean isEnergyRatingValid = false;
        boolean isInverterValid = false;
        boolean isColorValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            isBrandValid = true;
        }

        if (modelName != null && !modelName.isEmpty()) {
            isModelValid = true;
        }

        if (priceAmount != null && !priceAmount.isEmpty()) {
            isPriceValid = true;
        }

        if (machineCapacity != null && !machineCapacity.isEmpty()) {
            isCapacityValid = true;
        }

        if (washingType != null && !washingType.isEmpty()) {
            isTypeValid = true;
        }

        if (warrantyYears != null && !warrantyYears.isEmpty()) {
            isWarrantyValid = true;
        }

        if (spinSpeedRPM != null && !spinSpeedRPM.isEmpty()) {
            isSpinSpeedValid = true;
        }

        if (energyStarRating != null && !energyStarRating.isEmpty()) {
            isEnergyRatingValid = true;
        }

        if (inverterFeature != null && !inverterFeature.isEmpty()) {
            isInverterValid = true;
        }

        if (machineColor != null && !machineColor.isEmpty()) {
            isColorValid = true;
        }

        if (isBrandValid && isModelValid && isPriceValid &&
            isCapacityValid && isTypeValid && isWarrantyValid &&
            isSpinSpeedValid && isEnergyRatingValid &&
            isInverterValid && isColorValid) {

            brand = brandName;
            model = modelName;
            price = priceAmount;
            capacity = machineCapacity;
            type = washingType;
            warranty = warrantyYears;
            spinSpeed = spinSpeedRPM;
            energyRating = energyStarRating;
            inverterTechnology = inverterFeature;
            color = machineColor;

            isCreated = true;
        }

        return isCreated;
    }

    public static void getWashingMachineDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warranty);
        System.out.println("Spin Speed: " + spinSpeed);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Inverter Technology: " + inverterTechnology);
        System.out.println("Color: " + color);
        System.out.println("-----------------------------------");
    }
}