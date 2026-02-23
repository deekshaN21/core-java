class JobPortal {

    static String[] searchJobsByCompany(String companyName) {

        if (companyName=="LinkedIn") {
            String[] jobs = {
                "Software Engineer", "Backend Developer", "Frontend Developer",
                "Data Analyst", "Product Manager", "UI/UX Designer",
                "QA Engineer", "DevOps Engineer", "Cloud Engineer",
                "AI Engineer", "HR Executive", "Recruiter",
                "Marketing Manager", "Business Analyst", "Sales Executive",
                "Security Engineer", "Mobile Developer", "Technical Writer",
                "Support Engineer", "Database Administrator"
            };
            return jobs;
        }

        else if (companyName=="Naukri") {
            String[] jobs = {
                "Java Developer", "Python Developer", "React Developer",
                "System Engineer", "Network Engineer", "HR Manager",
                "Talent Acquisition", "Data Scientist", "SEO Analyst",
                "Content Writer", "Digital Marketer", "Full Stack Developer",
                "Android Developer", "iOS Developer", "Project Manager",
                "Business Development Executive", "Cloud Architect",
                "Cyber Security Analyst", "Operations Manager", "Testing Engineer"
            };
            return jobs;
        }

        else if (companyName=="Hirect") {
            String[] jobs = {
                "Junior Developer", "Senior Developer", "Data Engineer",
                "Machine Learning Engineer", "Technical Lead", "Scrum Master",
                "HR Recruiter", "Customer Support", "Graphic Designer",
                "Video Editor", "Accountant", "Finance Executive",
                "Product Owner", "Business Consultant", "AI Researcher",
                "Game Developer", "Automation Engineer", "Blockchain Developer",
                "Site Reliability Engineer", "System Administrator"
            };
            return jobs;
        }
		 else if (companyName=="Infosys") {
            String[] jobs = {
                "Software Engineer", "System Associate", "Test Engineer",
                "Data Analyst", "Cloud Consultant", "DevOps Engineer",
                "Business Analyst", "Java Developer", "Python Developer",
                "SAP Consultant", "Network Engineer", "Security Analyst",
                "Automation Tester", "UI Developer", "Project Lead",
                "Database Engineer", "AI Engineer", "Technical Support",
                "HR Executive", "Delivery Manager"
            };
            return jobs;
        }

        else if (companyName=="TCS") {
            String[] jobs = {
                "Assistant System Engineer", "System Engineer",
                "Full Stack Developer", "Backend Developer",
                "Frontend Developer", "Data Scientist",
                "Machine Learning Engineer", "Cloud Architect",
                "DevOps Engineer", "Cyber Security Analyst",
                "QA Engineer", "Business Analyst",
                "Technical Writer", "HR Recruiter",
                "Support Engineer", "Project Manager",
                "IT Analyst", "SAP Developer",
                "Automation Engineer", "UI Designer"
            };
            return jobs;
        }

        else if (companyName=="Wipro"){
            String[] jobs = {
                "Project Engineer", "Software Developer",
                "Data Engineer", "AI Developer",
                "Cloud Engineer", "Network Administrator",
                "System Analyst", "QA Tester",
                "Technical Support Engineer", "HR Executive",
                "Product Manager", "Business Development Manager",
                "DevOps Specialist", "Security Engineer",
                "Automation Tester", "Full Stack Developer",
                "Database Administrator", "Scrum Master",
                "Application Support", "Delivery Lead"
            };
            return jobs;
        }

        else if (companyName=="Accenture") {
            String[] jobs = {
                "Application Developer", "Cloud Consultant",
                "Security Consultant", "Data Analyst",
                "AI Engineer", "SAP Consultant",
                "Full Stack Engineer", "Test Automation Engineer",
                "Infrastructure Engineer", "Business Consultant",
                "Project Manager", "UI/UX Designer",
                "DevOps Engineer", "HR Manager",
                "Recruitment Specialist", "Technical Architect",
                "Java Developer", "Python Developer",
                "System Administrator", "Digital Marketing Analyst"
            };
            return jobs;
        }

        else if (companyName=="Capgemini") {
            String[] jobs = {
                "Software Engineer", "Associate Consultant",
                "Data Scientist", "Cloud Engineer",
                "Cyber Security Analyst", "SAP Developer",
                "Automation Tester", "QA Analyst",
                "Network Engineer", "HR Executive",
                "Business Analyst", "Product Owner",
                "Technical Lead", "Full Stack Developer",
                "DevOps Engineer", "Support Engineer",
                "Database Developer", "AI Researcher",
                "UI Developer", "Delivery Manager"
            };
            return jobs;
        }

        else if (companyName=="Google") {
            String[] jobs = {
                "Software Engineer", "Site Reliability Engineer",
                "Data Scientist", "Product Manager",
                "UX Designer", "Cloud Engineer",
                "Security Engineer", "AI Researcher",
                "Android Developer", "Technical Program Manager",
                "Solutions Architect", "Business Analyst",
                "Marketing Specialist", "Sales Strategist",
                "DevOps Engineer", "QA Engineer",
                "Backend Developer", "Frontend Developer",
                "Hardware Engineer", "Support Specialist"
            };
            return jobs;
        }

        else if (companyName=="Amazon") {
            String[] jobs = {
                "Software Development Engineer", "Cloud Support Engineer",
                "Data Engineer", "Machine Learning Engineer",
                "Operations Manager", "HR Manager",
                "Business Analyst", "QA Engineer",
                "DevOps Engineer", "Security Engineer",
                "Product Manager", "Technical Writer",
                "Network Engineer", "Database Engineer",
                "Frontend Developer", "Backend Developer",
                "Android Developer", "iOS Developer",
                "Site Reliability Engineer", "Delivery Manager"
            };
            return jobs;
        }

        else if (companyName=="Microsoft") {
            String[] jobs = {
                "Software Engineer", "Cloud Solution Architect",
                "AI Engineer", "Data Analyst",
                "Security Engineer", "DevOps Engineer",
                "Program Manager", "UX Designer",
                "Technical Consultant", "Product Manager",
                "QA Engineer", "Backend Developer",
                "Frontend Developer", "Database Administrator",
                "Business Development Manager", "HR Recruiter",
                "Support Engineer", "System Architect",
                "Automation Engineer", "IT Specialist"
            };
            return jobs;
        }



        return null;
    }

    static void displayJobs(String[] jobs) {
        if (jobs != null) {
            for (String job : jobs) {
                System.out.println(job);
            }
        }
    }
}