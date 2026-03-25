class MuseumExecutor {
    public static void main(String[] args) {

        Museum museum = new Museum();

        museum.addMonument("Taj Mahal");
        museum.addMonument("Qutub Minar");
        museum.addMonument("Red Fort");
        museum.addMonument("India Gate");
        museum.addMonument("Hampi");
        museum.addMonument("Mysore Palace");
        museum.addMonument("Charminar");
        museum.addMonument("Gateway of India");
        museum.addMonument("Konark Temple");
        museum.addMonument("Ajanta Caves");
        museum.addMonument("Ellora Caves");
        museum.addMonument("Golden Temple");
        museum.addMonument("Lotus Temple");
        museum.addMonument("Sanchi Stupa");
        museum.addMonument("Brihadeeswara Temple");
        museum.addMonument("Victoria Memorial");

        museum.getMonuments();
    }
}