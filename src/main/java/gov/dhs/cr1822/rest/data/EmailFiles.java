package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "email_files", schema = "example_database", catalog = "")
public class EmailFiles {
    private int id;
    private String emailMessageId;
    private String cyboxFileId;
    private String guid;
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
    @Column(name = "email_message_id", nullable = true, length = 255)
    public String getEmailMessageId() {
        return emailMessageId;
    }

    public void setEmailMessageId(String emailMessageId) {
        this.emailMessageId = emailMessageId;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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
        EmailFiles that = (EmailFiles) o;
        return id == that.id &&
                Objects.equals(emailMessageId, that.emailMessageId) &&
                Objects.equals(cyboxFileId, that.cyboxFileId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emailMessageId, cyboxFileId, guid, updatedAt, transferFromLow);
    }
}
