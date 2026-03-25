class RCB {
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayer(String name) {
        if (name != null && !name.isEmpty()) {
            playerNames[index++] = name;
            return true;
        }
        return false;
    }

    public void getPlayers() {
        for (String p : playerNames) {
            System.out.println(p);
        }
    }
}