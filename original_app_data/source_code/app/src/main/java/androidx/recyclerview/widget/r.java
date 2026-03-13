package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f24547b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24548a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24552e;

        public void a(int i10) {
            this.f24548a = i10 | this.f24548a;
        }

        public boolean b() {
            int i10 = this.f24548a;
            if ((i10 & 7) != 0 && (i10 & c(this.f24551d, this.f24549b)) == 0) {
                return false;
            }
            int i11 = this.f24548a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f24551d, this.f24550c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f24548a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f24552e, this.f24549b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f24548a;
            return (i13 & 28672) == 0 || ((c(this.f24552e, this.f24550c) << 12) & i13) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f24548a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.f24549b = i10;
            this.f24550c = i11;
            this.f24551d = i12;
            this.f24552e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public r(b bVar) {
        this.f24546a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int iC = this.f24546a.c();
        int iD = this.f24546a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f24546a.a(i10);
            this.f24547b.e(iC, iD, this.f24546a.b(viewA), this.f24546a.e(viewA));
            if (i12 != 0) {
                this.f24547b.d();
                this.f24547b.a(i12);
                if (this.f24547b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f24547b.d();
                this.f24547b.a(i13);
                if (this.f24547b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.f24547b.e(this.f24546a.c(), this.f24546a.d(), this.f24546a.b(view), this.f24546a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f24547b.d();
        this.f24547b.a(i10);
        return this.f24547b.b();
    }
}
