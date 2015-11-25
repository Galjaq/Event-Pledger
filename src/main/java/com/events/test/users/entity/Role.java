package com.events.test.users.entity;

import com.events.test.util.database.Identity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends Identity {
    
    private String roleName;
    private String roleDescription;
    
    Role(){}
    
    public String getRoleName() {
        return roleName;
    }
    public String getRoleDescription() {
        return roleDescription;
    }

}
