package Generics.Sports;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //assignment of generic class of footBall
        //football
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayers());

        //baseball
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago cubs");
        baseballPlayerTeam.addPlayer(pat);

        //Soccer
        Team<SoccerPlayer> manU = new Team<>("man united");
        manU.addPlayer(beckham);


        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> realmadrid = new Team<>("Real madrid");

        manU.matchResult(chelsea, 5,0);
        manU.matchResult(realmadrid, 10,2);
        manU.matchResult(realmadrid, 5,5);
        manU.matchResult(chelsea, 1,2);


        System.out.println("Rankings");

        System.out.println(manU.getName() + ": " + manU.ranking());
        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
        System.out.println(realmadrid.getName() + ": " + realmadrid.ranking());

        System.out.println(manU.compareTo(chelsea));
        System.out.println(chelsea.compareTo(realmadrid));
        System.out.println(manU.compareTo(manU));
    }
}
