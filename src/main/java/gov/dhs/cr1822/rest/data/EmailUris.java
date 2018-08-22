package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "email_uris", schema = "example_database", catalog = "")
public class EmailUris {
    private int id;
    private Integer oldEmailMessageId;
    private Integer oldUriId;
    private String guid;
    private Timestamp updatedAt;
    private String emailMessageId;
    private String uriId;
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
    @Column(name = "old_email_message_id", nullable = true)
    public Integer getOldEmailMessageId() {
        return oldEmailMessageId;
    }

    public void setOldEmailMessageId(Integer oldEmailMessageId) {
        this.oldEmailMessageId = oldEmailMessageId;
    }

    @Basic
    @Column(name = "old_uri_id", nullable = true)
    public Integer getOldUriId() {
        return oldUriId;
    }

    public void setOldUriId(Integer oldUriId) {
        this.oldUriId = oldUriId;
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
    @Column(name = "email_message_id", nullable = true, length = 255)
    public String getEmailMessageId() {
        return emailMessageId;
    }

    public void setEmailMessageId(String emailMessageId) {
        this.emailMessageId = emailMessageId;
    }

    @Basic
    @Column(name = "uri_id", nullable = true, length = 255)
    public String getUriId() {
        return uriId;
    }

    public void setUriId(String uriId) {
        this.uriId = uriId;
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
        EmailUris emailUris = (EmailUris) o;
        return id == emailUris.id &&
                Objects.equals(oldEmailMessageId, emailUris.oldEmailMessageId) &&
                Objects.equals(oldUriId, emailUris.oldUriId) &&
                Objects.equals(guid, emailUris.guid) &&
                Objects.equals(updatedAt, emailUris.updatedAt) &&
                Objects.equals(emailMessageId, emailUris.emailMessageId) &&
                Objects.equals(uriId, emailUris.uriId) &&
                Objects.equals(transferFromLow, emailUris.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, oldEmailMessageId, oldUriId, guid, updatedAt, emailMessageId, uriId, transferFromLow);
    }
}
