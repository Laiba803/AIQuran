package com.example.quranapp2;

public class DBModel {
    int AyaId;
    int SuraId;
    int AyaNo;
    String ArabicText;
    String Fateh_Muhammad_Jalandhri;
    String Mehmood_ul_Hassan;
    String Dr_Mohsin_Khan;
    String Mufti_Taqi_Usmani;
    int RakuID;
    int PRakuID;
    int ParaID;

    public DBModel(int ayaId, int suraId, int ayaNo, String arabicText, String fateh_Muhammad_Jalandhri, String mehmood_ul_Hassan, String dr_Mohsin_Khan, String mufti_Taqi_Usmani, int rakuID, int PRakuID, int paraID) {
        AyaId = ayaId;
        SuraId = suraId;
        AyaNo = ayaNo;
        ArabicText = arabicText;
        Fateh_Muhammad_Jalandhri = fateh_Muhammad_Jalandhri;
        Mehmood_ul_Hassan = mehmood_ul_Hassan;
        Dr_Mohsin_Khan = dr_Mohsin_Khan;
        Mufti_Taqi_Usmani = mufti_Taqi_Usmani;
        RakuID = rakuID;
        this.PRakuID = PRakuID;
        ParaID = paraID;
    }

    @Override
    public String toString() {
        return "ModelClass{" +
                "AyaId=" + AyaId +
                ", SuraId=" + SuraId +
                ", AyaNo=" + AyaNo +
                ", ArabicText='" + ArabicText + '\'' +
                ", Fateh_Muhammad_Jalandhri='" + Fateh_Muhammad_Jalandhri + '\'' +
                ", Mehmood_ul_Hassan='" + Mehmood_ul_Hassan + '\'' +
                ", Dr_Mohsin_Khan='" + Dr_Mohsin_Khan + '\'' +
                ", Mufti_Taqi_Usmani='" + Mufti_Taqi_Usmani + '\'' +
                ", RakuID=" + RakuID +
                ", PRakuID=" + PRakuID +
                ", ParaID=" + ParaID +
                '}';
    }

    public int getAyaId() {
        return AyaId;
    }

    public void setAyaId(int ayaId) {
        AyaId = ayaId;
    }

    public int getSuraId() {
        return SuraId;
    }

    public void setSuraId(int suraId) {
        SuraId = suraId;
    }

    public int getAyaNo() {
        return AyaNo;
    }

    public void setAyaNo(int ayaNo) {
        AyaNo = ayaNo;
    }

    public String getArabicText() {
        return ArabicText;
    }

    public void setArabicText(String arabicText) {
        ArabicText = arabicText;
    }

    public String getFateh_Muhammad_Jalandhri() {
        return Fateh_Muhammad_Jalandhri;
    }

    public void setFateh_Muhammad_Jalandhri(String fateh_Muhammad_Jalandhri) {
        Fateh_Muhammad_Jalandhri = fateh_Muhammad_Jalandhri;
    }

    public String getMehmood_ul_Hassan() {
        return Mehmood_ul_Hassan;
    }

    public void setMehmood_ul_Hassan(String mehmood_ul_Hassan) {
        Mehmood_ul_Hassan = mehmood_ul_Hassan;
    }

    public String getDr_Mohsin_Khan() {
        return Dr_Mohsin_Khan;
    }

    public void setDr_Mohsin_Khan(String dr_Mohsin_Khan) {
        Dr_Mohsin_Khan = dr_Mohsin_Khan;
    }

    public String getMufti_Taqi_Usmani() {
        return Mufti_Taqi_Usmani;
    }

    public void setMufti_Taqi_Usmani(String mufti_Taqi_Usmani) {
        Mufti_Taqi_Usmani = mufti_Taqi_Usmani;
    }

    public int getRakuID() {
        return RakuID;
    }

    public void setRakuID(int rakuID) {
        RakuID = rakuID;
    }

    public int getPRakuID() {
        return PRakuID;
    }

    public void setPRakuID(int PRakuID) {
        this.PRakuID = PRakuID;
    }

    public int getParaID() {
        return ParaID;
    }

    public void setParaID(int paraID) {
        ParaID = paraID;
    }
}