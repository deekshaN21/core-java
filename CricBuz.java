class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeam(String t) {
        if (t != null && !t.isEmpty()) {
            teamNames[index++] = t;
            return true;
        }
        return false;
    }

    public void getTeams() {
        for (String t : teamNames) {
            System.out.println(t);
        }
    }
}