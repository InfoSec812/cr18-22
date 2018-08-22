package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "weather_map_images", schema = "example_database", catalog = "")
public class WeatherMapImages {
    private int id;
    private String organizationToken;
    private Integer imageId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "organization_token", nullable = true, length = 255)
    public String getOrganizationToken() {
        return organizationToken;
    }

    public void setOrganizationToken(String organizationToken) {
        this.organizationToken = organizationToken;
    }

    @Basic
    @Column(name = "image_id", nullable = true)
    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherMapImages that = (WeatherMapImages) o;
        return id == that.id &&
                Objects.equals(organizationToken, that.organizationToken) &&
                Objects.equals(imageId, that.imageId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, organizationToken, imageId, createdAt, updatedAt);
    }
}
