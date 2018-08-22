package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "help_keyword", schema = "mysql", catalog = "")
public class HelpKeyword {
    private int helpKeywordId;
    private String name;

    @Id
    @Column(name = "help_keyword_id", nullable = false)
    public int getHelpKeywordId() {
        return helpKeywordId;
    }

    public void setHelpKeywordId(int helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelpKeyword that = (HelpKeyword) o;
        return helpKeywordId == that.helpKeywordId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpKeywordId, name);
    }
}
