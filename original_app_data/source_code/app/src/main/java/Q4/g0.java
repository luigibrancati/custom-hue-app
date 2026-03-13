package Q4;

import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LQ4/g0;", "", "<init>", "(Ljava/lang/String;I)V", "", "s", "()Z", "u", "Companion", "a", "enqueued", "running", "complete", "notFound", "failed", "canceled", "waitingToRetry", "paused", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    private static final InterfaceC4028k $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final g0 enqueued = new g0("enqueued", 0);
    public static final g0 running = new g0("running", 1);
    public static final g0 complete = new g0("complete", 2);
    public static final g0 notFound = new g0("notFound", 3);
    public static final g0 failed = new g0("failed", 4);
    public static final g0 canceled = new g0("canceled", 5);
    public static final g0 waitingToRetry = new g0("waitingToRetry", 6);
    public static final g0 paused = new g0("paused", 7);

    /* JADX INFO: renamed from: Q4.g0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ ce.b a() {
            return (ce.b) g0.$cachedSerializer$delegate.getValue();
        }

        public final ce.b serializer() {
            return a();
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    static {
        g0[] g0VarArrB = b();
        $VALUES = g0VarArrB;
        $ENTRIES = AbstractC5277b.a(g0VarArrB);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: Q4.f0
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return g0.j();
            }
        });
    }

    public g0(String str, int i10) {
    }

    public static final /* synthetic */ g0[] b() {
        return new g0[]{enqueued, running, complete, notFound, failed, canceled, waitingToRetry, paused};
    }

    public static final /* synthetic */ ce.b j() {
        return new j0();
    }

    public static InterfaceC5276a q() {
        return $ENTRIES;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final boolean s() {
        return !u();
    }

    public final boolean u() {
        return this == enqueued || this == running || this == waitingToRetry || this == paused;
    }
}
