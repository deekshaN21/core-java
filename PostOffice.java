class PostOffice {

    public static void main(String[] args) {

        String officeName = "City Central Post Office";
        String city = "Bengaluru";
        int totalCounters = 8;
        String postMaster = "Ms. Ananya";
		
        String services[] = {"Mail Delivery", "Parcel Booking", "Speed Post", "Money Order", "PO Savings Account", "Bill Payment", "Certificate Services", "Registered Post"};
        String counters[] = {"Counter 1", "Counter 2", "Counter 3", "Counter 4", "Counter 5", "Counter 6", "Counter 7", "Counter 8"};
        String staff[] = {"Post Master", "Clerk", "Sorting Staff", "Delivery Staff", "Security Guard"};
		
        System.out.println("Post Office Info:");
        System.out.println("Office Name: " + officeName);
        System.out.println("City: " + city);
        System.out.println("Total Counters: " + totalCounters);
        System.out.println("Post Master: " + postMaster);

        System.out.println("\nList of Counters:");
        for (String counter : counters) {
            System.out.println(counter);
        }


        System.out.println("\nServices Available:");
        for (String service : services) {
            System.out.println(service);
        }

        System.out.println("\nStaff Members:");
        for (String member : staff) {
            System.out.println(member);
        }
    }
}