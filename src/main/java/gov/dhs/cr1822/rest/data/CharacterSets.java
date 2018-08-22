package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CHARACTER_SETS", schema = "information_schema", catalog = "")
public class CharacterSets {
    private String characterSetName;
    private String defaultCollateName;
    private String description;
    private int maxlen;

    @Basic
    @Column(name = "CHARACTER_SET_NAME", nullable = false, length = 64)
    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Basic
    @Column(name = "DEFAULT_COLLATE_NAME", nullable = false, length = 64)
    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 2048)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "MAXLEN", nullable = false)
    public int getMaxlen() {
        return maxlen;
    }

    public void setMaxlen(int maxlen) {
        this.maxlen = maxlen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterSets that = (CharacterSets) o;
        return maxlen == that.maxlen &&
                Objects.equals(characterSetName, that.characterSetName) &&
                Objects.equals(defaultCollateName, that.defaultCollateName) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterSetName, defaultCollateName, description, maxlen);
    }
}
