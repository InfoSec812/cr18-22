package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_file_hashes", schema = "example_database", catalog = "")
public class CyboxFileHashes {
    private int id;
    private Timestamp createdAt;
    private String cyboxFileId;
    private String cyboxHash;
    private String cyboxObjectId;
    private String fuzzyHashValue;
    private String fuzzyHashValueNormalized;
    private String hashCondition;
    private String hashType;
    private String hashTypeVocabName;
    private String hashTypeVocabRef;
    private String simpleHashValue;
    private String simpleHashValueNormalized;
    private Timestamp updatedAt;
    private String guid;
    private Byte readOnly;
    private String simpleHashValueNormalizedC;
    private String fuzzyHashValueNormalizedC;
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
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "cybox_file_id", nullable = true, length = 255)
    public String getCyboxFileId() {
        return cyboxFileId;
    }

    public void setCyboxFileId(String cyboxFileId) {
        this.cyboxFileId = cyboxFileId;
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
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "fuzzy_hash_value", nullable = true, length = 255)
    public String getFuzzyHashValue() {
        return fuzzyHashValue;
    }

    public void setFuzzyHashValue(String fuzzyHashValue) {
        this.fuzzyHashValue = fuzzyHashValue;
    }

    @Basic
    @Column(name = "fuzzy_hash_value_normalized", nullable = true, length = 255)
    public String getFuzzyHashValueNormalized() {
        return fuzzyHashValueNormalized;
    }

    public void setFuzzyHashValueNormalized(String fuzzyHashValueNormalized) {
        this.fuzzyHashValueNormalized = fuzzyHashValueNormalized;
    }

    @Basic
    @Column(name = "hash_condition", nullable = true, length = 255)
    public String getHashCondition() {
        return hashCondition;
    }

    public void setHashCondition(String hashCondition) {
        this.hashCondition = hashCondition;
    }

    @Basic
    @Column(name = "hash_type", nullable = true, length = 255)
    public String getHashType() {
        return hashType;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    @Basic
    @Column(name = "hash_type_vocab_name", nullable = true, length = 255)
    public String getHashTypeVocabName() {
        return hashTypeVocabName;
    }

    public void setHashTypeVocabName(String hashTypeVocabName) {
        this.hashTypeVocabName = hashTypeVocabName;
    }

    @Basic
    @Column(name = "hash_type_vocab_ref", nullable = true, length = 255)
    public String getHashTypeVocabRef() {
        return hashTypeVocabRef;
    }

    public void setHashTypeVocabRef(String hashTypeVocabRef) {
        this.hashTypeVocabRef = hashTypeVocabRef;
    }

    @Basic
    @Column(name = "simple_hash_value", nullable = true, length = 255)
    public String getSimpleHashValue() {
        return simpleHashValue;
    }

    public void setSimpleHashValue(String simpleHashValue) {
        this.simpleHashValue = simpleHashValue;
    }

    @Basic
    @Column(name = "simple_hash_value_normalized", nullable = true, length = 255)
    public String getSimpleHashValueNormalized() {
        return simpleHashValueNormalized;
    }

    public void setSimpleHashValueNormalized(String simpleHashValueNormalized) {
        this.simpleHashValueNormalized = simpleHashValueNormalized;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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
    @Column(name = "simple_hash_value_normalized_c", nullable = true, length = 255)
    public String getSimpleHashValueNormalizedC() {
        return simpleHashValueNormalizedC;
    }

    public void setSimpleHashValueNormalizedC(String simpleHashValueNormalizedC) {
        this.simpleHashValueNormalizedC = simpleHashValueNormalizedC;
    }

    @Basic
    @Column(name = "fuzzy_hash_value_normalized_c", nullable = true, length = 255)
    public String getFuzzyHashValueNormalizedC() {
        return fuzzyHashValueNormalizedC;
    }

    public void setFuzzyHashValueNormalizedC(String fuzzyHashValueNormalizedC) {
        this.fuzzyHashValueNormalizedC = fuzzyHashValueNormalizedC;
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
        CyboxFileHashes that = (CyboxFileHashes) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(cyboxFileId, that.cyboxFileId) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(fuzzyHashValue, that.fuzzyHashValue) &&
                Objects.equals(fuzzyHashValueNormalized, that.fuzzyHashValueNormalized) &&
                Objects.equals(hashCondition, that.hashCondition) &&
                Objects.equals(hashType, that.hashType) &&
                Objects.equals(hashTypeVocabName, that.hashTypeVocabName) &&
                Objects.equals(hashTypeVocabRef, that.hashTypeVocabRef) &&
                Objects.equals(simpleHashValue, that.simpleHashValue) &&
                Objects.equals(simpleHashValueNormalized, that.simpleHashValueNormalized) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(simpleHashValueNormalizedC, that.simpleHashValueNormalizedC) &&
                Objects.equals(fuzzyHashValueNormalizedC, that.fuzzyHashValueNormalizedC) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, cyboxFileId, cyboxHash, cyboxObjectId, fuzzyHashValue, fuzzyHashValueNormalized, hashCondition, hashType, hashTypeVocabName, hashTypeVocabRef, simpleHashValue, simpleHashValueNormalized, updatedAt, guid, readOnly, simpleHashValueNormalizedC, fuzzyHashValueNormalizedC, isCiscp, isMifr, feeds);
    }
}
