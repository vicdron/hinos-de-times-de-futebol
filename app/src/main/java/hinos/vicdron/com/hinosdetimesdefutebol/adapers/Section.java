package hinos.vicdron.com.hinosdetimesdefutebol.adapers;

public class Section {
    public boolean isExpanded = true;
    private final String name;

    public Section(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
