
import com.jihwan.mart.controller.MartController;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getHours());
        if (/*date.getHours() >= 6 && date.getHours() >= 23*/ true){
            System.out.println("영업중");
            MartController martController = new MartController();
            martController.run();
        } else {
            System.out.println("마감되었습니다. 프로그램을 종료합니다.");
            return;
        }

    }
}