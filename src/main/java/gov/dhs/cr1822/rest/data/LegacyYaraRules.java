package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "legacy_yara_rules", schema = "example_database", catalog = "")
public class LegacyYaraRules {
    private int id;
    private String name;
    private Integer stringLocation;
    private String string;
    private String rule;
    private String indicatorGuid;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "string_location", nullable = true)
    public Integer getStringLocation() {
        return stringLocation;
    }

    public void setStringLocation(Integer stringLocation) {
        this.stringLocation = stringLocation;
    }

    @Basic
    @Column(name = "string", nullable = true, length = 255)
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Basic
    @Column(name = "rule", nullable = true, length = -1)
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Basic
    @Column(name = "indicator_guid", nullable = true, length = 255)
    public String getIndicatorGuid() {
        return indicatorGuid;
    }

    public void setIndicatorGuid(String indicatorGuid) {
        this.indicatorGuid = indicatorGuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegacyYaraRules that = (LegacyYaraRules) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(stringLocation, that.stringLocation) &&
                Objects.equals(string, that.string) &&
                Objects.equals(rule, that.rule) &&
                Objects.equals(indicatorGuid, that.indicatorGuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stringLocation, string, rule, indicatorGuid);
    }
}
