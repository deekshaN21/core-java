class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesign(String name) {
        if (name != null && !name.isEmpty()) {
            interiorDesignNames[index++] = name;
            return true;
        }
        return false;
    }

    public void getDesigns() {
        for (String d : interiorDesignNames) {
            System.out.println(d);
        }
    }
}