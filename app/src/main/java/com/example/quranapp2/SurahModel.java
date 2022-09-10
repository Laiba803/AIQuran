package com.example.quranapp2;

public class SurahModel {
    String SurahName;
    int SurahNum;

    public SurahModel(String surahName, int surahNum) {
        SurahName = surahName;
        SurahNum = surahNum;
    }

    public String getSurahName() {
        return SurahName;
    }

    public void setSurahName(String surahName) {
        SurahName = surahName;
    }

    public int getSurahNum() {
        return SurahNum;
    }

    public void setSurahNum(int surahNum) {
        SurahNum = surahNum;
    }
}
