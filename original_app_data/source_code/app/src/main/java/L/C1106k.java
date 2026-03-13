package L;

import L.a1;
import java.util.List;

/* JADX INFO: renamed from: L.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1106k extends a1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1109l0 f8095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E.J f8100f;

    /* JADX INFO: renamed from: L.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a1.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1109l0 f8101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f8102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f8104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f8105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public E.J f8106f;

        @Override // L.a1.f.a
        public a1.f a() {
            String str = "";
            if (this.f8101a == null) {
                str = " surface";
            }
            if (this.f8102b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f8104d == null) {
                str = str + " mirrorMode";
            }
            if (this.f8105e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f8106f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C1106k(this.f8101a, this.f8102b, this.f8103c, this.f8104d.intValue(), this.f8105e.intValue(), this.f8106f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // L.a1.f.a
        public a1.f.a b(E.J j10) {
            if (j10 == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f8106f = j10;
            return this;
        }

        @Override // L.a1.f.a
        public a1.f.a c(int i10) {
            this.f8104d = Integer.valueOf(i10);
            return this;
        }

        @Override // L.a1.f.a
        public a1.f.a d(String str) {
            this.f8103c = str;
            return this;
        }

        @Override // L.a1.f.a
        public a1.f.a e(List list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f8102b = list;
            return this;
        }

        @Override // L.a1.f.a
        public a1.f.a f(int i10) {
            this.f8105e = Integer.valueOf(i10);
            return this;
        }

        public a1.f.a g(AbstractC1109l0 abstractC1109l0) {
            if (abstractC1109l0 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f8101a = abstractC1109l0;
            return this;
        }
    }

    @Override // L.a1.f
    public E.J b() {
        return this.f8100f;
    }

    @Override // L.a1.f
    public int c() {
        return this.f8098d;
    }

    @Override // L.a1.f
    public String d() {
        return this.f8097c;
    }

    @Override // L.a1.f
    public List e() {
        return this.f8096b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a1.f) {
            a1.f fVar = (a1.f) obj;
            if (this.f8095a.equals(fVar.f()) && this.f8096b.equals(fVar.e()) && ((str = this.f8097c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f8098d == fVar.c() && this.f8099e == fVar.g() && this.f8100f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // L.a1.f
    public AbstractC1109l0 f() {
        return this.f8095a;
    }

    @Override // L.a1.f
    public int g() {
        return this.f8099e;
    }

    public int hashCode() {
        int iHashCode = (((this.f8095a.hashCode() ^ 1000003) * 1000003) ^ this.f8096b.hashCode()) * 1000003;
        String str = this.f8097c;
        return this.f8100f.hashCode() ^ ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8098d) * 1000003) ^ this.f8099e) * 1000003);
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f8095a + ", sharedSurfaces=" + this.f8096b + ", physicalCameraId=" + this.f8097c + ", mirrorMode=" + this.f8098d + ", surfaceGroupId=" + this.f8099e + ", dynamicRange=" + this.f8100f + "}";
    }

    public C1106k(AbstractC1109l0 abstractC1109l0, List list, String str, int i10, int i11, E.J j10) {
        this.f8095a = abstractC1109l0;
        this.f8096b = list;
        this.f8097c = str;
        this.f8098d = i10;
        this.f8099e = i11;
        this.f8100f = j10;
    }
}
