package a2;

import G1.AbstractC0853a;
import G1.InterfaceC0864l;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f20847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0864l f20848c;

    public j0() {
        this(new InterfaceC0864l() { // from class: a2.i0
            @Override // G1.InterfaceC0864l
            public final void accept(Object obj) {
                j0.a(obj);
            }
        });
    }

    public void b(int i10, Object obj) {
        if (this.f20846a == -1) {
            AbstractC0853a.g(this.f20847b.size() == 0);
            this.f20846a = 0;
        }
        if (this.f20847b.size() > 0) {
            SparseArray sparseArray = this.f20847b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC0853a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                InterfaceC0864l interfaceC0864l = this.f20848c;
                SparseArray sparseArray2 = this.f20847b;
                interfaceC0864l.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f20847b.append(i10, obj);
    }

    public void c() {
        for (int i10 = 0; i10 < this.f20847b.size(); i10++) {
            this.f20848c.accept(this.f20847b.valueAt(i10));
        }
        this.f20846a = -1;
        this.f20847b.clear();
    }

    public void d(int i10) {
        for (int size = this.f20847b.size() - 1; size >= 0 && i10 < this.f20847b.keyAt(size); size--) {
            this.f20848c.accept(this.f20847b.valueAt(size));
            this.f20847b.removeAt(size);
        }
        this.f20846a = this.f20847b.size() > 0 ? Math.min(this.f20846a, this.f20847b.size() - 1) : -1;
    }

    public void e(int i10) {
        int i11 = 0;
        while (i11 < this.f20847b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f20847b.keyAt(i12)) {
                return;
            }
            this.f20848c.accept(this.f20847b.valueAt(i11));
            this.f20847b.removeAt(i11);
            int i13 = this.f20846a;
            if (i13 > 0) {
                this.f20846a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object f(int i10) {
        if (this.f20846a == -1) {
            this.f20846a = 0;
        }
        while (true) {
            int i11 = this.f20846a;
            if (i11 <= 0 || i10 >= this.f20847b.keyAt(i11)) {
                break;
            }
            this.f20846a--;
        }
        while (this.f20846a < this.f20847b.size() - 1 && i10 >= this.f20847b.keyAt(this.f20846a + 1)) {
            this.f20846a++;
        }
        return this.f20847b.valueAt(this.f20846a);
    }

    public Object g() {
        return this.f20847b.valueAt(r1.size() - 1);
    }

    public boolean h() {
        return this.f20847b.size() == 0;
    }

    public j0(InterfaceC0864l interfaceC0864l) {
        this.f20847b = new SparseArray();
        this.f20848c = interfaceC0864l;
        this.f20846a = -1;
    }

    public static /* synthetic */ void a(Object obj) {
    }
}
