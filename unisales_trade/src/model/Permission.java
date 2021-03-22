/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alanm
 */
public class Permission {
    
    private int id_permission;
    private String ds_permission;

    public Permission(int id_permission, String ds_permission) {
        this.id_permission = id_permission;
        this.ds_permission = ds_permission;
    }

    public Permission() {
    }
    
    public Permission(String ds_permission) {
        this.ds_permission = ds_permission;
    }
    
    public int getId_permission() {
        return id_permission;
    }

    public void setId_permission(int id_permission) {
        this.id_permission = id_permission;
    }

    public String getDs_permission() {
        return ds_permission;
    }

    public void setDs_permission(String ds_permission) {
        this.ds_permission = ds_permission;
    }
    
}
