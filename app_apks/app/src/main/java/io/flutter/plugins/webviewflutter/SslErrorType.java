package io.flutter.plugins.webviewflutter;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lio/flutter/plugins/webviewflutter/SslErrorType;", "", "raw", "", "<init>", "(Ljava/lang/String;II)V", "getRaw", "()I", "DATE_INVALID", "EXPIRED", "ID_MISMATCH", "INVALID", "NOT_YET_VALID", "UNTRUSTED", "UNKNOWN", "Companion", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SslErrorType {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ SslErrorType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int raw;
    public static final SslErrorType DATE_INVALID = new SslErrorType("DATE_INVALID", 0, 0);
    public static final SslErrorType EXPIRED = new SslErrorType("EXPIRED", 1, 1);
    public static final SslErrorType ID_MISMATCH = new SslErrorType("ID_MISMATCH", 2, 2);
    public static final SslErrorType INVALID = new SslErrorType("INVALID", 3, 3);
    public static final SslErrorType NOT_YET_VALID = new SslErrorType("NOT_YET_VALID", 4, 4);
    public static final SslErrorType UNTRUSTED = new SslErrorType("UNTRUSTED", 5, 5);
    public static final SslErrorType UNKNOWN = new SslErrorType("UNKNOWN", 6, 6);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/flutter/plugins/webviewflutter/SslErrorType$Companion;", "", "<init>", "()V", "ofRaw", "Lio/flutter/plugins/webviewflutter/SslErrorType;", "raw", "", "webview_flutter_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final SslErrorType ofRaw(int raw) {
            for (SslErrorType sslErrorType : SslErrorType.values()) {
                if (sslErrorType.getRaw() == raw) {
                    return sslErrorType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SslErrorType[] $values() {
        return new SslErrorType[]{DATE_INVALID, EXPIRED, ID_MISMATCH, INVALID, NOT_YET_VALID, UNTRUSTED, UNKNOWN};
    }

    static {
        SslErrorType[] sslErrorTypeArr$values = $values();
        $VALUES = sslErrorTypeArr$values;
        $ENTRIES = AbstractC5277b.a(sslErrorTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private SslErrorType(String str, int i10, int i11) {
        this.raw = i11;
    }

    public static InterfaceC5276a getEntries() {
        return $ENTRIES;
    }

    public static SslErrorType valueOf(String str) {
        return (SslErrorType) Enum.valueOf(SslErrorType.class, str);
    }

    public static SslErrorType[] values() {
        return (SslErrorType[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
