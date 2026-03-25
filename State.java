class State {
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighway(String name) {
        if (name != null && !name.isEmpty()) {
            highwayNames[index++] = name;
            return true;
        }
        return false;
    }

    public void getHighways() {
        for (String h : highwayNames) {
            System.out.println(h);
        }
    }
}