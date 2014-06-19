package RSS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.*;

/**
 * Created with IntelliJ IDEA.
 * User: szemek
 * Date: 6/19/14
 * Time: 7:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class FeedTest {
    private static String title =  "test title";
    private static String url =  "test url";
    private static String description =  "test description";
    private static String language =  "test language";
    private static String copyrights =  "test copyrights";
    private static String pubDate =  "test pubDate";

    private Feed testFeed = new Feed(title, url, description, language, copyrights, pubDate);

    @Before
    public void prepareFeed(){
        FeedMessage message = new FeedMessage();
        message.setAuthor("Mark");
        message.setDescription("So description");
        message.setGuid("1234");
        message.setLink("linki kink");
        message.setTitle("Wow such title");

        testFeed.getMessages().add(message);
    }

    @After
    public void cleanUpFeed(){
        testFeed.getMessages().clear();
    }

    @Test
    public void testGetMessages() throws Exception {
        //given
        int addedMessagesToFeed = 1;

        //when
        int numberOfMessages = testFeed.getMessages().size();

        //then
        assertThat(numberOfMessages).isEqualTo(addedMessagesToFeed);
    }

    @Test
    public void testGetTitle() throws Exception {
        //given
        String expectedTitle = title;

        //when
        String observedTitle = testFeed.getTitle();

        //then
        assertThat(expectedTitle).matches(observedTitle);
    }

    @Test
    public void testGetLink() throws Exception {
        //given
        String expectedLink = url;

        //when
        String observedLink = testFeed.getLink();

        //then
        assertThat(expectedLink).matches(observedLink);
    }

    @Test
    public void testGetDescription() throws Exception {
        //given
        String expectedDescription = description;

        //when
        String observedDescription = testFeed.getDescription();

        //then
        assertThat(expectedDescription).matches(observedDescription);
    }

    @Test
    public void testGetLanguage() throws Exception {
        //given
        String expectedLanguage = language;

        //when
        String observedLanguage = testFeed.getLanguage();

        //then
        assertThat(expectedLanguage).matches(observedLanguage);
    }

    @Test
    public void testGetCopyright() throws Exception {
        //given
        String expectedCopyright = copyrights;

        //when
        String observedCopyright = testFeed.getCopyright();

        //then
        assertThat(expectedCopyright).matches(observedCopyright);
    }

    @Test
    public void testGetPubDate() throws Exception {
        //given
        String expectedPubDate = pubDate;

        //when
        String observedPubDate = testFeed.getPubDate();

        //then
        assertThat(expectedPubDate).matches(observedPubDate);
    }
}
