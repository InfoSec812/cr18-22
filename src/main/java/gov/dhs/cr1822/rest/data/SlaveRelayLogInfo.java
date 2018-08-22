package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "slave_relay_log_info", schema = "mysql", catalog = "")
public class SlaveRelayLogInfo {
    private int numberOfLines;
    private String relayLogName;
    private long relayLogPos;
    private String masterLogName;
    private long masterLogPos;
    private int sqlDelay;
    private int numberOfWorkers;
    private int id;
    private String channelName;

    @Basic
    @Column(name = "Number_of_lines", nullable = false)
    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    @Basic
    @Column(name = "Relay_log_name", nullable = false, length = -1)
    public String getRelayLogName() {
        return relayLogName;
    }

    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    @Basic
    @Column(name = "Relay_log_pos", nullable = false)
    public long getRelayLogPos() {
        return relayLogPos;
    }

    public void setRelayLogPos(long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    @Basic
    @Column(name = "Master_log_name", nullable = false, length = -1)
    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    @Basic
    @Column(name = "Master_log_pos", nullable = false)
    public long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    @Basic
    @Column(name = "Sql_delay", nullable = false)
    public int getSqlDelay() {
        return sqlDelay;
    }

    public void setSqlDelay(int sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    @Basic
    @Column(name = "Number_of_workers", nullable = false)
    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    @Basic
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "Channel_name", nullable = false, length = 64)
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlaveRelayLogInfo that = (SlaveRelayLogInfo) o;
        return numberOfLines == that.numberOfLines &&
                relayLogPos == that.relayLogPos &&
                masterLogPos == that.masterLogPos &&
                sqlDelay == that.sqlDelay &&
                numberOfWorkers == that.numberOfWorkers &&
                id == that.id &&
                Objects.equals(relayLogName, that.relayLogName) &&
                Objects.equals(masterLogName, that.masterLogName) &&
                Objects.equals(channelName, that.channelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLines, relayLogName, relayLogPos, masterLogName, masterLogPos, sqlDelay, numberOfWorkers, id, channelName);
    }
}
