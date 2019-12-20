package Week1;
import nhlstats.NHLStatistics;

public class NHLStatistics13 {
    public static void main(String[] args) throws Exception {
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println();
        //sunt sortati pentru ca i-am sortat dupa goals si penalties
        NHLStatistics.teamStatistics("PHI");
        System.out.println();
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
