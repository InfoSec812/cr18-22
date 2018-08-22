package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Questions {
    private int id;
    private String guid;
    private String cyboxHash;
    private String portionMarking;
    private String qclass;
    private String qtype;
    private String qnameCache;
    private Byte isReference;
    private Byte readOnly;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Byte isCiscp;
    private Byte isMifr;
    private String feeds;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "cybox_hash", nullable = true, length = 255)
    public String getCyboxHash() {
        return cyboxHash;
    }

    public void setCyboxHash(String cyboxHash) {
        this.cyboxHash = cyboxHash;
    }

    @Basic
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
    }

    @Basic
    @Column(name = "qclass", nullable = true, length = 255)
    public String getQclass() {
        return qclass;
    }

    public void setQclass(String qclass) {
        this.qclass = qclass;
    }

    @Basic
    @Column(name = "qtype", nullable = true, length = 255)
    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    @Basic
    @Column(name = "qname_cache", nullable = true, length = 255)
    public String getQnameCache() {
        return qnameCache;
    }

    public void setQnameCache(String qnameCache) {
        this.qnameCache = qnameCache;
    }

    @Basic
    @Column(name = "is_reference", nullable = true)
    public Byte getIsReference() {
        return isReference;
    }

    public void setIsReference(Byte isReference) {
        this.isReference = isReference;
    }

    @Basic
    @Column(name = "read_only", nullable = true)
    public Byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Byte readOnly) {
        this.readOnly = readOnly;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "is_ciscp", nullable = true)
    public Byte getIsCiscp() {
        return isCiscp;
    }

    public void setIsCiscp(Byte isCiscp) {
        this.isCiscp = isCiscp;
    }

    @Basic
    @Column(name = "is_mifr", nullable = true)
    public Byte getIsMifr() {
        return isMifr;
    }

    public void setIsMifr(Byte isMifr) {
        this.isMifr = isMifr;
    }

    @Basic
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questions questions = (Questions) o;
        return id == questions.id &&
                Objects.equals(guid, questions.guid) &&
                Objects.equals(cyboxHash, questions.cyboxHash) &&
                Objects.equals(portionMarking, questions.portionMarking) &&
                Objects.equals(qclass, questions.qclass) &&
                Objects.equals(qtype, questions.qtype) &&
                Objects.equals(qnameCache, questions.qnameCache) &&
                Objects.equals(isReference, questions.isReference) &&
                Objects.equals(readOnly, questions.readOnly) &&
                Objects.equals(createdAt, questions.createdAt) &&
                Objects.equals(updatedAt, questions.updatedAt) &&
                Objects.equals(isCiscp, questions.isCiscp) &&
                Objects.equals(isMifr, questions.isMifr) &&
                Objects.equals(feeds, questions.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guid, cyboxHash, portionMarking, qclass, qtype, qnameCache, isReference, readOnly, createdAt, updatedAt, isCiscp, isMifr, feeds);
    }
}
