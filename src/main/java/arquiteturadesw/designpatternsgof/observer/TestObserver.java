package arquiteturadesw.designpatternsgof.observer;

/**
 * Retirado de https://www.baeldung.com/java-observer-pattern
 * */
public class TestObserver {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
        if (observer.getNews().equals("news")){
            System.out.println("Success");
        }
    }
}
