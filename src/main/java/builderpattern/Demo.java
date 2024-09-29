package builderpattern;

public class Demo {

    public static void main(String[] args) {
        UrlBuilder urlBuilder = new UrlBuilder.Builder()
                .protocol("https")
                .domain("www.google.com")
                .port("8080")
                .path("/search")
                .query("q=design+patterns")
                .build();

        UrlBuilder urlBuilder2 = new UrlBuilder.Builder()
                .protocol("https")
                .domain("www.google.com")
                .path("/search")
                .query("q=design+patterns")
                .build();

        // prints: https://www.google.com:8080/search?q=design+patterns
        System.out.println(urlBuilder);
        System.out.println(urlBuilder2);


    }
}
