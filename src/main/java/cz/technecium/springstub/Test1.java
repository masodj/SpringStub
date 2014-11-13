package cz.technecium.springstub;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sobek
 */
@Entity
@Table(name="Test1")
public class Test1 {

    @Id
    @Column(name="id")
    private Integer id;
    
    @Column(name="testString")
    private String testString;

    public Integer getId() {
        return id;
    }

    public String getTestString() {
        return testString;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
