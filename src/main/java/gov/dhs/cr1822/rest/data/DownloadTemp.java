package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "download_temp", schema = "example_database", catalog = "")
public class DownloadTemp {
    private int id;
    private String userGuid;
    private byte[] download;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_guid", nullable = false, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "download", nullable = false)
    public byte[] getDownload() {
        return download;
    }

    public void setDownload(byte[] download) {
        this.download = download;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DownloadTemp that = (DownloadTemp) o;
        return id == that.id &&
                Objects.equals(userGuid, that.userGuid) &&
                Arrays.equals(download, that.download);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, userGuid);
        result = 31 * result + Arrays.hashCode(download);
        return result;
    }
}
