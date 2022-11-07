import org.w3c.dom.ranges.RangeException;

public abstract class rekord {
    private String ISBN;

    public rekord(String ISBN) {
        this.ISBN = ISBN;
    }

    public rekord() {

    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        String errorMessage = "Az ISBN értéke 10 vagy 13 hosszú számsor lehet csak!";
        if (ISBN.length() == 10 || ISBN.length() == 13) {
            this.ISBN = ISBN;
        } else {
            throw new RangeException((short) 1, errorMessage);
        }
    }
}
