class Government {
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExam(String name) {
        if (name != null && !name.isEmpty()) {
            competitiveExamNames[index++] = name;
            return true;
        }
        return false;
    }

    public void getExams() {
        for (String e : competitiveExamNames) {
            System.out.println(e);
        }
    }
}