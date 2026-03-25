class Television {
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String ch) {
        if (ch != null && !ch.isEmpty()) {
            channelNames[index++] = ch;
            return true;
        }
        return false;
    }

    public void getChannels() {
        for (String c : channelNames) {
            System.out.println(c);
        }
    }
}