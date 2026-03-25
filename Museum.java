class Museum {
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String name) {
        if (name != null && !name.isEmpty()) {
            historicalMonuments[index++] = name;
            return true;
        }
        return false;
    }

    public void getMonuments() {
        for (String m : historicalMonuments) {
            System.out.println(m);
        }
    }
}