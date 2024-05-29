package lickity.split;

public enum Flavor {
    CHOCOLATE("Chocolate"),
    VANILLA("Vanilla"),
    COFFEE("Coffee"),
    KEYLIME("Keylime"),
    COOKIEDOUGH("Cookiedough");

    private final String display;

    Flavor(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return getDisplay();
    }
}