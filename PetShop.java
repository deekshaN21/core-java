class PetShop {
    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String name) {
        if (name != null && !name.isEmpty()) {
            petAccessories[index++] = name;
            return true;
        }
        return false;
    }

    public void getAccessories() {
        for (String a : petAccessories) {
            System.out.println(a);
        }
    }
}