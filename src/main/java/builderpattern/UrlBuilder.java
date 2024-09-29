package builderpattern;

public class UrlBuilder {
    public final String protocol;
    public final String domain;
    public final String port;
    public final String path;
    public final String query;


    public UrlBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.domain = builder.domain;
        this.port = builder.port;
        this.path = builder.path;
        this.query = builder.query;
    }

    @Override
    public String toString() {

        if (port == null) {
            return protocol + "://" + domain + path + "?" + query;
        } else {
            return protocol + "://" + domain + ":" + port + path + "?" + query;
        }
    }

    public static class Builder {
        private String protocol;
        private String domain;
        private String port;
        private String path;
        private String query;

        public Builder protocol(String protocol) {
           this.protocol = protocol;
           return this;
        }

        public Builder domain(String domain) {
           this.domain = domain;
           return this;
        }

        public Builder port(String port) {
           this.port = port;
           return this;
        }

        public Builder path(String path) {
          this.path = path;
          return this;
        }

        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public UrlBuilder build() {
            return new UrlBuilder(this);
        }

    }
}
