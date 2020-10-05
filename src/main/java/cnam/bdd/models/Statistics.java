package cnam.bdd.models;

import java.util.Date;

public class Statistics {
    private Integer count;
    private Date birthYear;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }



    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
    }



    @Override
    public String toString() {
        return "Statistics{" +
                "count=" + count +
                ", birthYear=" + birthYear +
                '}';
    }


}
