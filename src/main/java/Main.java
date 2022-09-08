import LogicUnit.LogicCard;
import Student.Card;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LogicCard lgCard = new LogicCard();
        ArrayList<Card> cards = new ArrayList<Card>();
        while (true){
            System.out.println("******___________________******");
            System.out.println("1)Them the muon");
            System.out.println("2)Xoa the muon");
            System.out.println("3)Hien thi danh sach the muon");
            System.out.println("4)Tim the muon theo ten sinh vien");
            System.out.println("******___________________******");
            int n = sc.nextInt();
            while (n>5 || n<0){
                System.out.print("Nhap lai : ");
                n = sc.nextInt();
            }
            switch (n){
                case 1:
                    lgCard.AddCard(cards);
                    break;
                case 2:
                    System.out.print("Nhap ma phieu muon muon xoa : ");
                    int retalCode = sc.nextInt();
                    lgCard.DeleteCard(cards,retalCode);
                    break;
                case 3:
                    lgCard.ShowListCard(cards);
                    break;
                case 4:
                    System.out.print("Nhap ten sinh vien can tim kiem : ");
                    String nameStudent = sc.nextLine();
                    nameStudent = sc.nextLine();
                    lgCard.SearchCard(cards,nameStudent.toLowerCase());
                    break;
            }
        }
    }
}
