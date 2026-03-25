class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeach(String name) {
        if (name != null && !name.isEmpty()) {
            beachNames[index++] = name;
            return true;
        }
        return false;
    }

    public void getBeaches() {
        for (String b : beachNames) {
            System.out.println(b);
        }
    }
}