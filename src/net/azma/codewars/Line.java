package net.azma.codewars;

public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        //Your code is here...
        String result = "NO";
        int priceTicket = 25;
        int count25Dollars = 0;
        int count50Dollars = 0;
        int count100Dollars = 0;
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == priceTicket) {
                count25Dollars++;
            }
            if (peopleInLine[i] == 2*priceTicket) {
                count25Dollars--;
                count50Dollars++;
            }
            if (peopleInLine[i] == 4*priceTicket) {
                if (count50Dollars>0) {
                    count25Dollars--;
                    count50Dollars--;
                } else {
                    count25Dollars -= 3;
                }
                count100Dollars++;
            }

            if (count25Dollars > 0 && count50Dollars>=0 && count100Dollars>=0) {
                result = "YES";
            } else {
                result = "NO";
                break;
            }

        }

        return result;

    }
}
