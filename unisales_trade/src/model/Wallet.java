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
public class Wallet {
    private int id_wallet;
    private String nm_wallet;
    private BigDecimal amount_invested;
    private Date dt_created;
    private Trader trader;

    public Wallet() {
    }

    public Wallet(String nm_wallet, BigDecimal amount_invested, Date dt_created) {
        this.nm_wallet = nm_wallet;
        this.amount_invested = amount_invested;
        this.dt_created = dt_created;
    }

    public Wallet(int id_wallet, String nm_wallet, BigDecimal amount_invested, Date dt_created, Trader trader) {
        this.id_wallet = id_wallet;
        this.nm_wallet = nm_wallet;
        this.amount_invested = amount_invested;
        this.dt_created = dt_created;
        this.trader = trader;
     }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getId_wallet() {
        return id_wallet;
    }

    public void setId_wallet(int id_wallet) {
        this.id_wallet = id_wallet;
    }

    public String getNm_wallet() {
        return nm_wallet;
    }

    public void setNm_wallet(String nm_wallet) {
        this.nm_wallet = nm_wallet;
    }

    public BigDecimal getAmount_invested() {
        return amount_invested;
    }

    public void setAmount_invested(BigDecimal amount_invested) {
        this.amount_invested = amount_invested;
    }

    public Date getDt_created() {
        return dt_created;
    }

    public void setDt_created(Date dt_created) {
        this.dt_created = dt_created;
    }    
}
