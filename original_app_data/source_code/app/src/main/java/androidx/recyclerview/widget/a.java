package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X0.e f24311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0309a f24314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f24315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f24317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24318h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0309a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.E f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24322d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f24319a = i10;
            this.f24320b = i11;
            this.f24322d = i12;
            this.f24321c = obj;
        }

        public String a() {
            int i10 = this.f24319a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f24319a;
            if (i10 != bVar.f24319a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f24322d - this.f24320b) == 1 && this.f24322d == bVar.f24320b && this.f24320b == bVar.f24322d) {
                return true;
            }
            if (this.f24322d != bVar.f24322d || this.f24320b != bVar.f24320b) {
                return false;
            }
            Object obj2 = this.f24321c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f24321c)) {
                    return false;
                }
            } else if (bVar.f24321c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f24319a * 31) + this.f24320b) * 31) + this.f24322d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f24320b + "c:" + this.f24322d + ",p:" + this.f24321c + "]";
        }
    }

    public a(InterfaceC0309a interfaceC0309a) {
        this(interfaceC0309a, false);
    }

    @Override // androidx.recyclerview.widget.k.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f24311a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f24319a = i10;
        bVar.f24320b = i11;
        bVar.f24322d = i12;
        bVar.f24321c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.k.a
    public void b(b bVar) {
        if (this.f24316f) {
            return;
        }
        bVar.f24321c = null;
        this.f24311a.a(bVar);
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i10) {
        int size = this.f24312b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f24312b.get(i11);
            int i12 = bVar.f24319a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f24320b;
                    if (i13 <= i10) {
                        int i14 = bVar.f24322d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f24320b;
                    if (i15 == i10) {
                        i10 = bVar.f24322d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f24322d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f24320b <= i10) {
                i10 += bVar.f24322d;
            }
        }
        return i10;
    }

    public final void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f24320b;
        int i11 = bVar.f24322d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f24314d.f(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f24322d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i10 = bVar.f24320b;
        int i11 = bVar.f24322d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f24314d.f(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(a(4, i13, i12, bVar.f24321c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    v(a(4, i13, i12, bVar.f24321c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f24322d) {
            Object obj = bVar.f24321c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final boolean h(int i10) {
        int size = this.f24313c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f24313c.get(i11);
            int i12 = bVar.f24319a;
            if (i12 == 8) {
                if (n(bVar.f24322d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f24320b;
                int i14 = bVar.f24322d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f24313c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24314d.c((b) this.f24313c.get(i10));
        }
        x(this.f24313c);
        this.f24318h = 0;
    }

    public void j() {
        i();
        int size = this.f24312b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f24312b.get(i10);
            int i11 = bVar.f24319a;
            if (i11 == 1) {
                this.f24314d.c(bVar);
                this.f24314d.g(bVar.f24320b, bVar.f24322d);
            } else if (i11 == 2) {
                this.f24314d.c(bVar);
                this.f24314d.h(bVar.f24320b, bVar.f24322d);
            } else if (i11 == 4) {
                this.f24314d.c(bVar);
                this.f24314d.e(bVar.f24320b, bVar.f24322d, bVar.f24321c);
            } else if (i11 == 8) {
                this.f24314d.c(bVar);
                this.f24314d.a(bVar.f24320b, bVar.f24322d);
            }
            Runnable runnable = this.f24315e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f24312b);
        this.f24318h = 0;
    }

    public final void k(b bVar) {
        int i10;
        int i11 = bVar.f24319a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f24320b, i11);
        int i12 = bVar.f24320b;
        int i13 = bVar.f24319a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f24322d; i15++) {
            int iZ2 = z(bVar.f24320b + (i10 * i15), bVar.f24319a);
            int i16 = bVar.f24319a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f24321c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f24319a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f24321c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f24319a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    public void l(b bVar, int i10) {
        this.f24314d.b(bVar);
        int i11 = bVar.f24319a;
        if (i11 == 2) {
            this.f24314d.h(i10, bVar.f24322d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f24314d.e(i10, bVar.f24322d, bVar.f24321c);
        }
    }

    public int m(int i10) {
        return n(i10, 0);
    }

    public int n(int i10, int i11) {
        int size = this.f24313c.size();
        while (i11 < size) {
            b bVar = (b) this.f24313c.get(i11);
            int i12 = bVar.f24319a;
            if (i12 == 8) {
                int i13 = bVar.f24320b;
                if (i13 == i10) {
                    i10 = bVar.f24322d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f24322d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f24320b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f24322d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f24322d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean o(int i10) {
        return (this.f24318h & i10) != 0;
    }

    public boolean p() {
        return this.f24312b.size() > 0;
    }

    public boolean q() {
        return (this.f24313c.isEmpty() || this.f24312b.isEmpty()) ? false : true;
    }

    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f24312b.add(a(4, i10, i11, obj));
        this.f24318h |= 4;
        return this.f24312b.size() == 1;
    }

    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f24312b.add(a(1, i10, i11, null));
        this.f24318h |= 1;
        return this.f24312b.size() == 1;
    }

    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f24312b.add(a(8, i10, i11, null));
        this.f24318h |= 8;
        return this.f24312b.size() == 1;
    }

    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f24312b.add(a(2, i10, i11, null));
        this.f24318h |= 2;
        return this.f24312b.size() == 1;
    }

    public final void v(b bVar) {
        this.f24313c.add(bVar);
        int i10 = bVar.f24319a;
        if (i10 == 1) {
            this.f24314d.g(bVar.f24320b, bVar.f24322d);
            return;
        }
        if (i10 == 2) {
            this.f24314d.d(bVar.f24320b, bVar.f24322d);
            return;
        }
        if (i10 == 4) {
            this.f24314d.e(bVar.f24320b, bVar.f24322d, bVar.f24321c);
        } else {
            if (i10 == 8) {
                this.f24314d.a(bVar.f24320b, bVar.f24322d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.f24317g.b(this.f24312b);
        int size = this.f24312b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f24312b.get(i10);
            int i11 = bVar.f24319a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f24315e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f24312b.clear();
    }

    public void x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    public void y() {
        x(this.f24312b);
        x(this.f24313c);
        this.f24318h = 0;
    }

    public final int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f24313c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f24313c.get(size);
            int i14 = bVar.f24319a;
            if (i14 == 8) {
                int i15 = bVar.f24320b;
                int i16 = bVar.f24322d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f24320b = i15 + 1;
                            bVar.f24322d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f24320b = i15 - 1;
                            bVar.f24322d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f24322d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f24322d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f24320b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f24320b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f24320b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f24322d;
                    } else if (i14 == 2) {
                        i10 += bVar.f24322d;
                    }
                } else if (i11 == 1) {
                    bVar.f24320b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f24320b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f24313c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f24313c.get(size2);
            if (bVar2.f24319a == 8) {
                int i18 = bVar2.f24322d;
                if (i18 == bVar2.f24320b || i18 < 0) {
                    this.f24313c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f24322d <= 0) {
                this.f24313c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public a(InterfaceC0309a interfaceC0309a, boolean z10) {
        this.f24311a = new X0.f(30);
        this.f24312b = new ArrayList();
        this.f24313c = new ArrayList();
        this.f24318h = 0;
        this.f24314d = interfaceC0309a;
        this.f24316f = z10;
        this.f24317g = new k(this);
    }
}
