package Lc;

import io.flutter.plugins.firebase.crashlytics.Constants;

/* JADX INFO: renamed from: Lc.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC1178f {
    CLASS(Constants.CLASS),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");

    private final String codeRepresentation;

    EnumC1178f(String str) {
        this.codeRepresentation = str;
    }

    public final boolean b() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
