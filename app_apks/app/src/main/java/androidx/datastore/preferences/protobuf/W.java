package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC2697c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f22759d = new W(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22761c;

    public W(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f22760b = objArr;
        this.f22761c = i10;
    }

    public static Object[] d(int i10) {
        return new Object[i10];
    }

    public static W e() {
        return f22759d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i10 = this.f22761c;
        Object[] objArr = this.f22760b;
        if (i10 == objArr.length) {
            this.f22760b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22760b;
        int i11 = this.f22761c;
        this.f22761c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void f(int i10) {
        if (i10 < 0 || i10 >= this.f22761c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        f(i10);
        return this.f22760b[i10];
    }

    public final String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22761c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2714u.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public W a(int i10) {
        if (i10 >= this.f22761c) {
            return new W(Arrays.copyOf(this.f22760b, i10), this.f22761c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2697c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        c();
        f(i10);
        Object[] objArr = this.f22760b;
        Object obj = objArr[i10];
        if (i10 < this.f22761c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f22761c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        c();
        f(i10);
        Object[] objArr = this.f22760b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f22761c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        c();
        if (i10 >= 0 && i10 <= (i11 = this.f22761c)) {
            Object[] objArr = this.f22760b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrD = d(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f22760b, 0, objArrD, 0, i10);
                System.arraycopy(this.f22760b, i10, objArrD, i10 + 1, this.f22761c - i10);
                this.f22760b = objArrD;
            }
            this.f22760b[i10] = obj;
            this.f22761c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i10));
    }
}
