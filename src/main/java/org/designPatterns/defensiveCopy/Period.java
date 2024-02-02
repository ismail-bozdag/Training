package org.designPatterns.defensiveCopy;

import java.util.Date;

public class Period {


    private final Date start;
    private final Date end;




    /**
     * Bu şekilde tanımlarsa immutable olmaz çünkü bu nesnenin tanımlandığı yerde o fieldlar değiştirilirse burada da değişir.
     * @param start
     * @param end
     */
    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
