package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "INNODB_TRX", schema = "information_schema", catalog = "")
public class InnodbTrx {
    private String trxId;
    private String trxState;
    private Timestamp trxStarted;
    private String trxRequestedLockId;
    private Timestamp trxWaitStarted;
    private long trxWeight;
    private long trxMysqlThreadId;
    private String trxQuery;
    private String trxOperationState;
    private long trxTablesInUse;
    private long trxTablesLocked;
    private long trxLockStructs;
    private long trxLockMemoryBytes;
    private long trxRowsLocked;
    private long trxRowsModified;
    private long trxConcurrencyTickets;
    private String trxIsolationLevel;
    private int trxUniqueChecks;
    private int trxForeignKeyChecks;
    private String trxLastForeignKeyError;
    private int trxAdaptiveHashLatched;
    private long trxAdaptiveHashTimeout;
    private int trxIsReadOnly;
    private int trxAutocommitNonLocking;

    @Basic
    @Column(name = "trx_id", nullable = false, length = 18)
    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    @Basic
    @Column(name = "trx_state", nullable = false, length = 13)
    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    @Basic
    @Column(name = "trx_started", nullable = false)
    public Timestamp getTrxStarted() {
        return trxStarted;
    }

    public void setTrxStarted(Timestamp trxStarted) {
        this.trxStarted = trxStarted;
    }

    @Basic
    @Column(name = "trx_requested_lock_id", nullable = true, length = 81)
    public String getTrxRequestedLockId() {
        return trxRequestedLockId;
    }

    public void setTrxRequestedLockId(String trxRequestedLockId) {
        this.trxRequestedLockId = trxRequestedLockId;
    }

    @Basic
    @Column(name = "trx_wait_started", nullable = true)
    public Timestamp getTrxWaitStarted() {
        return trxWaitStarted;
    }

    public void setTrxWaitStarted(Timestamp trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    @Basic
    @Column(name = "trx_weight", nullable = false)
    public long getTrxWeight() {
        return trxWeight;
    }

    public void setTrxWeight(long trxWeight) {
        this.trxWeight = trxWeight;
    }

    @Basic
    @Column(name = "trx_mysql_thread_id", nullable = false)
    public long getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    public void setTrxMysqlThreadId(long trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    @Basic
    @Column(name = "trx_query", nullable = true, length = 1024)
    public String getTrxQuery() {
        return trxQuery;
    }

    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    @Basic
    @Column(name = "trx_operation_state", nullable = true, length = 64)
    public String getTrxOperationState() {
        return trxOperationState;
    }

    public void setTrxOperationState(String trxOperationState) {
        this.trxOperationState = trxOperationState;
    }

    @Basic
    @Column(name = "trx_tables_in_use", nullable = false)
    public long getTrxTablesInUse() {
        return trxTablesInUse;
    }

    public void setTrxTablesInUse(long trxTablesInUse) {
        this.trxTablesInUse = trxTablesInUse;
    }

    @Basic
    @Column(name = "trx_tables_locked", nullable = false)
    public long getTrxTablesLocked() {
        return trxTablesLocked;
    }

    public void setTrxTablesLocked(long trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    @Basic
    @Column(name = "trx_lock_structs", nullable = false)
    public long getTrxLockStructs() {
        return trxLockStructs;
    }

    public void setTrxLockStructs(long trxLockStructs) {
        this.trxLockStructs = trxLockStructs;
    }

    @Basic
    @Column(name = "trx_lock_memory_bytes", nullable = false)
    public long getTrxLockMemoryBytes() {
        return trxLockMemoryBytes;
    }

    public void setTrxLockMemoryBytes(long trxLockMemoryBytes) {
        this.trxLockMemoryBytes = trxLockMemoryBytes;
    }

    @Basic
    @Column(name = "trx_rows_locked", nullable = false)
    public long getTrxRowsLocked() {
        return trxRowsLocked;
    }

    public void setTrxRowsLocked(long trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    @Basic
    @Column(name = "trx_rows_modified", nullable = false)
    public long getTrxRowsModified() {
        return trxRowsModified;
    }

    public void setTrxRowsModified(long trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    @Basic
    @Column(name = "trx_concurrency_tickets", nullable = false)
    public long getTrxConcurrencyTickets() {
        return trxConcurrencyTickets;
    }

    public void setTrxConcurrencyTickets(long trxConcurrencyTickets) {
        this.trxConcurrencyTickets = trxConcurrencyTickets;
    }

    @Basic
    @Column(name = "trx_isolation_level", nullable = false, length = 16)
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    @Basic
    @Column(name = "trx_unique_checks", nullable = false)
    public int getTrxUniqueChecks() {
        return trxUniqueChecks;
    }

    public void setTrxUniqueChecks(int trxUniqueChecks) {
        this.trxUniqueChecks = trxUniqueChecks;
    }

    @Basic
    @Column(name = "trx_foreign_key_checks", nullable = false)
    public int getTrxForeignKeyChecks() {
        return trxForeignKeyChecks;
    }

    public void setTrxForeignKeyChecks(int trxForeignKeyChecks) {
        this.trxForeignKeyChecks = trxForeignKeyChecks;
    }

    @Basic
    @Column(name = "trx_last_foreign_key_error", nullable = true, length = 256)
    public String getTrxLastForeignKeyError() {
        return trxLastForeignKeyError;
    }

    public void setTrxLastForeignKeyError(String trxLastForeignKeyError) {
        this.trxLastForeignKeyError = trxLastForeignKeyError;
    }

    @Basic
    @Column(name = "trx_adaptive_hash_latched", nullable = false)
    public int getTrxAdaptiveHashLatched() {
        return trxAdaptiveHashLatched;
    }

    public void setTrxAdaptiveHashLatched(int trxAdaptiveHashLatched) {
        this.trxAdaptiveHashLatched = trxAdaptiveHashLatched;
    }

    @Basic
    @Column(name = "trx_adaptive_hash_timeout", nullable = false)
    public long getTrxAdaptiveHashTimeout() {
        return trxAdaptiveHashTimeout;
    }

    public void setTrxAdaptiveHashTimeout(long trxAdaptiveHashTimeout) {
        this.trxAdaptiveHashTimeout = trxAdaptiveHashTimeout;
    }

    @Basic
    @Column(name = "trx_is_read_only", nullable = false)
    public int getTrxIsReadOnly() {
        return trxIsReadOnly;
    }

    public void setTrxIsReadOnly(int trxIsReadOnly) {
        this.trxIsReadOnly = trxIsReadOnly;
    }

    @Basic
    @Column(name = "trx_autocommit_non_locking", nullable = false)
    public int getTrxAutocommitNonLocking() {
        return trxAutocommitNonLocking;
    }

    public void setTrxAutocommitNonLocking(int trxAutocommitNonLocking) {
        this.trxAutocommitNonLocking = trxAutocommitNonLocking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbTrx innodbTrx = (InnodbTrx) o;
        return trxWeight == innodbTrx.trxWeight &&
                trxMysqlThreadId == innodbTrx.trxMysqlThreadId &&
                trxTablesInUse == innodbTrx.trxTablesInUse &&
                trxTablesLocked == innodbTrx.trxTablesLocked &&
                trxLockStructs == innodbTrx.trxLockStructs &&
                trxLockMemoryBytes == innodbTrx.trxLockMemoryBytes &&
                trxRowsLocked == innodbTrx.trxRowsLocked &&
                trxRowsModified == innodbTrx.trxRowsModified &&
                trxConcurrencyTickets == innodbTrx.trxConcurrencyTickets &&
                trxUniqueChecks == innodbTrx.trxUniqueChecks &&
                trxForeignKeyChecks == innodbTrx.trxForeignKeyChecks &&
                trxAdaptiveHashLatched == innodbTrx.trxAdaptiveHashLatched &&
                trxAdaptiveHashTimeout == innodbTrx.trxAdaptiveHashTimeout &&
                trxIsReadOnly == innodbTrx.trxIsReadOnly &&
                trxAutocommitNonLocking == innodbTrx.trxAutocommitNonLocking &&
                Objects.equals(trxId, innodbTrx.trxId) &&
                Objects.equals(trxState, innodbTrx.trxState) &&
                Objects.equals(trxStarted, innodbTrx.trxStarted) &&
                Objects.equals(trxRequestedLockId, innodbTrx.trxRequestedLockId) &&
                Objects.equals(trxWaitStarted, innodbTrx.trxWaitStarted) &&
                Objects.equals(trxQuery, innodbTrx.trxQuery) &&
                Objects.equals(trxOperationState, innodbTrx.trxOperationState) &&
                Objects.equals(trxIsolationLevel, innodbTrx.trxIsolationLevel) &&
                Objects.equals(trxLastForeignKeyError, innodbTrx.trxLastForeignKeyError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trxId, trxState, trxStarted, trxRequestedLockId, trxWaitStarted, trxWeight, trxMysqlThreadId, trxQuery, trxOperationState, trxTablesInUse, trxTablesLocked, trxLockStructs, trxLockMemoryBytes, trxRowsLocked, trxRowsModified, trxConcurrencyTickets, trxIsolationLevel, trxUniqueChecks, trxForeignKeyChecks, trxLastForeignKeyError, trxAdaptiveHashLatched, trxAdaptiveHashTimeout, trxIsReadOnly, trxAutocommitNonLocking);
    }
}
