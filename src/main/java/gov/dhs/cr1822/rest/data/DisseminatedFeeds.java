package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "disseminated_feeds", schema = "example_database", catalog = "")
public class DisseminatedFeeds {
    private int id;
    private Integer disseminateId;
    private String feed;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "disseminate_id", nullable = true)
    public Integer getDisseminateId() {
        return disseminateId;
    }

    public void setDisseminateId(Integer disseminateId) {
        this.disseminateId = disseminateId;
    }

    @Basic
    @Column(name = "feed", nullable = true, length = 255)
    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisseminatedFeeds that = (DisseminatedFeeds) o;
        return id == that.id &&
                Objects.equals(disseminateId, that.disseminateId) &&
                Objects.equals(feed, that.feed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, disseminateId, feed);
    }
}
