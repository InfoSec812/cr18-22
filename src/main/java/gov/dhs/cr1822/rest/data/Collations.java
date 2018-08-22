package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Collations {
    private String collationName;
    private String characterSetName;
    private long id;
    private String isDefault;
    private String isCompiled;
    private int sortlen;
    private Object padAttribute;

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

    @Basic
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IS_DEFAULT", nullable = false, length = 3)
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "IS_COMPILED", nullable = false, length = 3)
    public String getIsCompiled() {
        return isCompiled;
    }

    public void setIsCompiled(String isCompiled) {
        this.isCompiled = isCompiled;
    }

    @Basic
    @Column(name = "SORTLEN", nullable = false)
    public int getSortlen() {
        return sortlen;
    }

    public void setSortlen(int sortlen) {
        this.sortlen = sortlen;
    }

    @Basic
    @Column(name = "PAD_ATTRIBUTE", nullable = false)
    public Object getPadAttribute() {
        return padAttribute;
    }

    public void setPadAttribute(Object padAttribute) {
        this.padAttribute = padAttribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collations that = (Collations) o;
        return id == that.id &&
                sortlen == that.sortlen &&
                Objects.equals(collationName, that.collationName) &&
                Objects.equals(characterSetName, that.characterSetName) &&
                Objects.equals(isDefault, that.isDefault) &&
                Objects.equals(isCompiled, that.isCompiled) &&
                Objects.equals(padAttribute, that.padAttribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collationName, characterSetName, id, isDefault, isCompiled, sortlen, padAttribute);
    }
}
