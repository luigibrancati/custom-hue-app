package org.apache.tika.language.translate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class EmptyTranslator implements Translator {
    @Override // org.apache.tika.language.translate.Translator
    public boolean isAvailable() {
        return true;
    }

    @Override // org.apache.tika.language.translate.Translator
    public String translate(String str, String str2) {
        return null;
    }

    @Override // org.apache.tika.language.translate.Translator
    public String translate(String str, String str2, String str3) {
        return null;
    }
}
