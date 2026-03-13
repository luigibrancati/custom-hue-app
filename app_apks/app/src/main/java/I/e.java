package I;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends G.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f5389i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f5390j = b.OFF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f5391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final I.b f5392h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b OFF = new b("OFF", 0);
        public static final b ON = new b("ON", 1);
        public static final b PREVIEW = new b("PREVIEW", 2);

        static {
            b[] bVarArrA = a();
            $VALUES = bVarArrA;
            $ENTRIES = AbstractC5277b.a(bVarArrA);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{OFF, ON, PREVIEW};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public e(b mode) {
        AbstractC4862t.e(mode, "mode");
        this.f5391g = mode;
        this.f5392h = I.b.VIDEO_STABILIZATION;
    }

    @Override // G.b
    public I.b c() {
        return this.f5392h;
    }

    public final b f() {
        return this.f5391g;
    }

    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.f5391g.name() + ')';
    }
}
