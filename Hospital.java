class Hospital{
	public static String[] findDoctorsBySpecialization(String specialization){
		System.out.println("invocked the findDoctorsBySpecialization method");
		if (specialization == "General Medicine") {
        String[] generalMedicineDoctors = {"Dr. Yashwanth", "Dr. Ankitha", "Dr. Manoj", "Dr. Rajesh", "Dr. Sneha", "Dr. Amit", "Dr. Kavya", "Dr. Rohan", "Dr. Megha", "Dr. Vikram", "Dr. Pooja", "Dr. Suresh", "Dr. Divya", "Dr. Arjun", "Dr. Neha"
        };
        System.out.println("Ended findDoctorsBySpecialization method");
        return generalMedicineDoctors;

		} else if (specialization == "Ortho") {
			String[] orthoDoctors = {"Dr. Vinay", "Dr. Sujatha", "Dr. Karthik", "Dr. Priya", "Dr. Akash", "Dr. Deepa", "Dr. Rahul", "Dr. Shanti", "Dr. Mohan", "Dr. Lakshmi", "Dr. Kiran", "Dr. Bharath", "Dr. Geetha", "Dr. Naveen", "Dr. Ritu"
			};
			return orthoDoctors;

		} else if (specialization == "Cardiology") {
			String[] cardiologyDoctors = {"Dr. Sharma", "Dr. Iyer", "Dr. Gupta", "Dr. Reddy", "Dr. Chawla", "Dr. Deshmukh", "Dr. Nair", "Dr. Verma", "Dr. Kapoor", "Dr. Joshi", "Dr. Mehta", "Dr. Singh", "Dr. Patil", "Dr. Rao", "Dr. Malhotra"
			};
			return cardiologyDoctors;

		} else if (specialization == "Dermatology") {
			String[] dermatologyDoctors = {"Dr. Alice", "Dr. Bob", "Dr. Catherine", "Dr. David", "Dr. Elena", "Dr. Farooq", "Dr. Grace", "Dr. Hans", "Dr. Ishani", "Dr. Jacob", "Dr. Kiara", "Dr. Leo", "Dr. Maya", "Dr. Noah", "Dr. Olivia"};
			return dermatologyDoctors;

		} else if (specialization == "Neurology") {
			String[] neurologyDoctors = {"Dr. Foster", "Dr. Simmons", "Dr. Bryant", "Dr. Griffin", "Dr. Hayes", "Dr. Myers", "Dr. Ford", "Dr. Hamilton", "Dr. Graham", "Dr. Sullivan", "Dr. Wallace", "Dr. Woods", "Dr. Cole", "Dr. West", "Dr. Jordan"};
			return neurologyDoctors;

		} else if (specialization == "Pediatrics") {
			String[] pediatricsDoctors = {"Dr. Reynolds", "Dr. Fisher", "Dr. Ellis", "Dr. Harrison", "Dr. Gibson", "Dr. Mcdonald", "Dr. Cruz", "Dr. Marshall", "Dr. Ortiz", "Dr. Gomez", "Dr. Murray", "Dr. Freeman", "Dr. Wells", "Dr. Webb", "Dr. Simpson"};
			return pediatricsDoctors;

		} else if (specialization == "Oncology") {
			String[] oncologyDoctors = {"Dr. Stevens", "Dr. Tucker", "Dr. Porter", "Dr. Hunter", "Dr. Hicks", "Dr. Crawford", "Dr. Henry", "Dr. Boyd", "Dr. Mason", "Dr. Morales", "Dr. Kennedy", "Dr. Warren", "Dr. Dixon", "Dr. Ramos", "Dr. Reyes"};
			return oncologyDoctors;

		} else if (specialization == "Psychiatry") {
			String[] psychiatryDoctors = {"Dr. Burns", "Dr. Gordon", "Dr. Shaw", "Dr. Holmes", "Dr. Rice", "Dr. Robertson", "Dr. Hunt", "Dr. Black", "Dr. Daniels", "Dr. Palmer", "Dr. Mills", "Dr. Nichols", "Dr. Grant", "Dr. Knight", "Dr. Ferguson"};
			return psychiatryDoctors;

		} else if (specialization == "Gastroenterology") {
			String[] gastroDoctors = {"Dr. Rose", "Dr. Stone", "Dr. Hawkins", "Dr. Dunn", "Dr. Perkins", "Dr. Hudson", "Dr. Spencer", "Dr. Gardner", "Dr. Stephens", "Dr. Payne", "Dr. Pierce", "Dr. Berry", "Dr. Matthews", "Dr. Arnold", "Dr. Wagner"};
			return gastroDoctors;

		} else if (specialization == "ENT") {
			String[] entDoctors = {"Dr. Willis", "Dr. Ray", "Dr. Watkins", "Dr. Olson", "Dr. Carroll", "Dr. Duncan", "Dr. Snyder", "Dr. Hart", "Dr. Cunningham", "Dr. Bradley", "Dr. Lane", "Dr. Andrews", "Dr. Ruiz", "Dr. Harper", "Dr. Fox"};
			return entDoctors;
			
		} else if (specialization == "Ophthalmology") {
			String[] ophthaDoctors = {"Dr. Miller", "Dr. Davis", "Dr. Wilson", "Dr. Moore", "Dr. Taylor", "Dr. Anderson", "Dr. Thomas", "Dr. Jackson", "Dr. White", "Dr. Harris", "Dr. Martin", "Dr. Thompson", "Dr. Garcia", "Dr. Martinez", "Dr. Robinson"};
			return ophthaDoctors;

		} else if (specialization == "Urology") {
			String[] urologyDoctors = {"Dr. Clark", "Dr. Rodriguez", "Dr. Lewis", "Dr. Lee", "Dr. Walker", "Dr. Hall", "Dr. Allen", "Dr. Young", "Dr. Hernandez", "Dr. King", "Dr. Wright", "Dr. Lopez", "Dr. Hill", "Dr. Scott", "Dr. Green"};
			return urologyDoctors;

		} else if (specialization == "Nephrology") {
			String[] nephroDoctors = {"Dr. Adams", "Dr. Baker", "Dr. Gonzalez", "Dr. Nelson", "Dr. Carter", "Dr. Mitchell", "Dr. Perez", "Dr. Roberts", "Dr. Turner", "Dr. Phillips", "Dr. Campbell", "Dr. Parker", "Dr. Evans", "Dr. Edwards", "Dr. Collins"};
			return nephroDoctors;

		} else if (specialization == "Pulmonology") {
			String[] pulmoDoctors = {"Dr. Stewart", "Dr. Sanchez", "Dr. Morris", "Dr. Rogers", "Dr. Reed", "Dr. Cook", "Dr. Morgan", "Dr. Bell", "Dr. Murphy", "Dr. Bailey", "Dr. Rivera", "Dr. Cooper", "Dr. Richardson", "Dr. Cox", "Dr. Howard"};
			return pulmoDoctors;

		} else if (specialization == "Endocrinology") {
			String[] endoDoctors = {"Dr. Ward", "Dr. Torres", "Dr. Peterson", "Dr. Gray", "Dr. Ramirez", "Dr. James", "Dr. Watson", "Dr. Brooks", "Dr. Kelly", "Dr. Sanders", "Dr. Price", "Dr. Bennett", "Dr. Wood", "Dr. Barnes", "Dr. Ross"};
			return endoDoctors;

		} else if (specialization == "Rheumatology") {
			String[] rheumDoctors = {"Dr. Henderson", "Dr. Coleman", "Dr. Jenkins", "Dr. Perry", "Dr. Powell", "Dr. Long", "Dr. Patterson", "Dr. Hughes", "Dr. Flores", "Dr. Washington", "Dr. Butler", "Dr. Simmons", "Dr. Foster", "Dr. Gonzales", "Dr. Bryant"};
			return rheumDoctors;

		} else if (specialization == "Gynecology") {
			String[] gynDoctors = {"Dr. Alexander", "Dr. Russell", "Dr. Griffin", "Dr. Diaz", "Dr. Hayes", "Dr. Myers", "Dr. Ford", "Dr. Hamilton", "Dr. Graham", "Dr. Sullivan", "Dr. Wallace", "Dr. Woods", "Dr. Cole", "Dr. West", "Dr. Jordan"};
			return gynDoctors;

		} else if (specialization == "Radiology") {
			String[] radioDoctors = {"Dr. Owens", "Dr. Reynolds", "Dr. Fisher", "Dr. Ellis", "Dr. Harrison", "Dr. Gibson", "Dr. Mcdonald", "Dr. Cruz", "Dr. Marshall", "Dr. Ortiz", "Dr. Gomez", "Dr. Murray", "Dr. Freeman", "Dr. Wells", "Dr. Webb"};
			return radioDoctors;

		} else if (specialization == "Pathology") {
			String[] pathoDoctors = {"Dr. Simpson", "Dr. Stevens", "Dr. Tucker", "Dr. Porter", "Dr. Hunter", "Dr. Hicks", "Dr. Crawford", "Dr. Henry", "Dr. Boyd", "Dr. Mason", "Dr. Morales", "Dr. Kennedy", "Dr. Warren", "Dr. Dixon", "Dr. Ramos"};
			return pathoDoctors;

		} else if (specialization == "Anesthesiology") {
			String[] anestDoctors = {"Dr. Reyes", "Dr. Burns", "Dr. Gordon", "Dr. Shaw", "Dr. Holmes", "Dr. Rice", "Dr. Robertson", "Dr. Hunt", "Dr. Black", "Dr. Daniels", "Dr. Palmer", "Dr. Mills", "Dr. Nichols", "Dr. Grant", "Dr. Knight"};
			return anestDoctors;

		} else if (specialization == "Hematology") {
			String[] hematoDoctors = {"Dr. Ferguson", "Dr. Rose", "Dr. Stone", "Dr. Hawkins", "Dr. Dunn", "Dr. Perkins", "Dr. Hudson", "Dr. Spencer", "Dr. Gardner", "Dr. Stephens", "Dr. Payne", "Dr. Pierce", "Dr. Berry", "Dr. Matthews", "Dr. Arnold"};
			return hematoDoctors;

		} else if (specialization == "Infectious Disease") {
			String[] idDoctors = {"Dr. Wagner", "Dr. Willis", "Dr. Ray", "Dr. Watkins", "Dr. Olson", "Dr. Carroll", "Dr. Duncan", "Dr. Snyder", "Dr. Hart", "Dr. Cunningham", "Dr. Bradley", "Dr. Lane", "Dr. Andrews", "Dr. Ruiz", "Dr. Harper"};
			return idDoctors;

		} else if (specialization == "Emergency Medicine") {
			String[] erDoctors = {"Dr. Fox", "Dr. Riley", "Dr. Armstrong", "Dr. Carpenter", "Dr. Weaver", "Dr. Greene", "Dr. Lawrence", "Dr. Elliott", "Dr. Chavez", "Dr. Sims", "Dr. Austin", "Dr. Peters", "Dr. Kelley", "Dr. Franklin", "Dr. Lawson"};
			return erDoctors;

		} else if (specialization == "Geriatrics") {
			String[] geriDoctors = {"Dr. Fields", "Dr. Gutierrez", "Dr. Ryan", "Dr. Schmidt", "Dr. Carr", "Dr. Vasquez", "Dr. Castillo", "Dr. Wheeler", "Dr. Chapman", "Dr. Oliver", "Dr. Montgomery", "Dr. Richards", "Dr. Williamson", "Dr. Johnston", "Dr. Banks"};
			return geriDoctors;

		} else if (specialization == "Plastic Surgery") {
			String[] plasticDoctors = {"Dr. Meyer", "Dr. Bishop", "Dr. Mccoy", "Dr. Howell", "Dr. Alvarez", "Dr. Morrison", "Dr. Hansen", "Dr. Fernandez", "Dr. Garza", "Dr. Harvey", "Dr. Little", "Dr. Burton", "Dr. Stanley", "Dr. Nguyen", "Dr. George"};
			return plasticDoctors;

		} else if (specialization == "Neurosurgery") {
			String[] neuroSurgDoctors = {"Dr. Jacobs", "Dr. Reid", "Dr. Kim", "Dr. Fuller", "Dr. Lynch", "Dr. Dean", "Dr. Gilbert", "Dr. Garrett", "Dr. Romero", "Dr. Welch", "Dr. Larson", "Dr. Frazier", "Dr. Burke", "Dr. Davidson", "Dr. Hoffman"};
			return neuroSurgDoctors;

		} else if (specialization == "General Surgery") {
			String[] genSurgDoctors = {"Dr. Baldwin", "Dr. Castillo", "Dr. Love", "Dr. Abbott", "Dr. Adam", "Dr. Ballard", "Dr. Barber", "Dr. Barker", "Dr. Barron", "Dr. Barry", "Dr. Barton", "Dr. Bates", "Dr. Bean", "Dr. Beard", "Dr. Beck"};
			return genSurgDoctors;

		} else if (specialization == "Cardiothoracic Surgery") {
			String[] ctSurgDoctors = {"Dr. Becker", "Dr. Beltran", "Dr. Bender", "Dr. Benitez", "Dr. Benson", "Dr. Bentley", "Dr. Benton", "Dr. Berg", "Dr. Berger", "Dr. Bernard", "Dr. Berry", "Dr. Best", "Dr. Bird", "Dr. Blake", "Dr. Bliss"};
			return ctSurgDoctors;

		} else if (specialization == "Vascular Surgery") {
			String[] vascSurgDoctors = {"Dr. Bond", "Dr. Boone", "Dr. Booth", "Dr. Bowen", "Dr. Bowers", "Dr. Bowman", "Dr. Boyer", "Dr. Boyle", "Dr. Brady", "Dr. Bragg", "Dr. Branch", "Dr. Brand", "Dr. Brandt", "Dr. Braun", "Dr. Bray"};
			return vascSurgDoctors;

		} else if (specialization == "Neonatology") {
			String[] neoDoctors = {"Dr. Brock", "Dr. Brooks", "Dr. Browning", "Dr. Bruce", "Dr. Bryan", "Dr. Buchan", "Dr. Buck", "Dr. Buckley", "Dr. Bull", "Dr. Bullock", "Dr. Burch", "Dr. Burgess", "Dr. Burke", "Dr. Burnett", "Dr. Burns"};
			return neoDoctors;

		} else if (specialization == "Immunology") {
			String[] immuneDoctors = {"Dr. Bush", "Dr. Cain", "Dr. Calderon", "Dr. Calhoun", "Dr. Callahan", "Dr. Camacho", "Dr. Cameron", "Dr. Campbell", "Dr. Campos", "Dr. Cannon", "Dr. Cantu", "Dr. Cardenas", "Dr. Carey", "Dr. Carl", "Dr. Carlson"};
			return immuneDoctors;

		} else if (specialization == "Physical Medicine") {
			String[] physDoctors = {"Dr. Carney", "Dr. Carpenter", "Dr. Carr", "Dr. Carrillo", "Dr. Carroll", "Dr. Carson", "Dr. Carter", "Dr. Carver", "Dr. Case", "Dr. Casey", "Dr. Cash", "Dr. Castaneda", "Dr. Castillo", "Dr. Castro", "Dr. Cato"};
			return physDoctors;

		} else if (specialization == "Sports Medicine") {
			String[] sportsDoctors = {"Dr. Chambers", "Dr. Chan", "Dr. Chandler", "Dr. Chang", "Dr. Chapman", "Dr. Charles", "Dr. Chase", "Dr. Chavez", "Dr. Chen", "Dr. Cherry", "Dr. Child", "Dr. Choi", "Dr. Christian", "Dr. Christy", "Dr. Chu"};
			return sportsDoctors;

		} else if (specialization == "Pain Management") {
			String[] painDoctors = {"Dr. Church", "Dr. Clay", "Dr. Clayton", "Dr. Clemons", "Dr. Cleveland", "Dr. Cline", "Dr. Cobb", "Dr. Cochran", "Dr. Coffey", "Dr. Cohen", "Dr. Cole", "Dr. Coleman", "Dr. Collier", "Dr. Collins", "Dr. Colon"};
			return painDoctors;

		} else if (specialization == "Sleep Medicine") {
			String[] sleepDoctors = {"Dr. Compton", "Dr. Conley", "Dr. Connell", "Dr. Conner", "Dr. Conrad", "Dr. Conway", "Dr. Cook", "Dr. Cooke", "Dr. Cooley", "Dr. Cooper", "Dr. Copeland", "Dr. Corbett", "Dr. Corbin", "Dr. Cordova", "Dr. Corey"};
			return sleepDoctors;

		} else if (specialization == "Palliative Care") {
			String[] pallDoctors = {"Dr. Costa", "Dr. Cotton", "Dr. Couch", "Dr. Court", "Dr. Cowan", "Dr. Cox", "Dr. Craft", "Dr. Craig", "Dr. Crane", "Dr. Craven", "Dr. Crawford", "Dr. Creighton", "Dr. Crisp", "Dr. Cross", "Dr. Crouch"};
			return pallDoctors;

		} else if (specialization == "Hepatology") {
			String[] hepatoDoctors = {"Dr. Crow", "Dr. Crowe", "Dr. Crowley", "Dr. Cruz", "Dr. Cullen", "Dr. Cummings", "Dr. Cunningham", "Dr. Curry", "Dr. Curtis", "Dr. Dalton", "Dr. Daly", "Dr. Daniel", "Dr. Daniels", "Dr. Daugherty", "Dr. Davenport"};
			return hepatoDoctors;

		} else if (specialization == "Critical Care") {
			String[] critDoctors = {"Dr. David", "Dr. Davidson", "Dr. Davies", "Dr. Davila", "Dr. Davis", "Dr. Dawson", "Dr. Day", "Dr. Dean", "Dr. Decker", "Dr. Deleon", "Dr. Delgado", "Dr. Dell", "Dr. Dennis", "Dr. Denny", "Dr. Denton"};
			return critDoctors;

		} else if (specialization == "Medical Genetics") {
			String[] geneDoctors = {"Dr. Derr", "Dr. Desantis", "Dr. Devine", "Dr. Dewitt", "Dr. Dexter", "Dr. Diaz", "Dr. Dickerson", "Dr. Dickson", "Dr. Dillon", "Dr. Dinh", "Dr. Dixon", "Dr. Dobson", "Dr. Dodge", "Dr. Dodson", "Dr. Doherty"};
			return geneDoctors;

		} else if (specialization == "Occupational Medicine") {
			String[] occuDoctors = {"Dr. Dolan", "Dr. Donahue", "Dr. Donald", "Dr. Donaldson", "Dr. Donnell", "Dr. Donnelly", "Dr. Donovan", "Dr. Dorsey", "Dr. Dotson", "Dr. Dougherty", "Dr. Douglas", "Dr. Dow", "Dr. Dowell", "Dr. Downey", "Dr. Doyle"};
			return occuDoctors;

		} else if (specialization == "Podiatry") {
			String[] podiDoctors = {"Dr. Drake", "Dr. Draper", "Dr. Drew", "Dr. Driscoll", "Dr. Drummond", "Dr. Duarte", "Dr. Dudley", "Dr. Duff", "Dr. Duffy", "Dr. Duke", "Dr. Duncan", "Dr. Dunlap", "Dr. Dunn", "Dr. Duran", "Dr. Durham"};
			return podiDoctors;
		}
		return null;
	}
	
	public static void getDoctors(String[] doctors){
		System.out.println("Fetching Doctors name!!!!");
		for(String doctor:doctors){
			System.out.println(doctor);
		}
		System.out.println("above are the doctors name");
	}
}