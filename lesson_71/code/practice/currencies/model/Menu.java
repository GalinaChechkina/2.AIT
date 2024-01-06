package practice.currencies.model;

public enum Menu {
    BUY("buy currency"), SELL("sell currency");
    private String action;

    Menu(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString() {
        return action;
    }
}