package org.designPatterns.defensiveCopy;

import java.util.Date;

public class DefensivePeriod {
    private final Date start;
    private final Date end;



    /**
     * Bu şekilde constructor oluşturursak fieldlarımız immutable olur.
     * @param start
     * @param end
     */
    public DefensivePeriod(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(this.start + " after " + this.end);
    }
    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    @Override
    public String toString() {
        return "DefensivePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
