import java.util.ArrayList;

public class Student
{
    private String name;
    private int idNum;
    private ArrayList<Integer> testScores;

    /**
     * Creates a Student object
     * @param studentName the name of the student
     * @param idNumber the id number of the student
     */
    public Student(String studentName, int idNumber) {
        name = studentName;
        idNum = idNumber;
        testScores = new ArrayList<Integer>();
    }

    /**
     * Adds a new score to the students class roster
     * @param classScore the score for a new class
     */
    public void addScore(int classScore) {
        testScores.add(classScore);
    }

    /**
     * returns the value of name
     * @return returns the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name to a new value
     * @param studentName the new value for the student's name
     */
    public void setName(String studentName) {
        name = studentName;
    }

    /**
     * returns the value of the student's id
     * @return returns the value of the student's id
     */
    public int getIdNum() {
        return idNum;
    }

    /**
     * Sets the student's id to a new value
     * @param idNumber the new value for the student's id
     */
    public void setIdNum(int idNumber) {
        idNum = idNumber;
    }

    /**
     * Returns the student's data
     * @return the student's details
     */
    @Override public String toString() {
        return ("ID: " + getIdNum() + "\n" +
                "Name: " + getName() + "\n" +
                "Average Grade: " + getAverage());
    }

    /**
     * Calculates the average value of all scores, but returns -1 if empty
     * @return The average value of all scores, or -1 if empty
     */
    public double getAverage() {
        if (testScores.size() == 0) return -1.0;
        double t = 0;
        for (int i = 0; i < testScores.size(); i++) {
            t += testScores.get(i);
        }
        return t / testScores.size();
    }
}