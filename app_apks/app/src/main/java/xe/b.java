package xe;

import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    private final int httpCode;
    public static final b NO_ERROR = new b("NO_ERROR", 0, 0);
    public static final b PROTOCOL_ERROR = new b("PROTOCOL_ERROR", 1, 1);
    public static final b INTERNAL_ERROR = new b("INTERNAL_ERROR", 2, 2);
    public static final b FLOW_CONTROL_ERROR = new b("FLOW_CONTROL_ERROR", 3, 3);
    public static final b SETTINGS_TIMEOUT = new b("SETTINGS_TIMEOUT", 4, 4);
    public static final b STREAM_CLOSED = new b("STREAM_CLOSED", 5, 5);
    public static final b FRAME_SIZE_ERROR = new b("FRAME_SIZE_ERROR", 6, 6);
    public static final b REFUSED_STREAM = new b("REFUSED_STREAM", 7, 7);
    public static final b CANCEL = new b("CANCEL", 8, 8);
    public static final b COMPRESSION_ERROR = new b("COMPRESSION_ERROR", 9, 9);
    public static final b CONNECT_ERROR = new b("CONNECT_ERROR", 10, 10);
    public static final b ENHANCE_YOUR_CALM = new b("ENHANCE_YOUR_CALM", 11, 11);
    public static final b INADEQUATE_SECURITY = new b("INADEQUATE_SECURITY", 12, 12);
    public static final b HTTP_1_1_REQUIRED = new b("HTTP_1_1_REQUIRED", 13, 13);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final b a(int i10) {
            for (b bVar : b.values()) {
                if (bVar.b() == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        b[] bVarArrA = a();
        $VALUES = bVarArrA;
        $ENTRIES = AbstractC5277b.a(bVarArrA);
        Companion = new a(null);
    }

    public b(String str, int i10, int i11) {
        this.httpCode = i11;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int b() {
        return this.httpCode;
    }
}
