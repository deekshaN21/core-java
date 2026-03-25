class GovernmentExecutor {
    public static void main(String[] args) {

        Government gov = new Government();

        gov.addExam("UPSC");
        gov.addExam("SSC");
        gov.addExam("Bank PO");
        gov.addExam("Railway Exam");
        gov.addExam("NEET");
        gov.addExam("JEE");
        gov.addExam("KPSC");
        gov.addExam("GATE");
        gov.addExam("CAT");

        gov.getExams();
    }
}