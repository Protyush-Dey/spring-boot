package project.FindMyTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class TrainSystem {
    private HashMap <String ,Station> stations = new HashMap<>();
    private HashMap<String, Train> trains = new HashMap<>();
    private List<Shedule> shedules = new ArrayList<>();

    public void addTrqain(Train train){
        trains.put(train.getTrainId() , train);
    }
    public void addStation(Station station){
        stations.put(station.getStationId() , station);
    }
    public void addShedule(Shedule shedule){
        shedules.add(shedule);
    }
    public List<Shedule> findMyTrain(String startStId , String endStId){
        List<Shedule> res = new ArrayList<>();
        for(Shedule shedule:shedules){
            if(shedule.getStation().getStationId().equals(startStId)  || shedule.getStation().getStationId().equals(endStId) ){
                res.add(shedule);
            }
        }
        return res;
    }
}
