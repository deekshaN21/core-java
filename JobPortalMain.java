class JobPortalMain {

    public static void main(String[] args) {

        String[] companies = {
            "LinkedIn","Naukri","Hirect",
            "Infosys","TCS","Wipro",
            "Accenture","Capgemini",
            "Google","Amazon","Microsoft"
        };

        for (String company : companies) {

            System.out.println("Jobs in " + company + " :");

            String[] jobs = JobPortal.searchJobsByCompany(company);

            JobPortal.displayJobs(jobs);


        }
    }
}