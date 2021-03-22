/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alanm
 */
public class Assets {

    
    private int id_asset;
    private String nm_asset;
    private int qt_asset;
    private BigDecimal vl_lastBuy;
    private BigDecimal vl_amountInvested;
    private Date dt_firstBuy;
    private Date dt_lastBuy;
    private Wallet wallet;

    public Assets(int id_asset, String nm_asset, int qt_asset, BigDecimal vl_lastBuy, BigDecimal vl_amountInvested, Date dt_firstBuy, Date dt_lastBuy, Wallet wallet) {
        this.id_asset = id_asset;
        this.nm_asset = nm_asset;
        this.qt_asset = qt_asset;
        this.vl_lastBuy = vl_lastBuy;
        this.vl_amountInvested = vl_amountInvested;
        this.dt_firstBuy = dt_firstBuy;
        this.dt_lastBuy = dt_lastBuy;
        this.wallet = wallet;
    }

    public Assets(String nm_asset, int qt_asset, BigDecimal vl_lastBuy, BigDecimal vl_amountInvested, Date dt_firstBuy, Date dt_lastBuy, Wallet wallet) {
        this.nm_asset = nm_asset;
        this.qt_asset = qt_asset;
        this.vl_lastBuy = vl_lastBuy;
        this.vl_amountInvested = vl_amountInvested;
        this.dt_firstBuy = dt_firstBuy;
        this.dt_lastBuy = dt_lastBuy;
        this.wallet = wallet;
    }

    public Assets() {
    }

    public int getId_asset() {
        return id_asset;
    }

    public void setId_asset(int id_asset) {
        this.id_asset = id_asset;
    }

    public String getNm_asset() {
        return nm_asset;
    }

    public void setNm_asset(String nm_asset) {
        this.nm_asset = nm_asset;
    }

    public int getQt_asset() {
        return qt_asset;
    }

    public void setQt_asset(int qt_asset) {
        this.qt_asset = qt_asset;
    }

    public BigDecimal getVl_lastBuy() {
        return vl_lastBuy;
    }

    public void setVl_lastBuy(BigDecimal vl_lastBuy) {
        this.vl_lastBuy = vl_lastBuy;
    }

    public BigDecimal getVl_amountInvested() {
        return vl_amountInvested;
    }

    public void setVl_amountInvested(BigDecimal vl_amountInvested) {
        this.vl_amountInvested = vl_amountInvested;
    }

    public Date getDt_firstBuy() {
        return dt_firstBuy;
    }

    public void setDt_firstBuy(Date dt_firstBuy) {
        this.dt_firstBuy = dt_firstBuy;
    }

    public Date getDt_lastBuy() {
        return dt_lastBuy;
    }

    public void setDt_lastBuy(Date dt_lastBuy) {
        this.dt_lastBuy = dt_lastBuy;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
