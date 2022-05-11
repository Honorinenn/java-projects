package com.company;

public class SoftWareLifeCycleApp {

    package com.company.inheritance;

    public class SoftwareDevelopmentLifecycle {
        public static void main(String[] args) {
            Developer dev1 = new Developer("Jennifer", 2020, "JavaScript");
            Developer dev2 = new Developer("Hoa", 2021, "JavaScript");

            Developer teamLead = new TeamLead();
            teamLead.setName("Honorine");
            teamLead.setHireYear(1981);
            teamLead.setPreferredProgrammingLanguage("Java");

            dev1.estimateStoryPoints();
            dev2.checkInCode();

//        teamLead.assignWork(dev1);
            teamLead.estimateStoryPoints();

            Architect architect = new Architect();
            architect.setName("Max");
            architect.setHireYear(2018);
            architect.setPreferredProgrammingLanguage("JavaScript");

            architect.checkInCode();
            architect.estimateStoryPoints();
            architect.assignWork(teamLead);
            architect.planSprint();
            architect.createTechRoadmap();
            architect.evaluateVendor();

            dev1.submitTimeCard();
            dev2.submitTimeCard();
            teamLead.submitTimeCard();
            architect.submitTimeCard();

            Developer[] devs = new Developer[4];
            devs[0] = dev1;
            devs[1] = dev2;
            devs[2] = teamLead;
            devs[3] = architect;

            for (Developer developer: devs) {
                System.out.println("===== " + developer.getName() + " =====");
                developer.submitTimeCard();
                developer.checkInCode();
                developer.estimateStoryPoints();
            }

            for(Object person: devs) {
                System.out.println(person.toString());
            }
        }
    }






}
