/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Criminal.Criminal;
import java.util.ArrayList;
import java.util.Random;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.time.LocalDate;

/**
 *
 * @author deivakumaran
 */
public class Initialization {

    public static String generateString(Random rng, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    public static int randInt(int min, int max) {

        Random rand = new Random();
        int num = 0, randomNum = 0;
        while ((num < min) || (num > max)) {
            num = rand.nextInt(max);
            if ((num > min) || (num < max)) {
                randomNum = num;
                break;
            }
        }

        return randomNum;
    }

    public static int randIntAge(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static float randfloat(double min, double max) {
        float randomNum = 0;
        Random rand = new Random();
        ArrayList<Double> arraylist = new ArrayList<Double>();

        for (double i = min; i < max; i++) {
            arraylist.add(i);
        }

        for (double j = min; j < arraylist.size(); j++) {
            randomNum = rand.nextFloat();
        }
        return randomNum;
    }

    public static void initializeCriminal(OrganizationDirectory orgDir) {
        Random random = new Random();

        String[] arrayOfHelicalRotation = {"Left", "Right"};

        for (Organization organization : orgDir.getOrganizationList()) {
            if (organization.getName().equalsIgnoreCase(Organization.Type.Admin.getValue())) {
                AdminOrganization admin = (AdminOrganization) organization;
                for (int i = 1; i < 100; i++) {
                    String[] arrayOfCity = {"Boston", "Worcester", "Salem", "Plymouth", "Waltham", "Newton", "Framingham", "Quincy", "Somerville", "Brockton", "Woburn", "Northampton", "Lynn", "Concord", "Tauntan"};
                    int no = random.nextInt(20);
                    String myCharacters = "123456789874545423323155984";
                    String[] firstNameArray = {"Adam",
                        "Adrian",
                        "Alan",
                        "Alexander",
                        "Andrew",
                        "Anthony",
                        "Austin",
                        "Benjamin",
                        "Blake",
                        "Boris",
                        "Brandon",
                        "Brian",
                        "Cameron",
                        "Carl",
                        "Charles",
                        "Christian",
                        "Christopher",
                        "Colin",
                        "Connor",
                        "Dan",
                        "David",
                        "Dominic",
                        "Dylan",
                        "Edward",
                        "Eric",
                        "Evan",
                        "Frank",
                        "Gavin",
                        "Gordon",
                        "Megan",
                        "Melanie",
                        "Michelle",
                        "Molly",
                        "Natalie",
                        "Nicola",
                        "Olivia",
                        "Penelope",
                        "Pippa",
                        "Rachel",
                        "Rebecca",
                        "Rose",
                        "Ruth",
                        "Sally",
                        "Samantha",
                        "Sarah",
                        "Sonia",
                        "Sophie",
                        "Stephanie",
                        "Sue",
                        "Theresa",
                        "Tracey",
                        "Una",
                        "Vanessa",
                        "Victoria",
                        "Virginia",
                        "Wanda",
                        "Wendy",
                        "Yvonne",
                        "Zoe"};
                    String[] lastNameArray = {"Abraham",
                        "Allan",
                        "Alsop",
                        "Anderson",
                        "Arnold",
                        "Avery",
                        "Bailey",
                        "Baker",
                        "Ball",
                        "Bell",
                        "Berry",
                        "Black",
                        "Blake",
                        "Bond",
                        "Bower",
                        "Brown",
                        "Buckland",
                        "Burgess",
                        "Butler",
                        "Cameron",
                        "Campbell",
                        "Carr",
                        "Chapman",
                        "Churchill",
                        "Clark",
                        "Clarkson",
                        "Coleman",
                        "Cornish",
                        "Davidson",
                        "Tucker",
                        "Turner",
                        "Underwood",
                        "Vance",
                        "Vaughan",
                        "Walker",
                        "Wallace",
                        "Walsh",
                        "Watson",
                        "Welch",
                        "White",
                        "Wilkins",
                        "Wilson",
                        "Wright",
                        "Young",
                        "Abraham",
                        "Allan",
                        "Alsop",
                        "Anderson",
                        "Arnold",
                        "Avery",
                        "Bailey",
                        "Baker",
                        "Ball",
                        "Bell",
                        "Berry",
                        "Black",
                        "Blake",
                        "Bond",
                        "Bower"};

                    String[] booleanArray = {"True", "False"};
                    String[] helicalArray = {"Right", "Left"};
                    String phoneNumber = generateString(random, myCharacters, 10);
                    String SA = booleanArray[random.nextInt(booleanArray.length)];
                    String robbery = booleanArray[random.nextInt(booleanArray.length)];
                    String murder = booleanArray[random.nextInt(booleanArray.length)];
                    String city = arrayOfCity[random.nextInt(arrayOfCity.length)];
                    int minDay = (int) LocalDate.of(1960, 3, 4).toEpochDay();
                    int maxDay = (int) LocalDate.of(2016, 1, 3).toEpochDay();
                    long randomDay = minDay + random.nextInt(maxDay - minDay);
                    String firstName = firstNameArray[random.nextInt(firstNameArray.length)];
                    String lastName = lastNameArray[random.nextInt(firstNameArray.length)];
                    LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
                    String[] ZipcodeArray = {"1001",
                        "1002",
                        "1003",
                        "1004",
                        "1005",
                        "1006",
                        "1007",
                        "1008",
                        "1009",
                        "1010",
                        "1011",
                        "1012",
                        "1013",
                        "1014",
                        "1015",
                        "1016",
                        "1017",
                        "1018",
                        "1019",
                        "1020",
                        "1021",
                        "1022",
                        "1023",
                        "1024",
                        "1025",
                        "2020",
                        "2021",
                        "2022",
                        "2023",
                        "2024",
                        "2025",
                        "2026",
                        "2027",
                        "2028",
                        "2029",
                        "2030",
                        "2031",
                        "2032",
                        "2033",
                        "2034",
                        "2035",
                        "2036",
                        "2037",
                        "2038",
                        "2039",
                        "2040",
                        "2041",
                        "2042",
                        "2043",
                        "2044",
                        "2045",
                        "2046",
                        "2047",
                        "2048",
                        "2049",
                        "2050",
                        "2051",
                        "3058",
                        "3059",
                        "3060",
                        "3061",
                        "3062",
                        "3063",
                        "3064",
                        "3065",
                        "3066",
                        "3067",
                        "3068",
                        "3069",
                        "3070",
                        "3071",
                        "3072",
                        "3073",
                        "3074",
                        "3075",
                        "3076",
                        "3077",
                        "3078",
                        "3079",
                        "3080",
                        "1081",
                        "1082",
                        "1083",
                        "1084",
                        "1085",
                        "1086",
                        "1087",
                        "1088",
                        "1089"};

                    int age = randIntAge(12, 80);
                    String zipCode = ZipcodeArray[random.nextInt(ZipcodeArray.length)];

                    admin.getCriminalDirectory().addCriminal(firstName, lastName, randomBirthDate, age, no, SA, robbery, murder, city, zipCode, phoneNumber);
                }
                for (Criminal criminal : admin.getCriminalDirectory().getCriminalList()) {
                    String[] fingerPrintTypeArray = {"Plain Arch", "Tented Arch", "Radial Loop  ", "Ulnar Loop", "Plain Whorl ", "Central Pocket Whorl", "Double Loop Whorl", "Accidental Whorl"};
                    String[] helicalArray = {"Right", "Left"};
                    String helicalRotation = helicalArray[random.nextInt(helicalArray.length)];
                    int diameter = randInt(18, 23);
                    int spacing = randInt(2, 8);
                    String fingerPrintType = fingerPrintTypeArray[random.nextInt(fingerPrintTypeArray.length)];
                    int helicalTurn = randInt(28, 44);
                    int rotationPerBase = randInt(32, 36);
                    int meanPropellerTwist = randInt(16, 20);
                    double distanceBWAdjPh = randInt(2, 8);
                    criminal.setIdentificationSigns(criminal.addIdentificationSigns(helicalRotation, diameter, helicalTurn, rotationPerBase, meanPropellerTwist, distanceBWAdjPh, fingerPrintType, spacing));
                }
            }

        }

    }

}
