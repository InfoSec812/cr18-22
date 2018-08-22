package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_FT_INDEX_CACHE", schema = "information_schema", catalog = "")
public class InnodbFtIndexCache {
    private String word;
    private long firstDocId;
    private long lastDocId;
    private long docCount;
    private long docId;
    private long position;

    @Basic
    @Column(name = "WORD", nullable = false, length = 337)
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Basic
    @Column(name = "FIRST_DOC_ID", nullable = false)
    public long getFirstDocId() {
        return firstDocId;
    }

    public void setFirstDocId(long firstDocId) {
        this.firstDocId = firstDocId;
    }

    @Basic
    @Column(name = "LAST_DOC_ID", nullable = false)
    public long getLastDocId() {
        return lastDocId;
    }

    public void setLastDocId(long lastDocId) {
        this.lastDocId = lastDocId;
    }

    @Basic
    @Column(name = "DOC_COUNT", nullable = false)
    public long getDocCount() {
        return docCount;
    }

    public void setDocCount(long docCount) {
        this.docCount = docCount;
    }

    @Basic
    @Column(name = "DOC_ID", nullable = false)
    public long getDocId() {
        return docId;
    }

    public void setDocId(long docId) {
        this.docId = docId;
    }

    @Basic
    @Column(name = "POSITION", nullable = false)
    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbFtIndexCache that = (InnodbFtIndexCache) o;
        return firstDocId == that.firstDocId &&
                lastDocId == that.lastDocId &&
                docCount == that.docCount &&
                docId == that.docId &&
                position == that.position &&
                Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, firstDocId, lastDocId, docCount, docId, position);
    }
}
