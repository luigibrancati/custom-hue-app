package io.lindstrom.m3u8.parser;

/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4574d {
    void b(Object obj, String str);

    default String key() {
        String strName = name();
        return strName.contains("_") ? strName.replace("_", "-") : strName;
    }

    String name();

    default void a(Object obj, String str, String str2) {
    }
}
