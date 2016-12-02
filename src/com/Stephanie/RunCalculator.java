package com.Stephanie;
import java.util.Scanner;

public class RunCalculator {
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //explain program
        System.out.println("This program will show you a schedule for a marathon, increasing a certain percentage each week until " +
                "you reach 26.2 miles.Please enter as 5 for 5 percent and so on.");
        //ask user what percentage they would like to run
        System.out.println("Please enter a percentage now. ");
        double percentIncrease= numberScanner.nextDouble();
        runningCalculations(percentIncrease);

        stringScanner.close();
        numberScanner.close();

    }
    public static void runningCalculations(double percentTheyWantIncreased) {
        //do the math of the distance
        double totalDistanceRan = 26.2;
        double startingDistance = 1;
        double perIncrease = 1 + (percentTheyWantIncreased/ 100);
        int week= 1 ;//this is the distance they are starting with. Not 0.
        System.out.println("Starting on week 1, you will run 1 mile!");
        //while loop to add the miles per week

        while (startingDistance <totalDistanceRan) {
            startingDistance = startingDistance * perIncrease;
            week++;
            System.out.println(String.format("Week number"+ week+" you need to run"+ startingDistance+ "miles"));
        }
    }
}
/*            //this was old code for the different percentges you had listed.


            //create method to calculate marathon distance by increments
            public void WeeksCalculated() {
                while (distance < TargetDistance) {
                    distance = distance * Increment;
                    weeksIn++;
                    System.out.println(" If you increase your distance by 10%, your " +
                            "distance on week " + (String.format("%.0f", weeksIn) + " is " +
                            (String.format("%.2f", distance))));
                    return;}}



                //class RunningCalc();{
                //create 1% increase
                RunningCalc onePercent = new RunningCalc();
                onePercent.distance = 1;
                onePercent.Increment = 1.01;
                onePercent.TargetDistance = 26.2;
                onePercent.weeksIn = 1;
                //create 5% increase
                RunningCalc fivePercent = new RunningCalc();
                fivePercent.distance = 1;
                fivePercent.Increment = 1.05;
                fivePercent.TargetDistance = 26.2;
                fivePercent.weeksIn = 1;
                //create 10% increase
                RunningCalc tenPercent = new RunningCalc();
                tenPercent.distance = 1;
                tenPercent.Increment = 1.1;
                tenPercent.TargetDistance = 26.2;
                tenPercent.weeksIn = 1;

                onePercent.WeeksCalculated();//display one percent weeks calculated
                fivePercent.WeeksCalculated();//display five percent weeks calculated
                tenPercent.WeeksCalculated();//display ten percent weeks calculated
            }
        }}*/



