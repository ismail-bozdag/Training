package org.designPatterns.theStrategyEnumPattern;

import static org.designPatterns.theStrategyEnumPattern.PayrollDay.PayType.*;

/**
 * Bu sınıfı effective-java-deep-tutorial reposundan aldım.
 * Enum kullanarak gruplara ayırmak ve bu gruplara ayrı davranış tanımlamak için güzel bir örnek
 */
enum PayrollDay {
    MONDAY(WEEKDAY), TUESDAY(WEEKDAY), WEDNESDAY(WEEKDAY), THURSDAY(WEEKDAY), FRIDAY(WEEKDAY), SATURDAY(WEEKEND),
    KURBAN_BAYRAM(WEEKEND),
    SUNDAY(WEEKEND);
    private final PayType payType;
    // Constructor
    PayrollDay(PayType payType) {
        this.payType = payType;
    }
    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }
    // The strategy enum type
    enum PayType {
        WEEKDAY {
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }

    public static void main(String[] args) {
        for (PayrollDay day : values())
            System.out.printf("%-10s%d%n", day, day.pay(8 * 60, 1));
    }

}