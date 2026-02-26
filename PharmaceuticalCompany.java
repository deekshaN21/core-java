class PharmaceuticalCompany {

    static String medicineName;
    static String companyName;
    static String medicineType;
    static String dosage;
    static String expiryDate;
    static String manufacturingDate;
    static String batchNumber;
    static String price;
    static String approvalNumber;

    public static boolean createMedicine(String medicineNameParam,
                                         String companyNameParam,
                                         String medicineTypeParam,
                                         String dosageParam,
                                         String expiryDateParam,
                                         String manufacturingDateParam,
                                         String batchNumberParam,
                                         String priceParam,
                                         String approvalNumberParam) {

        boolean isMedicineCreated = false;

        boolean isNameValid = false;
        boolean isCompanyValid = false;
        boolean isTypeValid = false;
        boolean isDosageValid = false;
        boolean isExpiryValid = false;
        boolean isManufactureValid = false;
        boolean isBatchValid = false;
        boolean isPriceValid = false;
        boolean isApprovalValid = false;

        if (medicineNameParam != null && !medicineNameParam.isEmpty()) isNameValid = true;
        if (companyNameParam != null && !companyNameParam.isEmpty()) isCompanyValid = true;
        if (medicineTypeParam != null && !medicineTypeParam.isEmpty()) isTypeValid = true;
        if (dosageParam != null && !dosageParam.isEmpty()) isDosageValid = true;
        if (expiryDateParam != null && !expiryDateParam.isEmpty()) isExpiryValid = true;
        if (manufacturingDateParam != null && !manufacturingDateParam.isEmpty()) isManufactureValid = true;
        if (batchNumberParam != null && !batchNumberParam.isEmpty()) isBatchValid = true;
        if (priceParam != null && !priceParam.isEmpty()) isPriceValid = true;
        if (approvalNumberParam != null && !approvalNumberParam.isEmpty()) isApprovalValid = true;

        if (isNameValid && isCompanyValid && isTypeValid && isDosageValid &&
            isExpiryValid && isManufactureValid && isBatchValid &&
            isPriceValid && isApprovalValid) {

            isMedicineCreated = true;
        }

        return isMedicineCreated;
    }

    public static void getMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Company Name: " + companyName);
        System.out.println("Medicine Type: " + medicineType);
        System.out.println("Dosage: " + dosage);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Price: " + price);
        System.out.println("Approval Number: " + approvalNumber);
        System.out.println("-----------------------------------");
    }
}
