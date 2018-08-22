package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_BUFFER_POOL_STATS", schema = "information_schema", catalog = "")
public class InnodbBufferPoolStats {
    private long poolId;
    private long poolSize;
    private long freeBuffers;
    private long databasePages;
    private long oldDatabasePages;
    private long modifiedDatabasePages;
    private long pendingDecompress;
    private long pendingReads;
    private long pendingFlushLru;
    private long pendingFlushList;
    private long pagesMadeYoung;
    private long pagesNotMadeYoung;
    private double pagesMadeYoungRate;
    private double pagesMadeNotYoungRate;
    private long numberPagesRead;
    private long numberPagesCreated;
    private long numberPagesWritten;
    private double pagesReadRate;
    private double pagesCreateRate;
    private double pagesWrittenRate;
    private long numberPagesGet;
    private long hitRate;
    private long youngMakePerThousandGets;
    private long notYoungMakePerThousandGets;
    private long numberPagesReadAhead;
    private long numberReadAheadEvicted;
    private double readAheadRate;
    private double readAheadEvictedRate;
    private long lruIoTotal;
    private long lruIoCurrent;
    private long uncompressTotal;
    private long uncompressCurrent;

    @Basic
    @Column(name = "POOL_ID", nullable = false)
    public long getPoolId() {
        return poolId;
    }

    public void setPoolId(long poolId) {
        this.poolId = poolId;
    }

    @Basic
    @Column(name = "POOL_SIZE", nullable = false)
    public long getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(long poolSize) {
        this.poolSize = poolSize;
    }

    @Basic
    @Column(name = "FREE_BUFFERS", nullable = false)
    public long getFreeBuffers() {
        return freeBuffers;
    }

    public void setFreeBuffers(long freeBuffers) {
        this.freeBuffers = freeBuffers;
    }

    @Basic
    @Column(name = "DATABASE_PAGES", nullable = false)
    public long getDatabasePages() {
        return databasePages;
    }

    public void setDatabasePages(long databasePages) {
        this.databasePages = databasePages;
    }

    @Basic
    @Column(name = "OLD_DATABASE_PAGES", nullable = false)
    public long getOldDatabasePages() {
        return oldDatabasePages;
    }

    public void setOldDatabasePages(long oldDatabasePages) {
        this.oldDatabasePages = oldDatabasePages;
    }

    @Basic
    @Column(name = "MODIFIED_DATABASE_PAGES", nullable = false)
    public long getModifiedDatabasePages() {
        return modifiedDatabasePages;
    }

    public void setModifiedDatabasePages(long modifiedDatabasePages) {
        this.modifiedDatabasePages = modifiedDatabasePages;
    }

    @Basic
    @Column(name = "PENDING_DECOMPRESS", nullable = false)
    public long getPendingDecompress() {
        return pendingDecompress;
    }

    public void setPendingDecompress(long pendingDecompress) {
        this.pendingDecompress = pendingDecompress;
    }

    @Basic
    @Column(name = "PENDING_READS", nullable = false)
    public long getPendingReads() {
        return pendingReads;
    }

    public void setPendingReads(long pendingReads) {
        this.pendingReads = pendingReads;
    }

    @Basic
    @Column(name = "PENDING_FLUSH_LRU", nullable = false)
    public long getPendingFlushLru() {
        return pendingFlushLru;
    }

    public void setPendingFlushLru(long pendingFlushLru) {
        this.pendingFlushLru = pendingFlushLru;
    }

    @Basic
    @Column(name = "PENDING_FLUSH_LIST", nullable = false)
    public long getPendingFlushList() {
        return pendingFlushList;
    }

    public void setPendingFlushList(long pendingFlushList) {
        this.pendingFlushList = pendingFlushList;
    }

    @Basic
    @Column(name = "PAGES_MADE_YOUNG", nullable = false)
    public long getPagesMadeYoung() {
        return pagesMadeYoung;
    }

    public void setPagesMadeYoung(long pagesMadeYoung) {
        this.pagesMadeYoung = pagesMadeYoung;
    }

    @Basic
    @Column(name = "PAGES_NOT_MADE_YOUNG", nullable = false)
    public long getPagesNotMadeYoung() {
        return pagesNotMadeYoung;
    }

    public void setPagesNotMadeYoung(long pagesNotMadeYoung) {
        this.pagesNotMadeYoung = pagesNotMadeYoung;
    }

    @Basic
    @Column(name = "PAGES_MADE_YOUNG_RATE", nullable = false, precision = 0)
    public double getPagesMadeYoungRate() {
        return pagesMadeYoungRate;
    }

    public void setPagesMadeYoungRate(double pagesMadeYoungRate) {
        this.pagesMadeYoungRate = pagesMadeYoungRate;
    }

    @Basic
    @Column(name = "PAGES_MADE_NOT_YOUNG_RATE", nullable = false, precision = 0)
    public double getPagesMadeNotYoungRate() {
        return pagesMadeNotYoungRate;
    }

    public void setPagesMadeNotYoungRate(double pagesMadeNotYoungRate) {
        this.pagesMadeNotYoungRate = pagesMadeNotYoungRate;
    }

    @Basic
    @Column(name = "NUMBER_PAGES_READ", nullable = false)
    public long getNumberPagesRead() {
        return numberPagesRead;
    }

    public void setNumberPagesRead(long numberPagesRead) {
        this.numberPagesRead = numberPagesRead;
    }

    @Basic
    @Column(name = "NUMBER_PAGES_CREATED", nullable = false)
    public long getNumberPagesCreated() {
        return numberPagesCreated;
    }

    public void setNumberPagesCreated(long numberPagesCreated) {
        this.numberPagesCreated = numberPagesCreated;
    }

    @Basic
    @Column(name = "NUMBER_PAGES_WRITTEN", nullable = false)
    public long getNumberPagesWritten() {
        return numberPagesWritten;
    }

    public void setNumberPagesWritten(long numberPagesWritten) {
        this.numberPagesWritten = numberPagesWritten;
    }

    @Basic
    @Column(name = "PAGES_READ_RATE", nullable = false, precision = 0)
    public double getPagesReadRate() {
        return pagesReadRate;
    }

    public void setPagesReadRate(double pagesReadRate) {
        this.pagesReadRate = pagesReadRate;
    }

    @Basic
    @Column(name = "PAGES_CREATE_RATE", nullable = false, precision = 0)
    public double getPagesCreateRate() {
        return pagesCreateRate;
    }

    public void setPagesCreateRate(double pagesCreateRate) {
        this.pagesCreateRate = pagesCreateRate;
    }

    @Basic
    @Column(name = "PAGES_WRITTEN_RATE", nullable = false, precision = 0)
    public double getPagesWrittenRate() {
        return pagesWrittenRate;
    }

    public void setPagesWrittenRate(double pagesWrittenRate) {
        this.pagesWrittenRate = pagesWrittenRate;
    }

    @Basic
    @Column(name = "NUMBER_PAGES_GET", nullable = false)
    public long getNumberPagesGet() {
        return numberPagesGet;
    }

    public void setNumberPagesGet(long numberPagesGet) {
        this.numberPagesGet = numberPagesGet;
    }

    @Basic
    @Column(name = "HIT_RATE", nullable = false)
    public long getHitRate() {
        return hitRate;
    }

    public void setHitRate(long hitRate) {
        this.hitRate = hitRate;
    }

    @Basic
    @Column(name = "YOUNG_MAKE_PER_THOUSAND_GETS", nullable = false)
    public long getYoungMakePerThousandGets() {
        return youngMakePerThousandGets;
    }

    public void setYoungMakePerThousandGets(long youngMakePerThousandGets) {
        this.youngMakePerThousandGets = youngMakePerThousandGets;
    }

    @Basic
    @Column(name = "NOT_YOUNG_MAKE_PER_THOUSAND_GETS", nullable = false)
    public long getNotYoungMakePerThousandGets() {
        return notYoungMakePerThousandGets;
    }

    public void setNotYoungMakePerThousandGets(long notYoungMakePerThousandGets) {
        this.notYoungMakePerThousandGets = notYoungMakePerThousandGets;
    }

    @Basic
    @Column(name = "NUMBER_PAGES_READ_AHEAD", nullable = false)
    public long getNumberPagesReadAhead() {
        return numberPagesReadAhead;
    }

    public void setNumberPagesReadAhead(long numberPagesReadAhead) {
        this.numberPagesReadAhead = numberPagesReadAhead;
    }

    @Basic
    @Column(name = "NUMBER_READ_AHEAD_EVICTED", nullable = false)
    public long getNumberReadAheadEvicted() {
        return numberReadAheadEvicted;
    }

    public void setNumberReadAheadEvicted(long numberReadAheadEvicted) {
        this.numberReadAheadEvicted = numberReadAheadEvicted;
    }

    @Basic
    @Column(name = "READ_AHEAD_RATE", nullable = false, precision = 0)
    public double getReadAheadRate() {
        return readAheadRate;
    }

    public void setReadAheadRate(double readAheadRate) {
        this.readAheadRate = readAheadRate;
    }

    @Basic
    @Column(name = "READ_AHEAD_EVICTED_RATE", nullable = false, precision = 0)
    public double getReadAheadEvictedRate() {
        return readAheadEvictedRate;
    }

    public void setReadAheadEvictedRate(double readAheadEvictedRate) {
        this.readAheadEvictedRate = readAheadEvictedRate;
    }

    @Basic
    @Column(name = "LRU_IO_TOTAL", nullable = false)
    public long getLruIoTotal() {
        return lruIoTotal;
    }

    public void setLruIoTotal(long lruIoTotal) {
        this.lruIoTotal = lruIoTotal;
    }

    @Basic
    @Column(name = "LRU_IO_CURRENT", nullable = false)
    public long getLruIoCurrent() {
        return lruIoCurrent;
    }

    public void setLruIoCurrent(long lruIoCurrent) {
        this.lruIoCurrent = lruIoCurrent;
    }

    @Basic
    @Column(name = "UNCOMPRESS_TOTAL", nullable = false)
    public long getUncompressTotal() {
        return uncompressTotal;
    }

    public void setUncompressTotal(long uncompressTotal) {
        this.uncompressTotal = uncompressTotal;
    }

    @Basic
    @Column(name = "UNCOMPRESS_CURRENT", nullable = false)
    public long getUncompressCurrent() {
        return uncompressCurrent;
    }

    public void setUncompressCurrent(long uncompressCurrent) {
        this.uncompressCurrent = uncompressCurrent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbBufferPoolStats that = (InnodbBufferPoolStats) o;
        return poolId == that.poolId &&
                poolSize == that.poolSize &&
                freeBuffers == that.freeBuffers &&
                databasePages == that.databasePages &&
                oldDatabasePages == that.oldDatabasePages &&
                modifiedDatabasePages == that.modifiedDatabasePages &&
                pendingDecompress == that.pendingDecompress &&
                pendingReads == that.pendingReads &&
                pendingFlushLru == that.pendingFlushLru &&
                pendingFlushList == that.pendingFlushList &&
                pagesMadeYoung == that.pagesMadeYoung &&
                pagesNotMadeYoung == that.pagesNotMadeYoung &&
                Double.compare(that.pagesMadeYoungRate, pagesMadeYoungRate) == 0 &&
                Double.compare(that.pagesMadeNotYoungRate, pagesMadeNotYoungRate) == 0 &&
                numberPagesRead == that.numberPagesRead &&
                numberPagesCreated == that.numberPagesCreated &&
                numberPagesWritten == that.numberPagesWritten &&
                Double.compare(that.pagesReadRate, pagesReadRate) == 0 &&
                Double.compare(that.pagesCreateRate, pagesCreateRate) == 0 &&
                Double.compare(that.pagesWrittenRate, pagesWrittenRate) == 0 &&
                numberPagesGet == that.numberPagesGet &&
                hitRate == that.hitRate &&
                youngMakePerThousandGets == that.youngMakePerThousandGets &&
                notYoungMakePerThousandGets == that.notYoungMakePerThousandGets &&
                numberPagesReadAhead == that.numberPagesReadAhead &&
                numberReadAheadEvicted == that.numberReadAheadEvicted &&
                Double.compare(that.readAheadRate, readAheadRate) == 0 &&
                Double.compare(that.readAheadEvictedRate, readAheadEvictedRate) == 0 &&
                lruIoTotal == that.lruIoTotal &&
                lruIoCurrent == that.lruIoCurrent &&
                uncompressTotal == that.uncompressTotal &&
                uncompressCurrent == that.uncompressCurrent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, poolSize, freeBuffers, databasePages, oldDatabasePages, modifiedDatabasePages, pendingDecompress, pendingReads, pendingFlushLru, pendingFlushList, pagesMadeYoung, pagesNotMadeYoung, pagesMadeYoungRate, pagesMadeNotYoungRate, numberPagesRead, numberPagesCreated, numberPagesWritten, pagesReadRate, pagesCreateRate, pagesWrittenRate, numberPagesGet, hitRate, youngMakePerThousandGets, notYoungMakePerThousandGets, numberPagesReadAhead, numberReadAheadEvicted, readAheadRate, readAheadEvictedRate, lruIoTotal, lruIoCurrent, uncompressTotal, uncompressCurrent);
    }
}
