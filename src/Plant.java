import java.util.Date;

public class Plant {

    private String name;
    private String type;
    private String lightAmount;
    private String waterTime;
    private Date dateWatered;
    private Date nextWater;


    //getter and setters
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }

    public void setType(String t) {
        this.type = t;
    }
    public String getType() {
        return type;
    }

    public void setLightAmount(String l) {
        this.lightAmount = l;
    }
    public String getLightAmount() {
        return lightAmount;
    }

    public void setWaterTime(String w) {
        this.waterTime = w;
    }
    public String getWaterTime() {
        return waterTime;
    }

    public void setDateWatered(Date d) {
        this.dateWatered = d;
    }
    public Date getDateWatered() {
        return dateWatered;
    }

    public void setNextWater(Date nextWater) {
        this.nextWater = nextWater;
    }
    public Date getNextWater() {
        return nextWater;
    }

    //other methods
    public void updateWaterDate(Date date) {
        Date newDate = date;
        this.nextWater = newDate;
    }
}

