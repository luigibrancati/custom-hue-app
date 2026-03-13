package F0;

import E0.i;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f3448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f3449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f3450d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E0.i f3453g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f3447a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3451e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3452f = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3454a;

        static {
            int[] iArr = new int[b.values().length];
            f3454a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3454a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3454a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3454a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3454a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3454a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3454a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3454a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3454a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f3448b = eVar;
        this.f3449c = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            k();
            return true;
        }
        if (!z10 && !j(dVar)) {
            return false;
        }
        this.f3450d = dVar;
        if (dVar.f3447a == null) {
            dVar.f3447a = new HashSet();
        }
        this.f3450d.f3447a.add(this);
        if (i10 > 0) {
            this.f3451e = i10;
        } else {
            this.f3451e = 0;
        }
        this.f3452f = i11;
        return true;
    }

    public int b() {
        d dVar;
        if (this.f3448b.M() == 8) {
            return 0;
        }
        return (this.f3452f <= -1 || (dVar = this.f3450d) == null || dVar.f3448b.M() != 8) ? this.f3451e : this.f3452f;
    }

    public final d c() {
        switch (a.f3454a[this.f3449c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f3448b.f3459D;
            case 3:
                return this.f3448b.f3457B;
            case 4:
                return this.f3448b.f3460E;
            case 5:
                return this.f3448b.f3458C;
            default:
                throw new AssertionError(this.f3449c.name());
        }
    }

    public e d() {
        return this.f3448b;
    }

    public E0.i e() {
        return this.f3453g;
    }

    public d f() {
        return this.f3450d;
    }

    public b g() {
        return this.f3449c;
    }

    public boolean h() {
        HashSet hashSet = this.f3447a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f3450d != null;
    }

    public boolean j(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarG = dVar.g();
        b bVar = this.f3449c;
        if (bVarG == bVar) {
            return bVar != b.BASELINE || (dVar.d().Q() && d().Q());
        }
        switch (a.f3454a[bVar.ordinal()]) {
            case 1:
                return (bVarG == b.BASELINE || bVarG == b.CENTER_X || bVarG == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarG == b.LEFT || bVarG == b.RIGHT;
                return dVar.d() instanceof g ? z10 || bVarG == b.CENTER_X : z10;
            case 4:
            case 5:
                boolean z11 = bVarG == b.TOP || bVarG == b.BOTTOM;
                return dVar.d() instanceof g ? z11 || bVarG == b.CENTER_Y : z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f3449c.name());
        }
    }

    public void k() {
        HashSet hashSet;
        d dVar = this.f3450d;
        if (dVar != null && (hashSet = dVar.f3447a) != null) {
            hashSet.remove(this);
        }
        this.f3450d = null;
        this.f3451e = 0;
        this.f3452f = -1;
    }

    public void l(E0.c cVar) {
        E0.i iVar = this.f3453g;
        if (iVar == null) {
            this.f3453g = new E0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f3448b.p() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f3449c.toString();
    }
}
