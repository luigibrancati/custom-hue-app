package com.google.firebase.remoteconfig.internal;

import P8.h;
import P8.m;
import android.text.format.DateUtils;
import b7.InterfaceC2869c;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k9.p;
import k9.q;
import k9.r;
import k9.t;
import l8.InterfaceC4964a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f31928j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f31929k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f31930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O8.b f31931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f31932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B6.e f31933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f31934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l9.e f31935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f31936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f31937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f31938i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f31939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.firebase.remoteconfig.internal.b f31941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f31942d;

        public a(Date date, int i10, com.google.firebase.remoteconfig.internal.b bVar, String str) {
            this.f31939a = date;
            this.f31940b = i10;
            this.f31941c = bVar;
            this.f31942d = str;
        }

        public static a a(Date date, com.google.firebase.remoteconfig.internal.b bVar) {
            return new a(date, 1, bVar, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.b bVar, String str) {
            return new a(bVar.h(), 0, bVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.b d() {
            return this.f31941c;
        }

        public String e() {
            return this.f31942d;
        }

        public int f() {
            return this.f31940b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        public String b() {
            return this.value;
        }
    }

    public c(h hVar, O8.b bVar, Executor executor, B6.e eVar, Random random, l9.e eVar2, ConfigFetchHttpClient configFetchHttpClient, e eVar3, Map map) {
        this.f31930a = hVar;
        this.f31931b = bVar;
        this.f31932c = executor;
        this.f31933d = eVar;
        this.f31934e = random;
        this.f31935f = eVar2;
        this.f31936g = configFetchHttpClient;
        this.f31937h = eVar3;
        this.f31938i = map;
    }

    public static /* synthetic */ Task a(c cVar, Task task, Task task2, Date date, Map map, Task task3) {
        cVar.getClass();
        return !task.q() ? Tasks.d(new p("Firebase Installations failed to get installation ID for fetch.", task.l())) : !task2.q() ? Tasks.d(new p("Firebase Installations failed to get installation auth token for fetch.", task2.l())) : cVar.l((String) task.m(), ((m) task2.m()).b(), date, map);
    }

    public static /* synthetic */ Task c(c cVar, Date date, Task task) {
        cVar.x(task, date);
        return task;
    }

    public final boolean f(long j10, Date date) {
        Date dateF = this.f31937h.f();
        if (dateF.equals(e.f31966f)) {
            return false;
        }
        return date.before(new Date(dateF.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    public final t g(t tVar) throws p {
        String str;
        int iA = tVar.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new p("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new t(tVar.a(), "Fetch failed: " + str, tVar);
    }

    public final String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    public Task i() {
        return j(this.f31937h.h());
    }

    public Task j(final long j10) {
        final HashMap map = new HashMap(this.f31938i);
        map.put("X-Firebase-RC-Fetch-Type", b.BASE.b() + "/1");
        return this.f31935f.e().k(this.f31932c, new InterfaceC2869c() { // from class: l9.f
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return this.f39944a.m(task, j10, map);
            }
        });
    }

    public final a k(String str, String str2, Date date, Map map) throws r, t {
        Date date2;
        try {
            date2 = date;
            try {
                a aVarFetch = this.f31936g.fetch(this.f31936g.d(), str, str2, s(), this.f31937h.e(), map, p(), date2, this.f31937h.b());
                if (aVarFetch.d() != null) {
                    this.f31937h.p(aVarFetch.d().k());
                }
                if (aVarFetch.e() != null) {
                    this.f31937h.o(aVarFetch.e());
                }
                this.f31937h.j();
                return aVarFetch;
            } catch (t e10) {
                e = e10;
                t tVar = e;
                e.a aVarV = v(tVar.a(), date2);
                if (u(aVarV, tVar.a())) {
                    throw new r(aVarV.a().getTime());
                }
                throw g(tVar);
            }
        } catch (t e11) {
            e = e11;
            date2 = date;
        }
    }

    public final Task l(String str, String str2, Date date, Map map) {
        try {
            final a aVarK = k(str, str2, date, map);
            return aVarK.f() != 0 ? Tasks.e(aVarK) : this.f31935f.i(aVarK.d()).s(this.f31932c, new InterfaceC2877k() { // from class: l9.j
                @Override // b7.InterfaceC2877k
                public final Task a(Object obj) {
                    return Tasks.e(aVarK);
                }
            });
        } catch (q e10) {
            return Tasks.d(e10);
        }
    }

    public final Task m(Task task, long j10, final Map map) {
        final c cVar;
        Task taskK;
        final Date date = new Date(this.f31933d.a());
        if (task.q() && f(j10, date)) {
            return Tasks.e(a.c(date));
        }
        Date dateO = o(date);
        if (dateO != null) {
            taskK = Tasks.d(new r(h(dateO.getTime() - date.getTime()), dateO.getTime()));
            cVar = this;
        } else {
            final Task id2 = this.f31930a.getId();
            final Task taskA = this.f31930a.a(false);
            cVar = this;
            taskK = Tasks.j(id2, taskA).k(this.f31932c, new InterfaceC2869c() { // from class: l9.g
                @Override // b7.InterfaceC2869c
                public final Object a(Task task2) {
                    return com.google.firebase.remoteconfig.internal.c.a(this.f39947a, id2, taskA, date, map, task2);
                }
            });
        }
        return taskK.k(cVar.f31932c, new InterfaceC2869c() { // from class: l9.h
            @Override // b7.InterfaceC2869c
            public final Object a(Task task2) {
                return com.google.firebase.remoteconfig.internal.c.c(this.f39952a, date, task2);
            }
        });
    }

    public Task n(b bVar, int i10) {
        final HashMap map = new HashMap(this.f31938i);
        map.put("X-Firebase-RC-Fetch-Type", bVar.b() + "/" + i10);
        return this.f31935f.e().k(this.f31932c, new InterfaceC2869c() { // from class: l9.i
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return this.f39954a.m(task, 0L, map);
            }
        });
    }

    public final Date o(Date date) {
        Date dateA = this.f31937h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    public final Long p() {
        InterfaceC4964a interfaceC4964a = (InterfaceC4964a) this.f31931b.get();
        if (interfaceC4964a == null) {
            return null;
        }
        return (Long) interfaceC4964a.c(true).get("_fot");
    }

    public final long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f31929k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f31934e.nextInt((int) millis));
    }

    public long r() {
        return this.f31937h.g();
    }

    public final Map s() {
        HashMap map = new HashMap();
        InterfaceC4964a interfaceC4964a = (InterfaceC4964a) this.f31931b.get();
        if (interfaceC4964a != null) {
            for (Map.Entry entry : interfaceC4964a.c(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    public final boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public final boolean u(e.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    public final e.a v(int i10, Date date) {
        if (t(i10)) {
            w(date);
        }
        return this.f31937h.a();
    }

    public final void w(Date date) {
        int iB = this.f31937h.a().b() + 1;
        this.f31937h.l(iB, new Date(date.getTime() + q(iB)));
    }

    public final void x(Task task, Date date) {
        if (task.q()) {
            this.f31937h.t(date);
            return;
        }
        Exception excL = task.l();
        if (excL == null) {
            return;
        }
        if (excL instanceof r) {
            this.f31937h.u();
        } else {
            this.f31937h.s();
        }
    }
}
