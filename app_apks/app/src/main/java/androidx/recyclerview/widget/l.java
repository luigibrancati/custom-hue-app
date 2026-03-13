package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f24529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f24531c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends l {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.l
        public int d(View view) {
            return this.f24529a.U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f24529a.T(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f24529a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int g(View view) {
            return this.f24529a.R(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int h() {
            return this.f24529a.p0();
        }

        @Override // androidx.recyclerview.widget.l
        public int i() {
            return this.f24529a.p0() - this.f24529a.g0();
        }

        @Override // androidx.recyclerview.widget.l
        public int j() {
            return this.f24529a.g0();
        }

        @Override // androidx.recyclerview.widget.l
        public int k() {
            return this.f24529a.q0();
        }

        @Override // androidx.recyclerview.widget.l
        public int l() {
            return this.f24529a.Y();
        }

        @Override // androidx.recyclerview.widget.l
        public int m() {
            return this.f24529a.f0();
        }

        @Override // androidx.recyclerview.widget.l
        public int n() {
            return (this.f24529a.p0() - this.f24529a.f0()) - this.f24529a.g0();
        }

        @Override // androidx.recyclerview.widget.l
        public int p(View view) {
            this.f24529a.o0(view, true, this.f24531c);
            return this.f24531c.right;
        }

        @Override // androidx.recyclerview.widget.l
        public int q(View view) {
            this.f24529a.o0(view, true, this.f24531c);
            return this.f24531c.left;
        }

        @Override // androidx.recyclerview.widget.l
        public void r(int i10) {
            this.f24529a.D0(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends l {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.l
        public int d(View view) {
            return this.f24529a.P(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f24529a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f24529a.T(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int g(View view) {
            return this.f24529a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.l
        public int h() {
            return this.f24529a.X();
        }

        @Override // androidx.recyclerview.widget.l
        public int i() {
            return this.f24529a.X() - this.f24529a.e0();
        }

        @Override // androidx.recyclerview.widget.l
        public int j() {
            return this.f24529a.e0();
        }

        @Override // androidx.recyclerview.widget.l
        public int k() {
            return this.f24529a.Y();
        }

        @Override // androidx.recyclerview.widget.l
        public int l() {
            return this.f24529a.q0();
        }

        @Override // androidx.recyclerview.widget.l
        public int m() {
            return this.f24529a.h0();
        }

        @Override // androidx.recyclerview.widget.l
        public int n() {
            return (this.f24529a.X() - this.f24529a.h0()) - this.f24529a.e0();
        }

        @Override // androidx.recyclerview.widget.l
        public int p(View view) {
            this.f24529a.o0(view, true, this.f24531c);
            return this.f24531c.bottom;
        }

        @Override // androidx.recyclerview.widget.l
        public int q(View view) {
            this.f24529a.o0(view, true, this.f24531c);
            return this.f24531c.top;
        }

        @Override // androidx.recyclerview.widget.l
        public void r(int i10) {
            this.f24529a.E0(i10);
        }
    }

    public /* synthetic */ l(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static l a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static l b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static l c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f24530b) {
            return 0;
        }
        return n() - this.f24530b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f24530b = n();
    }

    public l(RecyclerView.p pVar) {
        this.f24530b = Integer.MIN_VALUE;
        this.f24531c = new Rect();
        this.f24529a = pVar;
    }
}
