import files.History_write_read;
import frames.DayYearConverter;
import frames.YearDayConverter;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        History_write_read history = new History_write_read();
        history.History_Directory();
//        HomePage homePage = new HomePage();
        Object[] options = {"Day to Year,Month,Week", "Year,Month,Week to Day"};
        int result = JOptionPane.showOptionDialog(null, "Please choose converter",
                "DYMW Converter ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options
                , options[0]);
        if(result ==0) {
            new DayYearConverter();
        }else {
            new YearDayConverter();
        }

}

}
