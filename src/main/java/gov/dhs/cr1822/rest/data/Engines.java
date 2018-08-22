package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Engines {
    private String engine;
    private String support;
    private String comment;
    private String transactions;
    private String xa;
    private String savepoints;

    @Basic
    @Column(name = "ENGINE", nullable = false, length = 64)
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "SUPPORT", nullable = false, length = 8)
    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Basic
    @Column(name = "COMMENT", nullable = false, length = 80)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "TRANSACTIONS", nullable = true, length = 3)
    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    @Basic
    @Column(name = "XA", nullable = true, length = 3)
    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    @Basic
    @Column(name = "SAVEPOINTS", nullable = true, length = 3)
    public String getSavepoints() {
        return savepoints;
    }

    public void setSavepoints(String savepoints) {
        this.savepoints = savepoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engines engines = (Engines) o;
        return Objects.equals(engine, engines.engine) &&
                Objects.equals(support, engines.support) &&
                Objects.equals(comment, engines.comment) &&
                Objects.equals(transactions, engines.transactions) &&
                Objects.equals(xa, engines.xa) &&
                Objects.equals(savepoints, engines.savepoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, support, comment, transactions, xa, savepoints);
    }
}
