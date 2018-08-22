package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "help_relation", schema = "mysql", catalog = "")
@IdClass(HelpRelationPK.class)
public class HelpRelation {
    private int helpTopicId;
    private int helpKeywordId;

    @Id
    @Column(name = "help_topic_id", nullable = false)
    public int getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(int helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    @Id
    @Column(name = "help_keyword_id", nullable = false)
    public int getHelpKeywordId() {
        return helpKeywordId;
    }

    public void setHelpKeywordId(int helpKeywordId) {
        this.helpKeywordId = helpKeywordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelpRelation that = (HelpRelation) o;
        return helpTopicId == that.helpTopicId &&
                helpKeywordId == that.helpKeywordId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpTopicId, helpKeywordId);
    }
}
