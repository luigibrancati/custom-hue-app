package p9;

import Pd.a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.s0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.W, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\"&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b\"\u0010%¨\u0006("}, d2 = {"Lp9/W;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "Lge/s0;", "serializationConstructorMarker", "(IJJJLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "d", "(Lp9/W;Lfe/d;Lee/e;)V", "time", "LPd/a;", "c", "(Lp9/W;)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getMs", "()J", "b", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Time {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final long ms;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long us;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long seconds;

    /* JADX INFO: renamed from: p9.W$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42419a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f42419a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.google.firebase.sessions.Time", aVar, 3);
            c4240i0.o("ms", false);
            c4240i0.o("us", true);
            c4240i0.o("seconds", true);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Time deserialize(InterfaceC4049e decoder) {
            int i10;
            long jE;
            long j10;
            long j11;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            if (interfaceC4047cA.q()) {
                long jE2 = interfaceC4047cA.e(eVar, 0);
                long jE3 = interfaceC4047cA.e(eVar, 1);
                jE = interfaceC4047cA.e(eVar, 2);
                i10 = 7;
                j10 = jE2;
                j11 = jE3;
            } else {
                long jE4 = 0;
                boolean z10 = true;
                int i11 = 0;
                long jE5 = 0;
                long jE6 = 0;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        jE5 = interfaceC4047cA.e(eVar, 0);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        jE6 = interfaceC4047cA.e(eVar, 1);
                        i11 |= 2;
                    } else {
                        if (iJ != 2) {
                            throw new ce.h(iJ);
                        }
                        jE4 = interfaceC4047cA.e(eVar, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                jE = jE4;
                j10 = jE5;
                j11 = jE6;
            }
            interfaceC4047cA.c(eVar);
            return new Time(i10, j10, j11, jE, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            ge.Q q10 = ge.Q.f35675a;
            return new ce.b[]{q10, q10, q10};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, Time value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            Time.d(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: p9.W$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f42419a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ Time(int i10, long j10, long j11, long j12, s0 s0Var) {
        if (1 != (i10 & 1)) {
            AbstractC4232e0.a(i10, 1, a.f42419a.getDescriptor());
        }
        this.ms = j10;
        this.us = (i10 & 2) == 0 ? ((long) 1000) * j10 : j11;
        if ((i10 & 4) == 0) {
            this.seconds = j10 / ((long) 1000);
        } else {
            this.seconds = j12;
        }
    }

    public static final /* synthetic */ void d(Time self, InterfaceC4048d output, ee.e serialDesc) {
        output.t(serialDesc, 0, self.ms);
        if (output.i(serialDesc, 1) || self.us != self.ms * ((long) 1000)) {
            output.t(serialDesc, 1, self.us);
        }
        if (!output.i(serialDesc, 2) && self.seconds == self.ms / ((long) 1000)) {
            return;
        }
        output.t(serialDesc, 2, self.seconds);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUs() {
        return this.us;
    }

    public final long c(Time time) {
        AbstractC4862t.e(time, "time");
        a.C0170a c0170a = Pd.a.f13294b;
        return Pd.c.t(this.ms - time.ms, Pd.d.MILLISECONDS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Time) && this.ms == ((Time) other).ms;
    }

    public int hashCode() {
        return Long.hashCode(this.ms);
    }

    public String toString() {
        return "Time(ms=" + this.ms + ')';
    }

    public Time(long j10) {
        this.ms = j10;
        long j11 = 1000;
        this.us = j10 * j11;
        this.seconds = j10 / j11;
    }
}
