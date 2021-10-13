package lesson.Lesson05;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRobotCats {
    public static void main(String[] args) {
        BatteryRobotCat batteryRobotCatOld1 = new BatteryRobotCat("batteryRobotCat","01/01/2021");
        BatteryRobotCat batteryRobotCatOld2 = new BatteryRobotCat("batteryRobotCat","01/01/2021");
        BatteryRobotCat batteryRobotCatNew1 = new BatteryRobotCat("batteryRobotCat","01/01/2021","con o");
        BatteryRobotCat batteryRobotCatNew2 = new BatteryRobotCat("batteryRobotCat","01/01/2021","con o");
        BatteryRobotCat batteryRobotCatNew3 = new BatteryRobotCat("batteryRobotCat","01/01/2021","con o");

        TestRobotCats testRobotCats = new TestRobotCats();

//        List<BatteryRobotCat> abc = new ArrayList<>();
//        abc.add(batteryRobotCatOld1);
//        abc.add(batteryRobotCatOld2);
//        abc.add(batteryRobotCatNew1);
//        abc.add(batteryRobotCatNew2);
//        abc.add(batteryRobotCatNew3);
//        testRobotCats.checkCatTypes(abc);

        testRobotCats.checkCatTypes(Arrays.asList(
                batteryRobotCatOld1,
                batteryRobotCatOld2,
                batteryRobotCatNew1,
                batteryRobotCatNew2,
                batteryRobotCatNew3
        ));

        System.out.println("=========");
        SolarEnergyRobotCat solarEnergyRobotCat = new SolarEnergyRobotCat();
        batteryRobotCatNew1.charge();
        solarEnergyRobotCat.charge();

    }

    public void checkCatTypes (List<BatteryRobotCat> batteryRobotCats){
        int totalCatOldType = 0;
        int totalCatNewType = 0;

        for (BatteryRobotCat robotCat : batteryRobotCats) {
            if (robotCat.getBatteryType() == null)
                totalCatOldType++;
            else
                totalCatNewType++;
        }

        System.out.println(totalCatOldType);
        System.out.println(totalCatNewType);
    }
}
