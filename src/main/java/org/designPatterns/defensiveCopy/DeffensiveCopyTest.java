package org.designPatterns.defensiveCopy;

import java.util.Date;

public class DeffensiveCopyTest {



    public static void main(String[] args) {

        Date start = new Date();
        Date end = new Date();
        Period notİmmutable = new Period(start, end);
        System.out.println(notİmmutable);
        notİmmutable.getEnd().setYear(1235);
        System.out.println(notİmmutable);

        System.out.println("*************************************************");

        Date start2 = new Date();
        Date end2 = new Date();

        DefensivePeriod defensivePeriod=new DefensivePeriod(start2,end2);
        System.out.println(defensivePeriod);
        defensivePeriod.getStart().setYear(1907);
        System.out.println(defensivePeriod);


    }
}
