class PhonePe {
    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurance(String name) {
        if (name != null && !name.isEmpty()) {
            insuranceNames[index++] = name;
            return true;
        }
        return false;
    }

    public void getInsurance() {
        for (String s : insuranceNames) {
            System.out.println(s);
        }
    }
}