package com.rhine.blog.po;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RoleBean implements Serializable {
    private String id;
    private String name;
    private Set<PermissionBean> permissions = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PermissionBean> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<PermissionBean> permissions) {
        this.permissions = permissions;
    }
}
