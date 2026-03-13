package Td;

import Rd.InterfaceC2138l;
import Wd.E;
import Wd.H;
import kotlin.jvm.internal.AbstractC4860q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f16385a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16386b = H.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16387c = H.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f16388d = new E("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f16389e = new E("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E f16390f = new E("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E f16391g = new E("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f16392h = new E("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E f16393i = new E("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final E f16394j = new E("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final E f16395k = new E("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final E f16396l = new E("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final E f16397m = new E("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final E f16398n = new E("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final E f16399o = new E("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final E f16400p = new E("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final E f16401q = new E("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E f16402r = new E("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final E f16403s = new E("NO_CLOSE_CAUSE");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4860q implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16404a = new a();

        public a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m i(long j10, m mVar) {
            return f.x(j10, mVar);
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).longValue(), (m) obj2);
        }
    }

    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(InterfaceC2138l interfaceC2138l, Object obj, vc.q qVar) {
        Object objV = interfaceC2138l.v(obj, null, qVar);
        if (objV == null) {
            return false;
        }
        interfaceC2138l.A(objV);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC2138l interfaceC2138l, Object obj, vc.q qVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return B(interfaceC2138l, obj, qVar);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    public static final m x(long j10, m mVar) {
        return new m(j10, mVar, mVar.y(), 0);
    }

    public static final Cc.h y() {
        return a.f16404a;
    }

    public static final E z() {
        return f16396l;
    }
}
