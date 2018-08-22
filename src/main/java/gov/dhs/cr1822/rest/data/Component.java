package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Component {
    private int componentId;
    private int componentGroupId;
    private String componentUrn;

    @Id
    @Column(name = "component_id", nullable = false)
    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    @Basic
    @Column(name = "component_group_id", nullable = false)
    public int getComponentGroupId() {
        return componentGroupId;
    }

    public void setComponentGroupId(int componentGroupId) {
        this.componentGroupId = componentGroupId;
    }

    @Basic
    @Column(name = "component_urn", nullable = false, length = -1)
    public String getComponentUrn() {
        return componentUrn;
    }

    public void setComponentUrn(String componentUrn) {
        this.componentUrn = componentUrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return componentId == component.componentId &&
                componentGroupId == component.componentGroupId &&
                Objects.equals(componentUrn, component.componentUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, componentGroupId, componentUrn);
    }
}
