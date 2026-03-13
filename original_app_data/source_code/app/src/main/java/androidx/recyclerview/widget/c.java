package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24325b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24326c = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f24327a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f24328b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f24327a &= ~(1 << i10);
                return;
            }
            a aVar = this.f24328b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.f24328b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f24327a);
                }
                return Long.bitCount(((1 << i10) - 1) & this.f24327a);
            }
            if (i10 >= 64) {
                return aVar.b(i10 - 64) + Long.bitCount(this.f24327a);
            }
            return Long.bitCount(((1 << i10) - 1) & this.f24327a);
        }

        public final void c() {
            if (this.f24328b == null) {
                this.f24328b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return ((1 << i10) & this.f24327a) != 0;
            }
            c();
            return this.f24328b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f24328b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f24327a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f24327a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f24328b != null) {
                c();
                this.f24328b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f24328b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f24327a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f24327a = j12;
            long j13 = j10 - 1;
            this.f24327a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f24328b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f24328b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f24327a = 0L;
            a aVar = this.f24328b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f24327a |= 1 << i10;
            } else {
                c();
                this.f24328b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f24328b == null) {
                return Long.toBinaryString(this.f24327a);
            }
            return this.f24328b.toString() + "xx" + Long.toBinaryString(this.f24327a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        View a(int i10);

        void b(View view);

        int c();

        RecyclerView.E d(View view);

        void e(int i10);

        void f(View view, int i10);

        void g();

        int h(View view);

        void i(View view);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    public c(b bVar) {
        this.f24324a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f24324a.c() : h(i10);
        this.f24325b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f24324a.f(view, iC);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f24324a.c() : h(i10);
        this.f24325b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f24324a.k(view, iC, layoutParams);
    }

    public void d(int i10) {
        int iH = h(i10);
        this.f24325b.f(iH);
        this.f24324a.e(iH);
    }

    public View e(int i10) {
        int size = this.f24326c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f24326c.get(i11);
            RecyclerView.E eD = this.f24324a.d(view);
            if (eD.getLayoutPosition() == i10 && !eD.isInvalid() && !eD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f24324a.a(h(i10));
    }

    public int g() {
        return this.f24324a.c() - this.f24326c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f24324a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f24325b.b(i11));
            if (iB == 0) {
                while (this.f24325b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f24324a.a(i10);
    }

    public int j() {
        return this.f24324a.c();
    }

    public void k(View view) {
        int iH = this.f24324a.h(view);
        if (iH >= 0) {
            this.f24325b.h(iH);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f24326c.add(view);
        this.f24324a.b(view);
    }

    public int m(View view) {
        int iH = this.f24324a.h(view);
        if (iH == -1 || this.f24325b.d(iH)) {
            return -1;
        }
        return iH - this.f24325b.b(iH);
    }

    public boolean n(View view) {
        return this.f24326c.contains(view);
    }

    public void o() {
        this.f24325b.g();
        for (int size = this.f24326c.size() - 1; size >= 0; size--) {
            this.f24324a.i((View) this.f24326c.get(size));
            this.f24326c.remove(size);
        }
        this.f24324a.g();
    }

    public void p(View view) {
        int iH = this.f24324a.h(view);
        if (iH < 0) {
            return;
        }
        if (this.f24325b.f(iH)) {
            t(view);
        }
        this.f24324a.j(iH);
    }

    public void q(int i10) {
        int iH = h(i10);
        View viewA = this.f24324a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f24325b.f(iH)) {
            t(viewA);
        }
        this.f24324a.j(iH);
    }

    public boolean r(View view) {
        int iH = this.f24324a.h(view);
        if (iH == -1) {
            t(view);
            return true;
        }
        if (!this.f24325b.d(iH)) {
            return false;
        }
        this.f24325b.f(iH);
        t(view);
        this.f24324a.j(iH);
        return true;
    }

    public void s(View view) {
        int iH = this.f24324a.h(view);
        if (iH < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f24325b.d(iH)) {
            this.f24325b.a(iH);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f24326c.remove(view)) {
            return false;
        }
        this.f24324a.i(view);
        return true;
    }

    public String toString() {
        return this.f24325b.toString() + ", hidden list:" + this.f24326c.size();
    }
}
