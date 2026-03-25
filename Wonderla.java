class Wonderla {
    private String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String game) {
        if (game != null && !game.isEmpty()) {
            waterGames[index++] = game;
            return true;
        }
        return false;
    }

    public void getWaterGames() {
        for (String g : waterGames) {
            System.out.println(g);
        }
    }
}