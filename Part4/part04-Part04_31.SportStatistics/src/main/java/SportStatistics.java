
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Team> teamList = new ArrayList<>();

        try (Scanner fileScan = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                if (line.isEmpty())
                    continue;

                String[] parts = line.split(",");
                
                boolean updateTeam1 = false;
                boolean updateTeam2 = false;

                if (teamList.isEmpty()) {
                    addToList1(parts[0], parts, teamList);
                    addToList2(parts[1], parts, teamList);
                    continue;
                }

                for (Team t: teamList) {
                    if (updateTeam1 == true && updateTeam2 == true)
                        break;

                    if (t.getName().equals(parts[0])) {
                        t = updateWinLoss(parts, t);
                        updateTeam1 = true;
                        continue;  
                    }
                    
                    if (t.getName().equals(parts[1])) {
                        t = updateLossWin(parts, t);
                        updateTeam2 = true;
                        continue;
                    }
                }

                if (updateTeam1 == false)
                    addToList1(parts[0], parts, teamList);

                if (updateTeam2 == false) {
                    addToList2(parts[1], parts, teamList);
                }
                
            } // end of while loop

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print loop
        System.out.println("Team:");
        String team = scan.nextLine();

        boolean found = false;
        for (Team t: teamList) {
            if (t.getName().equals(team)) {
                System.out.println(t);
                found = true;
                break;
            }
        }

        if (found == false)
            System.out.println("Games: 0");

        scan.close();
    }

    public static void addToList1(String name, String[] parts, ArrayList<Team> teamList) {
        Team t = new Team(name);
        t = updateWinLoss(parts, t);

        teamList.add(t);
    }

    public static void addToList2(String name, String[] parts, ArrayList<Team> teamList) {
        Team t = new Team(name);
        t = updateLossWin(parts, t);

        teamList.add(t);
    }

    public static Team updateWinLoss(String[] parts, Team t) {
        if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3]))
            t.incrementWins();
        else
            t.incrementLosses();
        t.incrementNumGames();

        return t;
    }

    public static Team updateLossWin(String[] parts, Team t) {
        if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2]))
            t.incrementWins();
        else
            t.incrementLosses();
        t.incrementNumGames();

        return t;
    }

}
