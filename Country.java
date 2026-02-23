class Country {

    static String[] findStatesByCountry(String countryName) {

        if (countryName.equals("India")) {
            String[] states = {
                "Andhra Pradesh","Arunachal Pradesh","Assam","Bihar",
                "Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh",
                "Jharkhand","Karnataka","Kerala","Madhya Pradesh",
                "Maharashtra","Manipur","Meghalaya","Mizoram",
                "Nagaland","Odisha","Punjab","Rajasthan","Sikkim",
                "Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
                "Uttarakhand","West Bengal"
            };
            return states;
        }

     
        else if (countryName.equals("USA")) {
            String[] states = {
                "Alabama","Alaska","Arizona","Arkansas","California",
                "Colorado","Connecticut","Delaware","Florida","Georgia",
                "Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas",
                "Kentucky","Louisiana","Maine","Maryland","Massachusetts",
                "Michigan","Minnesota","Mississippi","Missouri","Montana",
                "Nebraska","Nevada","New Hampshire","New Jersey",
                "New Mexico","New York","North Carolina","North Dakota",
                "Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island",
                "South Carolina","South Dakota","Tennessee","Texas",
                "Utah","Vermont","Virginia","Washington",
                "West Virginia","Wisconsin","Wyoming"
            };
            return states;
        }

        else if (countryName.equals("Canada")) {
            String[] states = {
                "Alberta","British Columbia","Manitoba","New Brunswick",
                "Newfoundland and Labrador","Nova Scotia",
                "Ontario","Prince Edward Island","Quebec","Saskatchewan"
            };
            return states;
        }


        else if (countryName.equals("Australia")) {
            String[] states = {
                "New South Wales","Queensland","South Australia",
                "Tasmania","Victoria","Western Australia"
            };
            return states;
        }

        else if (countryName.equals("Germany")) {
            String[] states = {
                "Baden-Württemberg","Bavaria","Berlin","Brandenburg",
                "Bremen","Hamburg","Hesse","Lower Saxony",
                "Mecklenburg-Vorpommern","North Rhine-Westphalia",
                "Rhineland-Palatinate","Saarland",
                "Saxony","Saxony-Anhalt","Schleswig-Holstein","Thuringia"
            };
            return states;
        }

   
        else if (countryName.equals("Brazil")) {
            String[] states = {
                "Acre","Alagoas","Amapa","Amazonas","Bahia",
                "Ceara","Espirito Santo","Goias","Maranhao",
                "Mato Grosso","Mato Grosso do Sul","Minas Gerais",
                "Para","Paraiba","Parana","Pernambuco","Piaui",
                "Rio de Janeiro","Rio Grande do Norte",
                "Rio Grande do Sul","Rondonia","Roraima",
                "Santa Catarina","Sao Paulo","Sergipe","Tocantins"
            };
            return states;
        }

    
        else if (countryName.equals("Japan")) {
            String[] states = {
                "Tokyo","Osaka","Kyoto","Hokkaido",
                "Hiroshima","Fukuoka","Okinawa","Nagano"
            };
            return states;
        }


        else if (countryName.equals("South Africa")) {
            String[] states = {
                "Eastern Cape","Free State","Gauteng",
                "KwaZulu-Natal","Limpopo","Mpumalanga",
                "Northern Cape","North West","Western Cape"
            };
            return states;
        }

    
        else if (countryName.equals("Mexico")) {
            String[] states = {
                "Chihuahua","Jalisco","Puebla","Yucatan",
                "Oaxaca","Sonora","Veracruz","Guerrero",
                "Baja California","Durango"
            };
            return states;
        }

        else if (countryName.equals("China")) {
            String[] states = {
                "Beijing","Shanghai","Guangdong","Zhejiang",
                "Sichuan","Yunnan","Hunan","Hubei",
                "Henan","Shandong","Hebei","Fujian",
                "Jiangsu","Anhui","Shanxi"
            };
            return states;
			
		
        }
		
				else if (countryName.equals("France")) {
			String[] states = {
				"Île-de-France","Normandy","Brittany",
				"Occitanie","Grand Est","Nouvelle-Aquitaine"
			};
			return states;
		}

		else if (countryName.equals("Italy")) {
			String[] states = {
				"Lombardy","Sicily","Veneto",
				"Tuscany","Lazio","Piedmont"
			};
			return states;
		}

		else if (countryName.equals("Spain")) {
			String[] states = {
				"Catalonia","Madrid","Andalusia",
				"Valencia","Galicia","Basque Country"
			};
			return states;
		}

        else {
            System.out.println("Country not found");
            return null;
        }
    }

    static void displayStates(String[] states) {
        if (states != null) {
            for (String state : states) {
                System.out.println(state);
            }
        }
    }
}