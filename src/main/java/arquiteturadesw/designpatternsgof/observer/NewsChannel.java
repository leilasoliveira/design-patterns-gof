package arquiteturadesw.designpatternsgof.observer;

/**
 * Retirado de https://www.baeldung.com/java-observer-pattern
 * */
public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
