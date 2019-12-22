package Week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class NHLStatisticsPartTwo24 {
        public static void main(String[] args) throws Exception {
            Scanner reader = new Scanner(System.in);

            System.out.println("NHL statistics service");
            while (true) {
                System.out.println("");
                System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
                String command = reader.nextLine();

                if (command.equals("quit")) {
                    break;
                }

                if (command.equals("points")) {
                    // print the top ten playes sorted by points
                    NHLStatistics.sortByPoints();
                    NHLStatistics.top(10);
                } else if (command.equals("goals")) {
                    // print the top ten players sorted by goals
                    NHLStatistics.sortByGoals();
                    NHLStatistics.top(10);
                } else if (command.equals("assists")) {
                    // print the top ten players sorted by assists
                    NHLStatistics.sortByAssists();
                    NHLStatistics.top(10);
                } else if (command.equals("penalties")) {
                    // print the top ten players sorted by penalties
                    NHLStatistics.sortByPenalties();
                    NHLStatistics.top(10);
                } else if (command.equals("player")) {
                    // ask the user for the player name and print the statistics for that player
                    System.out.println("Type in the player name");
                    String player = reader.nextLine();
                    NHLStatistics.searchByPlayer(player);
                } else if (command.equals("club")) {
                    // ask the user for the club abbreviation and print the statistics for the club
                    // note: the statistics should be sorted by points
                    //     (players with the most points are first)
                    System.out.println("What is the club abbreviation?");
                    String abbreviation = reader.nextLine();
                    NHLStatistics.sortByPoints();
                    NHLStatistics.teamStatistics(abbreviation);
                }
            }
        }
    }
