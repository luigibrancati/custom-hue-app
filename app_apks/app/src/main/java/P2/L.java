package P2;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface L {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f12761c;

        public a(String str, int i10, byte[] bArr) {
            this.f12759a = str;
            this.f12760b = i10;
            this.f12761c = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f12765d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f12766e;

        public b(int i10, String str, int i11, List list, byte[] bArr) {
            this.f12762a = i10;
            this.f12763b = str;
            this.f12764c = i11;
            this.f12765d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f12766e = bArr;
        }

        public int a() {
            int i10 = this.f12764c;
            return i10 != 2 ? i10 != 3 ? 0 : 512 : RecognitionOptions.PDF417;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        L a(int i10, b bVar);

        SparseArray b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f12771e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public void a() {
            int i10 = this.f12770d;
            this.f12770d = i10 == Integer.MIN_VALUE ? this.f12768b : i10 + this.f12769c;
            this.f12771e = this.f12767a + this.f12770d;
        }

        public String b() {
            d();
            return this.f12771e;
        }

        public int c() {
            d();
            return this.f12770d;
        }

        public final void d() {
            if (this.f12770d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f12767a = str;
            this.f12768b = i11;
            this.f12769c = i12;
            this.f12770d = Integer.MIN_VALUE;
            this.f12771e = "";
        }
    }

    void a(G1.C c10, int i10);

    void b();

    void c(G1.H h10, i2.r rVar, d dVar);
}
