package bootsample.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by vukasin on 3/15/17.
 */
@Entity (name = "t_tasks")
public class Task implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_created")
    private Date dateCreated;
    private boolean finished;

    public Task() {
    }

    public Task(String name, String desctription, Date dateCreated, boolean finished) {
        this.name = name;
        this.description = desctription;
        this.dateCreated = dateCreated;
        this.finished = finished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctription() {
        return description;
    }

    public void setDesctription(String desctription) {
        this.description = desctription;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desctription='" + description + '\'' +
                ", dateCreated=" + dateCreated +
                ", finished=" + finished +
                '}';
    }
}
