package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "pending_amqp_messages", schema = "example_database", catalog = "")
public class PendingAmqpMessages {
    private int id;
    private byte isStixXml;
    private String transferCategory;
    private String replType;
    private byte[] messageData;
    private byte[] stringProps;
    private Timestamp lastAttempted;
    private int attemptCount;
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
    @Column(name = "is_stix_xml", nullable = false)
    public byte getIsStixXml() {
        return isStixXml;
    }

    public void setIsStixXml(byte isStixXml) {
        this.isStixXml = isStixXml;
    }

    @Basic
    @Column(name = "transfer_category", nullable = true, length = 255)
    public String getTransferCategory() {
        return transferCategory;
    }

    public void setTransferCategory(String transferCategory) {
        this.transferCategory = transferCategory;
    }

    @Basic
    @Column(name = "repl_type", nullable = true, length = 255)
    public String getReplType() {
        return replType;
    }

    public void setReplType(String replType) {
        this.replType = replType;
    }

    @Basic
    @Column(name = "message_data", nullable = false)
    public byte[] getMessageData() {
        return messageData;
    }

    public void setMessageData(byte[] messageData) {
        this.messageData = messageData;
    }

    @Basic
    @Column(name = "string_props", nullable = false)
    public byte[] getStringProps() {
        return stringProps;
    }

    public void setStringProps(byte[] stringProps) {
        this.stringProps = stringProps;
    }

    @Basic
    @Column(name = "last_attempted", nullable = true)
    public Timestamp getLastAttempted() {
        return lastAttempted;
    }

    public void setLastAttempted(Timestamp lastAttempted) {
        this.lastAttempted = lastAttempted;
    }

    @Basic
    @Column(name = "attempt_count", nullable = false)
    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(int attemptCount) {
        this.attemptCount = attemptCount;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
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
        PendingAmqpMessages that = (PendingAmqpMessages) o;
        return id == that.id &&
                isStixXml == that.isStixXml &&
                attemptCount == that.attemptCount &&
                Objects.equals(transferCategory, that.transferCategory) &&
                Objects.equals(replType, that.replType) &&
                Arrays.equals(messageData, that.messageData) &&
                Arrays.equals(stringProps, that.stringProps) &&
                Objects.equals(lastAttempted, that.lastAttempted) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, isStixXml, transferCategory, replType, lastAttempted, attemptCount, createdAt, updatedAt);
        result = 31 * result + Arrays.hashCode(messageData);
        result = 31 * result + Arrays.hashCode(stringProps);
        return result;
    }
}
