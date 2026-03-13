package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import b9.C2898a;
import c9.f;
import c9.i;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.l;
import d9.e;
import f9.C4003a;
import f9.InterfaceC4004b;
import h9.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Trace extends X8.b implements Parcelable, InterfaceC4004b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f31835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Trace f31836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaugeManager f31837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f31839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f31840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f31841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f31842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f31843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.firebase.perf.util.a f31844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f31845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f31846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C2898a f31832m = C2898a.e();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map f31833n = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Parcelable.Creator f31834o = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    @Override // f9.InterfaceC4004b
    public void a(C4003a c4003a) {
        if (c4003a == null) {
            f31832m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!i() || k()) {
                return;
            }
            this.f31841g.add(c4003a);
        }
    }

    public final void b(String str, String str2) {
        if (k()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f31838d));
        }
        if (!this.f31840f.containsKey(str) && this.f31840f.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        e.d(str, str2);
    }

    public Map c() {
        return this.f31839e;
    }

    public l d() {
        return this.f31846l;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f31838d;
    }

    public List f() {
        List listUnmodifiableList;
        synchronized (this.f31841g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C4003a c4003a : this.f31841g) {
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

    public void finalize() throws Throwable {
        try {
            if (j()) {
                f31832m.k("Trace '%s' is started but not stopped when it is destructed!", this.f31838d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public l g() {
        return this.f31845k;
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f31840f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f31840f);
    }

    @Keep
    public long getLongMetric(String str) {
        f fVar = str != null ? (f) this.f31839e.get(str.trim()) : null;
        if (fVar == null) {
            return 0L;
        }
        return fVar.a();
    }

    public List h() {
        return this.f31842h;
    }

    public boolean i() {
        return this.f31845k != null;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f31832m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f31832m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f31838d);
        } else {
            if (k()) {
                f31832m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f31838d);
                return;
            }
            f fVarL = l(str.trim());
            fVarL.c(j10);
            f31832m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(fVarL.a()), this.f31838d);
        }
    }

    public boolean j() {
        return i() && !k();
    }

    public boolean k() {
        return this.f31846l != null;
    }

    public final f l(String str) {
        f fVar = (f) this.f31839e.get(str);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(str);
        this.f31839e.put(str, fVar2);
        return fVar2;
    }

    public final void m(l lVar) {
        if (this.f31842h.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f31842h.get(this.f31842h.size() - 1);
        if (trace.f31846l == null) {
            trace.f31846l = lVar;
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f31832m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f31838d);
            z10 = true;
        } catch (Exception e10) {
            f31832m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f31840f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f31832m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f31832m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f31838d);
        } else if (k()) {
            f31832m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f31838d);
        } else {
            l(str.trim()).d(j10);
            f31832m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f31838d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (k()) {
            f31832m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f31840f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!Y8.a.g().K()) {
            f31832m.a("Trace feature is disabled.");
            return;
        }
        String strF = e.f(this.f31838d);
        if (strF != null) {
            f31832m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f31838d, strF);
            return;
        }
        if (this.f31845k != null) {
            f31832m.d("Trace '%s' has already started, should not start again!", this.f31838d);
            return;
        }
        this.f31845k = this.f31844j.a();
        registerForAppState();
        C4003a c4003aPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f31835a);
        a(c4003aPerfSession);
        if (c4003aPerfSession.e()) {
            this.f31837c.collectGaugeMetricOnce(c4003aPerfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f31832m.d("Trace '%s' has not been started so unable to stop!", this.f31838d);
            return;
        }
        if (k()) {
            f31832m.d("Trace '%s' has already stopped, should not stop again!", this.f31838d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f31835a);
        unregisterForAppState();
        l lVarA = this.f31844j.a();
        this.f31846l = lVarA;
        if (this.f31836b == null) {
            m(lVarA);
            if (this.f31838d.isEmpty()) {
                f31832m.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.f31843i.x(new i(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f31837c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f31836b, 0);
        parcel.writeString(this.f31838d);
        parcel.writeList(this.f31842h);
        parcel.writeMap(this.f31839e);
        parcel.writeParcelable(this.f31845k, 0);
        parcel.writeParcelable(this.f31846l, 0);
        synchronized (this.f31841g) {
            parcel.writeList(this.f31841g);
        }
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, X8.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, X8.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f31835a = new WeakReference(this);
        this.f31836b = null;
        this.f31838d = str.trim();
        this.f31842h = new ArrayList();
        this.f31839e = new ConcurrentHashMap();
        this.f31840f = new ConcurrentHashMap();
        this.f31844j = aVar;
        this.f31843i = kVar;
        this.f31841g = Collections.synchronizedList(new ArrayList());
        this.f31837c = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : X8.a.b());
        this.f31835a = new WeakReference(this);
        this.f31836b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f31838d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f31842h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f31839e = concurrentHashMap;
        this.f31840f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, f.class.getClassLoader());
        this.f31845k = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f31846l = (l) parcel.readParcelable(l.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f31841g = listSynchronizedList;
        parcel.readList(listSynchronizedList, C4003a.class.getClassLoader());
        if (z10) {
            this.f31843i = null;
            this.f31844j = null;
            this.f31837c = null;
        } else {
            this.f31843i = k.k();
            this.f31844j = new com.google.firebase.perf.util.a();
            this.f31837c = GaugeManager.getInstance();
        }
    }
}
