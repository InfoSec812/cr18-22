package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_win_registry_keys", schema = "example_database", catalog = "")
public class CyboxWinRegistryKeys {
    private int id;
    private String cyboxObjectId;
    private String cyboxHash;
    private String hive;
    private String key;
    private String guid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String portionMarking;
    private Byte readOnly;
    private String hiveC;
    private String keyC;
    private String hiveCondition;
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
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
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
    @Column(name = "hive", nullable = true, length = 255)
    public String getHive() {
        return hive;
    }

    public void setHive(String hive) {
        this.hive = hive;
    }

    @Basic
    @Column(name = "key", nullable = true, length = 255)
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
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
    @Column(name = "hive_c", nullable = true, length = 255)
    public String getHiveC() {
        return hiveC;
    }

    public void setHiveC(String hiveC) {
        this.hiveC = hiveC;
    }

    @Basic
    @Column(name = "key_c", nullable = true, length = 255)
    public String getKeyC() {
        return keyC;
    }

    public void setKeyC(String keyC) {
        this.keyC = keyC;
    }

    @Basic
    @Column(name = "hive_condition", nullable = true, length = 255)
    public String getHiveCondition() {
        return hiveCondition;
    }

    public void setHiveCondition(String hiveCondition) {
        this.hiveCondition = hiveCondition;
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
        CyboxWinRegistryKeys that = (CyboxWinRegistryKeys) o;
        return id == that.id &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(hive, that.hive) &&
                Objects.equals(key, that.key) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(hiveC, that.hiveC) &&
                Objects.equals(keyC, that.keyC) &&
                Objects.equals(hiveCondition, that.hiveCondition) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxObjectId, cyboxHash, hive, key, guid, createdAt, updatedAt, portionMarking, readOnly, hiveC, keyC, hiveCondition, isCiscp, isMifr, feeds);
    }
}
