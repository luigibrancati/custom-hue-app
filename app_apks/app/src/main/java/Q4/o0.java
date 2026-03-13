package Q4;

import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import io.sentry.MeasurementUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LQ4/o0;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", MeasurementUnit.NONE, "status", "progress", "statusAndProgress", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    private static final InterfaceC4028k $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final o0 none = new o0(MeasurementUnit.NONE, 0);
    public static final o0 status = new o0("status", 1);
    public static final o0 progress = new o0("progress", 2);
    public static final o0 statusAndProgress = new o0("statusAndProgress", 3);

    /* JADX INFO: renamed from: Q4.o0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ ce.b a() {
            return (ce.b) o0.$cachedSerializer$delegate.getValue();
        }

        public final ce.b serializer() {
            return a();
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    static {
        o0[] o0VarArrB = b();
        $VALUES = o0VarArrB;
        $ENTRIES = AbstractC5277b.a(o0VarArrB);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: Q4.n0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return o0.j();
            }
        });
    }

    public o0(String str, int i10) {
    }

    public static final /* synthetic */ o0[] b() {
        return new o0[]{none, status, progress, statusAndProgress};
    }

    public static final /* synthetic */ ce.b j() {
        return new r0();
    }

    public static InterfaceC5276a q() {
        return $ENTRIES;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
