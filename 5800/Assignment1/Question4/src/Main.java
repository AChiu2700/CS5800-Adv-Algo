public class Main {
        public static void main(String[] args) {
            // Part 1
            Course cs5800 = new Course("CS 5800: Advance Software");
            cs5800.addInstructor(new Instructor ("Nima", "Davarpanah", "Room 101"));
            cs5800.addTextbook (new Textbook("Clean Code: Handbook of Agile Software Craftsmanship", "Robert C. Martin, James O. Coplien", "Prentice Hall"));

            System.out.println("------------------- Course Details ------------------");
            cs5800.Print();
        
            // Part 2
            Course cs6910 = new Course("CS 6910: Software Architecture");
            cs6910.addInstructor(new Instructor ("John", "Korah", "Room 302"));
            cs6910.addInstructor(new Instructor ("D", "Young", "Room 310"));

            cs6910.addTextbook(new Textbook("The Elements of Computing Systems: Buildiong a Modern Computer", "Noam Nisan, Shimon Schocken", "N/A"));
            cs6910.addTextbook(new Textbook("Software Engeneering: A Practitioner's Approach", "Roger S. Pressman", "McGraw-Hill Education"));

            System.out.println();
            System.out.println("------------------- Two Instructors + Two Textbook Course Details ------------------");
            cs6910.Print();
    }
}
