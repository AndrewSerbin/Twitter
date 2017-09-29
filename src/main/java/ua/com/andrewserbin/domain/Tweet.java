package ua.com.andrewserbin.domain;

public class Tweet {

    private Long tweetId;
    private Integer likesCount;
    private Integer retweetCount;
    private String txt;
    private User user;

    public Tweet() {
    }

    public Tweet(Long tweetId, Integer likesCount, Integer retweetCount, String txt, User user) {
        this.tweetId = tweetId;
        this.likesCount = likesCount;
        this.retweetCount = retweetCount;
        this.txt = txt;
        this.user = user;
    }
    
    public void like() {
        likesCount++;
    }
    
    public void retweet() {
        retweetCount++;
    }

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tweet)) return false;

        Tweet tweet = (Tweet) o;

        if (tweetId != null ? !tweetId.equals(tweet.tweetId) : tweet.tweetId != null) return false;
        if (likesCount != null ? !likesCount.equals(tweet.likesCount) : tweet.likesCount != null) return false;
        if (retweetCount != null ? !retweetCount.equals(tweet.retweetCount) : tweet.retweetCount != null) return false;
        if (txt != null ? !txt.equals(tweet.txt) : tweet.txt != null) return false;
        return user != null ? user.equals(tweet.user) : tweet.user == null;

    }

    @Override
    public int hashCode() {
        int result = tweetId != null ? tweetId.hashCode() : 0;
        result = 31 * result + (likesCount != null ? likesCount.hashCode() : 0);
        result = 31 * result + (retweetCount != null ? retweetCount.hashCode() : 0);
        result = 31 * result + (txt != null ? txt.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweetId=" + tweetId +
                ", likesCount=" + likesCount +
                ", retweetCount=" + retweetCount +
                ", txt='" + txt + '\'' +
                ", user='" + user.getName() +'\'' +
                '}';
    }
}
