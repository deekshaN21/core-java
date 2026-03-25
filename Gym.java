class Gym {
    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String eq) {
        if (eq != null && !eq.isEmpty()) {
            equipments[index++] = eq;
            return true;
        }
        return false;
    }

    public void getEquipment() {
        for (String e : equipments) {
            System.out.println(e);
        }
    }
}