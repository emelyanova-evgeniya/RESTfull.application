package com.restfull_application.model;

public enum Permission {
    ADMIN("ADMIN"),
    USER("USER");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
