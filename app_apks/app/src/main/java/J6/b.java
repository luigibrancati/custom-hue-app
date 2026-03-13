package J6;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f6264a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6265b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6266c;

    public b(int i10) {
    }

    public final b a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f6264a.length;
        int i11 = this.f6265b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.f6266c) {
            this.f6264a = Arrays.copyOf(this.f6264a, i10);
            this.f6266c = false;
        }
        Object[] objArr = this.f6264a;
        int i13 = this.f6265b;
        this.f6265b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
