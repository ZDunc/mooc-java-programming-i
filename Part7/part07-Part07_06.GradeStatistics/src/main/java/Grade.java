public class Grade {
    private int grade; // out of 100
    private boolean passed; // greater or equal to 50?
    private int distribution; // scale of 0-5

    public Grade(int grade) {
        this.grade = grade;

        if (grade >= 50)
            passed = true;
        else
            passed = false;

        if (grade >= 90)
            distribution = 5;
        else if (grade < 90 && grade >= 80)
            distribution = 4;
        else if (grade < 80 && grade >= 70)
            distribution = 3;
        else if (grade < 70 && grade >= 60)
            distribution = 2;
        else if (grade < 60 && grade >= 50)
            distribution = 1;
        else
            distribution = 0;
    }

    public int getGrade() {
        return grade;
    }

    public boolean getPassed() {
        return passed;
    }

    public int getDistribution() {
        return distribution;
    }
}
