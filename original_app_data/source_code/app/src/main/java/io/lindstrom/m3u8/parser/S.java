package io.lindstrom.m3u8.parser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface S {
    void a(Object obj, String str, C4589t c4589t);

    String name();

    default String tag() {
        String strName = name();
        return strName.contains("_") ? strName.replace("_", "-") : strName;
    }
}
