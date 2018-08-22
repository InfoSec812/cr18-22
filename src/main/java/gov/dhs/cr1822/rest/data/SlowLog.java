package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "slow_log", schema = "mysql", catalog = "")
public class SlowLog {
    private Timestamp startTime;
    private String userHost;
    private Time queryTime;
    private Time lockTime;
    private int rowsSent;
    private int rowsExamined;
    private String db;
    private int lastInsertId;
    private int insertId;
    private int serverId;
    private byte[] sqlText;
    private long threadId;

    @Basic
    @Column(name = "start_time", nullable = false)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
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
    @Column(name = "query_time", nullable = false)
    public Time getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Time queryTime) {
        this.queryTime = queryTime;
    }

    @Basic
    @Column(name = "lock_time", nullable = false)
    public Time getLockTime() {
        return lockTime;
    }

    public void setLockTime(Time lockTime) {
        this.lockTime = lockTime;
    }

    @Basic
    @Column(name = "rows_sent", nullable = false)
    public int getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(int rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Basic
    @Column(name = "rows_examined", nullable = false)
    public int getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(int rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Basic
    @Column(name = "db", nullable = false, length = 512)
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Basic
    @Column(name = "last_insert_id", nullable = false)
    public int getLastInsertId() {
        return lastInsertId;
    }

    public void setLastInsertId(int lastInsertId) {
        this.lastInsertId = lastInsertId;
    }

    @Basic
    @Column(name = "insert_id", nullable = false)
    public int getInsertId() {
        return insertId;
    }

    public void setInsertId(int insertId) {
        this.insertId = insertId;
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
    @Column(name = "sql_text", nullable = false)
    public byte[] getSqlText() {
        return sqlText;
    }

    public void setSqlText(byte[] sqlText) {
        this.sqlText = sqlText;
    }

    @Basic
    @Column(name = "thread_id", nullable = false)
    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlowLog slowLog = (SlowLog) o;
        return rowsSent == slowLog.rowsSent &&
                rowsExamined == slowLog.rowsExamined &&
                lastInsertId == slowLog.lastInsertId &&
                insertId == slowLog.insertId &&
                serverId == slowLog.serverId &&
                threadId == slowLog.threadId &&
                Objects.equals(startTime, slowLog.startTime) &&
                Objects.equals(userHost, slowLog.userHost) &&
                Objects.equals(queryTime, slowLog.queryTime) &&
                Objects.equals(lockTime, slowLog.lockTime) &&
                Objects.equals(db, slowLog.db) &&
                Arrays.equals(sqlText, slowLog.sqlText);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(startTime, userHost, queryTime, lockTime, rowsSent, rowsExamined, db, lastInsertId, insertId, serverId, threadId);
        result = 31 * result + Arrays.hashCode(sqlText);
        return result;
    }
}
