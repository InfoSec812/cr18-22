package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "staging_weather_map_data", schema = "example_database", catalog = "")
public class StagingWeatherMapData {
    private String ipAddress;
    private String isoCountryCode;
    private String comThreatScore;
    private String govThreatScore;
    private String combinedScore;
    private String agenciesSensorsSeenOn;
    private String firstDateSeen;
    private String lastDateSeen;
    private String categoryList;

    @Basic
    @Column(name = "ip_address", nullable = true, length = 255)
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Basic
    @Column(name = "iso_country_code", nullable = true, length = 255)
    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    @Basic
    @Column(name = "com_threat_score", nullable = true, length = 255)
    public String getComThreatScore() {
        return comThreatScore;
    }

    public void setComThreatScore(String comThreatScore) {
        this.comThreatScore = comThreatScore;
    }

    @Basic
    @Column(name = "gov_threat_score", nullable = true, length = 255)
    public String getGovThreatScore() {
        return govThreatScore;
    }

    public void setGovThreatScore(String govThreatScore) {
        this.govThreatScore = govThreatScore;
    }

    @Basic
    @Column(name = "combined_score", nullable = true, length = 255)
    public String getCombinedScore() {
        return combinedScore;
    }

    public void setCombinedScore(String combinedScore) {
        this.combinedScore = combinedScore;
    }

    @Basic
    @Column(name = "agencies_sensors_seen_on", nullable = true, length = 1000)
    public String getAgenciesSensorsSeenOn() {
        return agenciesSensorsSeenOn;
    }

    public void setAgenciesSensorsSeenOn(String agenciesSensorsSeenOn) {
        this.agenciesSensorsSeenOn = agenciesSensorsSeenOn;
    }

    @Basic
    @Column(name = "first_date_seen", nullable = true, length = 255)
    public String getFirstDateSeen() {
        return firstDateSeen;
    }

    public void setFirstDateSeen(String firstDateSeen) {
        this.firstDateSeen = firstDateSeen;
    }

    @Basic
    @Column(name = "last_date_seen", nullable = true, length = 255)
    public String getLastDateSeen() {
        return lastDateSeen;
    }

    public void setLastDateSeen(String lastDateSeen) {
        this.lastDateSeen = lastDateSeen;
    }

    @Basic
    @Column(name = "category_list", nullable = true, length = 1000)
    public String getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(String categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StagingWeatherMapData that = (StagingWeatherMapData) o;
        return Objects.equals(ipAddress, that.ipAddress) &&
                Objects.equals(isoCountryCode, that.isoCountryCode) &&
                Objects.equals(comThreatScore, that.comThreatScore) &&
                Objects.equals(govThreatScore, that.govThreatScore) &&
                Objects.equals(combinedScore, that.combinedScore) &&
                Objects.equals(agenciesSensorsSeenOn, that.agenciesSensorsSeenOn) &&
                Objects.equals(firstDateSeen, that.firstDateSeen) &&
                Objects.equals(lastDateSeen, that.lastDateSeen) &&
                Objects.equals(categoryList, that.categoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, isoCountryCode, comThreatScore, govThreatScore, combinedScore, agenciesSensorsSeenOn, firstDateSeen, lastDateSeen, categoryList);
    }
}
