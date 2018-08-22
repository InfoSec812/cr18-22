package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Tags {
    private int id;
    private String name;
    private String nameNormalized;
    private String userGuid;
    private Integer r5CollectionId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private Byte isPermanent;
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
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "name_normalized", nullable = false, length = 255)
    public String getNameNormalized() {
        return nameNormalized;
    }

    public void setNameNormalized(String nameNormalized) {
        this.nameNormalized = nameNormalized;
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
    @Column(name = "r5_collection_id", nullable = true)
    public Integer getR5CollectionId() {
        return r5CollectionId;
    }

    public void setR5CollectionId(Integer r5CollectionId) {
        this.r5CollectionId = r5CollectionId;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "is_permanent", nullable = true)
    public Byte getIsPermanent() {
        return isPermanent;
    }

    public void setIsPermanent(Byte isPermanent) {
        this.isPermanent = isPermanent;
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
        Tags tags = (Tags) o;
        return id == tags.id &&
                Objects.equals(name, tags.name) &&
                Objects.equals(nameNormalized, tags.nameNormalized) &&
                Objects.equals(userGuid, tags.userGuid) &&
                Objects.equals(r5CollectionId, tags.r5CollectionId) &&
                Objects.equals(createdAt, tags.createdAt) &&
                Objects.equals(updatedAt, tags.updatedAt) &&
                Objects.equals(guid, tags.guid) &&
                Objects.equals(isPermanent, tags.isPermanent) &&
                Objects.equals(transferFromLow, tags.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameNormalized, userGuid, r5CollectionId, createdAt, updatedAt, guid, isPermanent, transferFromLow);
    }
}
