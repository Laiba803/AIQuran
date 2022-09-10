package com.example.quranapp2;

public class TransaltionModel {
    String arabic;
    String translation;

    public TransaltionModel(String arabic, String translation) {
        this.arabic = arabic;
        this.translation = translation;
    }

    public String getArabic() {
        return arabic;
    }

    public String getTranslation() {
        return translation;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
