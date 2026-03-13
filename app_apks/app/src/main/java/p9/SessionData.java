package p9;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.s0;
import ge.w0;
import io.sentry.protocol.Request;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import p9.ProcessData;
import p9.SessionDetails;
import p9.Time;

/* JADX INFO: renamed from: p9.E, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002#\u0019B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lp9/E;", "", "Lp9/H;", "sessionDetails", "Lp9/W;", "backgroundTime", "", "", "Lp9/v;", "processDataMap", "<init>", "(Lp9/H;Lp9/W;Ljava/util/Map;)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILp9/H;Lp9/W;Ljava/util/Map;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "g", "(Lp9/E;Lfe/d;Lee/e;)V", "b", "(Lp9/H;Lp9/W;Ljava/util/Map;)Lp9/E;", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp9/H;", "f", "()Lp9/H;", "Lp9/W;", "d", "()Lp9/W;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ce.b[] f42316d = {null, null, new ge.M(w0.f35762a, ProcessData.a.f42500a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final SessionDetails sessionDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Time backgroundTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map processDataMap;

    /* JADX INFO: renamed from: p9.E$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f42320a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f42320a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.google.firebase.sessions.SessionData", aVar, 3);
            c4240i0.o("sessionDetails", false);
            c4240i0.o("backgroundTime", true);
            c4240i0.o("processDataMap", true);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SessionData deserialize(InterfaceC4049e decoder) {
            int i10;
            SessionDetails sessionDetails;
            Time time;
            Map map;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            ce.b[] bVarArr = SessionData.f42316d;
            SessionDetails sessionDetails2 = null;
            if (interfaceC4047cA.q()) {
                SessionDetails sessionDetails3 = (SessionDetails) interfaceC4047cA.H(eVar, 0, SessionDetails.a.f42327a, null);
                Time time2 = (Time) interfaceC4047cA.A(eVar, 1, Time.a.f42419a, null);
                map = (Map) interfaceC4047cA.A(eVar, 2, bVarArr[2], null);
                sessionDetails = sessionDetails3;
                i10 = 7;
                time = time2;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Time time3 = null;
                Map map2 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        sessionDetails2 = (SessionDetails) interfaceC4047cA.H(eVar, 0, SessionDetails.a.f42327a, sessionDetails2);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        time3 = (Time) interfaceC4047cA.A(eVar, 1, Time.a.f42419a, time3);
                        i11 |= 2;
                    } else {
                        if (iJ != 2) {
                            throw new ce.h(iJ);
                        }
                        map2 = (Map) interfaceC4047cA.A(eVar, 2, bVarArr[2], map2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                sessionDetails = sessionDetails2;
                time = time3;
                map = map2;
            }
            interfaceC4047cA.c(eVar);
            return new SessionData(i10, sessionDetails, time, map, (s0) null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            return new ce.b[]{SessionDetails.a.f42327a, AbstractC3918a.p(Time.a.f42419a), AbstractC3918a.p(SessionData.f42316d[2])};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, SessionData value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            SessionData.g(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: p9.E$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f42320a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ SessionData(int i10, SessionDetails sessionDetails, Time time, Map map, s0 s0Var) {
        if (1 != (i10 & 1)) {
            AbstractC4232e0.a(i10, 1, a.f42320a.getDescriptor());
        }
        this.sessionDetails = sessionDetails;
        if ((i10 & 2) == 0) {
            this.backgroundTime = null;
        } else {
            this.backgroundTime = time;
        }
        if ((i10 & 4) == 0) {
            this.processDataMap = null;
        } else {
            this.processDataMap = map;
        }
    }

    public static /* synthetic */ SessionData c(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sessionDetails = sessionData.sessionDetails;
        }
        if ((i10 & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i10 & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.b(sessionDetails, time, map);
    }

    public static final /* synthetic */ void g(SessionData self, InterfaceC4048d output, ee.e serialDesc) {
        ce.b[] bVarArr = f42316d;
        output.E(serialDesc, 0, SessionDetails.a.f42327a, self.sessionDetails);
        if (output.i(serialDesc, 1) || self.backgroundTime != null) {
            output.l(serialDesc, 1, Time.a.f42419a, self.backgroundTime);
        }
        if (!output.i(serialDesc, 2) && self.processDataMap == null) {
            return;
        }
        output.l(serialDesc, 2, bVarArr[2], self.processDataMap);
    }

    public final SessionData b(SessionDetails sessionDetails, Time backgroundTime, Map processDataMap) {
        AbstractC4862t.e(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, backgroundTime, processDataMap);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Map getProcessDataMap() {
        return this.processDataMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) other;
        return AbstractC4862t.a(this.sessionDetails, sessionData.sessionDetails) && AbstractC4862t.a(this.backgroundTime, sessionData.backgroundTime) && AbstractC4862t.a(this.processDataMap, sessionData.processDataMap);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    public int hashCode() {
        int iHashCode = this.sessionDetails.hashCode() * 31;
        Time time = this.backgroundTime;
        int iHashCode2 = (iHashCode + (time == null ? 0 : time.hashCode())) * 31;
        Map map = this.processDataMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.sessionDetails + ", backgroundTime=" + this.backgroundTime + ", processDataMap=" + this.processDataMap + ')';
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map map) {
        AbstractC4862t.e(sessionDetails, "sessionDetails");
        this.sessionDetails = sessionDetails;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i10, AbstractC4854k abstractC4854k) {
        this(sessionDetails, (i10 & 2) != 0 ? null : time, (i10 & 4) != 0 ? null : map);
    }
}
