package v6;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import t6.C5843a;

/* JADX INFO: renamed from: v6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6069y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f45888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.a f45889b;

    public C6069y() {
        this(GoogleApiAvailability.m());
    }

    public final int a(Context context, C5843a.f fVar) {
        AbstractC6056k.l(context);
        AbstractC6056k.l(fVar);
        int iH = 0;
        if (!fVar.e()) {
            return 0;
        }
        int iM = fVar.m();
        int iB = b(context, iM);
        if (iB != -1) {
            return iB;
        }
        SparseIntArray sparseIntArray = this.f45888a;
        synchronized (sparseIntArray) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= sparseIntArray.size()) {
                        iH = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i10);
                    if (iKeyAt > iM && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iH == -1) {
                iH = this.f45889b.h(context, iM);
            }
            sparseIntArray.put(iM, iH);
        }
        return iH;
    }

    public final int b(Context context, int i10) {
        int i11;
        SparseIntArray sparseIntArray = this.f45888a;
        synchronized (sparseIntArray) {
            i11 = sparseIntArray.get(i10, -1);
        }
        return i11;
    }

    public final void c() {
        SparseIntArray sparseIntArray = this.f45888a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public C6069y(com.google.android.gms.common.a aVar) {
        this.f45888a = new SparseIntArray();
        AbstractC6056k.l(aVar);
        this.f45889b = aVar;
    }
}
