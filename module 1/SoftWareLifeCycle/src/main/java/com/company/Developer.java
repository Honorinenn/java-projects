package com.company;

public class Developer {
    package com.company.inheritance;

    public class Developer extends StaffMember {
        protected int hireYear;
        protected String preferredProgrammingLanguage;
        private String teamLeadName;

        public Developer(String name, int hireYear, String preferredProgrammingLanguage) {
            this.name = name;
            this.hireYear = hireYear;
            this.preferredProgrammingLanguage = preferredProgrammingLanguage;
        }
        public Developer(String name, int hireYear, String preferredProgrammingLanguage, String teamLeadName) {
            this.name = name;
            this.hireYear = hireYear;
            this.preferredProgrammingLanguage = preferredProgrammingLanguage;
            this.teamLeadName = teamLeadName;
        }

        public void submitTimeCard() {
            System.out.println(this.name + " says: PAY ME!");
        };

        public Developer() {
        }

        public int estimateStoryPoints() {
            System.out.println(this.name + " says: Hmmm... I think we should do 3 story points");
            return 3;
        }

        public String getTeamLeadName() {
            return this.teamLeadName;
        }

        public void checkInCode() {
            System.out.println(this.name + " types: git add -A; git commit -m 'developed this'; git push");
        }


        public int getHireYear() {
            return hireYear;
        }

        public void setHireYear(int hireYear) {
            this.hireYear = hireYear;
        }

        public String getPreferredProgrammingLanguage() {
            return preferredProgrammingLanguage;
        }

        public void setPreferredProgrammingLanguage(String preferredProgrammingLanguage) {
            this.preferredProgrammingLanguage = preferredProgrammingLanguage;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", hireYear=" + hireYear +
                    ", preferredProgrammingLanguage='" + preferredProgrammingLanguage + '\'' +
                    '}';
        }
    }
}
