class TelevisionExecutor {

    public static void main(String[] args) {

        Television tv = new Television();

        tv.addChannel("Star Plus");
        tv.addChannel("Zee TV");
        tv.addChannel("Sony TV");
        tv.addChannel("Colors TV");
        tv.addChannel("Sun TV");
        tv.addChannel("Star Sports");
        tv.addChannel("Sony Sports");
        tv.addChannel("Discovery Channel");
        tv.addChannel("National Geographic");
        tv.addChannel("Cartoon Network");
        tv.addChannel("Pogo");
        tv.addChannel("Nickelodeon");
        tv.addChannel("History TV18");
        tv.addChannel("Animal Planet");
        tv.addChannel("NDTV");
        tv.addChannel("Aaj Tak");
        tv.addChannel("BBC World News");

        tv.getChannels();
    }
}