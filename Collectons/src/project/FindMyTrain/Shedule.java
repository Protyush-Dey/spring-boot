package project.FindMyTrain;

import java.time.LocalDateTime;

public class Shedule {
    private Train train;
    private Station station;
    private Plartform plartform;
    private String arrivaltime;
    private String depurtureTime;

    public Shedule(String depurtureTime, String arrivaltime, Plartform plartform, Station station, Train train) {
        this.depurtureTime = depurtureTime;
        this.arrivaltime = arrivaltime;
        this.plartform = plartform;
        this.station = station;
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Plartform getPlartform() {
        return plartform;
    }

    public void setPlartform(Plartform plartform) {
        this.plartform = plartform;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDepurtureTime() {
        return depurtureTime;
    }

    public void setDepurtureTime(String depurtureTime) {
        this.depurtureTime = depurtureTime;
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "train=" + train +
                ", station=" + station +
                ", plartform=" + plartform +
                ", arrivaltime=" + arrivaltime +
                ", depurtureTime=" + depurtureTime +
                '}';
    }
}
