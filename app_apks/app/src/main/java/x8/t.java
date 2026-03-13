package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends F.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47892d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.c.AbstractC0660a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f47896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f47897e;

        @Override // x8.F.e.d.a.c.AbstractC0660a
        public F.e.d.a.c a() {
            String str;
            if (this.f47897e == 7 && (str = this.f47893a) != null) {
                return new t(str, this.f47894b, this.f47895c, this.f47896d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47893a == null) {
                sb2.append(" processName");
            }
            if ((this.f47897e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f47897e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f47897e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.c.AbstractC0660a
        public F.e.d.a.c.AbstractC0660a b(boolean z10) {
            this.f47896d = z10;
            this.f47897e = (byte) (this.f47897e | 4);
            return this;
        }

        @Override // x8.F.e.d.a.c.AbstractC0660a
        public F.e.d.a.c.AbstractC0660a c(int i10) {
            this.f47895c = i10;
            this.f47897e = (byte) (this.f47897e | 2);
            return this;
        }

        @Override // x8.F.e.d.a.c.AbstractC0660a
        public F.e.d.a.c.AbstractC0660a d(int i10) {
            this.f47894b = i10;
            this.f47897e = (byte) (this.f47897e | 1);
            return this;
        }

        @Override // x8.F.e.d.a.c.AbstractC0660a
        public F.e.d.a.c.AbstractC0660a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f47893a = str;
            return this;
        }
    }

    @Override // x8.F.e.d.a.c
    public int b() {
        return this.f47891c;
    }

    @Override // x8.F.e.d.a.c
    public int c() {
        return this.f47890b;
    }

    @Override // x8.F.e.d.a.c
    public String d() {
        return this.f47889a;
    }

    @Override // x8.F.e.d.a.c
    public boolean e() {
        return this.f47892d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.c) {
            F.e.d.a.c cVar = (F.e.d.a.c) obj;
            if (this.f47889a.equals(cVar.d()) && this.f47890b == cVar.c() && this.f47891c == cVar.b() && this.f47892d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f47892d ? 1231 : 1237) ^ ((((((this.f47889a.hashCode() ^ 1000003) * 1000003) ^ this.f47890b) * 1000003) ^ this.f47891c) * 1000003);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f47889a + ", pid=" + this.f47890b + ", importance=" + this.f47891c + ", defaultProcess=" + this.f47892d + "}";
    }

    public t(String str, int i10, int i11, boolean z10) {
        this.f47889a = str;
        this.f47890b = i10;
        this.f47891c = i11;
        this.f47892d = z10;
    }
}
