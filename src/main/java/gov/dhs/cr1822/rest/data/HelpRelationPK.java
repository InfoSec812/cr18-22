package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class HelpRelationPK implements Serializable {
    private int helpTopicId;
    private int helpKeywordId;

    @Column(name = "help_topic_id", nullable = false)
    @Id
    public int getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(int helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    @Column(name = "help_keyword_id", nullable = false)
    @Id
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
        HelpRelationPK that = (HelpRelationPK) o;
        return helpTopicId == that.helpTopicId &&
                helpKeywordId == that.helpKeywordId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(helpTopicId, helpKeywordId);
    }
}
