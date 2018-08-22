package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dms_labels", schema = "example_database", catalog = "")
public class DmsLabels {
    private int id;
    private Timestamp dmsRecordDate;
    private Integer dmsRecordId;
    private Byte isVetted;
    private String remoteObjectId;
    private String remoteObjectType;
    private String source;
    private Integer versionId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dms_record_date", nullable = true)
    public Timestamp getDmsRecordDate() {
        return dmsRecordDate;
    }

    public void setDmsRecordDate(Timestamp dmsRecordDate) {
        this.dmsRecordDate = dmsRecordDate;
    }

    @Basic
    @Column(name = "dms_record_id", nullable = true)
    public Integer getDmsRecordId() {
        return dmsRecordId;
    }

    public void setDmsRecordId(Integer dmsRecordId) {
        this.dmsRecordId = dmsRecordId;
    }

    @Basic
    @Column(name = "is_vetted", nullable = true)
    public Byte getIsVetted() {
        return isVetted;
    }

    public void setIsVetted(Byte isVetted) {
        this.isVetted = isVetted;
    }

    @Basic
    @Column(name = "remote_object_id", nullable = true, length = 255)
    public String getRemoteObjectId() {
        return remoteObjectId;
    }

    public void setRemoteObjectId(String remoteObjectId) {
        this.remoteObjectId = remoteObjectId;
    }

    @Basic
    @Column(name = "remote_object_type", nullable = true, length = 255)
    public String getRemoteObjectType() {
        return remoteObjectType;
    }

    public void setRemoteObjectType(String remoteObjectType) {
        this.remoteObjectType = remoteObjectType;
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
    @Column(name = "version_id", nullable = true)
    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DmsLabels dmsLabels = (DmsLabels) o;
        return id == dmsLabels.id &&
                Objects.equals(dmsRecordDate, dmsLabels.dmsRecordDate) &&
                Objects.equals(dmsRecordId, dmsLabels.dmsRecordId) &&
                Objects.equals(isVetted, dmsLabels.isVetted) &&
                Objects.equals(remoteObjectId, dmsLabels.remoteObjectId) &&
                Objects.equals(remoteObjectType, dmsLabels.remoteObjectType) &&
                Objects.equals(source, dmsLabels.source) &&
                Objects.equals(versionId, dmsLabels.versionId) &&
                Objects.equals(createdAt, dmsLabels.createdAt) &&
                Objects.equals(updatedAt, dmsLabels.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dmsRecordDate, dmsRecordId, isVetted, remoteObjectId, remoteObjectType, source, versionId, createdAt, updatedAt);
    }
}
