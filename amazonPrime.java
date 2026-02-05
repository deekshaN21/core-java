class amazonPrime {

    public static void main(String[] args) {

        String sports[] = {"NFL Thursday Night Football games", "NFL Bears vs Eagles Black Friday Game","NBA regular season games","NBA Play-In Tournament games","WNBA regular season games", "Seattle Kraken NHL games","MLB New York Yankees games","NWSL soccer matches","ONE Championship MMA events", "Premier League soccer matches (selected)","UEFA Champions League matches (selected)","Carabao Cup soccer matches",  "Women’s Big Bash League cricket",  "FIFA U17 World Cup matches",  "AFC Champions League matches","AFC Cup matches", "Kabaddi matches", "Rugby matches", "Basketball tournaments via FanCode", "Horse Racing events"};
        String wildlife[] = {"Planet Earth","Planet Earth II","Blue Planet","Blue Planet II", "Our Planet","Frozen Planet","The Hunt","Africa","Life","Life Story","Seven Worlds, One Planet","Big Cats","Night on Earth","Secrets of the Zoo","Night Safari","Savage Kingdom","Wild China","Born in China","Tiger King","Wild Alaska Live"};
        String marathiMovies[] = {"Sairat","Natsamrat","Lai Bhaari","Katyar Kaljat Ghusali","Timepass","Ventilator","Bajirao Mastani (Marathi Version)","Court","Fandry","Balak Palak","Mulshi Pattern","Double Seat","Deool","Kaul Manacha","Harishchandrachi Factory", "Simmba (Marathi Version)","Anna","Elizabeth Ekadashi", "Chandramukhi","Pandu"};
        String kannadaSerial[] = {"Gattimela","Majaa Talkies","Kavyanjali","Nannarasi Radhe", "Kannadathi","Puttakkana Makkalu","Akka","Manasaare", "Lakshmi Baramma","Sanju Mattu Naanu","Bhagyalakshmi","Radhika","Mahanadi","Radha Ramana","Anuradha","Mangalya Sandhosha","Prema Baraha","Swathi Muthu", "Putta Gowri Maduve","Chandramukhi"};
        String hindiSerial[] = {"Anupamaa","Yeh Rishta Kya Kehlata Hai","Ghum Hai Kisikey Pyaar Meiin","Taarak Mehta Ka Ooltah Chashmah","Kundali Bhagya","Imlie","Choti Sarrdaarni","Kumkum Bhagya","Barrister Babu","Saath Nibhaana Saathiya 2","Bade Achhe Lagte Hain 2","Pandya Store","Molkki","Shakti – Astitva Ke Ehsaas Ki","Yeh Hai Chahatein","Ishq Mein Marjawan 2","Naagin 6","Balika Vadhu 2","Bhagya Lakshmi", "Udaariyaan" };

        System.out.println("\nSports on Amazon Prime:");
        for (String item : sports) {
            System.out.println(item);
        }

        System.out.println("\nWildlife Content:");
        for (String item : wildlife) {
            System.out.println(item);
        }

        System.out.println("\nMarathi Movies:");
        for (String item : marathiMovies) {
            System.out.println(item);
        }

        System.out.println("\nKannada Serials:");
        for (String item : kannadaSerial) {
            System.out.println(item);
        }

        System.out.println("\nHindi Serials:");
        for (String item : hindiSerial) {
            System.out.println(item);
        }
    }
}
