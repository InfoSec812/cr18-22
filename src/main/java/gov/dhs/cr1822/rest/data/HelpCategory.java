package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "help_category", schema = "mysql", catalog = "")
public class HelpCategory {
    private short helpCategoryId;
    private String name;
    private Short parentCategoryId;
    private String url;

    @Id
    @Column(name = "help_category_id", nullable = false)
    public short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "parent_category_id", nullable = true)
    public Short getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Short parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @Basic
    @Column(name = "url", nullable = false, length = -1)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelpCategory that = (HelpCategory) o;
        return helpCategoryId == that.helpCategoryId &&
                Objects.equals(name, that.name) &&
                Objects.equals(parentCategoryId, that.parentCategoryId) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpCategoryId, name, parentCategoryId, url);
    }
}
