package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "INNODB_BUFFER_PAGE_LRU", schema = "information_schema", catalog = "")
public class InnodbBufferPageLru {
    private long poolId;
    private long lruPosition;
    private long space;
    private long pageNumber;
    private String pageType;
    private long flushType;
    private long fixCount;
    private String isHashed;
    private long newestModification;
    private long oldestModification;
    private long accessTime;
    private String tableName;
    private String indexName;
    private long numberRecords;
    private long dataSize;
    private long compressedSize;
    private String compressed;
    private String ioFix;
    private String isOld;
    private long freePageClock;

    @Basic
    @Column(name = "POOL_ID", nullable = false)
    public long getPoolId() {
        return poolId;
    }

    public void setPoolId(long poolId) {
        this.poolId = poolId;
    }

    @Basic
    @Column(name = "LRU_POSITION", nullable = false)
    public long getLruPosition() {
        return lruPosition;
    }

    public void setLruPosition(long lruPosition) {
        this.lruPosition = lruPosition;
    }

    @Basic
    @Column(name = "SPACE", nullable = false)
    public long getSpace() {
        return space;
    }

    public void setSpace(long space) {
        this.space = space;
    }

    @Basic
    @Column(name = "PAGE_NUMBER", nullable = false)
    public long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(long pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Basic
    @Column(name = "PAGE_TYPE", nullable = true, length = 64)
    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    @Basic
    @Column(name = "FLUSH_TYPE", nullable = false)
    public long getFlushType() {
        return flushType;
    }

    public void setFlushType(long flushType) {
        this.flushType = flushType;
    }

    @Basic
    @Column(name = "FIX_COUNT", nullable = false)
    public long getFixCount() {
        return fixCount;
    }

    public void setFixCount(long fixCount) {
        this.fixCount = fixCount;
    }

    @Basic
    @Column(name = "IS_HASHED", nullable = true, length = 3)
    public String getIsHashed() {
        return isHashed;
    }

    public void setIsHashed(String isHashed) {
        this.isHashed = isHashed;
    }

    @Basic
    @Column(name = "NEWEST_MODIFICATION", nullable = false)
    public long getNewestModification() {
        return newestModification;
    }

    public void setNewestModification(long newestModification) {
        this.newestModification = newestModification;
    }

    @Basic
    @Column(name = "OLDEST_MODIFICATION", nullable = false)
    public long getOldestModification() {
        return oldestModification;
    }

    public void setOldestModification(long oldestModification) {
        this.oldestModification = oldestModification;
    }

    @Basic
    @Column(name = "ACCESS_TIME", nullable = false)
    public long getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(long accessTime) {
        this.accessTime = accessTime;
    }

    @Basic
    @Column(name = "TABLE_NAME", nullable = true, length = 1024)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "INDEX_NAME", nullable = true, length = 1024)
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "NUMBER_RECORDS", nullable = false)
    public long getNumberRecords() {
        return numberRecords;
    }

    public void setNumberRecords(long numberRecords) {
        this.numberRecords = numberRecords;
    }

    @Basic
    @Column(name = "DATA_SIZE", nullable = false)
    public long getDataSize() {
        return dataSize;
    }

    public void setDataSize(long dataSize) {
        this.dataSize = dataSize;
    }

    @Basic
    @Column(name = "COMPRESSED_SIZE", nullable = false)
    public long getCompressedSize() {
        return compressedSize;
    }

    public void setCompressedSize(long compressedSize) {
        this.compressedSize = compressedSize;
    }

    @Basic
    @Column(name = "COMPRESSED", nullable = true, length = 3)
    public String getCompressed() {
        return compressed;
    }

    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }

    @Basic
    @Column(name = "IO_FIX", nullable = true, length = 64)
    public String getIoFix() {
        return ioFix;
    }

    public void setIoFix(String ioFix) {
        this.ioFix = ioFix;
    }

    @Basic
    @Column(name = "IS_OLD", nullable = true, length = 3)
    public String getIsOld() {
        return isOld;
    }

    public void setIsOld(String isOld) {
        this.isOld = isOld;
    }

    @Basic
    @Column(name = "FREE_PAGE_CLOCK", nullable = false)
    public long getFreePageClock() {
        return freePageClock;
    }

    public void setFreePageClock(long freePageClock) {
        this.freePageClock = freePageClock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnodbBufferPageLru that = (InnodbBufferPageLru) o;
        return poolId == that.poolId &&
                lruPosition == that.lruPosition &&
                space == that.space &&
                pageNumber == that.pageNumber &&
                flushType == that.flushType &&
                fixCount == that.fixCount &&
                newestModification == that.newestModification &&
                oldestModification == that.oldestModification &&
                accessTime == that.accessTime &&
                numberRecords == that.numberRecords &&
                dataSize == that.dataSize &&
                compressedSize == that.compressedSize &&
                freePageClock == that.freePageClock &&
                Objects.equals(pageType, that.pageType) &&
                Objects.equals(isHashed, that.isHashed) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(indexName, that.indexName) &&
                Objects.equals(compressed, that.compressed) &&
                Objects.equals(ioFix, that.ioFix) &&
                Objects.equals(isOld, that.isOld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, lruPosition, space, pageNumber, pageType, flushType, fixCount, isHashed, newestModification, oldestModification, accessTime, tableName, indexName, numberRecords, dataSize, compressedSize, compressed, ioFix, isOld, freePageClock);
    }
}
