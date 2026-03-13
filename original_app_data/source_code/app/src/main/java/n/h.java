package n;

import Y0.M;
import Y0.N;
import Y0.O;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f40468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N f40469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40470e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40467b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O f40471f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40466a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends O {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f40472a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f40473b = 0;

        public a() {
        }

        @Override // Y0.O, Y0.N
        public void b(View view) {
            int i10 = this.f40473b + 1;
            this.f40473b = i10;
            if (i10 == h.this.f40466a.size()) {
                N n10 = h.this.f40469d;
                if (n10 != null) {
                    n10.b(null);
                }
                d();
            }
        }

        @Override // Y0.O, Y0.N
        public void c(View view) {
            if (this.f40472a) {
                return;
            }
            this.f40472a = true;
            N n10 = h.this.f40469d;
            if (n10 != null) {
                n10.c(null);
            }
        }

        public void d() {
            this.f40473b = 0;
            this.f40472a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f40470e) {
            Iterator it = this.f40466a.iterator();
            while (it.hasNext()) {
                ((M) it.next()).c();
            }
            this.f40470e = false;
        }
    }

    public void b() {
        this.f40470e = false;
    }

    public h c(M m10) {
        if (!this.f40470e) {
            this.f40466a.add(m10);
        }
        return this;
    }

    public h d(M m10, M m11) {
        this.f40466a.add(m10);
        m11.i(m10.d());
        this.f40466a.add(m11);
        return this;
    }

    public h e(long j10) {
        if (!this.f40470e) {
            this.f40467b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f40470e) {
            this.f40468c = interpolator;
        }
        return this;
    }

    public h g(N n10) {
        if (!this.f40470e) {
            this.f40469d = n10;
        }
        return this;
    }

    public void h() {
        if (this.f40470e) {
            return;
        }
        for (M m10 : this.f40466a) {
            long j10 = this.f40467b;
            if (j10 >= 0) {
                m10.e(j10);
            }
            Interpolator interpolator = this.f40468c;
            if (interpolator != null) {
                m10.f(interpolator);
            }
            if (this.f40469d != null) {
                m10.g(this.f40471f);
            }
            m10.k();
        }
        this.f40470e = true;
    }
}
