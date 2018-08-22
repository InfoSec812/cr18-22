package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "indicator_zips", schema = "example_database", catalog = "")
public class IndicatorZips {
    private int id;
    private Integer uploadedFileId;
    private Integer indicatorId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uploaded_file_id", nullable = true)
    public Integer getUploadedFileId() {
        return uploadedFileId;
    }

    public void setUploadedFileId(Integer uploadedFileId) {
        this.uploadedFileId = uploadedFileId;
    }

    @Basic
    @Column(name = "indicator_id", nullable = true)
    public Integer getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndicatorZips that = (IndicatorZips) o;
        return id == that.id &&
                Objects.equals(uploadedFileId, that.uploadedFileId) &&
                Objects.equals(indicatorId, that.indicatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uploadedFileId, indicatorId);
    }
}
