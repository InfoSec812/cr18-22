package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stix_indicators", schema = "example_database", catalog = "")
public class StixIndicators {
    private int id;
    private String compositeOperator;
    private Timestamp createdAt;
    private String description;
    private String indicatorType;
    private String indicatorTypeVocabName;
    private String indicatorTypeVocabRef;
    private Byte isComposite;
    private Byte isNegated;
    private Byte isImported;
    private Byte isReference;
    private Integer oldParentId;
    private Integer respEntityStixIdentId;
    private String stixId;
    private String dmsLabel;
    private Timestamp stixTimestamp;
    private String title;
    private Timestamp updatedAt;
    private String downgradeRequestId;
    private String createdByUserGuid;
    private String updatedByUserGuid;
    private String createdByOrganizationGuid;
    private String updatedByOrganizationGuid;
    private String guid;
    private String legacyColor;
    private String legacyCategory;
    private String receivedFromSystemGuid;
    private String reference;
    private Byte publicRelease;
    private Integer oldAcsSetId;
    private String alternativeId;
    private Byte fromWeatherMap;
    private String portionMarking;
    private Byte readOnly;
    private String titleC;
    private String descriptionC;
    private String indicatorTypeC;
    private String dmsLabelC;
    private String downgradeRequestIdC;
    private String referenceC;
    private String alternativeIdC;
    private String timelines;
    private String sourceOfReport;
    private String targetOfAttack;
    private String targetScope;
    private String actorAttribution;
    private String actorType;
    private String modusOperandi;
    private Byte isAis;
    private String observableType;
    private String observableValue;
    private String threatActorId;
    private String threatActorTitle;
    private Timestamp startTime;
    private String startTimePrecision;
    private Timestamp endTime;
    private String endTimePrecision;
    private Byte isCiscp;
    private Byte isMifr;
    private String feeds;
    private String parentId;
    private String acsSetId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "composite_operator", nullable = true, length = 255)
    public String getCompositeOperator() {
        return compositeOperator;
    }

    public void setCompositeOperator(String compositeOperator) {
        this.compositeOperator = compositeOperator;
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
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "indicator_type", nullable = true, length = 255)
    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    @Basic
    @Column(name = "indicator_type_vocab_name", nullable = true, length = 255)
    public String getIndicatorTypeVocabName() {
        return indicatorTypeVocabName;
    }

    public void setIndicatorTypeVocabName(String indicatorTypeVocabName) {
        this.indicatorTypeVocabName = indicatorTypeVocabName;
    }

    @Basic
    @Column(name = "indicator_type_vocab_ref", nullable = true, length = 255)
    public String getIndicatorTypeVocabRef() {
        return indicatorTypeVocabRef;
    }

    public void setIndicatorTypeVocabRef(String indicatorTypeVocabRef) {
        this.indicatorTypeVocabRef = indicatorTypeVocabRef;
    }

    @Basic
    @Column(name = "is_composite", nullable = true)
    public Byte getIsComposite() {
        return isComposite;
    }

    public void setIsComposite(Byte isComposite) {
        this.isComposite = isComposite;
    }

    @Basic
    @Column(name = "is_negated", nullable = true)
    public Byte getIsNegated() {
        return isNegated;
    }

    public void setIsNegated(Byte isNegated) {
        this.isNegated = isNegated;
    }

    @Basic
    @Column(name = "is_imported", nullable = true)
    public Byte getIsImported() {
        return isImported;
    }

    public void setIsImported(Byte isImported) {
        this.isImported = isImported;
    }

    @Basic
    @Column(name = "is_reference", nullable = true)
    public Byte getIsReference() {
        return isReference;
    }

    public void setIsReference(Byte isReference) {
        this.isReference = isReference;
    }

    @Basic
    @Column(name = "old_parent_id", nullable = true)
    public Integer getOldParentId() {
        return oldParentId;
    }

    public void setOldParentId(Integer oldParentId) {
        this.oldParentId = oldParentId;
    }

    @Basic
    @Column(name = "resp_entity_stix_ident_id", nullable = true)
    public Integer getRespEntityStixIdentId() {
        return respEntityStixIdentId;
    }

    public void setRespEntityStixIdentId(Integer respEntityStixIdentId) {
        this.respEntityStixIdentId = respEntityStixIdentId;
    }

    @Basic
    @Column(name = "stix_id", nullable = true, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
    }

    @Basic
    @Column(name = "dms_label", nullable = true, length = 255)
    public String getDmsLabel() {
        return dmsLabel;
    }

    public void setDmsLabel(String dmsLabel) {
        this.dmsLabel = dmsLabel;
    }

    @Basic
    @Column(name = "stix_timestamp", nullable = true)
    public Timestamp getStixTimestamp() {
        return stixTimestamp;
    }

    public void setStixTimestamp(Timestamp stixTimestamp) {
        this.stixTimestamp = stixTimestamp;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "downgrade_request_id", nullable = true, length = 255)
    public String getDowngradeRequestId() {
        return downgradeRequestId;
    }

    public void setDowngradeRequestId(String downgradeRequestId) {
        this.downgradeRequestId = downgradeRequestId;
    }

    @Basic
    @Column(name = "created_by_user_guid", nullable = true, length = 255)
    public String getCreatedByUserGuid() {
        return createdByUserGuid;
    }

    public void setCreatedByUserGuid(String createdByUserGuid) {
        this.createdByUserGuid = createdByUserGuid;
    }

    @Basic
    @Column(name = "updated_by_user_guid", nullable = true, length = 255)
    public String getUpdatedByUserGuid() {
        return updatedByUserGuid;
    }

    public void setUpdatedByUserGuid(String updatedByUserGuid) {
        this.updatedByUserGuid = updatedByUserGuid;
    }

    @Basic
    @Column(name = "created_by_organization_guid", nullable = true, length = 255)
    public String getCreatedByOrganizationGuid() {
        return createdByOrganizationGuid;
    }

    public void setCreatedByOrganizationGuid(String createdByOrganizationGuid) {
        this.createdByOrganizationGuid = createdByOrganizationGuid;
    }

    @Basic
    @Column(name = "updated_by_organization_guid", nullable = true, length = 255)
    public String getUpdatedByOrganizationGuid() {
        return updatedByOrganizationGuid;
    }

    public void setUpdatedByOrganizationGuid(String updatedByOrganizationGuid) {
        this.updatedByOrganizationGuid = updatedByOrganizationGuid;
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
    @Column(name = "legacy_color", nullable = true, length = 255)
    public String getLegacyColor() {
        return legacyColor;
    }

    public void setLegacyColor(String legacyColor) {
        this.legacyColor = legacyColor;
    }

    @Basic
    @Column(name = "legacy_category", nullable = true, length = 255)
    public String getLegacyCategory() {
        return legacyCategory;
    }

    public void setLegacyCategory(String legacyCategory) {
        this.legacyCategory = legacyCategory;
    }

    @Basic
    @Column(name = "received_from_system_guid", nullable = true, length = 255)
    public String getReceivedFromSystemGuid() {
        return receivedFromSystemGuid;
    }

    public void setReceivedFromSystemGuid(String receivedFromSystemGuid) {
        this.receivedFromSystemGuid = receivedFromSystemGuid;
    }

    @Basic
    @Column(name = "reference", nullable = true, length = 255)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "public_release", nullable = true)
    public Byte getPublicRelease() {
        return publicRelease;
    }

    public void setPublicRelease(Byte publicRelease) {
        this.publicRelease = publicRelease;
    }

    @Basic
    @Column(name = "old_acs_set_id", nullable = true)
    public Integer getOldAcsSetId() {
        return oldAcsSetId;
    }

    public void setOldAcsSetId(Integer oldAcsSetId) {
        this.oldAcsSetId = oldAcsSetId;
    }

    @Basic
    @Column(name = "alternative_id", nullable = true, length = 255)
    public String getAlternativeId() {
        return alternativeId;
    }

    public void setAlternativeId(String alternativeId) {
        this.alternativeId = alternativeId;
    }

    @Basic
    @Column(name = "from_weather_map", nullable = true)
    public Byte getFromWeatherMap() {
        return fromWeatherMap;
    }

    public void setFromWeatherMap(Byte fromWeatherMap) {
        this.fromWeatherMap = fromWeatherMap;
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
    @Column(name = "read_only", nullable = true)
    public Byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Byte readOnly) {
        this.readOnly = readOnly;
    }

    @Basic
    @Column(name = "title_c", nullable = true, length = 255)
    public String getTitleC() {
        return titleC;
    }

    public void setTitleC(String titleC) {
        this.titleC = titleC;
    }

    @Basic
    @Column(name = "description_c", nullable = true, length = 255)
    public String getDescriptionC() {
        return descriptionC;
    }

    public void setDescriptionC(String descriptionC) {
        this.descriptionC = descriptionC;
    }

    @Basic
    @Column(name = "indicator_type_c", nullable = true, length = 255)
    public String getIndicatorTypeC() {
        return indicatorTypeC;
    }

    public void setIndicatorTypeC(String indicatorTypeC) {
        this.indicatorTypeC = indicatorTypeC;
    }

    @Basic
    @Column(name = "dms_label_c", nullable = true, length = 255)
    public String getDmsLabelC() {
        return dmsLabelC;
    }

    public void setDmsLabelC(String dmsLabelC) {
        this.dmsLabelC = dmsLabelC;
    }

    @Basic
    @Column(name = "downgrade_request_id_c", nullable = true, length = 255)
    public String getDowngradeRequestIdC() {
        return downgradeRequestIdC;
    }

    public void setDowngradeRequestIdC(String downgradeRequestIdC) {
        this.downgradeRequestIdC = downgradeRequestIdC;
    }

    @Basic
    @Column(name = "reference_c", nullable = true, length = 255)
    public String getReferenceC() {
        return referenceC;
    }

    public void setReferenceC(String referenceC) {
        this.referenceC = referenceC;
    }

    @Basic
    @Column(name = "alternative_id_c", nullable = true, length = 255)
    public String getAlternativeIdC() {
        return alternativeIdC;
    }

    public void setAlternativeIdC(String alternativeIdC) {
        this.alternativeIdC = alternativeIdC;
    }

    @Basic
    @Column(name = "timelines", nullable = true, length = 255)
    public String getTimelines() {
        return timelines;
    }

    public void setTimelines(String timelines) {
        this.timelines = timelines;
    }

    @Basic
    @Column(name = "source_of_report", nullable = true, length = 255)
    public String getSourceOfReport() {
        return sourceOfReport;
    }

    public void setSourceOfReport(String sourceOfReport) {
        this.sourceOfReport = sourceOfReport;
    }

    @Basic
    @Column(name = "target_of_attack", nullable = true, length = 255)
    public String getTargetOfAttack() {
        return targetOfAttack;
    }

    public void setTargetOfAttack(String targetOfAttack) {
        this.targetOfAttack = targetOfAttack;
    }

    @Basic
    @Column(name = "target_scope", nullable = true, length = 255)
    public String getTargetScope() {
        return targetScope;
    }

    public void setTargetScope(String targetScope) {
        this.targetScope = targetScope;
    }

    @Basic
    @Column(name = "actor_attribution", nullable = true, length = 255)
    public String getActorAttribution() {
        return actorAttribution;
    }

    public void setActorAttribution(String actorAttribution) {
        this.actorAttribution = actorAttribution;
    }

    @Basic
    @Column(name = "actor_type", nullable = true, length = 255)
    public String getActorType() {
        return actorType;
    }

    public void setActorType(String actorType) {
        this.actorType = actorType;
    }

    @Basic
    @Column(name = "modus_operandi", nullable = true, length = 255)
    public String getModusOperandi() {
        return modusOperandi;
    }

    public void setModusOperandi(String modusOperandi) {
        this.modusOperandi = modusOperandi;
    }

    @Basic
    @Column(name = "is_ais", nullable = true)
    public Byte getIsAis() {
        return isAis;
    }

    public void setIsAis(Byte isAis) {
        this.isAis = isAis;
    }

    @Basic
    @Column(name = "observable_type", nullable = true, length = 255)
    public String getObservableType() {
        return observableType;
    }

    public void setObservableType(String observableType) {
        this.observableType = observableType;
    }

    @Basic
    @Column(name = "observable_value", nullable = true, length = -1)
    public String getObservableValue() {
        return observableValue;
    }

    public void setObservableValue(String observableValue) {
        this.observableValue = observableValue;
    }

    @Basic
    @Column(name = "threat_actor_id", nullable = true, length = -1)
    public String getThreatActorId() {
        return threatActorId;
    }

    public void setThreatActorId(String threatActorId) {
        this.threatActorId = threatActorId;
    }

    @Basic
    @Column(name = "threat_actor_title", nullable = true, length = -1)
    public String getThreatActorTitle() {
        return threatActorTitle;
    }

    public void setThreatActorTitle(String threatActorTitle) {
        this.threatActorTitle = threatActorTitle;
    }

    @Basic
    @Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "start_time_precision", nullable = true, length = 255)
    public String getStartTimePrecision() {
        return startTimePrecision;
    }

    public void setStartTimePrecision(String startTimePrecision) {
        this.startTimePrecision = startTimePrecision;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "end_time_precision", nullable = true, length = 255)
    public String getEndTimePrecision() {
        return endTimePrecision;
    }

    public void setEndTimePrecision(String endTimePrecision) {
        this.endTimePrecision = endTimePrecision;
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
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 255)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "acs_set_id", nullable = true, length = 255)
    public String getAcsSetId() {
        return acsSetId;
    }

    public void setAcsSetId(String acsSetId) {
        this.acsSetId = acsSetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StixIndicators that = (StixIndicators) o;
        return id == that.id &&
                Objects.equals(compositeOperator, that.compositeOperator) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(description, that.description) &&
                Objects.equals(indicatorType, that.indicatorType) &&
                Objects.equals(indicatorTypeVocabName, that.indicatorTypeVocabName) &&
                Objects.equals(indicatorTypeVocabRef, that.indicatorTypeVocabRef) &&
                Objects.equals(isComposite, that.isComposite) &&
                Objects.equals(isNegated, that.isNegated) &&
                Objects.equals(isImported, that.isImported) &&
                Objects.equals(isReference, that.isReference) &&
                Objects.equals(oldParentId, that.oldParentId) &&
                Objects.equals(respEntityStixIdentId, that.respEntityStixIdentId) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(dmsLabel, that.dmsLabel) &&
                Objects.equals(stixTimestamp, that.stixTimestamp) &&
                Objects.equals(title, that.title) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(downgradeRequestId, that.downgradeRequestId) &&
                Objects.equals(createdByUserGuid, that.createdByUserGuid) &&
                Objects.equals(updatedByUserGuid, that.updatedByUserGuid) &&
                Objects.equals(createdByOrganizationGuid, that.createdByOrganizationGuid) &&
                Objects.equals(updatedByOrganizationGuid, that.updatedByOrganizationGuid) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(legacyColor, that.legacyColor) &&
                Objects.equals(legacyCategory, that.legacyCategory) &&
                Objects.equals(receivedFromSystemGuid, that.receivedFromSystemGuid) &&
                Objects.equals(reference, that.reference) &&
                Objects.equals(publicRelease, that.publicRelease) &&
                Objects.equals(oldAcsSetId, that.oldAcsSetId) &&
                Objects.equals(alternativeId, that.alternativeId) &&
                Objects.equals(fromWeatherMap, that.fromWeatherMap) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(titleC, that.titleC) &&
                Objects.equals(descriptionC, that.descriptionC) &&
                Objects.equals(indicatorTypeC, that.indicatorTypeC) &&
                Objects.equals(dmsLabelC, that.dmsLabelC) &&
                Objects.equals(downgradeRequestIdC, that.downgradeRequestIdC) &&
                Objects.equals(referenceC, that.referenceC) &&
                Objects.equals(alternativeIdC, that.alternativeIdC) &&
                Objects.equals(timelines, that.timelines) &&
                Objects.equals(sourceOfReport, that.sourceOfReport) &&
                Objects.equals(targetOfAttack, that.targetOfAttack) &&
                Objects.equals(targetScope, that.targetScope) &&
                Objects.equals(actorAttribution, that.actorAttribution) &&
                Objects.equals(actorType, that.actorType) &&
                Objects.equals(modusOperandi, that.modusOperandi) &&
                Objects.equals(isAis, that.isAis) &&
                Objects.equals(observableType, that.observableType) &&
                Objects.equals(observableValue, that.observableValue) &&
                Objects.equals(threatActorId, that.threatActorId) &&
                Objects.equals(threatActorTitle, that.threatActorTitle) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(startTimePrecision, that.startTimePrecision) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(endTimePrecision, that.endTimePrecision) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(acsSetId, that.acsSetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, compositeOperator, createdAt, description, indicatorType, indicatorTypeVocabName, indicatorTypeVocabRef, isComposite, isNegated, isImported, isReference, oldParentId, respEntityStixIdentId, stixId, dmsLabel, stixTimestamp, title, updatedAt, downgradeRequestId, createdByUserGuid, updatedByUserGuid, createdByOrganizationGuid, updatedByOrganizationGuid, guid, legacyColor, legacyCategory, receivedFromSystemGuid, reference, publicRelease, oldAcsSetId, alternativeId, fromWeatherMap, portionMarking, readOnly, titleC, descriptionC, indicatorTypeC, dmsLabelC, downgradeRequestIdC, referenceC, alternativeIdC, timelines, sourceOfReport, targetOfAttack, targetScope, actorAttribution, actorType, modusOperandi, isAis, observableType, observableValue, threatActorId, threatActorTitle, startTime, startTimePrecision, endTime, endTimePrecision, isCiscp, isMifr, feeds, parentId, acsSetId);
    }
}
