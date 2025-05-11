import java.util.Scanner;
import java.util.Random;

public class Ojw20221180_mid1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Random random = new Random();
        String[] RPS = {"가위", "바위", "보"};
        String UserRPS;

        System.out.println("가위바위보 게임이 시작!");
        System.out.println("게임을 종료하려면 '종료'를 입력!");

        while (true) {
            System.out.print("\n가위, 바위, 보 중 하나를 입력!: ");
            UserRPS = Scan.nextLine();

            if (UserRPS.equals("종료")) {
                System.out.println("게임 종료!");
                break;
            }

            if (!UserRPS.equals("가위") && !UserRPS.equals("바위") && !UserRPS.equals("보")) {
                System.out.println("!잘못된 입력! 다시 입력하세요.");
                continue;
            }

            int ComIndex = random.nextInt(3);
            String ComRPS = RPS[ComIndex];

            System.out.println("나: " + UserRPS);
            System.out.println("컴퓨터: " + ComRPS);

            if (UserRPS.equals(ComRPS)) {
                System.out.println("무승부!");
            } else if (
                (UserRPS.equals("가위") && ComRPS.equals("보")) ||
                (UserRPS.equals("바위") && ComRPS.equals("가위")) ||
                (UserRPS.equals("보") && ComRPS.equals("바위"))
            ) {
                System.out.println("승리!");
            } else {
                System.out.println("패배!");
            }
        }

        Scan.close();
    }
}