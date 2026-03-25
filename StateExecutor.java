class StateExecutor {
    public static void main(String[] args) {

        State state = new State();

        state.addHighway("NH44");
        state.addHighway("NH48");
        state.addHighway("NH75");
        state.addHighway("NH66");
        state.addHighway("NH50");
        state.addHighway("NH150");
        state.addHighway("NH367");
        state.addHighway("NH169");
        state.addHighway("NH73");

        state.getHighways();
    }
}