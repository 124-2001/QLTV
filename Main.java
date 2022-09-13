import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("*******************************************************************************************");
            System.out.println("Bai 1: một chuỗi có bắt đầu là ‘p’ các ký tự theo sau là ‘q’ xuất hiện 0 hoặc nhiều lần");
            System.out.println("Bai 2: chuỗi có các chữ cái thường được nối với nhau bằng dấu gạch dưới ‘_’");
            System.out.println("Bai 3: chuỗi chỉ chứa chữ hoa và chữ thường, số và dấu gạch dưới ‘_’");
            System.out.println("Bai 4: kiểm tra một chuỗi có bắt đầu bằng một số là 5 hay không");
            System.out.print("Nhap bai muon kiem tra : ");
            int n = sc.nextInt();
            while (0>n||n>5){
                System.out.print("Nhap lai bai toan :");
                n = sc.nextInt();
            }
            String testRegex;
            LogicRegex rg = new LogicRegex();
            switch (n){
                case 1:
                    System.out.print("Chuoi can kiem tra la : ");
                    sc.nextLine();
                    testRegex = sc.nextLine();
                    if(rg.Bai1(testRegex)){
                        System.out.println("Chuoi phu hop");
                    }
                    else {
                        System.out.println("Chuoi khong phu hop");
                    }
                    break;
                case 2:
                    System.out.print("Chuoi can kiem tra la : ");
                    sc.nextLine();
                    testRegex = sc.nextLine();
                    if(rg.Bai2(testRegex)){
                        System.out.println("Chuoi phu hop");
                    }
                    else {
                        System.out.println("Chuoi khong phu hop");
                    }
                    break;
                case 3:
                    System.out.print("Chuoi can kiem tra la : ");
                    sc.nextLine();
                    testRegex = sc.nextLine();
                    if(rg.Bai3(testRegex)){
                        System.out.println("Chuoi phu hop");
                    }
                    else {
                        System.out.println("Chuoi khong phu hop");
                    }
                    break;
                case 4:
                    System.out.print("Chuoi can kiem tra la : ");
                    sc.nextLine();
                    testRegex = sc.nextLine();
                    if(rg.Bai4(testRegex)){
                        System.out.println("Chuoi phu hop");
                    }
                    else {
                        System.out.println("Chuoi khong phu hop");
                    }
                    break;
            }

        }
    }


}
