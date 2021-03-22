/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author alanm
 */
public class Trader {
    private int id_trader;
    private String nm_trader;
    private String cpf;
    private Date dt_birthday;
    private String password;
    private String email;
    private Permission permission;

    

    public Trader() {
    }

    public Trader(int id_trader, String nm_trader, String cpf, Date dt_birthday, String password, String email, Permission permission) {
        this.id_trader = id_trader;
        this.nm_trader = nm_trader;
        this.cpf = cpf;
        this.dt_birthday = dt_birthday;
        this.password = password;
        this.email = email;
        this.permission = permission;
    }

    public Trader(String nm_trader, String cpf, Date dt_birthday, String password, String email, Permission permission) {
        this.nm_trader = nm_trader;
        this.cpf = cpf;
        this.dt_birthday = dt_birthday;
        this.password = password;
        this.email = email;
        this.permission = permission;
    }
    
    

    public int getId_trader() {
        return id_trader;
    }

    public void setId_trader(int id_trader) {
        this.id_trader = id_trader;
    }

    public String getNm_trader() {
        return nm_trader;
    }

    public void setNm_trader(String nm_trader) {
        this.nm_trader = nm_trader;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDt_birthday() {
        return dt_birthday;
    }

    public void setDt_birthday(Date dt_birthday) {
        this.dt_birthday = dt_birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
    
}
