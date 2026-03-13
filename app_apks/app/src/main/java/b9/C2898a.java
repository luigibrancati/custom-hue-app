package b9;

import java.util.Locale;

/* JADX INFO: renamed from: b9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2898a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C2898a f25474c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25476b;

    public C2898a(c cVar) {
        this.f25476b = false;
        this.f25475a = cVar == null ? c.c() : cVar;
    }

    public static C2898a e() {
        if (f25474c == null) {
            synchronized (C2898a.class) {
                try {
                    if (f25474c == null) {
                        f25474c = new C2898a();
                    }
                } finally {
                }
            }
        }
        return f25474c;
    }

    public void a(String str) {
        if (this.f25476b) {
            this.f25475a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f25476b) {
            this.f25475a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f25476b) {
            this.f25475a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f25476b) {
            this.f25475a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f25476b) {
            this.f25475a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f25476b) {
            this.f25475a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f25476b;
    }

    public void i(boolean z10) {
        this.f25476b = z10;
    }

    public void j(String str) {
        if (this.f25476b) {
            this.f25475a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f25476b) {
            this.f25475a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public C2898a() {
        this(null);
    }
}
