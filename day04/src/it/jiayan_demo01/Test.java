package it.jiayan_demo01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");

        HashMap<Integer, String> cardmap = new HashMap<>();
        int count = 1;
        cardmap.put(count++, "大♚");
        cardmap.put(count++, "小♝");
        for (String s : numbers) {
            for (String color : colors) {
                cardmap.put(count++, color + s);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < count; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();




        for (int i = 0; i < list.size(); i++) {
            if (i >= 51) {
                dipai.add(list.get(i));
            } else if (i % 3 == 0) {

                player1.add(list.get(i));
            } else if (i % 3 == 1) {

                player2.add(list.get(i));
            } else {

                player3.add(list.get(i));
            }

        }

   Collections.sort(player1);
   Collections.sort(player2);
   Collections.sort(player3);
   Collections.sort(dipai);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();



        for (Integer integer : player1) {
                p1.add(cardmap.get(integer));
            }
            System.out.println();
            for (Integer integer : player2) {
                p2.add(cardmap.get(integer));
            }
            System.out.println();
            for (Integer integer : player3) {
                p3.add(cardmap.get(integer));

            }
            System.out.println();
            for (Integer integer :dipai) {
                dp.add(cardmap.get(integer));



            }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(dp);




            }



    }

