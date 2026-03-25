class Universe {
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String name) {
        if (name != null && !name.isEmpty()) {
            galaxies[index++] = name;
            return true;
        }
        return false;
    }

    public void getGalaxies() {
        for (String g : galaxies) {
            System.out.println(g);
        }
    }
}