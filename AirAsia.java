class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String p) {
        if (p != null && !p.isEmpty()) {
            passengers[index++] = p;
            return true;
        }
        return false;
    }

    public void getPassengers() {
        for (String p : passengers) {
            System.out.println(p);
        }
    }
}