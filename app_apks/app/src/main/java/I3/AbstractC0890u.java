package I3;

import android.util.Log;

/* JADX INFO: renamed from: I3.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0890u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5637a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AbstractC0890u f5638b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5639c = 20;

    /* JADX INFO: renamed from: I3.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC0890u {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5640d;

        public a(int i10) {
            super(i10);
            this.f5640d = i10;
        }

        @Override // I3.AbstractC0890u
        public void a(String str, String str2) {
            if (this.f5640d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // I3.AbstractC0890u
        public void b(String str, String str2, Throwable th) {
            if (this.f5640d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // I3.AbstractC0890u
        public void c(String str, String str2) {
            if (this.f5640d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // I3.AbstractC0890u
        public void d(String str, String str2, Throwable th) {
            if (this.f5640d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // I3.AbstractC0890u
        public void f(String str, String str2) {
            if (this.f5640d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // I3.AbstractC0890u
        public void g(String str, String str2, Throwable th) {
            if (this.f5640d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // I3.AbstractC0890u
        public void j(String str, String str2) {
            if (this.f5640d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // I3.AbstractC0890u
        public void k(String str, String str2) {
            if (this.f5640d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // I3.AbstractC0890u
        public void l(String str, String str2, Throwable th) {
            if (this.f5640d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public AbstractC0890u(int i10) {
    }

    public static AbstractC0890u e() {
        AbstractC0890u abstractC0890u;
        synchronized (f5637a) {
            try {
                if (f5638b == null) {
                    f5638b = new a(3);
                }
                abstractC0890u = f5638b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0890u;
    }

    public static void h(AbstractC0890u abstractC0890u) {
        synchronized (f5637a) {
            try {
                if (f5638b == null) {
                    f5638b = abstractC0890u;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f5639c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
