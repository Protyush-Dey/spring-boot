package project.FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationId;
    private String stationName;
    private List<Plartform> plartformList;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.plartformList = new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Plartform> getPlartformList() {
        return plartformList;
    }

    public void setPlartformList(List<Plartform> plartformList) {
        this.plartformList = plartformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", plartformList=" + plartformList +
                '}';
    }
}
