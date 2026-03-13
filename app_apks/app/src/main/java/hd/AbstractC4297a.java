package hd;

import gc.C4179C;
import gc.C4202o;
import gc.C4204q;
import gc.C4206t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: hd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4297a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0475a f36517f = new C0475a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f36518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f36522e;

    /* JADX INFO: renamed from: hd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0475a {
        public /* synthetic */ C0475a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0475a() {
        }
    }

    public AbstractC4297a(int... numbers) {
        List listK;
        AbstractC4862t.e(numbers, "numbers");
        this.f36518a = numbers;
        Integer numC0 = C4204q.c0(numbers, 0);
        this.f36519b = numC0 != null ? numC0.intValue() : -1;
        Integer numC02 = C4204q.c0(numbers, 1);
        this.f36520c = numC02 != null ? numC02.intValue() : -1;
        Integer numC03 = C4204q.c0(numbers, 2);
        this.f36521d = numC03 != null ? numC03.intValue() : -1;
        if (numbers.length <= 3) {
            listK = C4206t.k();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listK = C4179C.V0(C4202o.g(numbers).subList(3, numbers.length));
        }
        this.f36522e = listK;
    }

    public final int a() {
        return this.f36519b;
    }

    public final int b() {
        return this.f36520c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f36519b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f36520c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f36521d >= i12;
    }

    public final boolean d(AbstractC4297a version) {
        AbstractC4862t.e(version, "version");
        return c(version.f36519b, version.f36520c, version.f36521d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f36519b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f36520c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f36521d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !AbstractC4862t.a(getClass(), obj.getClass())) {
            return false;
        }
        AbstractC4297a abstractC4297a = (AbstractC4297a) obj;
        return this.f36519b == abstractC4297a.f36519b && this.f36520c == abstractC4297a.f36520c && this.f36521d == abstractC4297a.f36521d && AbstractC4862t.a(this.f36522e, abstractC4297a.f36522e);
    }

    public final boolean f(AbstractC4297a ourVersion) {
        AbstractC4862t.e(ourVersion, "ourVersion");
        int i10 = this.f36519b;
        return i10 == 0 ? ourVersion.f36519b == 0 && this.f36520c == ourVersion.f36520c : i10 == ourVersion.f36519b && this.f36520c <= ourVersion.f36520c;
    }

    public final int[] g() {
        return this.f36518a;
    }

    public int hashCode() {
        int i10 = this.f36519b;
        int i11 = i10 + (i10 * 31) + this.f36520c;
        int i12 = i11 + (i11 * 31) + this.f36521d;
        return i12 + (i12 * 31) + this.f36522e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : C4179C.q0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
