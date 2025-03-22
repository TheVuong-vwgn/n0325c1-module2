package ss3_static.Exercise4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String dateString1 = "20/03/2025";
        String dateString2 = "2025/03/20";

        LocalDate date1 = LocalDateUtil.fromString_ddMMyyyy(dateString1);
        LocalDate date2 = LocalDateUtil.fromString_yyyyMMdd(dateString2);

        System.out.println("LocalDate từ chuỗi dd/MM/yyyy: " + date1);
        System.out.println("LocalDate từ chuỗi yyyy/MM/dd: " + date2);

        LocalDate currentDate = LocalDate.now();

        String formatterDate1 = LocalDateUtil.toString_ddMMyyyy(currentDate);
        String formatterDate2 = LocalDateUtil.toString_yyyyMMdd(currentDate);

        System.out.println("Chuỗi từ LocalDate dd/MM/yyyy: " + formatterDate1);
        System.out.println("Chuỗi từ LocalDate yyyy/MM/dd: " + formatterDate2);
    }
}
