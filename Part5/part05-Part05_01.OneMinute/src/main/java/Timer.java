public class Timer {
    private int hundredths;
    private int seconds;

    public Timer() {
        hundredths = 0;
        seconds = 0;
    }

    public String toString() {
        String s;

        if (seconds < 10)
            s = "0";
        else
            s = "";

        s = s + (seconds + ":");

        if (hundredths < 10)
            s = s + "0";
        s = s + hundredths;
        return s;
    }

    public void advance() {
        hundredths++;

        if (hundredths == 100)
        {
            hundredths = 0;
            seconds++;
        }

        if (seconds == 60)
            seconds = 0;
    }
}
