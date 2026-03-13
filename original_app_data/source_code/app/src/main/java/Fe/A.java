package Fe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4048b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4049c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0846h f4050a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ A d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ A e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ A f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final A a(File file, boolean z10) {
            AbstractC4862t.e(file, "<this>");
            String string = file.toString();
            AbstractC4862t.d(string, "toString(...)");
            return b(string, z10);
        }

        public final A b(String str, boolean z10) {
            AbstractC4862t.e(str, "<this>");
            return Ge.d.k(str, z10);
        }

        public final A c(Path path, boolean z10) {
            AbstractC4862t.e(path, "<this>");
            return b(path.toString(), z10);
        }

        public a() {
        }
    }

    static {
        String separator = File.separator;
        AbstractC4862t.d(separator, "separator");
        f4049c = separator;
    }

    public A(C0846h bytes) {
        AbstractC4862t.e(bytes, "bytes");
        this.f4050a = bytes;
    }

    public static /* synthetic */ A y(A a10, A a11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a10.w(a11, z10);
    }

    public final Character A() {
        if (C0846h.A(b(), Ge.d.f4731a, 0, 2, null) != -1 || b().size() < 2 || b().q(1) != 58) {
            return null;
        }
        char cQ = (char) b().q(0);
        if (('a' > cQ || cQ >= '{') && ('A' > cQ || cQ >= '[')) {
            return null;
        }
        return Character.valueOf(cQ);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(A other) {
        AbstractC4862t.e(other, "other");
        return b().compareTo(other.b());
    }

    public final C0846h b() {
        return this.f4050a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && AbstractC4862t.a(((A) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final boolean isAbsolute() {
        return Ge.d.o(this) != -1;
    }

    public final A j() {
        int iO = Ge.d.o(this);
        if (iO == -1) {
            return null;
        }
        return new A(b().O(0, iO));
    }

    public final List p() {
        ArrayList arrayList = new ArrayList();
        int iO = Ge.d.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < b().size() && b().q(iO) == 92) {
            iO++;
        }
        int size = b().size();
        int i10 = iO;
        while (iO < size) {
            if (b().q(iO) == 47 || b().q(iO) == 92) {
                arrayList.add(b().O(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < b().size()) {
            arrayList.add(b().O(i10, b().size()));
        }
        return arrayList;
    }

    public final String q() {
        return s().R();
    }

    public final C0846h s() {
        int iL = Ge.d.l(this);
        return iL != -1 ? C0846h.P(b(), iL + 1, 0, 2, null) : (A() == null || b().size() != 2) ? b() : C0846h.f4118e;
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return b().R();
    }

    public final A u() {
        if (AbstractC4862t.a(b(), Ge.d.f4734d) || AbstractC4862t.a(b(), Ge.d.f4731a) || AbstractC4862t.a(b(), Ge.d.f4732b) || Ge.d.n(this)) {
            return null;
        }
        int iL = Ge.d.l(this);
        if (iL == 2 && A() != null) {
            if (b().size() == 3) {
                return null;
            }
            return new A(C0846h.P(b(), 0, 3, 1, null));
        }
        if (iL == 1 && b().N(Ge.d.f4732b)) {
            return null;
        }
        if (iL != -1 || A() == null) {
            return iL == -1 ? new A(Ge.d.f4734d) : iL == 0 ? new A(C0846h.P(b(), 0, 1, 1, null)) : new A(C0846h.P(b(), 0, iL, 1, null));
        }
        if (b().size() == 2) {
            return null;
        }
        return new A(C0846h.P(b(), 0, 2, 1, null));
    }

    public final A v(A other) {
        AbstractC4862t.e(other, "other");
        if (!AbstractC4862t.a(j(), other.j())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listP = p();
        List listP2 = other.p();
        int iMin = Math.min(listP.size(), listP2.size());
        int i10 = 0;
        while (i10 < iMin && AbstractC4862t.a(listP.get(i10), listP2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && b().size() == other.b().size()) {
            return a.e(f4048b, ".", false, 1, null);
        }
        if (listP2.subList(i10, listP2.size()).indexOf(Ge.d.f4735e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (AbstractC4862t.a(other.b(), Ge.d.f4734d)) {
            return this;
        }
        C0843e c0843e = new C0843e();
        C0846h c0846hM = Ge.d.m(other);
        if (c0846hM == null && (c0846hM = Ge.d.m(this)) == null) {
            c0846hM = Ge.d.s(f4049c);
        }
        int size = listP2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c0843e.U(Ge.d.f4735e);
            c0843e.U(c0846hM);
        }
        int size2 = listP.size();
        while (i10 < size2) {
            c0843e.U((C0846h) listP.get(i10));
            c0843e.U(c0846hM);
            i10++;
        }
        return Ge.d.q(c0843e, false);
    }

    public final A w(A child, boolean z10) {
        AbstractC4862t.e(child, "child");
        return Ge.d.j(this, child, z10);
    }

    public final A x(String child) {
        AbstractC4862t.e(child, "child");
        return Ge.d.j(this, Ge.d.q(new C0843e().T(child), false), false);
    }

    public final Path z() {
        Path path = Paths.get(toString(), new String[0]);
        AbstractC4862t.d(path, "get(...)");
        return path;
    }
}
