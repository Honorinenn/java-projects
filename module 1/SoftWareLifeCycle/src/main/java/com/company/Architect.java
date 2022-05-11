package com.company;

public class Architect {
package com.company.inheritance;

    public class Architect extends TeamLead {
        public void createTechRoadmap() {
            System.out.println(this.name + " says: Here's our roadmap to success.");
        }
        public void evaluateVendor() {
            System.out.println(this.name + " says: They're fine. I could do it better.");
        }

        public int estimateStoryPoints() {
            System.out.println(this.name + " says: I can deliver that story in 1 point. Just sayin.");
            return 1;
        }
    }
}
