package project.FindMyTrain;

public class Plartform {
    private int plartformNo;
    private Train train;
    Plartform(int plartformNo){
        this.plartformNo = plartformNo;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getPlartformNo() {
        return plartformNo;
    }

    public void setPlartformNo(int plartformNo) {
        this.plartformNo = plartformNo;
    }

    @Override
    public String toString() {
        return "Plartform{" +
                "plartformNo=" + plartformNo +
                ", train=" + train +
                '}';
    }
}
