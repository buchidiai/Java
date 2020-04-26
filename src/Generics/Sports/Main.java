package Generics.Sports;

public class Main {

    public static void main(String[] args) {


//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        //assignment of generic class of footBall
//        //football
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
//        System.out.println(adelaideCrows.numPlayers());
//
//        //baseball
//        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago cubs");
//        baseballPlayerTeam.addPlayer(pat);
//
//        //Soccer
//        Team<SoccerPlayer> manU = new Team<>("man united");
//        manU.addPlayer(beckham);
//
//
//        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
//        Team<SoccerPlayer> realmadrid = new Team<>("Real madrid");
//
//        manU.matchResult(chelsea, 5,0);
//        manU.matchResult(realmadrid, 10,2);
//        manU.matchResult(realmadrid, 5,5);
//        manU.matchResult(chelsea, 1,2);
//
//
//        System.out.println("Rankings");
//
//        System.out.println(manU.getName() + ": " + manU.ranking());
//        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
//        System.out.println(realmadrid.getName() + ": " + realmadrid.ranking());
//
//        System.out.println(manU.compareTo(chelsea));
//        System.out.println(chelsea.compareTo(realmadrid));
//        System.out.println(manU.compareTo(manU));

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.add(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning
    }
}
