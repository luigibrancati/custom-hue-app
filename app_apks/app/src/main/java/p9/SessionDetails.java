package p9;

import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4221J;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.s0;
import ge.w0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.H, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u001f!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lp9/H;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IJLge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "e", "(Lp9/H;Lfe/d;Lee/e;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "J", "()J", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final String firstSessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int sessionIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final long sessionStartTimestampUs;

    /* JADX INFO: renamed from: p9.H$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42327a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f42327a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.google.firebase.sessions.SessionDetails", aVar, 4);
            c4240i0.o("sessionId", false);
            c4240i0.o("firstSessionId", false);
            c4240i0.o("sessionIndex", false);
            c4240i0.o("sessionStartTimestampUs", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SessionDetails deserialize(InterfaceC4049e decoder) {
            String strV;
            int i10;
            int I10;
            String str;
            long jE;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            if (interfaceC4047cA.q()) {
                strV = interfaceC4047cA.v(eVar, 0);
                String strV2 = interfaceC4047cA.v(eVar, 1);
                i10 = 15;
                I10 = interfaceC4047cA.I(eVar, 2);
                str = strV2;
                jE = interfaceC4047cA.e(eVar, 3);
            } else {
                strV = null;
                String strV3 = null;
                boolean z10 = true;
                long jE2 = 0;
                int i11 = 0;
                int I11 = 0;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        strV = interfaceC4047cA.v(eVar, 0);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        strV3 = interfaceC4047cA.v(eVar, 1);
                        i11 |= 2;
                    } else if (iJ == 2) {
                        I11 = interfaceC4047cA.I(eVar, 2);
                        i11 |= 4;
                    } else {
                        if (iJ != 3) {
                            throw new ce.h(iJ);
                        }
                        jE2 = interfaceC4047cA.e(eVar, 3);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                I10 = I11;
                str = strV3;
                jE = jE2;
            }
            String str2 = strV;
            interfaceC4047cA.c(eVar);
            return new SessionDetails(i10, str2, str, I10, jE, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            w0 w0Var = w0.f35762a;
            return new ce.b[]{w0Var, w0Var, C4221J.f35658a, ge.Q.f35675a};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, SessionDetails value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            SessionDetails.e(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: p9.H$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f42327a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ SessionDetails(int i10, String str, String str2, int i11, long j10, s0 s0Var) {
        if (15 != (i10 & 15)) {
            AbstractC4232e0.a(i10, 15, a.f42327a.getDescriptor());
        }
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i11;
        this.sessionStartTimestampUs = j10;
    }

    public static final /* synthetic */ void e(SessionDetails self, InterfaceC4048d output, ee.e serialDesc) {
        output.e(serialDesc, 0, self.sessionId);
        output.e(serialDesc, 1, self.firstSessionId);
        output.F(serialDesc, 2, self.sessionIndex);
        output.t(serialDesc, 3, self.sessionStartTimestampUs);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) other;
        return AbstractC4862t.a(this.sessionId, sessionDetails.sessionId) && AbstractC4862t.a(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    public int hashCode() {
        return (((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.sessionStartTimestampUs);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }

    public SessionDetails(String sessionId, String firstSessionId, int i10, long j10) {
        AbstractC4862t.e(sessionId, "sessionId");
        AbstractC4862t.e(firstSessionId, "firstSessionId");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i10;
        this.sessionStartTimestampUs = j10;
    }
}
