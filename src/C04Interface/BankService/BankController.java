package C04Interface.BankService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Controller 의 역할은 사용자와의 인터페이싱
public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber);
        List<BankAccount> bankAccounts = new ArrayList<>();
        while (true){
            System.out.println("서비스 번호를 입력하세요. 1.카드 2.카카오페이");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            int number2 = Integer.parseInt(sc.nextLine());
            if(number == 1){
                BankService bcs = new BankCardService();
                if(number2 == 1){
                    System.out.println("입금하실 금액을 입력해주세요");
                    int money = Integer.parseInt(sc.nextLine());
                    bcs.deposit(money,bankAccount);
                }else{
                    System.out.println("출금하실 금액을 입력해주세요");
                    int money = Integer.parseInt(sc.nextLine());
                    bcs.withdraw(money,bankAccount);
                }
            }else if (number == 2){
                BankService bks = new BankKakaoService();
                if(number2 == 1){
                    System.out.println("입금하실 금액을 입력해주세요");
                    int money = Integer.parseInt(sc.nextLine());
                    bks.deposit(money,bankAccount);

                }else{
                    System.out.println("출금하실 금액을 입력해주세요");
                    int money = Integer.parseInt(sc.nextLine());
                    bks.withdraw(money,bankAccount);
                }
            }
        }
    }
}