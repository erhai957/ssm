package com.hqyj.JWSystem.system.model;

public class RolePermission {
    private Integer rolePermissionId;

    private Integer roleId;

    private Integer permissionId;

    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

	@Override
	public String toString() {
		return "RolePermission [rolePermissionId=" + rolePermissionId + ", roleId=" + roleId + ", permissionId="
				+ permissionId + "]";
	}

	public RolePermission(Integer rolePermissionId, Integer roleId, Integer permissionId) {
		super();
		this.rolePermissionId = rolePermissionId;
		this.roleId = roleId;
		this.permissionId = permissionId;
	}

	public RolePermission() {
		super();
	}
    
}