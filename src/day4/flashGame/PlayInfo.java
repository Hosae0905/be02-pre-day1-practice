package day4.flashGame;

public class PlayInfo {
    private Integer heart;
    private String name;
    private static int score;

    public PlayInfo(String name) {
        this.heart = 5;
        score = 0;
        this.name = name;
    }

    public Integer getHeart() {
        return heart;
    }

    public void setHeart(Integer heart) {
        this.heart += heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void collect() {
        score++;
    }

    public void inCollect() {
        if (this.heart > 0) {
            this.heart--;
        }
    }

    public void boom() {
        inCollect();
        if (score > 0) {
            score--;
        }
    }
}
