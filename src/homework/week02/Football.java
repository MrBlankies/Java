package homework.week02;

import java.util.ArrayList;
import java.util.Scanner;

class TeamStats {
    String teamName;
    int wins;
    int losses;
    int ties;

    public TeamStats(String teamName) {
        this.teamName = teamName;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public String toString() {
        return teamName + " - Wins: " + wins + ", Losses: " + losses + ", Ties: " + ties;
    }
}




public class Football {
    public static void main(String[] args) {

        ArrayList<TeamStats> teams = new ArrayList<>();

        System.out.println("Welcome to the Football League of Elbonia");
        System.out.println("1. Add Game");
        System.out.println("2. Team Performance");
        System.out.println("0. Exit");

        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        input.nextLine();

        while (option != 0) {
            switch (option) {
                case 1:
                    System.out.print("Team 1: ");
                    String team1Name = input.nextLine();
                    System.out.print("Goals: ");
                    int team1goals = input.nextInt();
                    input.nextLine();

                    System.out.print("Team 2: ");
                    String team2Name = input.nextLine();
                    System.out.print("Goals: ");
                    int team2goals = input.nextInt();
                    input.nextLine();

                    // to find or create the teams
                    TeamStats team1 = findOrCreateTeam(teams, team1Name);
                    TeamStats team2 = findOrCreateTeam(teams, team2Name);

                    if (team1goals > team2goals) {
                            team1.wins++;
                            team2.losses++;
                        }
                    else if (team1goals < team2goals) {
                        team2.wins++;
                        team1.losses++;
                        }
                    else {
                        team1.ties++;
                        team2.ties++;
                    }
                    System.out.println("Game Added.");
                    break;
                case 2:
                    System.out.print("Search Team:  ");
                    String Search = input.nextLine();
                    boolean found = false;
                    for (TeamStats team : teams) {
                        if (team.teamName.equals(Search)) {
                            System.out.println(team);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Team not found.");
                    }

                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("\n1. Add Game\n2. Team Performance\n0. Exit");
            option = input.nextInt();
            input.nextLine();
        }
    }
    private static TeamStats findOrCreateTeam(ArrayList<TeamStats> teams, String teamName) {
        for (TeamStats team : teams) {
            if (team.teamName.equals(teamName)) {
                return team;
            }
        }
        TeamStats newTeam = new TeamStats(teamName);
        teams.add(newTeam);
        return newTeam;
    }
}