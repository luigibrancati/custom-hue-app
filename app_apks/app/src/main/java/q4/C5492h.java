package q4;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.X;
import Ud.A;
import Ud.AbstractC2315g;
import android.app.Activity;
import android.graphics.PointF;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4034q;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import q4.AbstractC5493i;
import s4.AbstractC5718d;
import s4.C5717c;
import vc.p;

/* JADX INFO: renamed from: q4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5492h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f43182i = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.a f43183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.a f43184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5487c f43185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f43186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2166z0 f43187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f43188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f43189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43190h;

    /* JADX INFO: renamed from: q4.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: q4.h$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f43201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f43203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f43204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f43205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f43206g;

        public d(long j10, long j11, int i10, float f10, float f11, e targetInfo, List clicks) {
            AbstractC4862t.e(targetInfo, "targetInfo");
            AbstractC4862t.e(clicks, "clicks");
            this.f43200a = j10;
            this.f43201b = j11;
            this.f43202c = i10;
            this.f43203d = f10;
            this.f43204e = f11;
            this.f43205f = targetInfo;
            this.f43206g = clicks;
        }

        public final int a() {
            return this.f43202c;
        }

        public final List b() {
            return this.f43206g;
        }

        public final long c() {
            return this.f43200a;
        }

        public final float d() {
            return this.f43203d;
        }

        public final float e() {
            return this.f43204e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f43200a == dVar.f43200a && this.f43201b == dVar.f43201b && this.f43202c == dVar.f43202c && Float.compare(this.f43203d, dVar.f43203d) == 0 && Float.compare(this.f43204e, dVar.f43204e) == 0 && AbstractC4862t.a(this.f43205f, dVar.f43205f) && AbstractC4862t.a(this.f43206g, dVar.f43206g);
        }

        public final long f() {
            return this.f43201b;
        }

        public final void g(int i10) {
            this.f43202c = i10;
        }

        public final void h(long j10) {
            this.f43201b = j10;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.f43200a) * 31) + Long.hashCode(this.f43201b)) * 31) + Integer.hashCode(this.f43202c)) * 31) + Float.hashCode(this.f43203d)) * 31) + Float.hashCode(this.f43204e)) * 31) + this.f43205f.hashCode()) * 31) + this.f43206g.hashCode();
        }

        public String toString() {
            return "RageClickSession(firstClickTime=" + this.f43200a + ", lastClickTime=" + this.f43201b + ", clickCount=" + this.f43202c + ", firstClickX=" + this.f43203d + ", firstClickY=" + this.f43204e + ", targetInfo=" + this.f43205f + ", clicks=" + this.f43206g + ')';
        }
    }

    /* JADX INFO: renamed from: q4.h$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f43209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f43210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f43211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f43212f;

        public e(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f43207a = str;
            this.f43208b = str2;
            this.f43209c = str3;
            this.f43210d = str4;
            this.f43211e = str5;
            this.f43212f = str6;
        }

        public final String a() {
            return this.f43207a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC4862t.a(this.f43207a, eVar.f43207a) && AbstractC4862t.a(this.f43208b, eVar.f43208b) && AbstractC4862t.a(this.f43209c, eVar.f43209c) && AbstractC4862t.a(this.f43210d, eVar.f43210d) && AbstractC4862t.a(this.f43211e, eVar.f43211e) && AbstractC4862t.a(this.f43212f, eVar.f43212f);
        }

        public int hashCode() {
            String str = this.f43207a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f43208b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f43209c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f43210d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f43211e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f43212f;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "TargetInfo(className=" + this.f43207a + ", resourceName=" + this.f43208b + ", tag=" + this.f43209c + ", text=" + this.f43210d + ", source=" + this.f43211e + ", hierarchy=" + this.f43212f + ')';
        }
    }

    /* JADX INFO: renamed from: q4.h$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f43213j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f43215l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f43216m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c cVar, String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f43215l = cVar;
            this.f43216m = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C5492h.this.new f(this.f43215l, this.f43216m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f43213j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                this.f43213j = 1;
                if (X.a(3000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            if (C5492h.this.f43190h <= this.f43215l.d()) {
                C5492h.this.t(this.f43215l);
            }
            C5492h.this.f43189g.remove(this.f43216m);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: q4.h$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f43217j;

        /* JADX INFO: renamed from: q4.h$g$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f43219j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f43220k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C5492h f43221l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5492h c5492h, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f43221l = c5492h;
            }

            public final Object a(F4.g gVar, InterfaceC4988e interfaceC4988e) {
                return ((a) create(gVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f43221l, interfaceC4988e);
                aVar.f43220k = obj;
                return aVar;
            }

            @Override // vc.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                android.support.v4.media.session.a.a(obj);
                return a(null, (InterfaceC4988e) obj2);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f43219j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                android.support.v4.media.session.a.a(this.f43220k);
                return C4015H.f34254a;
            }
        }

        public g(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C5492h.this.new g(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((g) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f43217j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                C5492h.this.f43184b.a("Starting UI change signal collection for dead click detection");
                A aT = C5492h.this.f43183a.t();
                a aVar = new a(C5492h.this, null);
                this.f43217j = 1;
                if (AbstractC2315g.j(aT, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public C5492h(D4.a amplitude, A4.a logger, float f10, C5487c autocaptureState) {
        AbstractC4862t.e(amplitude, "amplitude");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(autocaptureState, "autocaptureState");
        this.f43183a = amplitude;
        this.f43184b = logger;
        this.f43185c = autocaptureState;
        this.f43186d = f10 * 50.0f;
        this.f43188f = new ConcurrentHashMap();
        this.f43189g = new ConcurrentHashMap();
    }

    public final Map f(c cVar) {
        return Q.l(AbstractC4040w.a("[Amplitude] Begin Time", Long.valueOf(cVar.b().c())), AbstractC4040w.a("[Amplitude] End Time", Long.valueOf(cVar.b().c() + 3000)), AbstractC4040w.a("[Amplitude] Duration", 3000L), AbstractC4040w.a("[Amplitude] X", Integer.valueOf((int) cVar.b().d())), AbstractC4040w.a("[Amplitude] Y", Integer.valueOf((int) cVar.b().e())), AbstractC4040w.a("[Amplitude] Click Count", 1));
    }

    public final Map g(d dVar) {
        C4034q c4034qA = AbstractC4040w.a("[Amplitude] Begin Time", Long.valueOf(dVar.c()));
        C4034q c4034qA2 = AbstractC4040w.a("[Amplitude] End Time", Long.valueOf(dVar.f()));
        C4034q c4034qA3 = AbstractC4040w.a("[Amplitude] Duration", Long.valueOf(dVar.f() - dVar.c()));
        C4034q c4034qA4 = AbstractC4040w.a("[Amplitude] X", Integer.valueOf((int) dVar.d()));
        C4034q c4034qA5 = AbstractC4040w.a("[Amplitude] Y", Integer.valueOf((int) dVar.e()));
        C4034q c4034qA6 = AbstractC4040w.a("[Amplitude] Click Count", Integer.valueOf(dVar.a()));
        List<a> listB = dVar.b();
        ArrayList arrayList = new ArrayList(C4207u.v(listB, 10));
        for (a aVar : listB) {
            arrayList.add(Q.l(AbstractC4040w.a("[Amplitude] X", Integer.valueOf((int) aVar.d())), AbstractC4040w.a("[Amplitude] Y", Integer.valueOf((int) aVar.e())), AbstractC4040w.a("timestamp", Long.valueOf(aVar.c()))));
        }
        return Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, c4034qA5, c4034qA6, AbstractC4040w.a("[Amplitude] Clicks", arrayList));
    }

    public final String h(a aVar, e eVar) {
        StringBuilder sb2 = new StringBuilder();
        String strA = eVar.a();
        if (strA == null) {
            strA = "null";
        }
        sb2.append(strA);
        sb2.append('_');
        sb2.append((int) aVar.d());
        sb2.append('_');
        sb2.append((int) aVar.e());
        sb2.append('_');
        sb2.append(System.currentTimeMillis());
        return sb2.toString();
    }

    public final String i(a aVar, e eVar) {
        return eVar.a() + '_' + ((int) (aVar.d() / this.f43186d)) + '_' + ((int) (aVar.e() / this.f43186d));
    }

    public final boolean j() {
        return this.f43190h > 0;
    }

    public final boolean k(C5717c c5717c) {
        return c5717c.a();
    }

    public final boolean l(C5717c c5717c) {
        return c5717c.b();
    }

    public final boolean m(float f10, float f11, float f12, float f13) {
        PointF pointF = new PointF(f10, f11);
        PointF pointF2 = new PointF(f12, f13);
        return PointF.length(pointF.x - pointF2.x, pointF.y - pointF2.y) <= this.f43186d;
    }

    public final void n(a clickInfo, e targetInfo, C5717c target, Activity activity) {
        C5492h c5492h;
        a aVar;
        e eVar;
        C5717c c5717c;
        Activity activity2;
        AbstractC4862t.e(clickInfo, "clickInfo");
        AbstractC4862t.e(targetInfo, "targetInfo");
        AbstractC4862t.e(target, "target");
        AbstractC4862t.e(activity, "activity");
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strH = h(clickInfo, targetInfo);
        if (!this.f43185c.c().contains(AbstractC5493i.c.f43224a)) {
            c5492h = this;
            aVar = clickInfo;
            eVar = targetInfo;
            c5717c = target;
            activity2 = activity;
        } else if (l(target)) {
            c5492h = this;
            aVar = clickInfo;
            eVar = targetInfo;
            c5717c = target;
            activity2 = activity;
            c5492h.f43184b.a("Skipping rage click processing for ignored target: " + eVar.a());
        } else {
            c5492h = this;
            aVar = clickInfo;
            eVar = targetInfo;
            c5717c = target;
            activity2 = activity;
            c5492h.p(aVar, eVar, c5717c, activity2, jCurrentTimeMillis);
        }
        if (c5492h.f43185c.c().contains(AbstractC5493i.a.f43222a)) {
            if (!c5492h.k(c5717c)) {
                c5492h.o(aVar, eVar, c5717c, activity2, jCurrentTimeMillis, strH);
                return;
            }
            c5492h.f43184b.a("Skipping dead click processing for ignored target: " + eVar.a());
        }
    }

    public final void o(a aVar, e eVar, C5717c c5717c, Activity activity, long j10, String str) {
        InterfaceC2166z0 interfaceC2166z0C;
        InterfaceC2166z0 interfaceC2166z0 = this.f43187e;
        if (interfaceC2166z0 == null || !interfaceC2166z0.c()) {
            this.f43184b.d("Dead click detection is disabled - call start() to enable.");
            return;
        }
        if (!j()) {
            this.f43184b.d("Dead click detection is disabled - no UI change signals observed yet. Ensure SessionReplay plugin is active.");
            return;
        }
        c cVar = (c) this.f43189g.get(str);
        if (cVar != null && (interfaceC2166z0C = cVar.c()) != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0C, null, 1, null);
        }
        c cVar2 = new c(c5717c, activity, a.b(aVar, 0.0f, 0.0f, j10, 3, null), eVar, this.f43190h, null, 32, null);
        this.f43189g.put(str, cVar2);
        cVar2.f(AbstractC2132i.d(this.f43183a.k(), this.f43183a.j(), null, new f(cVar2, str, null), 2, null));
    }

    public final void p(a aVar, e eVar, C5717c c5717c, Activity activity, long j10) {
        String strI = i(aVar, eVar);
        d dVar = (d) this.f43188f.get(strI);
        if (dVar == null) {
            r(strI, aVar, eVar, j10);
            return;
        }
        if (j10 - dVar.c() > 1000) {
            r(strI, aVar, eVar, j10);
            return;
        }
        if (!m(aVar.d(), aVar.e(), dVar.d(), dVar.e())) {
            r(strI, aVar, eVar, j10);
            return;
        }
        dVar.g(dVar.a() + 1);
        dVar.h(j10);
        dVar.b().add(a.b(aVar, 0.0f, 0.0f, j10, 3, null));
        if (dVar.a() >= 4) {
            u(dVar, c5717c, activity);
            this.f43188f.remove(strI);
        }
    }

    public final void q() {
        s();
        this.f43184b.a("FrustrationInteractionsDetector started - UI change collection is now active");
    }

    public final void r(String str, a aVar, e eVar, long j10) {
        this.f43188f.put(str, new d(j10, j10, 1, aVar.d(), aVar.e(), eVar, C4206t.q(a.b(aVar, 0.0f, 0.0f, j10, 3, null))));
    }

    public final void s() {
        this.f43187e = AbstractC2132i.d(this.f43183a.k(), this.f43183a.j(), null, new g(null), 2, null);
    }

    public final void t(c cVar) {
        D4.a.H(this.f43183a, "[Amplitude] Dead Click", Q.p(AbstractC5718d.a(cVar.e(), cVar.a()), f(cVar)), null, 4, null);
        this.f43184b.a("Dead click detected");
    }

    public final void u(d dVar, C5717c c5717c, Activity activity) {
        D4.a.H(this.f43183a, "[Amplitude] Rage Click", Q.p(AbstractC5718d.a(c5717c, activity), g(dVar)), null, 4, null);
        this.f43184b.a("Rage click detected with " + dVar.a() + " clicks");
    }

    /* JADX INFO: renamed from: q4.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f43191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f43192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f43193c;

        public a(float f10, float f11, long j10) {
            this.f43191a = f10;
            this.f43192b = f11;
            this.f43193c = j10;
        }

        public static /* synthetic */ a b(a aVar, float f10, float f11, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f43191a;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f43192b;
            }
            if ((i10 & 4) != 0) {
                j10 = aVar.f43193c;
            }
            return aVar.a(f10, f11, j10);
        }

        public final a a(float f10, float f11, long j10) {
            return new a(f10, f11, j10);
        }

        public final long c() {
            return this.f43193c;
        }

        public final float d() {
            return this.f43191a;
        }

        public final float e() {
            return this.f43192b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f43191a, aVar.f43191a) == 0 && Float.compare(this.f43192b, aVar.f43192b) == 0 && this.f43193c == aVar.f43193c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f43191a) * 31) + Float.hashCode(this.f43192b)) * 31) + Long.hashCode(this.f43193c);
        }

        public String toString() {
            return "ClickInfo(x=" + this.f43191a + ", y=" + this.f43192b + ", timestamp=" + this.f43193c + ')';
        }

        public /* synthetic */ a(float f10, float f11, long j10, int i10, AbstractC4854k abstractC4854k) {
            this(f10, f11, (i10 & 4) != 0 ? System.currentTimeMillis() : j10);
        }
    }

    /* JADX INFO: renamed from: q4.h$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5717c f43194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Activity f43195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f43196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f43197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f43198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC2166z0 f43199f;

        public c(C5717c target, Activity activity, a clickInfo, e targetInfo, long j10, InterfaceC2166z0 interfaceC2166z0) {
            AbstractC4862t.e(target, "target");
            AbstractC4862t.e(activity, "activity");
            AbstractC4862t.e(clickInfo, "clickInfo");
            AbstractC4862t.e(targetInfo, "targetInfo");
            this.f43194a = target;
            this.f43195b = activity;
            this.f43196c = clickInfo;
            this.f43197d = targetInfo;
            this.f43198e = j10;
            this.f43199f = interfaceC2166z0;
        }

        public final Activity a() {
            return this.f43195b;
        }

        public final a b() {
            return this.f43196c;
        }

        public final InterfaceC2166z0 c() {
            return this.f43199f;
        }

        public final long d() {
            return this.f43198e;
        }

        public final C5717c e() {
            return this.f43194a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC4862t.a(this.f43194a, cVar.f43194a) && AbstractC4862t.a(this.f43195b, cVar.f43195b) && AbstractC4862t.a(this.f43196c, cVar.f43196c) && AbstractC4862t.a(this.f43197d, cVar.f43197d) && this.f43198e == cVar.f43198e && AbstractC4862t.a(this.f43199f, cVar.f43199f);
        }

        public final void f(InterfaceC2166z0 interfaceC2166z0) {
            this.f43199f = interfaceC2166z0;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.f43194a.hashCode() * 31) + this.f43195b.hashCode()) * 31) + this.f43196c.hashCode()) * 31) + this.f43197d.hashCode()) * 31) + Long.hashCode(this.f43198e)) * 31;
            InterfaceC2166z0 interfaceC2166z0 = this.f43199f;
            return iHashCode + (interfaceC2166z0 == null ? 0 : interfaceC2166z0.hashCode());
        }

        public String toString() {
            return "DeadClickSession(target=" + this.f43194a + ", activity=" + this.f43195b + ", clickInfo=" + this.f43196c + ", targetInfo=" + this.f43197d + ", preClickUiChangeTime=" + this.f43198e + ", job=" + this.f43199f + ')';
        }

        public /* synthetic */ c(C5717c c5717c, Activity activity, a aVar, e eVar, long j10, InterfaceC2166z0 interfaceC2166z0, int i10, AbstractC4854k abstractC4854k) {
            this(c5717c, activity, aVar, eVar, j10, (i10 & 32) != 0 ? null : interfaceC2166z0);
        }
    }
}
