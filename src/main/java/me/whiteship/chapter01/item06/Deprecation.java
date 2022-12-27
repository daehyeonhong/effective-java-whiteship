package me.whiteship.chapter01.item06;

public class Deprecation {

    private String name;

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2")
    public Deprecation() {
    }

    public Deprecation(String name) {
        this.name = name;
    }
}
