package H1;

import G1.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5122a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f5124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f5125d;

        public b(int i10, long j10) {
            super(i10);
            this.f5123b = j10;
            this.f5124c = new ArrayList();
            this.f5125d = new ArrayList();
        }

        public void b(b bVar) {
            this.f5125d.add(bVar);
        }

        public void c(c cVar) {
            this.f5124c.add(cVar);
        }

        public b d(int i10) {
            int size = this.f5125d.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f5125d.get(i11);
                if (bVar.f5122a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public c e(int i10) {
            int size = this.f5124c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) this.f5124c.get(i11);
                if (cVar.f5122a == i10) {
                    return cVar;
                }
            }
            return null;
        }

        @Override // H1.d
        public String toString() {
            return d.a(this.f5122a) + " leaves: " + Arrays.toString(this.f5124c.toArray()) + " containers: " + Arrays.toString(this.f5125d.toArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f5126b;

        public c(int i10, C c10) {
            super(i10);
            this.f5126b = c10;
        }
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f5122a);
    }

    public d(int i10) {
        this.f5122a = i10;
    }
}
