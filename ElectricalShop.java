class ElectricalShop {
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String a) {
        if (a != null && !a.isEmpty()) {
            appliances[index++] = a;
            return true;
        }
        return false;
    }

    public void getAppliances() {
        for (String a : appliances) {
            System.out.println(a);
        }
    }
}