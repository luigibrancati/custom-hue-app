package O6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K3 extends AbstractC1710l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f11350a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11351b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11352c;

    public K3(int i10) {
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f11351b + 1);
        Object[] objArr = this.f11350a;
        int i10 = this.f11351b;
        this.f11351b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void b(int i10) {
        Object[] objArr = this.f11350a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f11352c) {
                this.f11350a = (Object[]) objArr.clone();
                this.f11352c = false;
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
        this.f11350a = Arrays.copyOf(objArr, i11);
        this.f11352c = false;
    }
}
