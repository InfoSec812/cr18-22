package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Notes {
    private int id;
    private String guid;
    private String targetClass;
    private String targetGuid;
    private String userGuid;
    private String note;
    private String justification;
    private Timestamp createdAt;
    private Timestamp updatedAt;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "target_class", nullable = true, length = 255)
    public String getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    @Basic
    @Column(name = "target_guid", nullable = true, length = 255)
    public String getTargetGuid() {
        return targetGuid;
    }

    public void setTargetGuid(String targetGuid) {
        this.targetGuid = targetGuid;
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
    @Column(name = "note", nullable = true, length = -1)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "justification", nullable = true, length = 255)
    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
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
        Notes notes = (Notes) o;
        return id == notes.id &&
                Objects.equals(guid, notes.guid) &&
                Objects.equals(targetClass, notes.targetClass) &&
                Objects.equals(targetGuid, notes.targetGuid) &&
                Objects.equals(userGuid, notes.userGuid) &&
                Objects.equals(note, notes.note) &&
                Objects.equals(justification, notes.justification) &&
                Objects.equals(createdAt, notes.createdAt) &&
                Objects.equals(updatedAt, notes.updatedAt) &&
                Objects.equals(transferFromLow, notes.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guid, targetClass, targetGuid, userGuid, note, justification, createdAt, updatedAt, transferFromLow);
    }
}
