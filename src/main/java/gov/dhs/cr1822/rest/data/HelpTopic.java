package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "help_topic", schema = "mysql", catalog = "")
public class HelpTopic {
    private int helpTopicId;
    private String name;
    private short helpCategoryId;
    private String description;
    private String example;
    private String url;

    @Id
    @Column(name = "help_topic_id", nullable = false)
    public int getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(int helpTopicId) {
        this.helpTopicId = helpTopicId;
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
    @Column(name = "help_category_id", nullable = false)
    public short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "example", nullable = false, length = -1)
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
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
        HelpTopic helpTopic = (HelpTopic) o;
        return helpTopicId == helpTopic.helpTopicId &&
                helpCategoryId == helpTopic.helpCategoryId &&
                Objects.equals(name, helpTopic.name) &&
                Objects.equals(description, helpTopic.description) &&
                Objects.equals(example, helpTopic.example) &&
                Objects.equals(url, helpTopic.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpTopicId, name, helpCategoryId, description, example, url);
    }
}
