package project.FindMyTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem trainSystem = new TrainSystem();
        Station st1 = new Station("st01" , "Habra");
        Station st2 = new Station("st02" , "Bongan");

        Train train1 = new Train("t01" , "hb-bn" , "local");
        Train train2 = new Train("t02" , "bn-hb" , "local");

        Plartform p1 = new Plartform(1);
        Plartform p2 = new Plartform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);
        List<Plartform> pt = new ArrayList<>();
        pt.add(p1);
        pt.add(p2);
        st1.setPlartformList(pt);

        Shedule sh1 = new Shedule("12:47am" , "12:50am" , p1 ,st1 ,train1);
        Shedule sh2 = new Shedule("1:47am" , "1:50am" , p2 ,st2 ,train1);
        trainSystem.addStation(st1);
        trainSystem.addStation(st2);
        trainSystem.addTrqain(train1);
        trainSystem.addTrqain(train2);
        trainSystem.addShedule(sh1);
        trainSystem.addShedule(sh2);

        Scanner sc = new Scanner(System.in);
        System.out.println("start");
        String src = sc.nextLine();

        System.out.println("destination");
        String dst = sc.nextLine();

        List<Shedule> sclist = trainSystem.findMyTrain(src , dst);

        System.out.println(sclist.getFirst());
    }
}
