package c9;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26383c;

        public a(int i10, int i11, int i12) {
            this.f26381a = i10;
            this.f26382b = i11;
            this.f26383c = i12;
        }

        public a a(a aVar) {
            return new a(this.f26381a - aVar.d(), this.f26382b - aVar.c(), this.f26383c - aVar.b());
        }

        public int b() {
            return this.f26383c;
        }

        public int c() {
            return this.f26382b;
        }

        public int d() {
            return this.f26381a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
