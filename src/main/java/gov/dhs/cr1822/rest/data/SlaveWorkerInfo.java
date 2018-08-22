package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "slave_worker_info", schema = "mysql", catalog = "")
@IdClass(SlaveWorkerInfoPK.class)
public class SlaveWorkerInfo {
    private int id;
    private String relayLogName;
    private long relayLogPos;
    private String masterLogName;
    private long masterLogPos;
    private String checkpointRelayLogName;
    private long checkpointRelayLogPos;
    private String checkpointMasterLogName;
    private long checkpointMasterLogPos;
    private int checkpointSeqno;
    private int checkpointGroupSize;
    private byte[] checkpointGroupBitmap;
    private String channelName;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "Checkpoint_relay_log_name", nullable = false, length = -1)
    public String getCheckpointRelayLogName() {
        return checkpointRelayLogName;
    }

    public void setCheckpointRelayLogName(String checkpointRelayLogName) {
        this.checkpointRelayLogName = checkpointRelayLogName;
    }

    @Basic
    @Column(name = "Checkpoint_relay_log_pos", nullable = false)
    public long getCheckpointRelayLogPos() {
        return checkpointRelayLogPos;
    }

    public void setCheckpointRelayLogPos(long checkpointRelayLogPos) {
        this.checkpointRelayLogPos = checkpointRelayLogPos;
    }

    @Basic
    @Column(name = "Checkpoint_master_log_name", nullable = false, length = -1)
    public String getCheckpointMasterLogName() {
        return checkpointMasterLogName;
    }

    public void setCheckpointMasterLogName(String checkpointMasterLogName) {
        this.checkpointMasterLogName = checkpointMasterLogName;
    }

    @Basic
    @Column(name = "Checkpoint_master_log_pos", nullable = false)
    public long getCheckpointMasterLogPos() {
        return checkpointMasterLogPos;
    }

    public void setCheckpointMasterLogPos(long checkpointMasterLogPos) {
        this.checkpointMasterLogPos = checkpointMasterLogPos;
    }

    @Basic
    @Column(name = "Checkpoint_seqno", nullable = false)
    public int getCheckpointSeqno() {
        return checkpointSeqno;
    }

    public void setCheckpointSeqno(int checkpointSeqno) {
        this.checkpointSeqno = checkpointSeqno;
    }

    @Basic
    @Column(name = "Checkpoint_group_size", nullable = false)
    public int getCheckpointGroupSize() {
        return checkpointGroupSize;
    }

    public void setCheckpointGroupSize(int checkpointGroupSize) {
        this.checkpointGroupSize = checkpointGroupSize;
    }

    @Basic
    @Column(name = "Checkpoint_group_bitmap", nullable = false)
    public byte[] getCheckpointGroupBitmap() {
        return checkpointGroupBitmap;
    }

    public void setCheckpointGroupBitmap(byte[] checkpointGroupBitmap) {
        this.checkpointGroupBitmap = checkpointGroupBitmap;
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
        SlaveWorkerInfo that = (SlaveWorkerInfo) o;
        return id == that.id &&
                relayLogPos == that.relayLogPos &&
                masterLogPos == that.masterLogPos &&
                checkpointRelayLogPos == that.checkpointRelayLogPos &&
                checkpointMasterLogPos == that.checkpointMasterLogPos &&
                checkpointSeqno == that.checkpointSeqno &&
                checkpointGroupSize == that.checkpointGroupSize &&
                Objects.equals(relayLogName, that.relayLogName) &&
                Objects.equals(masterLogName, that.masterLogName) &&
                Objects.equals(checkpointRelayLogName, that.checkpointRelayLogName) &&
                Objects.equals(checkpointMasterLogName, that.checkpointMasterLogName) &&
                Arrays.equals(checkpointGroupBitmap, that.checkpointGroupBitmap) &&
                Objects.equals(channelName, that.channelName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, relayLogName, relayLogPos, masterLogName, masterLogPos, checkpointRelayLogName, checkpointRelayLogPos, checkpointMasterLogName, checkpointMasterLogPos, checkpointSeqno, checkpointGroupSize, channelName);
        result = 31 * result + Arrays.hashCode(checkpointGroupBitmap);
        return result;
    }
}
