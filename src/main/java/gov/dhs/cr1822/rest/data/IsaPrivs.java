package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "isa_privs", schema = "example_database", catalog = "")
public class IsaPrivs {
    private int id;
    private String action;
    private String effect;
    private String guid;
    private String isaAssertionStructureGuid;
    private String scopeCountries;
    private String scopeEntity;
    private byte scopeIsAll;
    private String scopeOrgs;
    private String scopeShargrp;
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
    @Column(name = "action", nullable = true, length = 255)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "effect", nullable = false, length = 255)
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
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
    @Column(name = "isa_assertion_structure_guid", nullable = true, length = 255)
    public String getIsaAssertionStructureGuid() {
        return isaAssertionStructureGuid;
    }

    public void setIsaAssertionStructureGuid(String isaAssertionStructureGuid) {
        this.isaAssertionStructureGuid = isaAssertionStructureGuid;
    }

    @Basic
    @Column(name = "scope_countries", nullable = true, length = 1000)
    public String getScopeCountries() {
        return scopeCountries;
    }

    public void setScopeCountries(String scopeCountries) {
        this.scopeCountries = scopeCountries;
    }

    @Basic
    @Column(name = "scope_entity", nullable = true, length = 255)
    public String getScopeEntity() {
        return scopeEntity;
    }

    public void setScopeEntity(String scopeEntity) {
        this.scopeEntity = scopeEntity;
    }

    @Basic
    @Column(name = "scope_is_all", nullable = false)
    public byte getScopeIsAll() {
        return scopeIsAll;
    }

    public void setScopeIsAll(byte scopeIsAll) {
        this.scopeIsAll = scopeIsAll;
    }

    @Basic
    @Column(name = "scope_orgs", nullable = true, length = 255)
    public String getScopeOrgs() {
        return scopeOrgs;
    }

    public void setScopeOrgs(String scopeOrgs) {
        this.scopeOrgs = scopeOrgs;
    }

    @Basic
    @Column(name = "scope_shargrp", nullable = true, length = 255)
    public String getScopeShargrp() {
        return scopeShargrp;
    }

    public void setScopeShargrp(String scopeShargrp) {
        this.scopeShargrp = scopeShargrp;
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
        IsaPrivs isaPrivs = (IsaPrivs) o;
        return id == isaPrivs.id &&
                scopeIsAll == isaPrivs.scopeIsAll &&
                Objects.equals(action, isaPrivs.action) &&
                Objects.equals(effect, isaPrivs.effect) &&
                Objects.equals(guid, isaPrivs.guid) &&
                Objects.equals(isaAssertionStructureGuid, isaPrivs.isaAssertionStructureGuid) &&
                Objects.equals(scopeCountries, isaPrivs.scopeCountries) &&
                Objects.equals(scopeEntity, isaPrivs.scopeEntity) &&
                Objects.equals(scopeOrgs, isaPrivs.scopeOrgs) &&
                Objects.equals(scopeShargrp, isaPrivs.scopeShargrp) &&
                Objects.equals(updatedAt, isaPrivs.updatedAt) &&
                Objects.equals(transferFromLow, isaPrivs.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, action, effect, guid, isaAssertionStructureGuid, scopeCountries, scopeEntity, scopeIsAll, scopeOrgs, scopeShargrp, updatedAt, transferFromLow);
    }
}
