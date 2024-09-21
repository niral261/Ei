package Exercise1.CreationalDesignPattern.BuilderPattern;

public class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String lettuce;
    private String tomato;
    private String mayo;
    private Boolean hasOnion;
    private Boolean hasGarlic;

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.mayo = builder.mayo;
        this.hasGarlic = builder.hasGarlic;
        this.hasOnion = builder.hasOnion;
    }

    public String toString() {
        return "Burger [bun=" + bun +
                ", patty=" + patty +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", sauce=" + mayo +
                ", pickles=" + (hasGarlic ? "Yes" : "No") +
                ", onions=" + (hasOnion ? "Yes" : "No") + "]";
    }

    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String cheese;
        private String lettuce;
        private String tomato;
        private String mayo;
        private boolean hasGarlic;
        private boolean hasOnion;

        // Step-by-step methods to build the burger
        public BurgerBuilder setBun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder setPatty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder setLettuce(String lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public BurgerBuilder setTomato(String tomato) {
            this.tomato = tomato;
            return this;
        }

        public BurgerBuilder setMayo(String mayo) {
            this.mayo = mayo;
            return this;
        }

        public BurgerBuilder setGarlic(boolean hasGarlic) {
            this.hasGarlic = hasGarlic;
            return this;
        }

        public BurgerBuilder setOnion(boolean hasOnion) {
            this.hasOnion = hasOnion;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
