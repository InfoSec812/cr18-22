package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigInteger;
import java.util.Objects;

@Entity
public class Profiling {
    private int queryId;
    private int seq;
    private String state;
    private BigInteger duration;
    private BigInteger cpuUser;
    private BigInteger cpuSystem;
    private Integer contextVoluntary;
    private Integer contextInvoluntary;
    private Integer blockOpsIn;
    private Integer blockOpsOut;
    private Integer messagesSent;
    private Integer messagesReceived;
    private Integer pageFaultsMajor;
    private Integer pageFaultsMinor;
    private Integer swaps;
    private String sourceFunction;
    private String sourceFile;
    private Integer sourceLine;

    @Basic
    @Column(name = "QUERY_ID", nullable = false)
    public int getQueryId() {
        return queryId;
    }

    public void setQueryId(int queryId) {
        this.queryId = queryId;
    }

    @Basic
    @Column(name = "SEQ", nullable = false)
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    @Basic
    @Column(name = "STATE", nullable = false, length = 30)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "DURATION", nullable = false, precision = 0)
    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "CPU_USER", nullable = true, precision = 0)
    public BigInteger getCpuUser() {
        return cpuUser;
    }

    public void setCpuUser(BigInteger cpuUser) {
        this.cpuUser = cpuUser;
    }

    @Basic
    @Column(name = "CPU_SYSTEM", nullable = true, precision = 0)
    public BigInteger getCpuSystem() {
        return cpuSystem;
    }

    public void setCpuSystem(BigInteger cpuSystem) {
        this.cpuSystem = cpuSystem;
    }

    @Basic
    @Column(name = "CONTEXT_VOLUNTARY", nullable = true)
    public Integer getContextVoluntary() {
        return contextVoluntary;
    }

    public void setContextVoluntary(Integer contextVoluntary) {
        this.contextVoluntary = contextVoluntary;
    }

    @Basic
    @Column(name = "CONTEXT_INVOLUNTARY", nullable = true)
    public Integer getContextInvoluntary() {
        return contextInvoluntary;
    }

    public void setContextInvoluntary(Integer contextInvoluntary) {
        this.contextInvoluntary = contextInvoluntary;
    }

    @Basic
    @Column(name = "BLOCK_OPS_IN", nullable = true)
    public Integer getBlockOpsIn() {
        return blockOpsIn;
    }

    public void setBlockOpsIn(Integer blockOpsIn) {
        this.blockOpsIn = blockOpsIn;
    }

    @Basic
    @Column(name = "BLOCK_OPS_OUT", nullable = true)
    public Integer getBlockOpsOut() {
        return blockOpsOut;
    }

    public void setBlockOpsOut(Integer blockOpsOut) {
        this.blockOpsOut = blockOpsOut;
    }

    @Basic
    @Column(name = "MESSAGES_SENT", nullable = true)
    public Integer getMessagesSent() {
        return messagesSent;
    }

    public void setMessagesSent(Integer messagesSent) {
        this.messagesSent = messagesSent;
    }

    @Basic
    @Column(name = "MESSAGES_RECEIVED", nullable = true)
    public Integer getMessagesReceived() {
        return messagesReceived;
    }

    public void setMessagesReceived(Integer messagesReceived) {
        this.messagesReceived = messagesReceived;
    }

    @Basic
    @Column(name = "PAGE_FAULTS_MAJOR", nullable = true)
    public Integer getPageFaultsMajor() {
        return pageFaultsMajor;
    }

    public void setPageFaultsMajor(Integer pageFaultsMajor) {
        this.pageFaultsMajor = pageFaultsMajor;
    }

    @Basic
    @Column(name = "PAGE_FAULTS_MINOR", nullable = true)
    public Integer getPageFaultsMinor() {
        return pageFaultsMinor;
    }

    public void setPageFaultsMinor(Integer pageFaultsMinor) {
        this.pageFaultsMinor = pageFaultsMinor;
    }

    @Basic
    @Column(name = "SWAPS", nullable = true)
    public Integer getSwaps() {
        return swaps;
    }

    public void setSwaps(Integer swaps) {
        this.swaps = swaps;
    }

    @Basic
    @Column(name = "SOURCE_FUNCTION", nullable = true, length = 30)
    public String getSourceFunction() {
        return sourceFunction;
    }

    public void setSourceFunction(String sourceFunction) {
        this.sourceFunction = sourceFunction;
    }

    @Basic
    @Column(name = "SOURCE_FILE", nullable = true, length = 20)
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Basic
    @Column(name = "SOURCE_LINE", nullable = true)
    public Integer getSourceLine() {
        return sourceLine;
    }

    public void setSourceLine(Integer sourceLine) {
        this.sourceLine = sourceLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profiling profiling = (Profiling) o;
        return queryId == profiling.queryId &&
                seq == profiling.seq &&
                Objects.equals(state, profiling.state) &&
                Objects.equals(duration, profiling.duration) &&
                Objects.equals(cpuUser, profiling.cpuUser) &&
                Objects.equals(cpuSystem, profiling.cpuSystem) &&
                Objects.equals(contextVoluntary, profiling.contextVoluntary) &&
                Objects.equals(contextInvoluntary, profiling.contextInvoluntary) &&
                Objects.equals(blockOpsIn, profiling.blockOpsIn) &&
                Objects.equals(blockOpsOut, profiling.blockOpsOut) &&
                Objects.equals(messagesSent, profiling.messagesSent) &&
                Objects.equals(messagesReceived, profiling.messagesReceived) &&
                Objects.equals(pageFaultsMajor, profiling.pageFaultsMajor) &&
                Objects.equals(pageFaultsMinor, profiling.pageFaultsMinor) &&
                Objects.equals(swaps, profiling.swaps) &&
                Objects.equals(sourceFunction, profiling.sourceFunction) &&
                Objects.equals(sourceFile, profiling.sourceFile) &&
                Objects.equals(sourceLine, profiling.sourceLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryId, seq, state, duration, cpuUser, cpuSystem, contextVoluntary, contextInvoluntary, blockOpsIn, blockOpsOut, messagesSent, messagesReceived, pageFaultsMajor, pageFaultsMinor, swaps, sourceFunction, sourceFile, sourceLine);
    }
}
