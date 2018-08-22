package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Gfis {
    private int id;
    private String gfiSourceName;
    private String gfiActionName;
    private String gfiActionNameClass;
    private String gfiActionNameSubclass;
    private String gfiPsRegex;
    private String gfiPsRegexClass;
    private String gfiPsRegexSubclass;
    private String gfiCsRegex;
    private String gfiCsRegexClass;
    private String gfiCsRegexSubclass;
    private String gfiExpSigLoc;
    private String gfiExpSigLocClass;
    private String gfiExpSigLocSubclass;
    private Integer gfiBluesmokeId;
    private Integer gfiUscertSid;
    private String gfiNotes;
    private String gfiNotesClass;
    private String gfiNotesSubclass;
    private String gfiStatus;
    private String gfiUscertDoc;
    private String gfiUscertDocClass;
    private String gfiUscertDocSubclass;
    private String gfiSpecialInst;
    private String gfiSpecialInstClass;
    private String gfiSpecialInstSubclass;
    private String gfiType;
    private String oldGuid;
    private String guid;
    private String remoteObjectId;
    private String remoteObjectType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "gfi_source_name", nullable = true, length = -1)
    public String getGfiSourceName() {
        return gfiSourceName;
    }

    public void setGfiSourceName(String gfiSourceName) {
        this.gfiSourceName = gfiSourceName;
    }

    @Basic
    @Column(name = "gfi_action_name", nullable = true, length = -1)
    public String getGfiActionName() {
        return gfiActionName;
    }

    public void setGfiActionName(String gfiActionName) {
        this.gfiActionName = gfiActionName;
    }

    @Basic
    @Column(name = "gfi_action_name_class", nullable = true, length = -1)
    public String getGfiActionNameClass() {
        return gfiActionNameClass;
    }

    public void setGfiActionNameClass(String gfiActionNameClass) {
        this.gfiActionNameClass = gfiActionNameClass;
    }

    @Basic
    @Column(name = "gfi_action_name_subclass", nullable = true, length = -1)
    public String getGfiActionNameSubclass() {
        return gfiActionNameSubclass;
    }

    public void setGfiActionNameSubclass(String gfiActionNameSubclass) {
        this.gfiActionNameSubclass = gfiActionNameSubclass;
    }

    @Basic
    @Column(name = "gfi_ps_regex", nullable = true, length = -1)
    public String getGfiPsRegex() {
        return gfiPsRegex;
    }

    public void setGfiPsRegex(String gfiPsRegex) {
        this.gfiPsRegex = gfiPsRegex;
    }

    @Basic
    @Column(name = "gfi_ps_regex_class", nullable = true, length = -1)
    public String getGfiPsRegexClass() {
        return gfiPsRegexClass;
    }

    public void setGfiPsRegexClass(String gfiPsRegexClass) {
        this.gfiPsRegexClass = gfiPsRegexClass;
    }

    @Basic
    @Column(name = "gfi_ps_regex_subclass", nullable = true, length = -1)
    public String getGfiPsRegexSubclass() {
        return gfiPsRegexSubclass;
    }

    public void setGfiPsRegexSubclass(String gfiPsRegexSubclass) {
        this.gfiPsRegexSubclass = gfiPsRegexSubclass;
    }

    @Basic
    @Column(name = "gfi_cs_regex", nullable = true, length = -1)
    public String getGfiCsRegex() {
        return gfiCsRegex;
    }

    public void setGfiCsRegex(String gfiCsRegex) {
        this.gfiCsRegex = gfiCsRegex;
    }

    @Basic
    @Column(name = "gfi_cs_regex_class", nullable = true, length = -1)
    public String getGfiCsRegexClass() {
        return gfiCsRegexClass;
    }

    public void setGfiCsRegexClass(String gfiCsRegexClass) {
        this.gfiCsRegexClass = gfiCsRegexClass;
    }

    @Basic
    @Column(name = "gfi_cs_regex_subclass", nullable = true, length = -1)
    public String getGfiCsRegexSubclass() {
        return gfiCsRegexSubclass;
    }

    public void setGfiCsRegexSubclass(String gfiCsRegexSubclass) {
        this.gfiCsRegexSubclass = gfiCsRegexSubclass;
    }

    @Basic
    @Column(name = "gfi_exp_sig_loc", nullable = true, length = -1)
    public String getGfiExpSigLoc() {
        return gfiExpSigLoc;
    }

    public void setGfiExpSigLoc(String gfiExpSigLoc) {
        this.gfiExpSigLoc = gfiExpSigLoc;
    }

    @Basic
    @Column(name = "gfi_exp_sig_loc_class", nullable = true, length = -1)
    public String getGfiExpSigLocClass() {
        return gfiExpSigLocClass;
    }

    public void setGfiExpSigLocClass(String gfiExpSigLocClass) {
        this.gfiExpSigLocClass = gfiExpSigLocClass;
    }

    @Basic
    @Column(name = "gfi_exp_sig_loc_subclass", nullable = true, length = -1)
    public String getGfiExpSigLocSubclass() {
        return gfiExpSigLocSubclass;
    }

    public void setGfiExpSigLocSubclass(String gfiExpSigLocSubclass) {
        this.gfiExpSigLocSubclass = gfiExpSigLocSubclass;
    }

    @Basic
    @Column(name = "gfi_bluesmoke_id", nullable = true)
    public Integer getGfiBluesmokeId() {
        return gfiBluesmokeId;
    }

    public void setGfiBluesmokeId(Integer gfiBluesmokeId) {
        this.gfiBluesmokeId = gfiBluesmokeId;
    }

    @Basic
    @Column(name = "gfi_uscert_sid", nullable = true)
    public Integer getGfiUscertSid() {
        return gfiUscertSid;
    }

    public void setGfiUscertSid(Integer gfiUscertSid) {
        this.gfiUscertSid = gfiUscertSid;
    }

    @Basic
    @Column(name = "gfi_notes", nullable = true, length = -1)
    public String getGfiNotes() {
        return gfiNotes;
    }

    public void setGfiNotes(String gfiNotes) {
        this.gfiNotes = gfiNotes;
    }

    @Basic
    @Column(name = "gfi_notes_class", nullable = true, length = -1)
    public String getGfiNotesClass() {
        return gfiNotesClass;
    }

    public void setGfiNotesClass(String gfiNotesClass) {
        this.gfiNotesClass = gfiNotesClass;
    }

    @Basic
    @Column(name = "gfi_notes_subclass", nullable = true, length = -1)
    public String getGfiNotesSubclass() {
        return gfiNotesSubclass;
    }

    public void setGfiNotesSubclass(String gfiNotesSubclass) {
        this.gfiNotesSubclass = gfiNotesSubclass;
    }

    @Basic
    @Column(name = "gfi_status", nullable = true, length = -1)
    public String getGfiStatus() {
        return gfiStatus;
    }

    public void setGfiStatus(String gfiStatus) {
        this.gfiStatus = gfiStatus;
    }

    @Basic
    @Column(name = "gfi_uscert_doc", nullable = true, length = -1)
    public String getGfiUscertDoc() {
        return gfiUscertDoc;
    }

    public void setGfiUscertDoc(String gfiUscertDoc) {
        this.gfiUscertDoc = gfiUscertDoc;
    }

    @Basic
    @Column(name = "gfi_uscert_doc_class", nullable = true, length = -1)
    public String getGfiUscertDocClass() {
        return gfiUscertDocClass;
    }

    public void setGfiUscertDocClass(String gfiUscertDocClass) {
        this.gfiUscertDocClass = gfiUscertDocClass;
    }

    @Basic
    @Column(name = "gfi_uscert_doc_subclass", nullable = true, length = -1)
    public String getGfiUscertDocSubclass() {
        return gfiUscertDocSubclass;
    }

    public void setGfiUscertDocSubclass(String gfiUscertDocSubclass) {
        this.gfiUscertDocSubclass = gfiUscertDocSubclass;
    }

    @Basic
    @Column(name = "gfi_special_inst", nullable = true, length = -1)
    public String getGfiSpecialInst() {
        return gfiSpecialInst;
    }

    public void setGfiSpecialInst(String gfiSpecialInst) {
        this.gfiSpecialInst = gfiSpecialInst;
    }

    @Basic
    @Column(name = "gfi_special_inst_class", nullable = true, length = -1)
    public String getGfiSpecialInstClass() {
        return gfiSpecialInstClass;
    }

    public void setGfiSpecialInstClass(String gfiSpecialInstClass) {
        this.gfiSpecialInstClass = gfiSpecialInstClass;
    }

    @Basic
    @Column(name = "gfi_special_inst_subclass", nullable = true, length = -1)
    public String getGfiSpecialInstSubclass() {
        return gfiSpecialInstSubclass;
    }

    public void setGfiSpecialInstSubclass(String gfiSpecialInstSubclass) {
        this.gfiSpecialInstSubclass = gfiSpecialInstSubclass;
    }

    @Basic
    @Column(name = "gfi_type", nullable = true, length = -1)
    public String getGfiType() {
        return gfiType;
    }

    public void setGfiType(String gfiType) {
        this.gfiType = gfiType;
    }

    @Basic
    @Column(name = "old_guid", nullable = true, length = -1)
    public String getOldGuid() {
        return oldGuid;
    }

    public void setOldGuid(String oldGuid) {
        this.oldGuid = oldGuid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gfis gfis = (Gfis) o;
        return id == gfis.id &&
                Objects.equals(gfiSourceName, gfis.gfiSourceName) &&
                Objects.equals(gfiActionName, gfis.gfiActionName) &&
                Objects.equals(gfiActionNameClass, gfis.gfiActionNameClass) &&
                Objects.equals(gfiActionNameSubclass, gfis.gfiActionNameSubclass) &&
                Objects.equals(gfiPsRegex, gfis.gfiPsRegex) &&
                Objects.equals(gfiPsRegexClass, gfis.gfiPsRegexClass) &&
                Objects.equals(gfiPsRegexSubclass, gfis.gfiPsRegexSubclass) &&
                Objects.equals(gfiCsRegex, gfis.gfiCsRegex) &&
                Objects.equals(gfiCsRegexClass, gfis.gfiCsRegexClass) &&
                Objects.equals(gfiCsRegexSubclass, gfis.gfiCsRegexSubclass) &&
                Objects.equals(gfiExpSigLoc, gfis.gfiExpSigLoc) &&
                Objects.equals(gfiExpSigLocClass, gfis.gfiExpSigLocClass) &&
                Objects.equals(gfiExpSigLocSubclass, gfis.gfiExpSigLocSubclass) &&
                Objects.equals(gfiBluesmokeId, gfis.gfiBluesmokeId) &&
                Objects.equals(gfiUscertSid, gfis.gfiUscertSid) &&
                Objects.equals(gfiNotes, gfis.gfiNotes) &&
                Objects.equals(gfiNotesClass, gfis.gfiNotesClass) &&
                Objects.equals(gfiNotesSubclass, gfis.gfiNotesSubclass) &&
                Objects.equals(gfiStatus, gfis.gfiStatus) &&
                Objects.equals(gfiUscertDoc, gfis.gfiUscertDoc) &&
                Objects.equals(gfiUscertDocClass, gfis.gfiUscertDocClass) &&
                Objects.equals(gfiUscertDocSubclass, gfis.gfiUscertDocSubclass) &&
                Objects.equals(gfiSpecialInst, gfis.gfiSpecialInst) &&
                Objects.equals(gfiSpecialInstClass, gfis.gfiSpecialInstClass) &&
                Objects.equals(gfiSpecialInstSubclass, gfis.gfiSpecialInstSubclass) &&
                Objects.equals(gfiType, gfis.gfiType) &&
                Objects.equals(oldGuid, gfis.oldGuid) &&
                Objects.equals(guid, gfis.guid) &&
                Objects.equals(remoteObjectId, gfis.remoteObjectId) &&
                Objects.equals(remoteObjectType, gfis.remoteObjectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gfiSourceName, gfiActionName, gfiActionNameClass, gfiActionNameSubclass, gfiPsRegex, gfiPsRegexClass, gfiPsRegexSubclass, gfiCsRegex, gfiCsRegexClass, gfiCsRegexSubclass, gfiExpSigLoc, gfiExpSigLocClass, gfiExpSigLocSubclass, gfiBluesmokeId, gfiUscertSid, gfiNotes, gfiNotesClass, gfiNotesSubclass, gfiStatus, gfiUscertDoc, gfiUscertDocClass, gfiUscertDocSubclass, gfiSpecialInst, gfiSpecialInstClass, gfiSpecialInstSubclass, gfiType, oldGuid, guid, remoteObjectId, remoteObjectType);
    }
}
