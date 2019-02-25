package pl.sda.javastart.day12.Homework;

public class Feed {
    private String feedName;
    private int kilogramsOfFeed;

    public Feed(String feedName, int amountOfFeed) {
        this.feedName = feedName;
        this.kilogramsOfFeed = amountOfFeed;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public int getKilogramsOfFeed() {
        return kilogramsOfFeed;
    }

    public void setKilogramsOfFeed(int kilogramsOfFeed) {
        this.kilogramsOfFeed = kilogramsOfFeed;
    }
}
