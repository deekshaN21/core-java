class PlayList {
    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String song) {
        if (song != null && !song.isEmpty()) {
            songNames[index++] = song;
            return true;
        }
        return false;
    }

    public void getSongs() {
        for (String s : songNames) {
            System.out.println(s);
        }
    }
}