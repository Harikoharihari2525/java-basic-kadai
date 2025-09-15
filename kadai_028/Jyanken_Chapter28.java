package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.nextLine().toLowerCase();

        while (!input.equals("r") && !input.equals("s") && !input.equals("p")) {
            System.out.println("正しい手を入力してください（r, s, p）:");
            input = scanner.nextLine().toLowerCase();
        }

        return input;
    }
    
    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int index = (int)Math.floor(Math.random() * hands.length);
        return hands[index];
    }

    

    public void playGame() {
        String myHand = getMyChoice();
        String opponentHand = getRandom();

        String myHandJP = convertToJapanese(myHand);
        String opponentHandJP = convertToJapanese(opponentHand);

        System.out.println("自分の手は" + myHandJP + ", 対戦相手の手は" + opponentHandJP);

        String result = judge(myHand, opponentHand);
        System.out.println(result);
    }

    private String convertToJapanese(String hand) {
        switch (hand) {
            case "r": return "グー";
            case "s": return "チョキ";
            case "p": return "パー";
            default: return "不明";
        }
    }

    private String judge(String my, String opponent) {
        if (my.equals(opponent)) {
            return "あいこです";
        } else if ((my.equals("r") && opponent.equals("s")) ||
                   (my.equals("s") && opponent.equals("p")) ||
                   (my.equals("p") && opponent.equals("r"))) {
            return "自分の勝ちです";
        } else {
            return "自分の負けです";
        }
    }
}