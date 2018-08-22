package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "email_links", schema = "example_database", catalog = "")
public class EmailLinks {
    private int id;
    private Integer oldEmailMessageId;
    private Integer oldLinkId;
    private String guid;
    private Timestamp updatedAt;
    private String emailMessageId;
    private String linkId;
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
    @Column(name = "old_link_id", nullable = true)
    public Integer getOldLinkId() {
        return oldLinkId;
    }

    public void setOldLinkId(Integer oldLinkId) {
        this.oldLinkId = oldLinkId;
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
    @Column(name = "link_id", nullable = true, length = 255)
    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
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
        EmailLinks that = (EmailLinks) o;
        return id == that.id &&
                Objects.equals(oldEmailMessageId, that.oldEmailMessageId) &&
                Objects.equals(oldLinkId, that.oldLinkId) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(emailMessageId, that.emailMessageId) &&
                Objects.equals(linkId, that.linkId) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, oldEmailMessageId, oldLinkId, guid, updatedAt, emailMessageId, linkId, transferFromLow);
    }
}
