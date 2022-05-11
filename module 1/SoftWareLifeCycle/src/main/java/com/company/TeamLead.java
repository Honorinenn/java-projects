package com.company;

public class TeamLead {
    package com.company.inheritance;

    public class TeamLead extends Developer {

//    private Developer[] myDevelopers = new Developer[10];

        public TeamLead(String name, int hireYear, String preferredProgrammingLanguage) {
            super(name, hireYear, preferredProgrammingLanguage);
            System.out.println("Makin a teamLead named " + name);
        }

        public TeamLead() {
            // super();  super automatically gets called whether I write it or not
        }

        public String getTeamLeadName() {
            return "me";
        }
        public void planSprint() {
            System.out.println(this.getName() + " says: We commit to deliver 100 points.");
        }

        public void assignWork(Developer dev) {
            System.out.println(this.name + " says: " + dev.getName() + ", start coding.");
        }

        public int estimateStoryPoints() {
            int developerPoints = super.estimateStoryPoints();
            System.out.println(this.name + " says: A developer might rate this as a " + developerPoints + ".");
            System.out.println(this.name + " says: Nope! That's only 2 points. Work smarter!");
            return 2;
        }
    }
}
