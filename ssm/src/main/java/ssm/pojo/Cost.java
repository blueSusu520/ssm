package ssm.pojo;

import java.util.Date;

public class Cost {

    private Integer id;
    private Date costDay;
    private Double morning;
    private Double afternoon;
    private Double evening;
    private Double totalcost;

    public Cost() {
    }

    public Cost(Integer id, Date costDay, Double morning, Double afternoon, Double evening, Double totalcost) {
        this.id = id;
        this.costDay = costDay;
        this.morning = morning;
        this.afternoon = afternoon;
        this.evening = evening;
        this.totalcost = totalcost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCostDay() {
        return costDay;
    }

    public void setCostDay(Date costDay) {
        this.costDay = costDay;
    }

    public Double getMorning() {
        return morning;
    }

    public void setMorning(Double morning) {
        this.morning = morning;
    }

    public Double getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Double afternoon) {
        this.afternoon = afternoon;
    }

    public Double getEvening() {
        return evening;
    }

    public void setEvening(Double evening) {
        this.evening = evening;
    }

    public Double getTotalcost() {
        return totalcost;
    }


    public void setTotalcost(Double totalcost) {
        this.totalcost = totalcost;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", costDay=" + costDay +
                ", morning=" + morning +
                ", afternoon=" + afternoon +
                ", evening=" + evening +
                ", totalcost=" + totalcost +
                '}';
    }
}
