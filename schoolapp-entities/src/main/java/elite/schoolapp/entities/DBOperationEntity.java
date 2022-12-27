package elite.schoolapp.entities;

public class DBOperationEntity {

  private Object entity;
  private String updateOnField;
  private CrudOperations crudOperations;

  public DBOperationEntity(Object entity, String updateOnField, CrudOperations crudOperations) {
    super();
    this.entity = entity;
    this.updateOnField = updateOnField;
    this.crudOperations = crudOperations;
  }

  public Object getEntity() {
    return entity;
  }

  public void setEntity(Object entity) {
    this.entity = entity;
  }

  public String getUpdateOnField() {
    return updateOnField;
  }

  public void setUpdateOnField(String updateOnField) {
    this.updateOnField = updateOnField;
  }

  public CrudOperations getCrudOperations() {
    return crudOperations;
  }

  public void setCrudOperations(CrudOperations crudOperations) {
    this.crudOperations = crudOperations;
  }
}
