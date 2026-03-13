package c9;

import b9.C2898a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.o;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfSession;
import f9.C4003a;
import f9.InterfaceC4004b;
import h9.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends X8.b implements InterfaceC4004b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2898a f26384i = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GaugeManager f26386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f26387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NetworkRequestMetric.b f26388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f26389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26392h;

    public h(k kVar) {
        this(kVar, X8.a.b(), GaugeManager.getInstance());
    }

    public static h c(k kVar) {
        return new h(kVar);
    }

    private boolean g() {
        return this.f26388d.o();
    }

    private boolean h() {
        return this.f26388d.q();
    }

    public static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // f9.InterfaceC4004b
    public void a(C4003a c4003a) {
        if (c4003a == null) {
            f26384i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!g() || h()) {
                return;
            }
            this.f26385a.add(c4003a);
        }
    }

    public NetworkRequestMetric b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f26389e);
        unregisterForAppState();
        PerfSession[] perfSessionArrB = C4003a.b(d());
        if (perfSessionArrB != null) {
            this.f26388d.j(Arrays.asList(perfSessionArrB));
        }
        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.f26388d.build();
        if (!e9.h.c(this.f26390f)) {
            f26384i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return networkRequestMetric;
        }
        if (this.f26391g) {
            if (this.f26392h) {
                f26384i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return networkRequestMetric;
        }
        this.f26387c.w(networkRequestMetric, getAppState());
        this.f26391g = true;
        return networkRequestMetric;
    }

    public List d() {
        List listUnmodifiableList;
        synchronized (this.f26385a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C4003a c4003a : this.f26385a) {
                    if (c4003a != null) {
                        arrayList.add(c4003a);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listUnmodifiableList;
    }

    public long e() {
        return this.f26388d.n();
    }

    public boolean f() {
        return this.f26388d.p();
    }

    public h j(String str) {
        NetworkRequestMetric.d dVar;
        if (str != null) {
            NetworkRequestMetric.d dVar2 = NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = NetworkRequestMetric.d.OPTIONS;
                    break;
                case "GET":
                    dVar = NetworkRequestMetric.d.GET;
                    break;
                case "PUT":
                    dVar = NetworkRequestMetric.d.PUT;
                    break;
                case "HEAD":
                    dVar = NetworkRequestMetric.d.HEAD;
                    break;
                case "POST":
                    dVar = NetworkRequestMetric.d.POST;
                    break;
                case "PATCH":
                    dVar = NetworkRequestMetric.d.PATCH;
                    break;
                case "TRACE":
                    dVar = NetworkRequestMetric.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = NetworkRequestMetric.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = NetworkRequestMetric.d.DELETE;
                    break;
                default:
                    dVar = NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f26388d.s(dVar);
        }
        return this;
    }

    public h k(int i10) {
        this.f26388d.t(i10);
        return this;
    }

    public h l() {
        this.f26388d.u(NetworkRequestMetric.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h m(long j10) {
        this.f26388d.v(j10);
        return this;
    }

    public h n(long j10) {
        C4003a c4003aPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f26389e);
        this.f26388d.r(j10);
        a(c4003aPerfSession);
        if (c4003aPerfSession.e()) {
            this.f26386b.collectGaugeMetricOnce(c4003aPerfSession.d());
        }
        return this;
    }

    public h o(String str) {
        if (str == null) {
            this.f26388d.m();
            return this;
        }
        if (i(str)) {
            this.f26388d.w(str);
            return this;
        }
        f26384i.j("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public h q(long j10) {
        this.f26388d.x(j10);
        return this;
    }

    public h r(long j10) {
        this.f26388d.y(j10);
        return this;
    }

    public h t(long j10) {
        this.f26388d.z(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f26386b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h u(long j10) {
        this.f26388d.A(j10);
        return this;
    }

    public h v(String str) {
        if (str != null) {
            this.f26388d.B(o.e(o.d(str), 2000));
        }
        return this;
    }

    public h w(String str) {
        this.f26390f = str;
        return this;
    }

    public h(k kVar, X8.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f26388d = NetworkRequestMetric.newBuilder();
        this.f26389e = new WeakReference(this);
        this.f26387c = kVar;
        this.f26386b = gaugeManager;
        this.f26385a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
