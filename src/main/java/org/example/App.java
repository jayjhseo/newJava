package org.example;

import java.util.Scanner;

public class App {

        private final Scanner sc;

        public App(Scanner sc) {
            this.sc = sc;
        }

        public void run() {
            System.out.println("== 명언 앱 ==");

            while (true) {
                System.out.print("명령) ");
                String command = sc.nextLine().trim();
                if (command.equals("등록")) {
                    System.out.print("명언 : ");
                    String c1 = sc.nextLine().trim();
                    System.out.print("작가 : ");
                    String c2 = sc.nextLine().trim();
                } else if (command.equals("종료")) {
                    break;
                }
            }
        }



    }


