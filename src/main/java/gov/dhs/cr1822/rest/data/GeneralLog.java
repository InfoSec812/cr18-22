package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "general_log", schema = "mysql", catalog = "")
public class GeneralLog {
    private Timestamp eventTime;
    private String userHost;
    private long threadId;
    private int serverId;
    private String commandType;
    private byte[] argument;

    @Basic
    @Column(name = "event_time", nullable = false)
    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
    }

    @Basic
    @Column(name = "user_host", nullable = false, length = -1)
    public String getUserHost() {
        return userHost;
    }

    public void setUserHost(String userHost) {
        this.userHost = userHost;
    }

    @Basic
    @Column(name = "thread_id", nullable = false)
    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    @Basic
    @Column(name = "server_id", nullable = false)
    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    @Basic
    @Column(name = "command_type", nullable = false, length = 64)
    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    @Basic
    @Column(name = "argument", nullable = false)
    public byte[] getArgument() {
        return argument;
    }

    public void setArgument(byte[] argument) {
        this.argument = argument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralLog that = (GeneralLog) o;
        return threadId == that.threadId &&
                serverId == that.serverId &&
                Objects.equals(eventTime, that.eventTime) &&
                Objects.equals(userHost, that.userHost) &&
                Objects.equals(commandType, that.commandType) &&
                Arrays.equals(argument, that.argument);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(eventTime, userHost, threadId, serverId, commandType);
        result = 31 * result + Arrays.hashCode(argument);
        return result;
    }
}
