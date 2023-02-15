package jp.co.baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team1 = new BaseBallTeam();
        team1.setName("東京ヤクルトスワローズ");
        team1.setWin(80);
        team1.setLose(59);
        team1.setDraw(4);

        BaseBallTeam team2 = new BaseBallTeam();
        team2.setName("横浜DeNAベイスターズ");
        team2.setWin(73);
        team2.setLose(68);
        team2.setDraw(2);

        BaseBallTeam team3 = new BaseBallTeam();
        team3.setName("阪神タイガース");
        team3.setWin(68);
        team3.setLose(71);
        team3.setDraw(4);

        BaseBallTeam team4 = new BaseBallTeam();
        team4.setName("読売ジャイアンツ");
        team4.setWin(68);
        team4.setLose(72);
        team4.setDraw(3);

        BaseBallTeam team5 = new BaseBallTeam();
        team5.setName("広島東洋カープ");
        team5.setWin(66);
        team5.setLose(74);
        team5.setDraw(3);

        BaseBallTeam team6 = new BaseBallTeam();
        team6.setName("中日ドラゴンズ");
        team6.setWin(66);
        team6.setLose(75);
        team6.setDraw(2);

        team1.report();
        team2.report();
        team3.report();
        team4.report();
        team5.report();
        team6.report();
    }
}
