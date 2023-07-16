package converter;

import static java.lang.Integer.parseInt;

public class ConversionProgram {
    private String DAYS, MONTHS, YEAR,WEEKS;

    public ConversionProgram( String YEAR,String MONTHS ,String WEEKS) {
        this.MONTHS = MONTHS;
        this.YEAR = YEAR;
        this.WEEKS= WEEKS;
    }

    public ConversionProgram(String DAYS){
        this.DAYS = DAYS;
    }

    public String day_to_week() {

            int days = DAYS == "" ? 0 : parseInt(DAYS);
            int week = days / 7;
            String weeks = new String(String.valueOf(week));
            return weeks;



    }

    public String day_to_month() {

            int days =  DAYS == "" ? 0 : parseInt(DAYS);
            int month = days / 30;
            String months = new String(String.valueOf(month));
            return months;

    }

    public String day_to_year() {

            int days = DAYS == "" ? 0 : parseInt(DAYS);
            int year = days / 365;
            String years = new String(String.valueOf(year));
            return years;

        }
        public String other_to_day () {
            int weeks, months, year, days;
            if (WEEKS.isEmpty() && MONTHS.isEmpty() && YEAR.isEmpty()) {
                System.out.println("Please enter at least one value (weeks, months, or years)!");
                return null;
            }

            if (WEEKS.isEmpty()) {
                weeks = 0;
            } else {
                weeks = parseInt(WEEKS);
            }

            if (MONTHS.isEmpty()) {
                months = 0;
            } else {
                months = parseInt(MONTHS);
            }

            if (YEAR.isEmpty()) {
                year = 0;
            } else {
                year = parseInt(YEAR);
            }


            days = (weeks * 7) + (months * 30) + (year * 365);

            String result = new String(String.valueOf(days));
            return result;
        }


    }
