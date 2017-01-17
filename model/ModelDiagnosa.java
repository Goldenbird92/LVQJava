/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistempakar.model;

import java.sql.Date;
import javax.swing.ButtonGroup;

/**
 *
 * @author adesuryansyah
 */
public class ModelDiagnosa {
    private Integer id_pemeriksaan;
    private String usia;
    private Date tgl_pemeriksaan;
    private String pertumbuhan;
    private String gerakan;
    private String nafsu_makan;
    private String gesekan_badan_jaring;
    private String flashing;
    private String pendarahan_mata;
    private String pendarahan_mulut;
    private String pendarahan_hidung;
    private String pendarahan_tutup_insang;
    private String borok;
    private String mata;
    private String insang;
    private String sisik;
    private String sirip;
    private String pathogen;
    private String lender;
    private String tubuh;
    private String lintah;
    private String ekor;
    private String mati;

    /**
     * @return the id_pemeriksaan
     */
    public Integer getId_pemeriksaan() {
        return id_pemeriksaan;
    }

    /**
     * @param id_pemeriksaan the id_pemeriksaan to set
     */
    public void setId_pemeriksaan(Integer id_pemeriksaan) {
        this.id_pemeriksaan = id_pemeriksaan;
    }

    /**
     * @return the usia
     */
    public String getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(String usia) {
        this.usia = usia;
    }

    /**
     * @return the tgl_pemeriksaan
     */
    public Date getTgl_pemeriksaan() {
        return tgl_pemeriksaan;
    }

    /**
     * @param tgl_pemeriksaan the tgl_pemeriksaan to set
     */
    public void setTgl_pemeriksaan(Date tgl_pemeriksaan) {
        this.tgl_pemeriksaan = tgl_pemeriksaan;
    }

    /**
     * @return the pertumbuhan
     */
    public String getPertumbuhan() {
        return pertumbuhan;
    }

    /**
     * @param pertumbuhan the pertumbuhan to set
     */
    public void setPertumbuhan(String pertumbuhan) {
        this.pertumbuhan = pertumbuhan;
    }

    /**
     * @return the gerakan
     */
    public String getGerakan() {
        return gerakan;
    }

    /**
     * @param gerakan the gerakan to set
     */
    public void setGerakan(String gerakan) {
        this.gerakan = gerakan;
    }

    /**
     * @return the nafsu_makan
     */
    public String getNafsu_makan() {
        return nafsu_makan;
    }

    /**
     * @param nafsu_makan the nafsu_makan to set
     */
    public void setNafsu_makan(String nafsu_makan) {
        this.nafsu_makan = nafsu_makan;
    }

    /**
     * @return the gesekan_badan_jaring
     */
    public String getGesekan_badan_jaring() {
        return gesekan_badan_jaring;
    }

    /**
     * @param gesekan_badan_jaring the gesekan_badan_jaring to set
     */
    public void setGesekan_badan_jaring(String gesekan_badan_jaring) {
        this.gesekan_badan_jaring = gesekan_badan_jaring;
    }

    /**
     * @return the flashing
     */
    public String getFlashing() {
        return flashing;
    }

    /**
     * @param flashing the flashing to set
     */
    public void setFlashing(String flashing) {
        this.flashing = flashing;
    }

    /**
     * @return the pendarahan_mata
     */
    public String getPendarahan_mata() {
        return pendarahan_mata;
    }

    /**
     * @param pendarahan_mata the pendarahan_mata to set
     */
    public void setPendarahan_mata(String pendarahan_mata) {
        this.pendarahan_mata = pendarahan_mata;
    }
    
    public String getPendarahan_mulut() {
        return pendarahan_mulut;
    }

    /**
     * @param pendarahan_mulut the pendarahan_mulut to set
     */
    public void setPendarahan_mulut(String pendarahan_mulut) {
        this.pendarahan_mulut = pendarahan_mulut;
    }

    /**
     * @return the pendarahan_hidung
     */
    public String getPendarahan_hidung() {
        return pendarahan_hidung;
    }

    /**
     * @param pendarahan_hidung the pendarahan_hidung to set
     */
    public void setPendarahan_hidung(String pendarahan_hidung) {
        this.pendarahan_hidung = pendarahan_hidung;
    }

    /**
     * @return the pendarahan_tutup_insang
     */
    public String getPendarahan_tutup_insang() {
        return pendarahan_tutup_insang;
    }

    /**
     * @param pendarahan_tutup_insang the pendarahan_tutup_insang to set
     */
    public void setPendarahan_tutup_insang(String pendarahan_tutup_insang) {
        this.pendarahan_tutup_insang = pendarahan_tutup_insang;
    }

    /**
     * @return the borok
     */
    public String getBorok() {
        return borok;
    }

    /**
     * @param borok the borok to set
     */
    public void setBorok(String borok) {
        this.borok = borok;
    }

    /**
     * @return the mata
     */
    public String getMata() {
        return mata;
    }

    /**
     * @param mata the mata to set
     */
    public void setMata(String mata) {
        this.mata = mata;
    }

    /**
     * @return the insang
     */
    public String getInsang() {
        return insang;
    }

    /**
     * @param insang the insang to set
     */
    public void setInsang(String insang) {
        this.insang = insang;
    }

    /**
     * @return the sisik
     */
    public String getSisik() {
        return sisik;
    }

    /**
     * @param sisik the sisik to set
     */
    public void setSisik(String sisik) {
        this.sisik = sisik;
    }

    /**
     * @return the sirip
     */
    public String getSirip() {
        return sirip;
    }

    /**
     * @param sirip the sirip to set
     */
    public void setSirip(String sirip) {
        this.sirip = sirip;
    }

    /**
     * @return the pathogen
     */
    public String getPathogen() {
        return pathogen;
    }

    /**
     * @param pathogen the pathogen to set
     */
    public void setPathogen(String pathogen) {
        this.pathogen = pathogen;
    }

    /**
     * @return the lender
     */
    public String getLender() {
        return lender;
    }

    /**
     * @param lender the lender to set
     */
    public void setLender(String lender) {
        this.lender = lender;
    }

    /**
     * @return the tubuh
     */
    public String getTubuh() {
        return tubuh;
    }

    /**
     * @param tubuh the tubuh to set
     */
    public void setTubuh(String tubuh) {
        this.tubuh = tubuh;
    }

    /**
     * @return the lintah
     */
    public String getLintah() {
        return lintah;
    }

    /**
     * @param lintah the lintah to set
     */
    public void setLintah(String lintah) {
        this.lintah = lintah;
    }

    /**
     * @return the ekor
     */
    public String getEkor() {
        return ekor;
    }

    /**
     * @param ekor the ekor to set
     */
    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    /**
     * @return the mati
     */
    public String getMati() {
        return mati;
    }

    /**
     * @param mati the mati to set
     */
    public void setMati(String mati) {
        this.mati = mati;
    }
 
}
