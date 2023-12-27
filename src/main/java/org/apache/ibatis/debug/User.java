package org.apache.ibatis.debug;

import java.util.Date;
import java.util.List;

public class User {

  private Integer id;
  private String name;
  private Date createDate;

  private Date updateDate;

  private List<Integer> role;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public List<Integer> getRole() {
        return role;
  }

  public void setRole(List<Integer> role) {
        this.role = role;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", createDate=" + createDate +
      ", updateDate=" + updateDate +
      ", role=" + role +
      '}';
  }
}
