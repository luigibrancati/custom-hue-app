package s9;

import de.AbstractC3918a;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import ge.AbstractC4232e0;
import ge.C4221J;
import ge.C4237h;
import ge.C4240i0;
import ge.C4255t;
import ge.InterfaceC4215D;
import ge.Q;
import ge.s0;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: s9.h, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002!%B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b!\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b%\u0010-¨\u0006/"}, d2 = {"Ls9/h;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "f", "(Ls9/h;Lfe/d;Lee/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Boolean sessionsEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final Double sessionSamplingRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer sessionTimeoutSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Integer cacheDurationSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final Long cacheUpdatedTimeSeconds;

    /* JADX INFO: renamed from: s9.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44369a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f44369a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            c4240i0.o("sessionsEnabled", false);
            c4240i0.o("sessionSamplingRate", false);
            c4240i0.o("sessionTimeoutSeconds", false);
            c4240i0.o("cacheDurationSeconds", false);
            c4240i0.o("cacheUpdatedTimeSeconds", false);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return InterfaceC4215D.a.a(this);
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SessionConfigs deserialize(InterfaceC4049e decoder) {
            int i10;
            Boolean bool;
            Double d10;
            Integer num;
            Integer num2;
            Long l10;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            Boolean bool2 = null;
            if (interfaceC4047cA.q()) {
                Boolean bool3 = (Boolean) interfaceC4047cA.A(eVar, 0, C4237h.f35705a, null);
                Double d11 = (Double) interfaceC4047cA.A(eVar, 1, C4255t.f35744a, null);
                C4221J c4221j = C4221J.f35658a;
                Integer num3 = (Integer) interfaceC4047cA.A(eVar, 2, c4221j, null);
                bool = bool3;
                num2 = (Integer) interfaceC4047cA.A(eVar, 3, c4221j, null);
                l10 = (Long) interfaceC4047cA.A(eVar, 4, Q.f35675a, null);
                num = num3;
                d10 = d11;
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d12 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l11 = null;
                while (z10) {
                    int iJ = interfaceC4047cA.j(eVar);
                    if (iJ == -1) {
                        z10 = false;
                    } else if (iJ == 0) {
                        bool2 = (Boolean) interfaceC4047cA.A(eVar, 0, C4237h.f35705a, bool2);
                        i11 |= 1;
                    } else if (iJ == 1) {
                        d12 = (Double) interfaceC4047cA.A(eVar, 1, C4255t.f35744a, d12);
                        i11 |= 2;
                    } else if (iJ == 2) {
                        num4 = (Integer) interfaceC4047cA.A(eVar, 2, C4221J.f35658a, num4);
                        i11 |= 4;
                    } else if (iJ == 3) {
                        num5 = (Integer) interfaceC4047cA.A(eVar, 3, C4221J.f35658a, num5);
                        i11 |= 8;
                    } else {
                        if (iJ != 4) {
                            throw new ce.h(iJ);
                        }
                        l11 = (Long) interfaceC4047cA.A(eVar, 4, Q.f35675a, l11);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                bool = bool2;
                d10 = d12;
                num = num4;
                num2 = num5;
                l10 = l11;
            }
            interfaceC4047cA.c(eVar);
            return new SessionConfigs(i10, bool, d10, num, num2, l10, null);
        }

        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            ce.b bVarP = AbstractC3918a.p(C4237h.f35705a);
            ce.b bVarP2 = AbstractC3918a.p(C4255t.f35744a);
            C4221J c4221j = C4221J.f35658a;
            return new ce.b[]{bVarP, bVarP2, AbstractC3918a.p(c4221j), AbstractC3918a.p(c4221j), AbstractC3918a.p(Q.f35675a)};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, SessionConfigs value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            SessionConfigs.f(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: s9.h$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f44369a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l10, s0 s0Var) {
        if (31 != (i10 & 31)) {
            AbstractC4232e0.a(i10, 31, a.f44369a.getDescriptor());
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }

    public static final /* synthetic */ void f(SessionConfigs self, InterfaceC4048d output, ee.e serialDesc) {
        output.l(serialDesc, 0, C4237h.f35705a, self.sessionsEnabled);
        output.l(serialDesc, 1, C4255t.f35744a, self.sessionSamplingRate);
        C4221J c4221j = C4221J.f35658a;
        output.l(serialDesc, 2, c4221j, self.sessionTimeoutSeconds);
        output.l(serialDesc, 3, c4221j, self.cacheDurationSeconds);
        output.l(serialDesc, 4, Q.f35675a, self.cacheUpdatedTimeSeconds);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return AbstractC4862t.a(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && AbstractC4862t.a(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && AbstractC4862t.a(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && AbstractC4862t.a(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && AbstractC4862t.a(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + ')';
    }

    public SessionConfigs(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d10;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l10;
    }
}
