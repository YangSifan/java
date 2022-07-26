package com.company;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keyword = input.nextLine();
        CardLost[] Card = new CardLost[3];
        Card[0] = new CardLost("一卡通01", 220115, "千喜鹤");
        Card[1] = new CardLost("一卡通02", 221116, "中心");
        Card[2] = new CardLost("一卡通03", 220623, "千喜鹤");
        BookLost[] Book = new BookLost[4];
        Book[0] = new BookLost("数学分析", 210406, "樱花");
        Book[1] = new BookLost("高等代数", 230325, "衍生");
        Book[2] = new BookLost("c语言程序设计", 220102, "千喜鹤");
        Book[3] = new BookLost("近代史", 220527, "中心");
        Lost[] LostArray = new Lost[15];
        LostArray[0] = Card[0];
        LostArray[1] = Card[1];
        LostArray[2] = Card[2];
        LostArray[3] = Book[0];
        LostArray[4] = Book[1];
        LostArray[5] = Book[2];
        LostArray[6] = Book[3];
        LostArray[7] = new Lost("羽毛球", 210315, "千喜鹤");
        LostArray[8] = new Lost("衣服", 220927, "中心");
        LostArray[9] = new Lost("蓝牙耳机", 221007, "兴业苑");
        LostArray[10] = new Lost("雨伞", 220915, "樱花");
        LostArray[11] = new Lost("乒乓球", 220725, "三教学楼");
        LostArray[12] = new Lost("平板", 210619, "衍生");
        LostArray[13] = new Lost("手机", 220323, "千喜鹤");
        LostArray[14] = new Lost("充电器", 211015, "中心");

        Lost[] lostqwq = selectByKeyword(LostArray, keyword);
        sortLost(LostArray);
        for (Lost e : lostqwq){
            System.out.println(e.getName() + "," + e.getDate() + "," + e.getLoc());
        }
        for (Lost e : LostArray){
            System.out.println(e.getName() + "," + e.getDate() + "," + e.getLoc());
        }

        System.out.println(keyword);
    }

    public static void sortLost(Lost[] lostArray) {
        int i=0,j=0,k=0,min,temp;
        int[] con=new int[15];
        Lost tempp = new Lost("一卡通01", 220115, "千喜鹤");
        for(k=0;k<15;k++){
            con[k]=lostArray[k].getDate();
            System.out.println(con[k]);
        }
        for(i=0;i<15;i++){
            for(j=0;j<15-i-1;j++){
                if(con[j]>con[j+1])
                {
                    temp=con[j];
                    con[j]=con[j+1];
                    con[j+1]=temp;
                    tempp=lostArray[j];
                    lostArray[j]=lostArray[j+1];
                    lostArray[j+1]=tempp;
                }

            }
        }
    }

    public static Lost[] selectByKeyword(Lost[] lostArray, String keyword) {
        Lost[] keylost = new Lost[15];
        int i=0,j=0;
        for (Lost e : lostArray) {
            if (e.getLoc().equals(keyword)) {
                keylost[i]=new Lost(e.getName(),e.getDate(),e.getLoc());
                System.out.println(keylost[i].getName() + "," + keylost[i].getDate() + "," + keylost[i].getLoc());
                i=i+1;
            }
        }
        Lost[] keylos = new Lost[i];
        for ( j = 0; j<i ; j++)
        {
            keylos[j]=keylost[j];
        }
        return keylos;
    }
}
