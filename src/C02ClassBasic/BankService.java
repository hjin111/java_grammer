package C02ClassBasic;
// 1. BankService 라는 클래스 생성
// => main 메서드에서 BankAccount 객체 생성 후 입금 출금 등 테스트

// 2. BankAccount 라는 클래스 생성
// - accountNumber(계좌번호), balance(잔액) 변수
// - 생성자 1개 : accountNumber 를 초기화
// - getter 가 모든 변수에 맞게 존재
// - deposit(예금하기) : balance(잔액) 증가시키는 메서드
// => "~원 입금되었습니다."

// - withdraw(출금하기) : balance(잔액) 감소시키는 메서드
// => 출금액보다 잔액이 부족하면 "잔액이 부족합니다."
// => 충분하면 "~원 출금되었습니다."

// 어떤 서비스 이용할지 질문
// 1. 계좌개설 2. 입금 3. 출금 4. 계좌송금
// 1-1) 계좌번호입력하세요
// 2-1) 얼마 입금하시겠어요?
// 3-1) 얼마 출금하시겠어요?
// 4-1) 누구(계좌번호)한테 입금하시나요? : for 문 돌려서 .equals
// 2-1) 얼마 입금하시나요?

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {

        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
//        BankAccount b1 = new BankAccount("1234");
//        b1.deposit(5000);
//        BankAccount b2 = new BankAccount("4321");
//        b2.deposit(5000);
//        b2.transfer(5000, b1); // b2가 b1한테 보내는것
//        System.out.println(b2.getBalance());
//        System.out.println(b1.getBalance());
        while(true){
            System.out.println("서비스 번호를 입력하세요. 1.개설 2.입금 3.출금 4.송금");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if(number == 1){
                System.out.println("계좌번호를 입력하세요");
                String accountNumber = sc.nextLine();
                BankAccount bankAccount = new BankAccount(accountNumber);
                bankAccounts.add(bankAccount); // 리스트에 담아버리기
            }else if(number == 2){
                System.out.println("계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("얼마 입금하겠습니까?");
                int money = Integer.parseInt(sc.nextLine());
                for(int i = 0; i < bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
                        bankAccounts.get(i).deposit(money);
                    }
                }
            }else if(number == 3){


            }else if(number == 4){
                System.out.println("본인 계좌번호를 입력해주세요");
                String myNumber = sc.nextLine();
                System.out.println("상대방 계좌번호를 입력해주세요");
                String yourNumber = sc.nextLine();
                System.out.println("얼마 입금하겠습니까?");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount myAccount = null;
                BankAccount yourAccount = null;
                for(int i = 0; i < bankAccounts.size(); i++){
                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
                        myAccount = bankAccounts.get(i);
                    }
                    if(bankAccounts.get(i).getAccountNumber().equals(yourNumber)){
                        yourAccount = bankAccounts.get(i);
                    }
                }
                myAccount.transfer(money, yourAccount);
            }

        }

    }
}

class BankAccount {
    private String accountNumber;
    private int balance;

    BankAccount(String accountNumber) {
        // accountNumber를 초기화
        this.accountNumber = accountNumber;
    }
    public void transfer(int money, BankAccount bankAccount){
        this.balance -= money;
        bankAccount.deposit(money);
        System.out.println("현재 잔액은 " + this.balance);
    }

    public void deposit(int money) {
        this.balance += money;
        System.out.println(money + "원 입금되었습니다.");
        System.out.println("현재 잔액은" + this.balance);
    }

    public void withdraw(int money){
        if(this.balance < money){
            System.out.println("잔액 부족입니다.");
        }else {
            this.balance -= money;
            System.out.println(money + "원 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
