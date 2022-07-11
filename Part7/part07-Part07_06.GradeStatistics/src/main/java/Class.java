import java.util.ArrayList;

public class Class {
    private ArrayList<Grade> myClass;
    private int num0;
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public Class() {
        myClass = new ArrayList<>();

        num0 = 0;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
        num5 = 0;
    }

    public void addGrade(int grade) {
        Grade g = new Grade(grade);
        myClass.add(g);

        if(g.getDistribution() == 5)
            num5++;
        else if(g.getDistribution() == 4)
            num4++;
        else if(g.getDistribution() == 3)
            num3++;
        else if(g.getDistribution() == 2)
            num2++;
        else if(g.getDistribution() == 1)
            num1++;
        else
            num0++;
    }

    public double getAverage() {
        double avg = 0.0;
        for(Grade g: myClass) {
            avg += g.getGrade();
        }

        return avg / myClass.size();
    }

    public double getPassingAverage() {
        double avg = 0.0;
        int counter = 0;

        for(Grade g: myClass) {
            if(g.getPassed() == true) {
                avg += g.getGrade();
                counter++;
            }
        }

        return avg / counter;
    }

    public double getPassPercentage() {
        return (100.0 * (num1 + num2 + num3 + num4 + num5)) / myClass.size();
    }

    public void printDistribution() {
        int i = 5;
        while (i >= 0) {
            System.out.print(i + ": ");
            int j = 0;
            int current = 0;

            if (i == 5)
                current = num5;
            else if (i == 4)
                current = num4;
            else if (i == 3)
                current = num3;
            else if (i == 2)
                current = num2;
            else if (i == 1)
                current = num1;
            else
                current = num0;

            while(j < current) {
                System.out.print("*");
                j++;
            }  
            System.out.print("\n");

            i--;
        }
    }
}
