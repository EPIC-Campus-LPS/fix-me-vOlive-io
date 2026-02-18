import java.util.ArrayList;

public class run_stuff {
    public static void main(String[] args) {
        ArrayList<Student> studentArray = new ArrayList<Student>();

        // Create Students
        Student studentOne = new Student("Alice", 101);
        studentOne.addScore(85);
        studentOne.addScore(90);
        studentOne.addScore(78);
        studentArray.add(studentOne);

        Student studentTwo = new Student("Bob", 102);
        studentTwo.addScore(92);
        studentTwo.addScore(88);
        studentTwo.addScore(95);
        studentArray.add(studentTwo);

        Student studentThree = new Student("Charlie", 103);
        studentThree.addScore(70);
        studentThree.addScore(60);
        studentThree.addScore(65);
        studentArray.add(studentThree);

        ///////////////////////////////////////////////
        // DOING THE MATH AND PRINTING ALL AT ONCE   //
        ///////////////////////////////////////////////
        for(int i = 0; i < studentArray.size(); i++) {
            Student student = studentArray.get(i);
            double studentAverage = student.getAverage();
            String letterGrade;
            if (studentAverage >= 90) letterGrade = "A";
            else if (studentAverage >= 80) letterGrade = "B";
            else if (studentAverage >= 70) letterGrade = "C";
            else if (studentAverage >= 60) letterGrade = "D";
            else letterGrade = "F";
            System.out.println(student + "\nLetter Grade: " + letterGrade);
        }
        System.out.println("\n\n");
        /////////////////////////////////
        //  FINDING THE BEST STUDENT   //
        /////////////////////////////////
        double highestGrade = -1;
        Student star = studentArray.get(0);
        for (Student student : studentArray) {
            if (student.getAverage() > highestGrade) {
                highestGrade = student.getAverage();
                star = student;
            }
        }
        System.out.println("Star Student: \n" + star);
        System.out.println("\n\n");

        ///////////////////////////////
        // FINDING FAILING STUDENTS  //
        /// ///////////////////////////
        System.out.println("Students that need help:");
        for(Student student : studentArray) {
            if(student.getAverage() < 70) {
                System.out.println(student);
            }
        }
        System.out.println("\n\n");
    }
}