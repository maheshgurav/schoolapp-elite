package elite.schoolapp.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class Organization implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(columnDefinition = "varchar(64)")
  private String id;

  @Column(columnDefinition = "varchar(64)")
  private String schoolUuid;

  @Column(columnDefinition = "varchar(64)")
  private String organizationUuid;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSchoolUuid() {
    return schoolUuid;
  }

  public void setSchoolUuid(String schoolUuid) {
    this.schoolUuid = schoolUuid;
  }

  public String getOrganizationUuid() {
    return organizationUuid;
  }

  public void setOrganizationUuid(String organizationUuid) {
    this.organizationUuid = organizationUuid;
  }
}
