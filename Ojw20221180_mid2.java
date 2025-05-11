import java.util.Scanner;
import java.util.Random;

public class Ojw20221180_mid2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Random random = new Random();
        String[] RPS = {"가위", "바위", "보"};
        String[] directions = {"<", ">"};

        System.out.println("가위바위보 참참참 게임 시작!");
        System.out.println("게임을 종료하려면 '종료'를 입력!");

        while (true) {
            String UserRPS;
            String ComRPS;
            String ATK = "";
            String DEF = "";

            while (true) {
                System.out.print("\n가위, 바위, 보 중 하나를 입력!: ");
                UserRPS = Scan.nextLine();

                if (UserRPS.equals("종료")) {
                    System.out.println("게임 종료!");
                    Scan.close();
                    return;
                }

                if (!UserRPS.equals("가위") && !UserRPS.equals("바위") && !UserRPS.equals("보")) {
                    System.out.println("잘못된 입력! 다시 입력!");
                    continue;
                }

                ComRPS = RPS[random.nextInt(3)];

                System.out.println("나: " + UserRPS);
                System.out.println("컴퓨터: " + ComRPS);

                if (UserRPS.equals(ComRPS)) {
                    System.out.println("무승부!. 다시 가위바위보!");
                } else if (
                    (UserRPS.equals("가위") && ComRPS.equals("보")) ||
                    (UserRPS.equals("바위") && ComRPS.equals("가위")) ||
                    (UserRPS.equals("보") && ComRPS.equals("바위"))
                ) {
                	ATK = "나";
                	DEF = "컴퓨터";
                    break;
                } else {
                	ATK = "컴퓨터";
                	DEF = "나";
                    break;
                }
            }

            String userCHAM = "";
            String ComCHAM = directions[random.nextInt(2)];

            if (ATK.equals("나")) {
                System.out.print("공격! 방향을 선택! ('<' 또는 '>'): ");
                userCHAM = Scan.nextLine();

                if (!userCHAM.equals("<") && !userCHAM.equals(">")) {
                    System.out.println("잘못된 방향! 다시 가위바위보부터 시작!");
                    continue;
                }

                System.out.println("컴퓨터 방향: " + ComCHAM);

                if (userCHAM.equals(ComCHAM)) {
                    System.out.println("공격 성공! 승리!");
                    break;
                } else {
                    System.out.println("공격 실패! 다시 가위바위보!");
                }

            } else {
                System.out.print("수비! 방향을 선택! ('<' 또는 '>'): ");
                userCHAM = Scan.nextLine();

                if (!userCHAM.equals("<") && !userCHAM.equals(">")) {
                    System.out.println("잘못된 방향! 다시 가위바위보부터 시작!");
                    continue;
                }

                System.out.println("컴퓨터(공격자) 방향: " + ComCHAM);

                if (userCHAM.equals(ComCHAM)) {
                    System.out.println("수비 실패! 패배!");
                    break;
                } else {
                    System.out.println("수비 성공! 다시 가위바위보!");
                }
            }
        }
    }
}