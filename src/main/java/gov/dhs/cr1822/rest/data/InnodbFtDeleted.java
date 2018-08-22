package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_FT_DELETED", schema = "information_schema", catalog = "")
public class InnodbFtDeleted {
    private long docId;

    @Basic
    @Column(name = "DOC_ID", nullable = false)
    public long getDocId() {
        return docId;
    }

    public void setDocId(long docId) {
        this.docId = docId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbFtDeleted that = (InnodbFtDeleted) o;
        return docId == that.docId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(docId);
    }
}
