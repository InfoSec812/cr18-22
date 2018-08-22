package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Users {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String passwordHash;
    private String passwordSalt;
    private String organizationGuid;
    private Timestamp lockedAt;
    private Timestamp loggedInAt;
    private Integer failedLoginAttempts;
    private Timestamp expiredAt;
    private Timestamp disabledAt;
    private Byte passwordChangeRequired;
    private Timestamp passwordChangedAt;
    private Timestamp termsAcceptedAt;
    private Timestamp hiddenAt;
    private Integer throttle;
    private Byte machine;
    private Integer r5Id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String apiKey;
    private String apiKeySecretEncrypted;
    private String guid;
    private String notes;
    private String remoteGuid;
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
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "first_name", nullable = true, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, length = 255)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "password_hash", nullable = true, length = 255)
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Basic
    @Column(name = "password_salt", nullable = true, length = 255)
    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    @Basic
    @Column(name = "organization_guid", nullable = true, length = 255)
    public String getOrganizationGuid() {
        return organizationGuid;
    }

    public void setOrganizationGuid(String organizationGuid) {
        this.organizationGuid = organizationGuid;
    }

    @Basic
    @Column(name = "locked_at", nullable = true)
    public Timestamp getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(Timestamp lockedAt) {
        this.lockedAt = lockedAt;
    }

    @Basic
    @Column(name = "logged_in_at", nullable = true)
    public Timestamp getLoggedInAt() {
        return loggedInAt;
    }

    public void setLoggedInAt(Timestamp loggedInAt) {
        this.loggedInAt = loggedInAt;
    }

    @Basic
    @Column(name = "failed_login_attempts", nullable = true)
    public Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    @Basic
    @Column(name = "expired_at", nullable = true)
    public Timestamp getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Timestamp expiredAt) {
        this.expiredAt = expiredAt;
    }

    @Basic
    @Column(name = "disabled_at", nullable = true)
    public Timestamp getDisabledAt() {
        return disabledAt;
    }

    public void setDisabledAt(Timestamp disabledAt) {
        this.disabledAt = disabledAt;
    }

    @Basic
    @Column(name = "password_change_required", nullable = true)
    public Byte getPasswordChangeRequired() {
        return passwordChangeRequired;
    }

    public void setPasswordChangeRequired(Byte passwordChangeRequired) {
        this.passwordChangeRequired = passwordChangeRequired;
    }

    @Basic
    @Column(name = "password_changed_at", nullable = true)
    public Timestamp getPasswordChangedAt() {
        return passwordChangedAt;
    }

    public void setPasswordChangedAt(Timestamp passwordChangedAt) {
        this.passwordChangedAt = passwordChangedAt;
    }

    @Basic
    @Column(name = "terms_accepted_at", nullable = true)
    public Timestamp getTermsAcceptedAt() {
        return termsAcceptedAt;
    }

    public void setTermsAcceptedAt(Timestamp termsAcceptedAt) {
        this.termsAcceptedAt = termsAcceptedAt;
    }

    @Basic
    @Column(name = "hidden_at", nullable = true)
    public Timestamp getHiddenAt() {
        return hiddenAt;
    }

    public void setHiddenAt(Timestamp hiddenAt) {
        this.hiddenAt = hiddenAt;
    }

    @Basic
    @Column(name = "throttle", nullable = true)
    public Integer getThrottle() {
        return throttle;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
    }

    @Basic
    @Column(name = "machine", nullable = true)
    public Byte getMachine() {
        return machine;
    }

    public void setMachine(Byte machine) {
        this.machine = machine;
    }

    @Basic
    @Column(name = "r5_id", nullable = true)
    public Integer getR5Id() {
        return r5Id;
    }

    public void setR5Id(Integer r5Id) {
        this.r5Id = r5Id;
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
    @Column(name = "api_key", nullable = true, length = 255)
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Basic
    @Column(name = "api_key_secret_encrypted", nullable = true, length = 255)
    public String getApiKeySecretEncrypted() {
        return apiKeySecretEncrypted;
    }

    public void setApiKeySecretEncrypted(String apiKeySecretEncrypted) {
        this.apiKeySecretEncrypted = apiKeySecretEncrypted;
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
    @Column(name = "notes", nullable = true, length = 255)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "remote_guid", nullable = true, length = 255)
    public String getRemoteGuid() {
        return remoteGuid;
    }

    public void setRemoteGuid(String remoteGuid) {
        this.remoteGuid = remoteGuid;
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
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(username, users.username) &&
                Objects.equals(firstName, users.firstName) &&
                Objects.equals(lastName, users.lastName) &&
                Objects.equals(email, users.email) &&
                Objects.equals(phone, users.phone) &&
                Objects.equals(passwordHash, users.passwordHash) &&
                Objects.equals(passwordSalt, users.passwordSalt) &&
                Objects.equals(organizationGuid, users.organizationGuid) &&
                Objects.equals(lockedAt, users.lockedAt) &&
                Objects.equals(loggedInAt, users.loggedInAt) &&
                Objects.equals(failedLoginAttempts, users.failedLoginAttempts) &&
                Objects.equals(expiredAt, users.expiredAt) &&
                Objects.equals(disabledAt, users.disabledAt) &&
                Objects.equals(passwordChangeRequired, users.passwordChangeRequired) &&
                Objects.equals(passwordChangedAt, users.passwordChangedAt) &&
                Objects.equals(termsAcceptedAt, users.termsAcceptedAt) &&
                Objects.equals(hiddenAt, users.hiddenAt) &&
                Objects.equals(throttle, users.throttle) &&
                Objects.equals(machine, users.machine) &&
                Objects.equals(r5Id, users.r5Id) &&
                Objects.equals(createdAt, users.createdAt) &&
                Objects.equals(updatedAt, users.updatedAt) &&
                Objects.equals(apiKey, users.apiKey) &&
                Objects.equals(apiKeySecretEncrypted, users.apiKeySecretEncrypted) &&
                Objects.equals(guid, users.guid) &&
                Objects.equals(notes, users.notes) &&
                Objects.equals(remoteGuid, users.remoteGuid) &&
                Objects.equals(transferFromLow, users.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstName, lastName, email, phone, passwordHash, passwordSalt, organizationGuid, lockedAt, loggedInAt, failedLoginAttempts, expiredAt, disabledAt, passwordChangeRequired, passwordChangedAt, termsAcceptedAt, hiddenAt, throttle, machine, r5Id, createdAt, updatedAt, apiKey, apiKeySecretEncrypted, guid, notes, remoteGuid, transferFromLow);
    }
}
