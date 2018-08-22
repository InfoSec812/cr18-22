package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "system_logs", schema = "example_database", catalog = "")
public class SystemLogs {
    private int id;
    private String stixPackageId;
    private String sanitizedPackageId;
    private Timestamp timestamp;
    private String source;
    private String logLevel;
    private String message;
    private String text;
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
    @Column(name = "stix_package_id", nullable = false, length = 255)
    public String getStixPackageId() {
        return stixPackageId;
    }

    public void setStixPackageId(String stixPackageId) {
        this.stixPackageId = stixPackageId;
    }

    @Basic
    @Column(name = "sanitized_package_id", nullable = true, length = 255)
    public String getSanitizedPackageId() {
        return sanitizedPackageId;
    }

    public void setSanitizedPackageId(String sanitizedPackageId) {
        this.sanitizedPackageId = sanitizedPackageId;
    }

    @Basic
    @Column(name = "timestamp", nullable = false)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "source", nullable = false, length = 255)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "log_level", nullable = false, length = 255)
    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    @Basic
    @Column(name = "message", nullable = false, length = 255)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "text", nullable = true, length = -1)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        SystemLogs that = (SystemLogs) o;
        return id == that.id &&
                Objects.equals(stixPackageId, that.stixPackageId) &&
                Objects.equals(sanitizedPackageId, that.sanitizedPackageId) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(source, that.source) &&
                Objects.equals(logLevel, that.logLevel) &&
                Objects.equals(message, that.message) &&
                Objects.equals(text, that.text) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixPackageId, sanitizedPackageId, timestamp, source, logLevel, message, text, createdAt, updatedAt);
    }
}
