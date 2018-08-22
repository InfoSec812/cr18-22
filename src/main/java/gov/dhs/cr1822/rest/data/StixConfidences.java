package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_confidences", schema = "example_database", catalog = "")
public class StixConfidences {
    private int id;
    private String value;
    private String description;
    private String source;
    private Byte isOfficial;
    private int confidenceNum;
    private Timestamp createdAt;
    private Timestamp stixTimestamp;
    private String userGuid;
    private String remoteObjectType;
    private String remoteObjectId;
    private String guid;
    private Byte fromFile;
    private Byte transferFromLow;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value", nullable = false, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "source", nullable = true, length = 255)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "is_official", nullable = true)
    public Byte getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Byte isOfficial) {
        this.isOfficial = isOfficial;
    }

    @Basic
    @Column(name = "confidence_num", nullable = false)
    public int getConfidenceNum() {
        return confidenceNum;
    }

    public void setConfidenceNum(int confidenceNum) {
        this.confidenceNum = confidenceNum;
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
    @Column(name = "stix_timestamp", nullable = true)
    public Timestamp getStixTimestamp() {
        return stixTimestamp;
    }

    public void setStixTimestamp(Timestamp stixTimestamp) {
        this.stixTimestamp = stixTimestamp;
    }

    @Basic
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "remote_object_type", nullable = false, length = 255)
    public String getRemoteObjectType() {
        return remoteObjectType;
    }

    public void setRemoteObjectType(String remoteObjectType) {
        this.remoteObjectType = remoteObjectType;
    }

    @Basic
    @Column(name = "remote_object_id", nullable = false, length = 255)
    public String getRemoteObjectId() {
        return remoteObjectId;
    }

    public void setRemoteObjectId(String remoteObjectId) {
        this.remoteObjectId = remoteObjectId;
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
    @Column(name = "from_file", nullable = true)
    public Byte getFromFile() {
        return fromFile;
    }

    public void setFromFile(Byte fromFile) {
        this.fromFile = fromFile;
    }

    @Basic
    @Column(name = "transfer_from_low", nullable = true)
    public Byte getTransferFromLow() {
        return transferFromLow;
    }

    public void setTransferFromLow(Byte transferFromLow) {
        this.transferFromLow = transferFromLow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StixConfidences that = (StixConfidences) o;
        return id == that.id &&
                confidenceNum == that.confidenceNum &&
                Objects.equals(value, that.value) &&
                Objects.equals(description, that.description) &&
                Objects.equals(source, that.source) &&
                Objects.equals(isOfficial, that.isOfficial) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(stixTimestamp, that.stixTimestamp) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(remoteObjectType, that.remoteObjectType) &&
                Objects.equals(remoteObjectId, that.remoteObjectId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(fromFile, that.fromFile) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, description, source, isOfficial, confidenceNum, createdAt, stixTimestamp, userGuid, remoteObjectType, remoteObjectId, guid, fromFile, transferFromLow);
    }
}
