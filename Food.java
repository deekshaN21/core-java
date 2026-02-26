class Food {

    static String name;
    static String cuisine;
    static String price;
    static String quantity;
    static String calories;

    public static boolean createFood(String foodName,
                                     String foodCuisine,
                                     String foodPrice,
                                     String foodQuantity,
                                     String foodCalories) {

        boolean isCreated = false;

        boolean isNameValid = false;
        boolean isCuisineValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isCaloriesValid = false;

        if (foodName != null && !foodName.isEmpty()) {
            isNameValid = true;
        }

        if (foodCuisine != null && !foodCuisine.isEmpty()) {
            isCuisineValid = true;
        }

        if (foodPrice != null && !foodPrice.isEmpty()) {
            isPriceValid = true;
        }

        if (foodQuantity != null && !foodQuantity.isEmpty()) {
            isQuantityValid = true;
        }

        if (foodCalories != null && !foodCalories.isEmpty()) {
            isCaloriesValid = true;
        }

        if (isNameValid && isCuisineValid && isPriceValid &&
            isQuantityValid && isCaloriesValid) {


            isCreated = true;
        }

        return isCreated;
    }

    public static void getFoodDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Calories: " + calories);
        System.out.println("-----------------------------------");
    }
}
