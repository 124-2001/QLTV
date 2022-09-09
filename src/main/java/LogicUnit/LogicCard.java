package LogicUnit;

import Student.Card;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicCard {
    public void AddCard(ArrayList<Card> cards){
        Scanner sc = new Scanner(System.in);
        Card card = new Card();
        System.out.print("Nhap ten sinh vien muon sach: ");
        String name = sc.nextLine();
        card.setName(name);
        System.out.print("Nhap tuoi sinh vien muon sach: ");
        int age = sc.nextInt();
        card.setAge(age);
        System.out.print("Nhap ma lop sinh vien : ");
        int classCode = sc.nextInt();
        card.setClass_code(classCode);
        System.out.print("Nhap ma phieu muon : ");
        int rentalCode = sc.nextInt();
        while (CheckRentalCodeisExist(cards,rentalCode)){
            System.out.print("Nhap lai ma phieu : ");
            rentalCode = sc.nextInt();
        }
        card.setRental_code(rentalCode);
        System.out.print("Nhap ma sach : ");
        int bookCode = sc.nextInt();
        card.setBook_code(bookCode);
        System.out.print("Nhap ngay muon sach (1-30) :");
        int startDay = sc.nextInt();
        if(0>startDay || startDay>30){
            System.out.print("Nhap lai ngay muon sach : ");
            startDay = sc.nextInt();
        }
        card.setStart_day(startDay);
        System.out.print("Nhap ngay tra sach (1-30) :");
        int endDay = sc.nextInt();
        while (endDay<startDay || endDay>32){
            System.out.print("Nhap lai ngay tra sach : ");
            endDay = sc.nextInt();
        }
        card.setEnd_day(endDay);
        cards.add(card);
        System.out.println("Them phieu muon thanh cong ");
    }
    private boolean CheckRentalCodeisExist(ArrayList<Card> cards,int rentalCode){
        if(cards==null){
            return false;
        }
        else {
            int count =0;
            for(Card card : cards){
                if(rentalCode==card.getRental_code()){
                    count++;
                }
            }
            if(count==0){
                return false;
            }
            else {
                return true;
            }
        }
    }
    public void DeleteCard(ArrayList<Card> cards,int rentalCode){
        if(cards.size()==0){
            System.out.println("Danh sach muon dang rong ");
        }
        else if (!CheckRentalCodeisExist(cards,rentalCode)) {
            System.out.println("Khong co ma muon nao phu hop ");
        } else {
            int count =-1;
            for(Card card : cards){
                if(card.getRental_code()==rentalCode){
                    count++;
                    break;
                }
                count++;
            }
            cards.remove(count);
            System.out.println("Xoa phieu muon thanh cong ");
        }
    }
    public void ShowListCard(ArrayList<Card> cards){
        if(cards.size()==0){
            System.out.println("Danh sach rong ");
        }
        else{
            for (Card card : cards){
                System.out.println("******************************************");
                System.out.println("Ma phieu muon la : "+ card.getRental_code());
                System.out.println("Ten sinh vien muon : "+card.getName());
                System.out.println(card.getAge()+" tuoi");
                System.out.println("Ma lop sinh vien : "+ card.getClass_code());
                System.out.println("Ma sach muon "+card.getBook_code());
                System.out.println("Ngay muon : "+card.getStart_day()+"  Ngay tra : "+card.getEnd_day());
                System.out.println("******************************************");
            }
        }
    }
    public void SearchCard(ArrayList<Card> cards,String nameStudent){
        int count=0;
        if(cards.size()==0){
            System.out.println("Danh sach sinh vien dang rong ");
        }
        else{
            for (Card card : cards){
                if(card.getName().toLowerCase().contains(nameStudent)){
                    count++;
                    System.out.println("******************************************");
                    System.out.println("Ma phieu muon la : "+ card.getRental_code());
                    System.out.println("Ten sinh vien muon : "+card.getName());
                    System.out.println(card.getAge()+" tuoi");
                    System.out.println("Ma lop sinh vien : "+ card.getClass_code());
                    System.out.println("Ma sach muon : "+card.getBook_code());
                    System.out.println("Ngay muon : "+card.getStart_day()+"  Ngay tra : "+card.getEnd_day());
                    System.out.println("******************************************");
                }
            }
            if(count==0){
                System.out.println("Khong co sinh vien phu hop ");
            }
        }

    }
}
