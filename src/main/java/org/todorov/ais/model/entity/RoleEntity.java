package org.todorov.ais.model.entity;

import javax.persistence.*;

@Entity
public class RoleEntity extends BaseEntity{
    private String roleName;

    public RoleEntity() {
    }

    public RoleEntity(String roleName) {
        this.roleName = roleName;
    }

    @Column(nullable = false)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
