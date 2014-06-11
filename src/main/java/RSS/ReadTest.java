package RSS;

/**
 * Created by Mario on 2014-06-11.
 */

public class ReadTest {
    public static void main(String[] args) {
        RSSFeedParser parser = new RSSFeedParser("http://www.vogella.com/article.rss");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);
        }
    }
}
