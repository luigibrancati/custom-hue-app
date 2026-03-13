package e2;

import e2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f33658h = new Comparator() { // from class: e2.p
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return r.b((r.b) obj, (r.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f33659i = new Comparator() { // from class: e2.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((r.b) obj).f33669c, ((r.b) obj2).f33669c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33660a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33666g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f33662c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f33661b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33663d = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f33669c;

        public b() {
        }
    }

    public r(int i10) {
        this.f33660a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f33667a - bVar2.f33667a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f33666g;
        if (i11 > 0) {
            b[] bVarArr = this.f33662c;
            int i12 = i11 - 1;
            this.f33666g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f33664e;
        this.f33664e = i13 + 1;
        bVar.f33667a = i13;
        bVar.f33668b = i10;
        bVar.f33669c = f10;
        this.f33661b.add(bVar);
        this.f33665f += i10;
        while (true) {
            int i14 = this.f33665f;
            int i15 = this.f33660a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = (b) this.f33661b.get(0);
            int i17 = bVar2.f33668b;
            if (i17 <= i16) {
                this.f33665f -= i17;
                this.f33661b.remove(0);
                int i18 = this.f33666g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f33662c;
                    this.f33666g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f33668b = i17 - i16;
                this.f33665f -= i16;
            }
        }
    }

    public final void d() {
        if (this.f33663d != 1) {
            Collections.sort(this.f33661b, f33658h);
            this.f33663d = 1;
        }
    }

    public final void e() {
        if (this.f33663d != 0) {
            Collections.sort(this.f33661b, f33659i);
            this.f33663d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f33665f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f33661b.size(); i11++) {
            b bVar = (b) this.f33661b.get(i11);
            i10 += bVar.f33668b;
            if (i10 >= f11) {
                return bVar.f33669c;
            }
        }
        if (this.f33661b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.f33661b.get(r4.size() - 1)).f33669c;
    }

    public void g() {
        this.f33661b.clear();
        this.f33663d = -1;
        this.f33664e = 0;
        this.f33665f = 0;
    }
}
