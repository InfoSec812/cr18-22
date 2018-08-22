package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_files", schema = "example_database", catalog = "")
public class CyboxFiles {
    private int id;
    private Timestamp createdAt;
    private String cyboxHash;
    private String cyboxObjectId;
    private String fileExtension;
    private String fileNameCondition;
    private String filePath;
    private String filePathCondition;
    private String sizeInBytesCondition;
    private Timestamp updatedAt;
    private String guid;
    private String legacyFileType;
    private String legacyRegistryEdits;
    private String legacyAvSignatureMcafee;
    private String legacyAvSignatureMicrosoft;
    private String legacyAvSignatureSymantec;
    private String legacyAvSignatureTrendmicro;
    private String legacyAvSignatureKaspersky;
    private Timestamp legacyCompiledAt;
    private String legacyCompilerType;
    private String legacyCve;
    private String legacyKeywords;
    private String legacyMutex;
    private String legacyPacker;
    private String legacyXorKey;
    private String legacyMotifName;
    private String legacyMotifSize;
    private String legacyCompositeHash;
    private String legacyCommandLine;
    private String portionMarking;
    private Integer gfiIdOld;
    private Byte readOnly;
    private String fileNameC;
    private String filePathC;
    private String sizeInBytesC;
    private Byte isCiscp;
    private Byte isMifr;
    private String sizeInBytes;
    private String fileName;
    private String feeds;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "cybox_hash", nullable = true, length = 255)
    public String getCyboxHash() {
        return cyboxHash;
    }

    public void setCyboxHash(String cyboxHash) {
        this.cyboxHash = cyboxHash;
    }

    @Basic
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "file_extension", nullable = true, length = 255)
    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Basic
    @Column(name = "file_name_condition", nullable = true, length = 255)
    public String getFileNameCondition() {
        return fileNameCondition;
    }

    public void setFileNameCondition(String fileNameCondition) {
        this.fileNameCondition = fileNameCondition;
    }

    @Basic
    @Column(name = "file_path", nullable = true, length = 255)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "file_path_condition", nullable = true, length = 255)
    public String getFilePathCondition() {
        return filePathCondition;
    }

    public void setFilePathCondition(String filePathCondition) {
        this.filePathCondition = filePathCondition;
    }

    @Basic
    @Column(name = "size_in_bytes_condition", nullable = true, length = 255)
    public String getSizeInBytesCondition() {
        return sizeInBytesCondition;
    }

    public void setSizeInBytesCondition(String sizeInBytesCondition) {
        this.sizeInBytesCondition = sizeInBytesCondition;
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
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "legacy_file_type", nullable = true, length = -1)
    public String getLegacyFileType() {
        return legacyFileType;
    }

    public void setLegacyFileType(String legacyFileType) {
        this.legacyFileType = legacyFileType;
    }

    @Basic
    @Column(name = "legacy_registry_edits", nullable = true, length = -1)
    public String getLegacyRegistryEdits() {
        return legacyRegistryEdits;
    }

    public void setLegacyRegistryEdits(String legacyRegistryEdits) {
        this.legacyRegistryEdits = legacyRegistryEdits;
    }

    @Basic
    @Column(name = "legacy_av_signature_mcafee", nullable = true, length = 255)
    public String getLegacyAvSignatureMcafee() {
        return legacyAvSignatureMcafee;
    }

    public void setLegacyAvSignatureMcafee(String legacyAvSignatureMcafee) {
        this.legacyAvSignatureMcafee = legacyAvSignatureMcafee;
    }

    @Basic
    @Column(name = "legacy_av_signature_microsoft", nullable = true, length = 255)
    public String getLegacyAvSignatureMicrosoft() {
        return legacyAvSignatureMicrosoft;
    }

    public void setLegacyAvSignatureMicrosoft(String legacyAvSignatureMicrosoft) {
        this.legacyAvSignatureMicrosoft = legacyAvSignatureMicrosoft;
    }

    @Basic
    @Column(name = "legacy_av_signature_symantec", nullable = true, length = 255)
    public String getLegacyAvSignatureSymantec() {
        return legacyAvSignatureSymantec;
    }

    public void setLegacyAvSignatureSymantec(String legacyAvSignatureSymantec) {
        this.legacyAvSignatureSymantec = legacyAvSignatureSymantec;
    }

    @Basic
    @Column(name = "legacy_av_signature_trendmicro", nullable = true, length = 255)
    public String getLegacyAvSignatureTrendmicro() {
        return legacyAvSignatureTrendmicro;
    }

    public void setLegacyAvSignatureTrendmicro(String legacyAvSignatureTrendmicro) {
        this.legacyAvSignatureTrendmicro = legacyAvSignatureTrendmicro;
    }

    @Basic
    @Column(name = "legacy_av_signature_kaspersky", nullable = true, length = 255)
    public String getLegacyAvSignatureKaspersky() {
        return legacyAvSignatureKaspersky;
    }

    public void setLegacyAvSignatureKaspersky(String legacyAvSignatureKaspersky) {
        this.legacyAvSignatureKaspersky = legacyAvSignatureKaspersky;
    }

    @Basic
    @Column(name = "legacy_compiled_at", nullable = true)
    public Timestamp getLegacyCompiledAt() {
        return legacyCompiledAt;
    }

    public void setLegacyCompiledAt(Timestamp legacyCompiledAt) {
        this.legacyCompiledAt = legacyCompiledAt;
    }

    @Basic
    @Column(name = "legacy_compiler_type", nullable = true, length = 255)
    public String getLegacyCompilerType() {
        return legacyCompilerType;
    }

    public void setLegacyCompilerType(String legacyCompilerType) {
        this.legacyCompilerType = legacyCompilerType;
    }

    @Basic
    @Column(name = "legacy_cve", nullable = true, length = -1)
    public String getLegacyCve() {
        return legacyCve;
    }

    public void setLegacyCve(String legacyCve) {
        this.legacyCve = legacyCve;
    }

    @Basic
    @Column(name = "legacy_keywords", nullable = true, length = -1)
    public String getLegacyKeywords() {
        return legacyKeywords;
    }

    public void setLegacyKeywords(String legacyKeywords) {
        this.legacyKeywords = legacyKeywords;
    }

    @Basic
    @Column(name = "legacy_mutex", nullable = true, length = -1)
    public String getLegacyMutex() {
        return legacyMutex;
    }

    public void setLegacyMutex(String legacyMutex) {
        this.legacyMutex = legacyMutex;
    }

    @Basic
    @Column(name = "legacy_packer", nullable = true, length = 255)
    public String getLegacyPacker() {
        return legacyPacker;
    }

    public void setLegacyPacker(String legacyPacker) {
        this.legacyPacker = legacyPacker;
    }

    @Basic
    @Column(name = "legacy_xor_key", nullable = true, length = 255)
    public String getLegacyXorKey() {
        return legacyXorKey;
    }

    public void setLegacyXorKey(String legacyXorKey) {
        this.legacyXorKey = legacyXorKey;
    }

    @Basic
    @Column(name = "legacy_motif_name", nullable = true, length = 255)
    public String getLegacyMotifName() {
        return legacyMotifName;
    }

    public void setLegacyMotifName(String legacyMotifName) {
        this.legacyMotifName = legacyMotifName;
    }

    @Basic
    @Column(name = "legacy_motif_size", nullable = true, length = 255)
    public String getLegacyMotifSize() {
        return legacyMotifSize;
    }

    public void setLegacyMotifSize(String legacyMotifSize) {
        this.legacyMotifSize = legacyMotifSize;
    }

    @Basic
    @Column(name = "legacy_composite_hash", nullable = true, length = 255)
    public String getLegacyCompositeHash() {
        return legacyCompositeHash;
    }

    public void setLegacyCompositeHash(String legacyCompositeHash) {
        this.legacyCompositeHash = legacyCompositeHash;
    }

    @Basic
    @Column(name = "legacy_command_line", nullable = true, length = 255)
    public String getLegacyCommandLine() {
        return legacyCommandLine;
    }

    public void setLegacyCommandLine(String legacyCommandLine) {
        this.legacyCommandLine = legacyCommandLine;
    }

    @Basic
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
    }

    @Basic
    @Column(name = "gfi_id_old", nullable = true)
    public Integer getGfiIdOld() {
        return gfiIdOld;
    }

    public void setGfiIdOld(Integer gfiIdOld) {
        this.gfiIdOld = gfiIdOld;
    }

    @Basic
    @Column(name = "read_only", nullable = true)
    public Byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Byte readOnly) {
        this.readOnly = readOnly;
    }

    @Basic
    @Column(name = "file_name_c", nullable = true, length = 255)
    public String getFileNameC() {
        return fileNameC;
    }

    public void setFileNameC(String fileNameC) {
        this.fileNameC = fileNameC;
    }

    @Basic
    @Column(name = "file_path_c", nullable = true, length = 255)
    public String getFilePathC() {
        return filePathC;
    }

    public void setFilePathC(String filePathC) {
        this.filePathC = filePathC;
    }

    @Basic
    @Column(name = "size_in_bytes_c", nullable = true, length = 255)
    public String getSizeInBytesC() {
        return sizeInBytesC;
    }

    public void setSizeInBytesC(String sizeInBytesC) {
        this.sizeInBytesC = sizeInBytesC;
    }

    @Basic
    @Column(name = "is_ciscp", nullable = true)
    public Byte getIsCiscp() {
        return isCiscp;
    }

    public void setIsCiscp(Byte isCiscp) {
        this.isCiscp = isCiscp;
    }

    @Basic
    @Column(name = "is_mifr", nullable = true)
    public Byte getIsMifr() {
        return isMifr;
    }

    public void setIsMifr(Byte isMifr) {
        this.isMifr = isMifr;
    }

    @Basic
    @Column(name = "size_in_bytes", nullable = true, length = 255)
    public String getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(String sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    @Basic
    @Column(name = "file_name", nullable = true, length = 4000)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyboxFiles that = (CyboxFiles) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(fileExtension, that.fileExtension) &&
                Objects.equals(fileNameCondition, that.fileNameCondition) &&
                Objects.equals(filePath, that.filePath) &&
                Objects.equals(filePathCondition, that.filePathCondition) &&
                Objects.equals(sizeInBytesCondition, that.sizeInBytesCondition) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(legacyFileType, that.legacyFileType) &&
                Objects.equals(legacyRegistryEdits, that.legacyRegistryEdits) &&
                Objects.equals(legacyAvSignatureMcafee, that.legacyAvSignatureMcafee) &&
                Objects.equals(legacyAvSignatureMicrosoft, that.legacyAvSignatureMicrosoft) &&
                Objects.equals(legacyAvSignatureSymantec, that.legacyAvSignatureSymantec) &&
                Objects.equals(legacyAvSignatureTrendmicro, that.legacyAvSignatureTrendmicro) &&
                Objects.equals(legacyAvSignatureKaspersky, that.legacyAvSignatureKaspersky) &&
                Objects.equals(legacyCompiledAt, that.legacyCompiledAt) &&
                Objects.equals(legacyCompilerType, that.legacyCompilerType) &&
                Objects.equals(legacyCve, that.legacyCve) &&
                Objects.equals(legacyKeywords, that.legacyKeywords) &&
                Objects.equals(legacyMutex, that.legacyMutex) &&
                Objects.equals(legacyPacker, that.legacyPacker) &&
                Objects.equals(legacyXorKey, that.legacyXorKey) &&
                Objects.equals(legacyMotifName, that.legacyMotifName) &&
                Objects.equals(legacyMotifSize, that.legacyMotifSize) &&
                Objects.equals(legacyCompositeHash, that.legacyCompositeHash) &&
                Objects.equals(legacyCommandLine, that.legacyCommandLine) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(gfiIdOld, that.gfiIdOld) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(fileNameC, that.fileNameC) &&
                Objects.equals(filePathC, that.filePathC) &&
                Objects.equals(sizeInBytesC, that.sizeInBytesC) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(sizeInBytes, that.sizeInBytes) &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, cyboxHash, cyboxObjectId, fileExtension, fileNameCondition, filePath, filePathCondition, sizeInBytesCondition, updatedAt, guid, legacyFileType, legacyRegistryEdits, legacyAvSignatureMcafee, legacyAvSignatureMicrosoft, legacyAvSignatureSymantec, legacyAvSignatureTrendmicro, legacyAvSignatureKaspersky, legacyCompiledAt, legacyCompilerType, legacyCve, legacyKeywords, legacyMutex, legacyPacker, legacyXorKey, legacyMotifName, legacyMotifSize, legacyCompositeHash, legacyCommandLine, portionMarking, gfiIdOld, readOnly, fileNameC, filePathC, sizeInBytesC, isCiscp, isMifr, sizeInBytes, fileName, feeds);
    }
}
