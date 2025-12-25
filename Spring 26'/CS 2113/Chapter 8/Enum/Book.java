public enum Book {
    JHTP("Java How to Program"),
    CHTP("C How to Program"),   
    CPPHTP("C++ How to Program"),
    VBHTP("Visual Basic How to Program"),
    CSHTP("C# How to Program");

    private final String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}