package N6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: N6.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1397m0 extends AbstractC1410n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f10358a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10359b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10360c;

    public AbstractC1397m0(int i10) {
    }

    public final AbstractC1397m0 b(Object obj) {
        obj.getClass();
        d(this.f10359b + 1);
        Object[] objArr = this.f10358a;
        int i10 = this.f10359b;
        this.f10359b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final AbstractC1410n0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f10359b + collection.size());
            if (collection instanceof AbstractC1423o0) {
                this.f10359b = ((AbstractC1423o0) collection).c(this.f10358a, this.f10359b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final void d(int i10) {
        Object[] objArr = this.f10358a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f10360c) {
                this.f10358a = (Object[]) objArr.clone();
                this.f10360c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f10358a = Arrays.copyOf(objArr, i11);
        this.f10360c = false;
    }
}
