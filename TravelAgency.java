class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String name) {
        if (name != null && !name.isEmpty()) {
            places[index++] = name;
            return true;
        }
        return false;
    }

    public void getPlaces() {
        for (String p : places) {
            System.out.println(p);
        }
    }
}