package org.apache.tika.language.translate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Translator {
    boolean isAvailable();

    String translate(String str, String str2);

    String translate(String str, String str2, String str3);
}
