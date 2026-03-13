package Q4;

import Q4.C1885e;
import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.InterfaceC4215D;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u0017BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LQ4/d0;", "", "", "seen0", "", "beforeTaskStartRawHandle", "onTaskStartRawHandle", "onTaskFinishedRawHandle", "LQ4/e;", "auth", "Lge/s0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;LQ4/e;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "e", "(LQ4/d0;Lfe/d;Lee/e;)V", "", "b", "()Z", "d", "c", "a", "Ljava/lang/Long;", "LQ4/e;", "()LQ4/e;", "setAuth", "(LQ4/e;)V", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Long beforeTaskStartRawHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Long onTaskStartRawHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Long onTaskFinishedRawHandle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public C1885e auth;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13841a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13841a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.TaskOptions", aVar, 4);
            c4240i0.o("beforeTaskStartRawHandle", false);
            c4240i0.o("onTaskStartRawHandle", false);
            c4240i0.o("onTaskFinishedRawHandle", false);
            c4240i0.o("auth", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d0 deserialize(InterfaceC4049e decoder) {
            int i10;
            Long l10;
            Long l11;
            Long l12;
            C1885e c1885e;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            Long l13 = null;
            if (interfaceC4047cA.q()) {
                ge.Q q10 = ge.Q.f35675a;
                Long l14 = (Long) interfaceC4047cA.A(eVar, 0, q10, null);
                Long l15 = (Long) interfaceC4047cA.A(eVar, 1, q10, null);
                l12 = (Long) interfaceC4047cA.A(eVar, 2, q10, null);
                c1885e = (C1885e) interfaceC4047cA.A(eVar, 3, C1885e.a.f13852a, null);
                i10 = 15;
                l11 = l15;
                l10 = l14;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Long l16 = null;
                Long l17 = null;
                C1885e c1885e2 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        l13 = (Long) interfaceC4047cA.A(eVar, 0, ge.Q.f35675a, l13);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        l16 = (Long) interfaceC4047cA.A(eVar, 1, ge.Q.f35675a, l16);
                        i11 |= 2;
                    } else if (iJ == 2) {
                        l17 = (Long) interfaceC4047cA.A(eVar, 2, ge.Q.f35675a, l17);
                        i11 |= 4;
                    } else {
                        if (iJ != 3) {
                            throw new ce.h(iJ);
                        }
                        c1885e2 = (C1885e) interfaceC4047cA.A(eVar, 3, C1885e.a.f13852a, c1885e2);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                l10 = l13;
                l11 = l16;
                l12 = l17;
                c1885e = c1885e2;
            }
            interfaceC4047cA.c(eVar);
            return new d0(i10, l10, l11, l12, c1885e, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            ge.Q q10 = ge.Q.f35675a;
            return new ce.b[]{AbstractC3918a.p(q10), AbstractC3918a.p(q10), AbstractC3918a.p(q10), AbstractC3918a.p(C1885e.a.f13852a)};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, d0 value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            d0.e(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.d0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13841a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ d0(int i10, Long l10, Long l11, Long l12, C1885e c1885e, ge.s0 s0Var) {
        if (15 != (i10 & 15)) {
            AbstractC4232e0.a(i10, 15, a.f13841a.getDescriptor());
        }
        this.beforeTaskStartRawHandle = l10;
        this.onTaskStartRawHandle = l11;
        this.onTaskFinishedRawHandle = l12;
        this.auth = c1885e;
    }

    public static final /* synthetic */ void e(d0 self, InterfaceC4048d output, ee.e serialDesc) {
        ge.Q q10 = ge.Q.f35675a;
        output.l(serialDesc, 0, q10, self.beforeTaskStartRawHandle);
        output.l(serialDesc, 1, q10, self.onTaskStartRawHandle);
        output.l(serialDesc, 2, q10, self.onTaskFinishedRawHandle);
        output.l(serialDesc, 3, C1885e.a.f13852a, self.auth);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1885e getAuth() {
        return this.auth;
    }

    public final boolean b() {
        return this.beforeTaskStartRawHandle != null;
    }

    public final boolean c() {
        return this.onTaskFinishedRawHandle != null;
    }

    public final boolean d() {
        return this.onTaskStartRawHandle != null;
    }
}
