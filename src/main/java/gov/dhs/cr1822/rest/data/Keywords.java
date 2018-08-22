package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Keywords {
    private String word;
    private Integer reserved;

    @Basic
    @Column(name = "WORD", nullable = true, length = 29)
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Basic
    @Column(name = "RESERVED", nullable = true)
    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keywords keywords = (Keywords) o;
        return Objects.equals(word, keywords.word) &&
                Objects.equals(reserved, keywords.reserved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, reserved);
    }
}
