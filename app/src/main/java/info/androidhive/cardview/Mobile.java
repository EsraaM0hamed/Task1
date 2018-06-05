package info.androidhive.cardview;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Mobile {
    private String name;
    private int average;
    private double rate;
    private int  thumbnail;
    private int numOfpoor;
    private int numOfavrage;
    private int numOfgood;

    public Mobile() {
    }

    public Mobile(String name, int average, int thumbnail) {
        this.name = name;
       this.setAverage(average);
       this.thumbnail=thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getNumOfpoor() {
        return numOfpoor;
    }

    public void setNumOfpoor(int numOfpoor) {
        this.numOfpoor = numOfpoor;
    }

    public int getNumOfavrage() {
        return numOfavrage;
    }

    public void setNumOfavrage(int numOfavrage) {
        this.numOfavrage = numOfavrage;
    }

    public int getNumOfgood() {
        return numOfgood;
    }

    public void setNumOfgood(int numOfgood) {
        this.numOfgood = numOfgood;
    }
}
