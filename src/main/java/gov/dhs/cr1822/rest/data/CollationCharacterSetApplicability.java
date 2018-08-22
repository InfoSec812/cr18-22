package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "COLLATION_CHARACTER_SET_APPLICABILITY", schema = "information_schema", catalog = "")
public class CollationCharacterSetApplicability {
    private String collationName;
    private String characterSetName;

    @Basic
    @Column(name = "COLLATION_NAME", nullable = false, length = 64)
    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Basic
    @Column(name = "CHARACTER_SET_NAME", nullable = false, length = 64)
    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollationCharacterSetApplicability that = (CollationCharacterSetApplicability) o;
        return Objects.equals(collationName, that.collationName) &&
                Objects.equals(characterSetName, that.characterSetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collationName, characterSetName);
    }
}
