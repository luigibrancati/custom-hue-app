package fd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.AbstractC5047a;
import md.AbstractC5048b;
import md.AbstractC5050d;
import md.C5051e;
import md.C5052f;
import md.C5053g;
import md.i;
import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends md.i implements md.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f34295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static md.r f34296i = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5050d f34297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f34300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f34301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34302g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC5048b {
        @Override // md.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(C5051e c5051e, C5053g c5053g) {
            return new b(c5051e, c5053g);
        }
    }

    /* JADX INFO: renamed from: fd.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0442b extends md.i implements md.q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0442b f34303h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static md.r f34304i = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f34305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f34308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f34309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f34310g;

        /* JADX INFO: renamed from: fd.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public C0442b c(C5051e c5051e, C5053g c5053g) {
                return new C0442b(c5051e, c5053g);
            }
        }

        static {
            C0442b c0442b = new C0442b(true);
            f34303h = c0442b;
            c0442b.u();
        }

        public static C0442b p() {
            return f34303h;
        }

        private void u() {
            this.f34307d = 0;
            this.f34308e = c.F();
        }

        public static C0443b v() {
            return C0443b.s();
        }

        public static C0443b w(C0442b c0442b) {
            return v().m(c0442b);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            if ((this.f34306c & 1) == 1) {
                c5052f.Z(1, this.f34307d);
            }
            if ((this.f34306c & 2) == 2) {
                c5052f.c0(2, this.f34308e);
            }
            c5052f.h0(this.f34305b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f34310g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f34306c & 1) == 1 ? C5052f.o(1, this.f34307d) : 0;
            if ((this.f34306c & 2) == 2) {
                iO += C5052f.r(2, this.f34308e);
            }
            int size = iO + this.f34305b.size();
            this.f34310g = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f34309f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!s()) {
                this.f34309f = (byte) 0;
                return false;
            }
            if (!t()) {
                this.f34309f = (byte) 0;
                return false;
            }
            if (r().isInitialized()) {
                this.f34309f = (byte) 1;
                return true;
            }
            this.f34309f = (byte) 0;
            return false;
        }

        public int q() {
            return this.f34307d;
        }

        public c r() {
            return this.f34308e;
        }

        public boolean s() {
            return (this.f34306c & 1) == 1;
        }

        public boolean t() {
            return (this.f34306c & 2) == 2;
        }

        @Override // md.p
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public C0443b newBuilderForType() {
            return v();
        }

        @Override // md.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C0443b toBuilder() {
            return w(this);
        }

        /* JADX INFO: renamed from: fd.b$b$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends md.i implements md.q {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final c f34314q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static md.r f34315r = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AbstractC5050d f34316b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f34317c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public EnumC0445c f34318d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f34319e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public float f34320f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public double f34321g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f34322h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f34323i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f34324j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public b f34325k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public List f34326l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f34327m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f34328n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public byte f34329o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f34330p;

            /* JADX INFO: renamed from: fd.b$b$c$a */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class a extends AbstractC5048b {
                @Override // md.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c c(C5051e c5051e, C5053g c5053g) {
                    return new c(c5051e, c5053g);
                }
            }

            /* JADX INFO: renamed from: fd.b$b$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public enum EnumC0445c implements j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                private static j.b internalValueMap = new a();
                private final int value;

                /* JADX INFO: renamed from: fd.b$b$c$c$a */
                /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                public static class a implements j.b {
                    @Override // md.j.b
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public EnumC0445c findValueByNumber(int i10) {
                        return EnumC0445c.a(i10);
                    }
                }

                EnumC0445c(int i10, int i11) {
                    this.value = i11;
                }

                public static EnumC0445c a(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // md.j.a
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                c cVar = new c(true);
                f34314q = cVar;
                cVar.Y();
            }

            public static c F() {
                return f34314q;
            }

            public static C0444b Z() {
                return C0444b.s();
            }

            public static C0444b a0(c cVar) {
                return Z().m(cVar);
            }

            public int A() {
                return this.f34327m;
            }

            public c B(int i10) {
                return (c) this.f34326l.get(i10);
            }

            public int C() {
                return this.f34326l.size();
            }

            public List D() {
                return this.f34326l;
            }

            public int E() {
                return this.f34323i;
            }

            public double G() {
                return this.f34321g;
            }

            public int I() {
                return this.f34324j;
            }

            public int J() {
                return this.f34328n;
            }

            public float K() {
                return this.f34320f;
            }

            public long L() {
                return this.f34319e;
            }

            public int M() {
                return this.f34322h;
            }

            public EnumC0445c N() {
                return this.f34318d;
            }

            public boolean O() {
                return (this.f34317c & 128) == 128;
            }

            public boolean P() {
                return (this.f34317c & 256) == 256;
            }

            public boolean Q() {
                return (this.f34317c & 32) == 32;
            }

            public boolean R() {
                return (this.f34317c & 8) == 8;
            }

            public boolean S() {
                return (this.f34317c & 64) == 64;
            }

            public boolean T() {
                return (this.f34317c & 512) == 512;
            }

            public boolean U() {
                return (this.f34317c & 4) == 4;
            }

            public boolean V() {
                return (this.f34317c & 2) == 2;
            }

            public boolean W() {
                return (this.f34317c & 16) == 16;
            }

            public boolean X() {
                return (this.f34317c & 1) == 1;
            }

            public final void Y() {
                this.f34318d = EnumC0445c.BYTE;
                this.f34319e = 0L;
                this.f34320f = 0.0f;
                this.f34321g = 0.0d;
                this.f34322h = 0;
                this.f34323i = 0;
                this.f34324j = 0;
                this.f34325k = b.t();
                this.f34326l = Collections.EMPTY_LIST;
                this.f34327m = 0;
                this.f34328n = 0;
            }

            @Override // md.p
            public void a(C5052f c5052f) throws IOException {
                getSerializedSize();
                if ((this.f34317c & 1) == 1) {
                    c5052f.R(1, this.f34318d.getNumber());
                }
                if ((this.f34317c & 2) == 2) {
                    c5052f.s0(2, this.f34319e);
                }
                if ((this.f34317c & 4) == 4) {
                    c5052f.V(3, this.f34320f);
                }
                if ((this.f34317c & 8) == 8) {
                    c5052f.P(4, this.f34321g);
                }
                if ((this.f34317c & 16) == 16) {
                    c5052f.Z(5, this.f34322h);
                }
                if ((this.f34317c & 32) == 32) {
                    c5052f.Z(6, this.f34323i);
                }
                if ((this.f34317c & 64) == 64) {
                    c5052f.Z(7, this.f34324j);
                }
                if ((this.f34317c & 128) == 128) {
                    c5052f.c0(8, this.f34325k);
                }
                for (int i10 = 0; i10 < this.f34326l.size(); i10++) {
                    c5052f.c0(9, (md.p) this.f34326l.get(i10));
                }
                if ((this.f34317c & 512) == 512) {
                    c5052f.Z(10, this.f34328n);
                }
                if ((this.f34317c & 256) == 256) {
                    c5052f.Z(11, this.f34327m);
                }
                c5052f.h0(this.f34316b);
            }

            @Override // md.p
            /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
            public C0444b newBuilderForType() {
                return Z();
            }

            @Override // md.p
            /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
            public C0444b toBuilder() {
                return a0(this);
            }

            @Override // md.p
            public int getSerializedSize() {
                int i10 = this.f34330p;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f34317c & 1) == 1 ? C5052f.h(1, this.f34318d.getNumber()) : 0;
                if ((this.f34317c & 2) == 2) {
                    iH += C5052f.z(2, this.f34319e);
                }
                if ((this.f34317c & 4) == 4) {
                    iH += C5052f.l(3, this.f34320f);
                }
                if ((this.f34317c & 8) == 8) {
                    iH += C5052f.f(4, this.f34321g);
                }
                if ((this.f34317c & 16) == 16) {
                    iH += C5052f.o(5, this.f34322h);
                }
                if ((this.f34317c & 32) == 32) {
                    iH += C5052f.o(6, this.f34323i);
                }
                if ((this.f34317c & 64) == 64) {
                    iH += C5052f.o(7, this.f34324j);
                }
                if ((this.f34317c & 128) == 128) {
                    iH += C5052f.r(8, this.f34325k);
                }
                for (int i11 = 0; i11 < this.f34326l.size(); i11++) {
                    iH += C5052f.r(9, (md.p) this.f34326l.get(i11));
                }
                if ((this.f34317c & 512) == 512) {
                    iH += C5052f.o(10, this.f34328n);
                }
                if ((this.f34317c & 256) == 256) {
                    iH += C5052f.o(11, this.f34327m);
                }
                int size = iH + this.f34316b.size();
                this.f34330p = size;
                return size;
            }

            @Override // md.q
            public final boolean isInitialized() {
                byte b10 = this.f34329o;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (O() && !z().isInitialized()) {
                    this.f34329o = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < C(); i10++) {
                    if (!B(i10).isInitialized()) {
                        this.f34329o = (byte) 0;
                        return false;
                    }
                }
                this.f34329o = (byte) 1;
                return true;
            }

            public b z() {
                return this.f34325k;
            }

            public c(i.b bVar) {
                super(bVar);
                this.f34329o = (byte) -1;
                this.f34330p = -1;
                this.f34316b = bVar.j();
            }

            public c(boolean z10) {
                this.f34329o = (byte) -1;
                this.f34330p = -1;
                this.f34316b = AbstractC5050d.f40294a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            public c(C5051e c5051e, C5053g c5053g) {
                this.f34329o = (byte) -1;
                this.f34330p = -1;
                Y();
                AbstractC5050d.b bVarT = AbstractC5050d.t();
                C5052f c5052fI = C5052f.I(bVarT, 1);
                boolean z10 = false;
                char c10 = 0;
                while (true) {
                    ?? J10 = 256;
                    if (!z10) {
                        try {
                            try {
                                int iJ = c5051e.J();
                                switch (iJ) {
                                    case 0:
                                        z10 = true;
                                        break;
                                    case 8:
                                        int iM = c5051e.m();
                                        EnumC0445c enumC0445cA = EnumC0445c.a(iM);
                                        if (enumC0445cA == null) {
                                            c5052fI.n0(iJ);
                                            c5052fI.n0(iM);
                                        } else {
                                            this.f34317c |= 1;
                                            this.f34318d = enumC0445cA;
                                        }
                                        break;
                                    case 16:
                                        this.f34317c |= 2;
                                        this.f34319e = c5051e.G();
                                        break;
                                    case 29:
                                        this.f34317c |= 4;
                                        this.f34320f = c5051e.p();
                                        break;
                                    case 33:
                                        this.f34317c |= 8;
                                        this.f34321g = c5051e.l();
                                        break;
                                    case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                        this.f34317c |= 16;
                                        this.f34322h = c5051e.r();
                                        break;
                                    case 48:
                                        this.f34317c |= 32;
                                        this.f34323i = c5051e.r();
                                        break;
                                    case 56:
                                        this.f34317c |= 64;
                                        this.f34324j = c5051e.r();
                                        break;
                                    case 66:
                                        c builder = (this.f34317c & 128) == 128 ? this.f34325k.toBuilder() : null;
                                        b bVar = (b) c5051e.t(b.f34296i, c5053g);
                                        this.f34325k = bVar;
                                        if (builder != null) {
                                            builder.m(bVar);
                                            this.f34325k = builder.q();
                                        }
                                        this.f34317c |= 128;
                                        break;
                                    case 74:
                                        if ((c10 & 256) != 256) {
                                            this.f34326l = new ArrayList();
                                            c10 = 256;
                                        }
                                        this.f34326l.add(c5051e.t(f34315r, c5053g));
                                        break;
                                    case 80:
                                        this.f34317c |= 512;
                                        this.f34328n = c5051e.r();
                                        break;
                                    case 88:
                                        this.f34317c |= 256;
                                        this.f34327m = c5051e.r();
                                        break;
                                    default:
                                        J10 = j(c5051e, c5052fI, c5053g, iJ);
                                        if (J10 == 0) {
                                            z10 = true;
                                        }
                                        break;
                                }
                            } catch (md.k e10) {
                                throw e10.i(this);
                            } catch (IOException e11) {
                                throw new md.k(e11.getMessage()).i(this);
                            }
                        } catch (Throwable th) {
                            if ((c10 & 256) == J10) {
                                this.f34326l = Collections.unmodifiableList(this.f34326l);
                            }
                            try {
                                c5052fI.H();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f34316b = bVarT.f();
                                throw th2;
                            }
                            this.f34316b = bVarT.f();
                            g();
                            throw th;
                        }
                    } else {
                        if ((c10 & 256) == 256) {
                            this.f34326l = Collections.unmodifiableList(this.f34326l);
                        }
                        try {
                            c5052fI.H();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.f34316b = bVarT.f();
                            throw th3;
                        }
                        this.f34316b = bVarT.f();
                        g();
                        return;
                    }
                }
            }

            /* JADX INFO: renamed from: fd.b$b$c$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0444b extends i.b implements md.q {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f34331b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public long f34333d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public float f34334e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public double f34335f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public int f34336g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public int f34337h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public int f34338i;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public int f34341l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public int f34342m;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public EnumC0445c f34332c = EnumC0445c.BYTE;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public b f34339j = b.t();

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public List f34340k = Collections.EMPTY_LIST;

                public C0444b() {
                    u();
                }

                public static C0444b s() {
                    return new C0444b();
                }

                public C0444b A(double d10) {
                    this.f34331b |= 8;
                    this.f34335f = d10;
                    return this;
                }

                public C0444b B(int i10) {
                    this.f34331b |= 64;
                    this.f34338i = i10;
                    return this;
                }

                public C0444b C(int i10) {
                    this.f34331b |= RecognitionOptions.UPC_E;
                    this.f34342m = i10;
                    return this;
                }

                public C0444b D(float f10) {
                    this.f34331b |= 4;
                    this.f34334e = f10;
                    return this;
                }

                public C0444b E(long j10) {
                    this.f34331b |= 2;
                    this.f34333d = j10;
                    return this;
                }

                public C0444b F(int i10) {
                    this.f34331b |= 16;
                    this.f34336g = i10;
                    return this;
                }

                public C0444b G(EnumC0445c enumC0445c) {
                    enumC0445c.getClass();
                    this.f34331b |= 1;
                    this.f34332c = enumC0445c;
                    return this;
                }

                @Override // md.p.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarQ = q();
                    if (cVarQ.isInitialized()) {
                        return cVarQ;
                    }
                    throw AbstractC5047a.AbstractC0530a.i(cVarQ);
                }

                public c q() {
                    c cVar = new c(this);
                    int i10 = this.f34331b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f34318d = this.f34332c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f34319e = this.f34333d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f34320f = this.f34334e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f34321g = this.f34335f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    cVar.f34322h = this.f34336g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    cVar.f34323i = this.f34337h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    cVar.f34324j = this.f34338i;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    cVar.f34325k = this.f34339j;
                    if ((this.f34331b & 256) == 256) {
                        this.f34340k = Collections.unmodifiableList(this.f34340k);
                        this.f34331b &= -257;
                    }
                    cVar.f34326l = this.f34340k;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    cVar.f34327m = this.f34341l;
                    if ((i10 & RecognitionOptions.UPC_E) == 1024) {
                        i11 |= 512;
                    }
                    cVar.f34328n = this.f34342m;
                    cVar.f34317c = i11;
                    return cVar;
                }

                @Override // md.AbstractC5047a.AbstractC0530a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public C0444b e() {
                    return s().m(q());
                }

                public final void t() {
                    if ((this.f34331b & 256) != 256) {
                        this.f34340k = new ArrayList(this.f34340k);
                        this.f34331b |= 256;
                    }
                }

                public C0444b v(b bVar) {
                    if ((this.f34331b & 128) != 128 || this.f34339j == b.t()) {
                        this.f34339j = bVar;
                    } else {
                        this.f34339j = b.y(this.f34339j).m(bVar).q();
                    }
                    this.f34331b |= 128;
                    return this;
                }

                @Override // md.i.b
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public C0444b m(c cVar) {
                    if (cVar == c.F()) {
                        return this;
                    }
                    if (cVar.X()) {
                        G(cVar.N());
                    }
                    if (cVar.V()) {
                        E(cVar.L());
                    }
                    if (cVar.U()) {
                        D(cVar.K());
                    }
                    if (cVar.R()) {
                        A(cVar.G());
                    }
                    if (cVar.W()) {
                        F(cVar.M());
                    }
                    if (cVar.Q()) {
                        z(cVar.E());
                    }
                    if (cVar.S()) {
                        B(cVar.I());
                    }
                    if (cVar.O()) {
                        v(cVar.z());
                    }
                    if (!cVar.f34326l.isEmpty()) {
                        if (this.f34340k.isEmpty()) {
                            this.f34340k = cVar.f34326l;
                            this.f34331b &= -257;
                        } else {
                            t();
                            this.f34340k.addAll(cVar.f34326l);
                        }
                    }
                    if (cVar.P()) {
                        y(cVar.A());
                    }
                    if (cVar.T()) {
                        C(cVar.J());
                    }
                    n(j().d(cVar.f34316b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public fd.b.C0442b.c.C0444b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        md.r r1 = fd.b.C0442b.c.f34315r     // Catch: java.lang.Throwable -> Lf md.k -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                        fd.b$b$c r3 = (fd.b.C0442b.c) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
                        if (r3 == 0) goto Le
                        r2.m(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        md.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        fd.b$b$c r4 = (fd.b.C0442b.c) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.m(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: fd.b.C0442b.c.C0444b.v0(md.e, md.g):fd.b$b$c$b");
                }

                public C0444b y(int i10) {
                    this.f34331b |= 512;
                    this.f34341l = i10;
                    return this;
                }

                public C0444b z(int i10) {
                    this.f34331b |= 32;
                    this.f34337h = i10;
                    return this;
                }

                private void u() {
                }
            }
        }

        public C0442b(i.b bVar) {
            super(bVar);
            this.f34309f = (byte) -1;
            this.f34310g = -1;
            this.f34305b = bVar.j();
        }

        public C0442b(boolean z10) {
            this.f34309f = (byte) -1;
            this.f34310g = -1;
            this.f34305b = AbstractC5050d.f40294a;
        }

        public C0442b(C5051e c5051e, C5053g c5053g) {
            this.f34309f = (byte) -1;
            this.f34310g = -1;
            u();
            AbstractC5050d.b bVarT = AbstractC5050d.t();
            C5052f c5052fI = C5052f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = c5051e.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f34306c |= 1;
                                this.f34307d = c5051e.r();
                            } else if (iJ != 18) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                c.C0444b builder = (this.f34306c & 2) == 2 ? this.f34308e.toBuilder() : null;
                                c cVar = (c) c5051e.t(c.f34315r, c5053g);
                                this.f34308e = cVar;
                                if (builder != null) {
                                    builder.m(cVar);
                                    this.f34308e = builder.q();
                                }
                                this.f34306c |= 2;
                            }
                        }
                        z10 = true;
                    } catch (md.k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new md.k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f34305b = bVarT.f();
                        throw th2;
                    }
                    this.f34305b = bVarT.f();
                    g();
                    throw th;
                }
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f34305b = bVarT.f();
                throw th3;
            }
            this.f34305b = bVarT.f();
            g();
        }

        /* JADX INFO: renamed from: fd.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0443b extends i.b implements md.q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f34311b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f34312c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public c f34313d = c.F();

            public C0443b() {
                t();
            }

            public static C0443b s() {
                return new C0443b();
            }

            @Override // md.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0442b build() {
                C0442b c0442bQ = q();
                if (c0442bQ.isInitialized()) {
                    return c0442bQ;
                }
                throw AbstractC5047a.AbstractC0530a.i(c0442bQ);
            }

            public C0442b q() {
                C0442b c0442b = new C0442b(this);
                int i10 = this.f34311b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                c0442b.f34307d = this.f34312c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c0442b.f34308e = this.f34313d;
                c0442b.f34306c = i11;
                return c0442b;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0443b e() {
                return s().m(q());
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0443b m(C0442b c0442b) {
                if (c0442b == C0442b.p()) {
                    return this;
                }
                if (c0442b.s()) {
                    x(c0442b.q());
                }
                if (c0442b.t()) {
                    w(c0442b.r());
                }
                n(j().d(c0442b.f34305b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public fd.b.C0442b.C0443b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = fd.b.C0442b.f34304i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    fd.b$b r3 = (fd.b.C0442b) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    if (r3 == 0) goto Le
                    r2.m(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    md.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    fd.b$b r4 = (fd.b.C0442b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.m(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: fd.b.C0442b.C0443b.v0(md.e, md.g):fd.b$b$b");
            }

            public C0443b w(c cVar) {
                if ((this.f34311b & 2) != 2 || this.f34313d == c.F()) {
                    this.f34313d = cVar;
                } else {
                    this.f34313d = c.a0(this.f34313d).m(cVar).q();
                }
                this.f34311b |= 2;
                return this;
            }

            public C0443b x(int i10) {
                this.f34311b |= 1;
                this.f34312c = i10;
                return this;
            }

            public final void t() {
            }
        }
    }

    static {
        b bVar = new b(true);
        f34295h = bVar;
        bVar.w();
    }

    public static b t() {
        return f34295h;
    }

    private void w() {
        this.f34299d = 0;
        this.f34300e = Collections.EMPTY_LIST;
    }

    public static c x() {
        return c.s();
    }

    public static c y(b bVar) {
        return x().m(bVar);
    }

    @Override // md.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c toBuilder() {
        return y(this);
    }

    @Override // md.p
    public void a(C5052f c5052f) throws IOException {
        getSerializedSize();
        if ((this.f34298c & 1) == 1) {
            c5052f.Z(1, this.f34299d);
        }
        for (int i10 = 0; i10 < this.f34300e.size(); i10++) {
            c5052f.c0(2, (md.p) this.f34300e.get(i10));
        }
        c5052f.h0(this.f34297b);
    }

    @Override // md.p
    public int getSerializedSize() {
        int i10 = this.f34302g;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f34298c & 1) == 1 ? C5052f.o(1, this.f34299d) : 0;
        for (int i11 = 0; i11 < this.f34300e.size(); i11++) {
            iO += C5052f.r(2, (md.p) this.f34300e.get(i11));
        }
        int size = iO + this.f34297b.size();
        this.f34302g = size;
        return size;
    }

    @Override // md.q
    public final boolean isInitialized() {
        byte b10 = this.f34301f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!v()) {
            this.f34301f = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!q(i10).isInitialized()) {
                this.f34301f = (byte) 0;
                return false;
            }
        }
        this.f34301f = (byte) 1;
        return true;
    }

    public C0442b q(int i10) {
        return (C0442b) this.f34300e.get(i10);
    }

    public int r() {
        return this.f34300e.size();
    }

    public List s() {
        return this.f34300e;
    }

    public int u() {
        return this.f34299d;
    }

    public boolean v() {
        return (this.f34298c & 1) == 1;
    }

    @Override // md.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return x();
    }

    public b(i.b bVar) {
        super(bVar);
        this.f34301f = (byte) -1;
        this.f34302g = -1;
        this.f34297b = bVar.j();
    }

    public b(boolean z10) {
        this.f34301f = (byte) -1;
        this.f34302g = -1;
        this.f34297b = AbstractC5050d.f40294a;
    }

    public b(C5051e c5051e, C5053g c5053g) {
        this.f34301f = (byte) -1;
        this.f34302g = -1;
        w();
        AbstractC5050d.b bVarT = AbstractC5050d.t();
        C5052f c5052fI = C5052f.I(bVarT, 1);
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int iJ = c5051e.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f34298c |= 1;
                            this.f34299d = c5051e.r();
                        } else if (iJ != 18) {
                            if (!j(c5051e, c5052fI, c5053g, iJ)) {
                            }
                        } else {
                            if ((c10 & 2) != 2) {
                                this.f34300e = new ArrayList();
                                c10 = 2;
                            }
                            this.f34300e.add(c5051e.t(C0442b.f34304i, c5053g));
                        }
                    }
                    z10 = true;
                } catch (md.k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new md.k(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((c10 & 2) == 2) {
                    this.f34300e = Collections.unmodifiableList(this.f34300e);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f34297b = bVarT.f();
                    throw th2;
                }
                this.f34297b = bVarT.f();
                g();
                throw th;
            }
        }
        if ((c10 & 2) == 2) {
            this.f34300e = Collections.unmodifiableList(this.f34300e);
        }
        try {
            c5052fI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f34297b = bVarT.f();
            throw th3;
        }
        this.f34297b = bVarT.f();
        g();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends i.b implements md.q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f34345d = Collections.EMPTY_LIST;

        public c() {
            u();
        }

        public static c s() {
            return new c();
        }

        @Override // md.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b build() {
            b bVarQ = q();
            if (bVarQ.isInitialized()) {
                return bVarQ;
            }
            throw AbstractC5047a.AbstractC0530a.i(bVarQ);
        }

        public b q() {
            b bVar = new b(this);
            int i10 = (this.f34343b & 1) != 1 ? 0 : 1;
            bVar.f34299d = this.f34344c;
            if ((this.f34343b & 2) == 2) {
                this.f34345d = Collections.unmodifiableList(this.f34345d);
                this.f34343b &= -3;
            }
            bVar.f34300e = this.f34345d;
            bVar.f34298c = i10;
            return bVar;
        }

        @Override // md.AbstractC5047a.AbstractC0530a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public c e() {
            return s().m(q());
        }

        public final void t() {
            if ((this.f34343b & 2) != 2) {
                this.f34345d = new ArrayList(this.f34345d);
                this.f34343b |= 2;
            }
        }

        @Override // md.i.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c m(b bVar) {
            if (bVar == b.t()) {
                return this;
            }
            if (bVar.v()) {
                x(bVar.u());
            }
            if (!bVar.f34300e.isEmpty()) {
                if (this.f34345d.isEmpty()) {
                    this.f34345d = bVar.f34300e;
                    this.f34343b &= -3;
                } else {
                    t();
                    this.f34345d.addAll(bVar.f34300e);
                }
            }
            n(j().d(bVar.f34297b));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public fd.b.c v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                md.r r1 = fd.b.f34296i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                fd.b r3 = (fd.b) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
                if (r3 == 0) goto Le
                r2.m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                md.p r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                fd.b r4 = (fd.b) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.b.c.v0(md.e, md.g):fd.b$c");
        }

        public c x(int i10) {
            this.f34343b |= 1;
            this.f34344c = i10;
            return this;
        }

        private void u() {
        }
    }
}
