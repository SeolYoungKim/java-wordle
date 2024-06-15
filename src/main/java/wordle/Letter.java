package wordle;

import java.util.Objects;

public class Letter {

    private final int position;
    private final char value;

    public Letter(int position, char value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Letter letter = (Letter) o;
        return position == letter.position && value == letter.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, value);
    }
}