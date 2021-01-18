package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //题库复制到txt文件中
        File mult = new File("mult.txt");
        File single = new File("single.txt");
        try {

            Scanner singleScan = new Scanner(single);
            Scanner multScan = new Scanner(mult);
            Scanner scanner = new Scanner(System.in);
            String[] singles = new String[500 * 7];
            String[] mults = new String[200 *8];
//        input();
            int singlesCnt = 0;
            int multsCnt = 0;
            String str= null;
            while (singleScan.hasNext()) {
                str = singleScan.nextLine();
                if (!str.equals("\n"))
                    singles[singlesCnt++] = str;
            }
            while (multScan.hasNext()) {
                 str = multScan.nextLine();
                if (!str.equals("\n"))
                    mults[multsCnt++] = str;
            }
            boolean[] singleIsRight = new boolean[500];
            boolean[] singleIsWrong = new boolean[500];

            boolean[] multIsRight = new boolean[200];
            boolean[] multIsWrong = new boolean[200];

//        Random random = new Random();/*随机数写法*/先写循序写法吧
            while (true) {
                System.out.println("input the type of exercise(mult or single, or input q or quit to quit): ");
                String inputAtBegin = scanner.next();
                if (inputAtBegin.equalsIgnoreCase("q") || inputAtBegin.equalsIgnoreCase("quit")
                        || inputAtBegin.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    if (inputAtBegin.equalsIgnoreCase("mult")) {
                        System.out.println("input enter to continue or q to quit: ");
                        inputAtBegin = scanner.next();
                        if (inputAtBegin.equalsIgnoreCase("q") || inputAtBegin.equalsIgnoreCase("quit")
                                || inputAtBegin.equalsIgnoreCase("exit")) break;
                        else {

                        }
                        for (int i = 0; i < 189; i++) {
                            for (int j = 0; j < 5; j++) {
                                System.out.println(mults[i] + "\n" + mults[i + 1] + "\n" + mults[i + 2] + "\n" + mults[i + 3] + "\n" + mults[i + 4]);
                                System.out.println("input your answer:");
                                Scanner answer = new Scanner(System.in);

                            }
                        }
                    } else {
                        System.out.println("input a number to start or q to quit: ");
                        inputAtBegin = scanner.next();
                        if (inputAtBegin.equalsIgnoreCase("q") || inputAtBegin.equalsIgnoreCase("quit")
                                || inputAtBegin.equalsIgnoreCase("exit")) break;
                        else {
                            for (int i = 0; i < 430; i++) {
                                for (int j = 0; j < 5; j++) {
                                    System.out.println(singles[i*7 + j]);
                                }
                                System.out.println("input your answer:");
                                Scanner answer = new Scanner(System.in);
                                if (answer.nextLine().equalsIgnoreCase(singles[(i + 1) * 7 - 2])) {
                                    System.out.println("you are right!!! very good!");
                                    singleIsRight[i] = true;
                                } else {
                                    singleIsWrong[i] = true;
                                }

                            }
                            for (int i = 0; i < singleIsRight.length; i++) {
                                if(singleIsRight[i]!=true) System.out.print((i+1)+" ");
                            }
                        }

                    }
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("not found");
        } finally {
        }
    }
}
