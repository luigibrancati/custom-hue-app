package id;

import com.google.api.Endpoint;
import fd.l;
import fd.n;
import fd.s;
import java.io.IOException;
import java.io.InputStream;
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
import md.k;
import md.p;
import md.q;
import md.r;
import md.y;

/* JADX INFO: renamed from: id.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4376a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.f f37378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i.f f37379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.f f37380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i.f f37381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.f f37382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.f f37383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i.f f37384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.f f37385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i.f f37386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i.f f37387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i.f f37388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i.f f37389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.f f37390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final i.f f37391n;

    /* JADX INFO: renamed from: id.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f37431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f37432i = new C0494a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f37433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f37434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f37435d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37436e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f37437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f37438g;

        /* JADX INFO: renamed from: id.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0494a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e c(C5051e c5051e, C5053g c5053g) {
                return new e(c5051e, c5053g);
            }
        }

        static {
            e eVar = new e(true);
            f37431h = eVar;
            eVar.t();
        }

        public static e q() {
            return f37431h;
        }

        private void t() {
            List list = Collections.EMPTY_LIST;
            this.f37434c = list;
            this.f37435d = list;
        }

        public static b u() {
            return b.s();
        }

        public static b v(e eVar) {
            return u().m(eVar);
        }

        public static e x(InputStream inputStream, C5053g c5053g) {
            return (e) f37432i.a(inputStream, c5053g);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f37434c.size(); i10++) {
                c5052f.c0(1, (p) this.f37434c.get(i10));
            }
            if (r().size() > 0) {
                c5052f.n0(42);
                c5052f.n0(this.f37436e);
            }
            for (int i11 = 0; i11 < this.f37435d.size(); i11++) {
                c5052f.a0(((Integer) this.f37435d.get(i11)).intValue());
            }
            c5052f.h0(this.f37433b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f37438g;
            if (i10 != -1) {
                return i10;
            }
            int iR = 0;
            for (int i11 = 0; i11 < this.f37434c.size(); i11++) {
                iR += C5052f.r(1, (p) this.f37434c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f37435d.size(); i12++) {
                iP += C5052f.p(((Integer) this.f37435d.get(i12)).intValue());
            }
            int iP2 = iR + iP;
            if (!r().isEmpty()) {
                iP2 = iP2 + 1 + C5052f.p(iP);
            }
            this.f37436e = iP;
            int size = iP2 + this.f37433b.size();
            this.f37438g = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f37437f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f37437f = (byte) 1;
            return true;
        }

        public List r() {
            return this.f37435d;
        }

        public List s() {
            return this.f37434c;
        }

        @Override // md.p
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return u();
        }

        @Override // md.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return v(this);
        }

        /* JADX INFO: renamed from: id.a$e$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends i implements q {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final c f37442n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static r f37443o = new C0495a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AbstractC5050d f37444b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f37445c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f37446d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f37447e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f37448f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public EnumC0496c f37449g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public List f37450h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f37451i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public List f37452j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public int f37453k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public byte f37454l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f37455m;

            /* JADX INFO: renamed from: id.a$e$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class C0495a extends AbstractC5048b {
                @Override // md.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c c(C5051e c5051e, C5053g c5053g) {
                    return new c(c5051e, c5053g);
                }
            }

            /* JADX INFO: renamed from: id.a$e$c$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public enum EnumC0496c implements j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static j.b internalValueMap = new C0497a();
                private final int value;

                /* JADX INFO: renamed from: id.a$e$c$c$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                public static class C0497a implements j.b {
                    @Override // md.j.b
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public EnumC0496c findValueByNumber(int i10) {
                        return EnumC0496c.a(i10);
                    }
                }

                EnumC0496c(int i10, int i11) {
                    this.value = i11;
                }

                public static EnumC0496c a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // md.j.a
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                c cVar = new c(true);
                f37442n = cVar;
                cVar.L();
            }

            private void L() {
                this.f37446d = 1;
                this.f37447e = 0;
                this.f37448f = "";
                this.f37449g = EnumC0496c.NONE;
                List list = Collections.EMPTY_LIST;
                this.f37450h = list;
                this.f37452j = list;
            }

            public static b M() {
                return b.s();
            }

            public static b N(c cVar) {
                return M().m(cVar);
            }

            public static c w() {
                return f37442n;
            }

            public int A() {
                return this.f37452j.size();
            }

            public List B() {
                return this.f37452j;
            }

            public String C() {
                Object obj = this.f37448f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                AbstractC5050d abstractC5050d = (AbstractC5050d) obj;
                String strA = abstractC5050d.A();
                if (abstractC5050d.s()) {
                    this.f37448f = strA;
                }
                return strA;
            }

            public AbstractC5050d D() {
                Object obj = this.f37448f;
                if (!(obj instanceof String)) {
                    return (AbstractC5050d) obj;
                }
                AbstractC5050d abstractC5050dK = AbstractC5050d.k((String) obj);
                this.f37448f = abstractC5050dK;
                return abstractC5050dK;
            }

            public int E() {
                return this.f37450h.size();
            }

            public List F() {
                return this.f37450h;
            }

            public boolean G() {
                return (this.f37445c & 8) == 8;
            }

            public boolean I() {
                return (this.f37445c & 2) == 2;
            }

            public boolean J() {
                return (this.f37445c & 1) == 1;
            }

            public boolean K() {
                return (this.f37445c & 4) == 4;
            }

            @Override // md.p
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public b newBuilderForType() {
                return M();
            }

            @Override // md.p
            /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
            public b toBuilder() {
                return N(this);
            }

            @Override // md.p
            public void a(C5052f c5052f) throws IOException {
                getSerializedSize();
                if ((this.f37445c & 1) == 1) {
                    c5052f.Z(1, this.f37446d);
                }
                if ((this.f37445c & 2) == 2) {
                    c5052f.Z(2, this.f37447e);
                }
                if ((this.f37445c & 8) == 8) {
                    c5052f.R(3, this.f37449g.getNumber());
                }
                if (F().size() > 0) {
                    c5052f.n0(34);
                    c5052f.n0(this.f37451i);
                }
                for (int i10 = 0; i10 < this.f37450h.size(); i10++) {
                    c5052f.a0(((Integer) this.f37450h.get(i10)).intValue());
                }
                if (B().size() > 0) {
                    c5052f.n0(42);
                    c5052f.n0(this.f37453k);
                }
                for (int i11 = 0; i11 < this.f37452j.size(); i11++) {
                    c5052f.a0(((Integer) this.f37452j.get(i11)).intValue());
                }
                if ((this.f37445c & 4) == 4) {
                    c5052f.N(6, D());
                }
                c5052f.h0(this.f37444b);
            }

            @Override // md.p
            public int getSerializedSize() {
                int i10 = this.f37455m;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f37445c & 1) == 1 ? C5052f.o(1, this.f37446d) : 0;
                if ((this.f37445c & 2) == 2) {
                    iO += C5052f.o(2, this.f37447e);
                }
                if ((this.f37445c & 8) == 8) {
                    iO += C5052f.h(3, this.f37449g.getNumber());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f37450h.size(); i11++) {
                    iP += C5052f.p(((Integer) this.f37450h.get(i11)).intValue());
                }
                int iP2 = iO + iP;
                if (!F().isEmpty()) {
                    iP2 = iP2 + 1 + C5052f.p(iP);
                }
                this.f37451i = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f37452j.size(); i12++) {
                    iP3 += C5052f.p(((Integer) this.f37452j.get(i12)).intValue());
                }
                int iD = iP2 + iP3;
                if (!B().isEmpty()) {
                    iD = iD + 1 + C5052f.p(iP3);
                }
                this.f37453k = iP3;
                if ((this.f37445c & 4) == 4) {
                    iD += C5052f.d(6, D());
                }
                int size = iD + this.f37444b.size();
                this.f37455m = size;
                return size;
            }

            @Override // md.q
            public final boolean isInitialized() {
                byte b10 = this.f37454l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f37454l = (byte) 1;
                return true;
            }

            public EnumC0496c x() {
                return this.f37449g;
            }

            public int y() {
                return this.f37447e;
            }

            public int z() {
                return this.f37446d;
            }

            public c(i.b bVar) {
                super(bVar);
                this.f37451i = -1;
                this.f37453k = -1;
                this.f37454l = (byte) -1;
                this.f37455m = -1;
                this.f37444b = bVar.j();
            }

            public c(boolean z10) {
                this.f37451i = -1;
                this.f37453k = -1;
                this.f37454l = (byte) -1;
                this.f37455m = -1;
                this.f37444b = AbstractC5050d.f40294a;
            }

            public c(C5051e c5051e, C5053g c5053g) {
                this.f37451i = -1;
                this.f37453k = -1;
                this.f37454l = (byte) -1;
                this.f37455m = -1;
                L();
                AbstractC5050d.b bVarT = AbstractC5050d.t();
                C5052f c5052fI = C5052f.I(bVarT, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iJ = c5051e.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f37445c |= 1;
                                    this.f37446d = c5051e.r();
                                } else if (iJ == 16) {
                                    this.f37445c |= 2;
                                    this.f37447e = c5051e.r();
                                } else if (iJ == 24) {
                                    int iM = c5051e.m();
                                    EnumC0496c enumC0496cA = EnumC0496c.a(iM);
                                    if (enumC0496cA == null) {
                                        c5052fI.n0(iJ);
                                        c5052fI.n0(iM);
                                    } else {
                                        this.f37445c |= 8;
                                        this.f37449g = enumC0496cA;
                                    }
                                } else if (iJ == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f37450h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f37450h.add(Integer.valueOf(c5051e.r()));
                                } else if (iJ == 34) {
                                    int i11 = c5051e.i(c5051e.z());
                                    if ((i10 & 16) != 16 && c5051e.e() > 0) {
                                        this.f37450h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (c5051e.e() > 0) {
                                        this.f37450h.add(Integer.valueOf(c5051e.r()));
                                    }
                                    c5051e.h(i11);
                                } else if (iJ == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f37452j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f37452j.add(Integer.valueOf(c5051e.r()));
                                } else if (iJ == 42) {
                                    int i12 = c5051e.i(c5051e.z());
                                    if ((i10 & 32) != 32 && c5051e.e() > 0) {
                                        this.f37452j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (c5051e.e() > 0) {
                                        this.f37452j.add(Integer.valueOf(c5051e.r()));
                                    }
                                    c5051e.h(i12);
                                } else if (iJ != 50) {
                                    if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                    }
                                } else {
                                    AbstractC5050d abstractC5050dK = c5051e.k();
                                    this.f37445c |= 4;
                                    this.f37448f = abstractC5050dK;
                                }
                            }
                            z10 = true;
                        } catch (k e10) {
                            throw e10.i(this);
                        } catch (IOException e11) {
                            throw new k(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th) {
                        if ((i10 & 16) == 16) {
                            this.f37450h = Collections.unmodifiableList(this.f37450h);
                        }
                        if ((i10 & 32) == 32) {
                            this.f37452j = Collections.unmodifiableList(this.f37452j);
                        }
                        try {
                            c5052fI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f37444b = bVarT.f();
                            throw th2;
                        }
                        this.f37444b = bVarT.f();
                        g();
                        throw th;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f37450h = Collections.unmodifiableList(this.f37450h);
                }
                if ((i10 & 32) == 32) {
                    this.f37452j = Collections.unmodifiableList(this.f37452j);
                }
                try {
                    c5052fI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f37444b = bVarT.f();
                    throw th3;
                }
                this.f37444b = bVarT.f();
                g();
            }

            /* JADX INFO: renamed from: id.a$e$c$b */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class b extends i.b implements q {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f37456b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f37458d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public List f37461g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public List f37462h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public int f37457c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f37459e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public EnumC0496c f37460f = EnumC0496c.NONE;

                public b() {
                    List list = Collections.EMPTY_LIST;
                    this.f37461g = list;
                    this.f37462h = list;
                    v();
                }

                public static b s() {
                    return new b();
                }

                public b A(int i10) {
                    this.f37456b |= 1;
                    this.f37457c = i10;
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
                    int i10 = this.f37456b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    cVar.f37446d = this.f37457c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    cVar.f37447e = this.f37458d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    cVar.f37448f = this.f37459e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    cVar.f37449g = this.f37460f;
                    if ((this.f37456b & 16) == 16) {
                        this.f37461g = Collections.unmodifiableList(this.f37461g);
                        this.f37456b &= -17;
                    }
                    cVar.f37450h = this.f37461g;
                    if ((this.f37456b & 32) == 32) {
                        this.f37462h = Collections.unmodifiableList(this.f37462h);
                        this.f37456b &= -33;
                    }
                    cVar.f37452j = this.f37462h;
                    cVar.f37445c = i11;
                    return cVar;
                }

                @Override // md.AbstractC5047a.AbstractC0530a
                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public b e() {
                    return s().m(q());
                }

                public final void t() {
                    if ((this.f37456b & 32) != 32) {
                        this.f37462h = new ArrayList(this.f37462h);
                        this.f37456b |= 32;
                    }
                }

                public final void u() {
                    if ((this.f37456b & 16) != 16) {
                        this.f37461g = new ArrayList(this.f37461g);
                        this.f37456b |= 16;
                    }
                }

                @Override // md.i.b
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public b m(c cVar) {
                    if (cVar == c.w()) {
                        return this;
                    }
                    if (cVar.J()) {
                        A(cVar.z());
                    }
                    if (cVar.I()) {
                        z(cVar.y());
                    }
                    if (cVar.K()) {
                        this.f37456b |= 4;
                        this.f37459e = cVar.f37448f;
                    }
                    if (cVar.G()) {
                        y(cVar.x());
                    }
                    if (!cVar.f37450h.isEmpty()) {
                        if (this.f37461g.isEmpty()) {
                            this.f37461g = cVar.f37450h;
                            this.f37456b &= -17;
                        } else {
                            u();
                            this.f37461g.addAll(cVar.f37450h);
                        }
                    }
                    if (!cVar.f37452j.isEmpty()) {
                        if (this.f37462h.isEmpty()) {
                            this.f37462h = cVar.f37452j;
                            this.f37456b &= -33;
                        } else {
                            t();
                            this.f37462h.addAll(cVar.f37452j);
                        }
                    }
                    n(j().d(cVar.f37444b));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public id.AbstractC4376a.e.c.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        md.r r1 = id.AbstractC4376a.e.c.f37443o     // Catch: java.lang.Throwable -> Lf md.k -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                        id.a$e$c r3 = (id.AbstractC4376a.e.c) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                        id.a$e$c r4 = (id.AbstractC4376a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: id.AbstractC4376a.e.c.b.v0(md.e, md.g):id.a$e$c$b");
                }

                public b y(EnumC0496c enumC0496c) {
                    enumC0496c.getClass();
                    this.f37456b |= 8;
                    this.f37460f = enumC0496c;
                    return this;
                }

                public b z(int i10) {
                    this.f37456b |= 2;
                    this.f37458d = i10;
                    return this;
                }

                private void v() {
                }
            }
        }

        public e(i.b bVar) {
            super(bVar);
            this.f37436e = -1;
            this.f37437f = (byte) -1;
            this.f37438g = -1;
            this.f37433b = bVar.j();
        }

        public e(boolean z10) {
            this.f37436e = -1;
            this.f37437f = (byte) -1;
            this.f37438g = -1;
            this.f37433b = AbstractC5050d.f40294a;
        }

        public e(C5051e c5051e, C5053g c5053g) {
            this.f37436e = -1;
            this.f37437f = (byte) -1;
            this.f37438g = -1;
            t();
            AbstractC5050d.b bVarT = AbstractC5050d.t();
            C5052f c5052fI = C5052f.I(bVarT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iJ = c5051e.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f37434c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f37434c.add(c5051e.t(c.f37443o, c5053g));
                            } else if (iJ == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f37435d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f37435d.add(Integer.valueOf(c5051e.r()));
                            } else if (iJ != 42) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                int i11 = c5051e.i(c5051e.z());
                                if ((i10 & 2) != 2 && c5051e.e() > 0) {
                                    this.f37435d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (c5051e.e() > 0) {
                                    this.f37435d.add(Integer.valueOf(c5051e.r()));
                                }
                                c5051e.h(i11);
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i10 & 1) == 1) {
                        this.f37434c = Collections.unmodifiableList(this.f37434c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f37435d = Collections.unmodifiableList(this.f37435d);
                    }
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f37433b = bVarT.f();
                        throw th2;
                    }
                    this.f37433b = bVarT.f();
                    g();
                    throw th;
                }
            }
            if ((i10 & 1) == 1) {
                this.f37434c = Collections.unmodifiableList(this.f37434c);
            }
            if ((i10 & 2) == 2) {
                this.f37435d = Collections.unmodifiableList(this.f37435d);
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f37433b = bVarT.f();
                throw th3;
            }
            this.f37433b = bVarT.f();
            g();
        }

        /* JADX INFO: renamed from: id.a$e$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f37439b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public List f37440c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public List f37441d;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f37440c = list;
                this.f37441d = list;
                v();
            }

            public static b s() {
                return new b();
            }

            @Override // md.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public e build() {
                e eVarQ = q();
                if (eVarQ.isInitialized()) {
                    return eVarQ;
                }
                throw AbstractC5047a.AbstractC0530a.i(eVarQ);
            }

            public e q() {
                e eVar = new e(this);
                if ((this.f37439b & 1) == 1) {
                    this.f37440c = Collections.unmodifiableList(this.f37440c);
                    this.f37439b &= -2;
                }
                eVar.f37434c = this.f37440c;
                if ((this.f37439b & 2) == 2) {
                    this.f37441d = Collections.unmodifiableList(this.f37441d);
                    this.f37439b &= -3;
                }
                eVar.f37435d = this.f37441d;
                return eVar;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e() {
                return s().m(q());
            }

            public final void t() {
                if ((this.f37439b & 2) != 2) {
                    this.f37441d = new ArrayList(this.f37441d);
                    this.f37439b |= 2;
                }
            }

            public final void u() {
                if ((this.f37439b & 1) != 1) {
                    this.f37440c = new ArrayList(this.f37440c);
                    this.f37439b |= 1;
                }
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b m(e eVar) {
                if (eVar == e.q()) {
                    return this;
                }
                if (!eVar.f37434c.isEmpty()) {
                    if (this.f37440c.isEmpty()) {
                        this.f37440c = eVar.f37434c;
                        this.f37439b &= -2;
                    } else {
                        u();
                        this.f37440c.addAll(eVar.f37434c);
                    }
                }
                if (!eVar.f37435d.isEmpty()) {
                    if (this.f37441d.isEmpty()) {
                        this.f37441d = eVar.f37435d;
                        this.f37439b &= -3;
                    } else {
                        t();
                        this.f37441d.addAll(eVar.f37435d);
                    }
                }
                n(j().d(eVar.f37433b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public id.AbstractC4376a.e.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = id.AbstractC4376a.e.f37432i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    id.a$e r3 = (id.AbstractC4376a.e) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                    id.a$e r4 = (id.AbstractC4376a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: id.AbstractC4376a.e.b.v0(md.e, md.g):id.a$e$b");
            }

            private void v() {
            }
        }
    }

    static {
        fd.d dVarB = fd.d.B();
        c cVarP = c.p();
        c cVarP2 = c.p();
        y.b bVar = y.b.MESSAGE;
        f37378a = i.i(dVarB, cVarP, cVarP2, null, 100, bVar, c.class);
        f37379b = i.i(fd.i.V(), c.p(), c.p(), null, 100, bVar, c.class);
        fd.i iVarV = fd.i.V();
        y.b bVar2 = y.b.INT32;
        f37380c = i.i(iVarV, 0, null, null, Endpoint.TARGET_FIELD_NUMBER, bVar2, Integer.class);
        f37381d = i.i(n.T(), d.s(), d.s(), null, 100, bVar, d.class);
        f37382e = i.i(n.T(), 0, null, null, Endpoint.TARGET_FIELD_NUMBER, bVar2, Integer.class);
        f37383f = i.h(fd.q.S(), fd.b.t(), null, 100, bVar, false, fd.b.class);
        f37384g = i.i(fd.q.S(), Boolean.FALSE, null, null, Endpoint.TARGET_FIELD_NUMBER, y.b.BOOL, Boolean.class);
        f37385h = i.h(s.E(), fd.b.t(), null, 100, bVar, false, fd.b.class);
        f37386i = i.i(fd.c.t0(), 0, null, null, Endpoint.TARGET_FIELD_NUMBER, bVar2, Integer.class);
        f37387j = i.h(fd.c.t0(), n.T(), null, 102, bVar, false, n.class);
        f37388k = i.i(fd.c.t0(), 0, null, null, 103, bVar2, Integer.class);
        f37389l = i.i(fd.c.t0(), 0, null, null, 104, bVar2, Integer.class);
        f37390m = i.i(l.E(), 0, null, null, Endpoint.TARGET_FIELD_NUMBER, bVar2, Integer.class);
        f37391n = i.h(l.E(), n.T(), null, 102, bVar, false, n.class);
    }

    public static void a(C5053g c5053g) {
        c5053g.a(f37378a);
        c5053g.a(f37379b);
        c5053g.a(f37380c);
        c5053g.a(f37381d);
        c5053g.a(f37382e);
        c5053g.a(f37383f);
        c5053g.a(f37384g);
        c5053g.a(f37385h);
        c5053g.a(f37386i);
        c5053g.a(f37387j);
        c5053g.a(f37388k);
        c5053g.a(f37389l);
        c5053g.a(f37390m);
        c5053g.a(f37391n);
    }

    /* JADX INFO: renamed from: id.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f37392h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f37393i = new C0490a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f37394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f37398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f37399g;

        /* JADX INFO: renamed from: id.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0490a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(C5051e c5051e, C5053g c5053g) {
                return new b(c5051e, c5053g);
            }
        }

        static {
            b bVar = new b(true);
            f37392h = bVar;
            bVar.u();
        }

        public static b p() {
            return f37392h;
        }

        private void u() {
            this.f37396d = 0;
            this.f37397e = 0;
        }

        public static C0491b v() {
            return C0491b.s();
        }

        public static C0491b w(b bVar) {
            return v().m(bVar);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            if ((this.f37395c & 1) == 1) {
                c5052f.Z(1, this.f37396d);
            }
            if ((this.f37395c & 2) == 2) {
                c5052f.Z(2, this.f37397e);
            }
            c5052f.h0(this.f37394b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f37399g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f37395c & 1) == 1 ? C5052f.o(1, this.f37396d) : 0;
            if ((this.f37395c & 2) == 2) {
                iO += C5052f.o(2, this.f37397e);
            }
            int size = iO + this.f37394b.size();
            this.f37399g = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f37398f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f37398f = (byte) 1;
            return true;
        }

        public int q() {
            return this.f37397e;
        }

        public int r() {
            return this.f37396d;
        }

        public boolean s() {
            return (this.f37395c & 2) == 2;
        }

        public boolean t() {
            return (this.f37395c & 1) == 1;
        }

        @Override // md.p
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public C0491b newBuilderForType() {
            return v();
        }

        @Override // md.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public C0491b toBuilder() {
            return w(this);
        }

        public b(i.b bVar) {
            super(bVar);
            this.f37398f = (byte) -1;
            this.f37399g = -1;
            this.f37394b = bVar.j();
        }

        public b(boolean z10) {
            this.f37398f = (byte) -1;
            this.f37399g = -1;
            this.f37394b = AbstractC5050d.f40294a;
        }

        public b(C5051e c5051e, C5053g c5053g) {
            this.f37398f = (byte) -1;
            this.f37399g = -1;
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
                                this.f37395c |= 1;
                                this.f37396d = c5051e.r();
                            } else if (iJ != 16) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                this.f37395c |= 2;
                                this.f37397e = c5051e.r();
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f37394b = bVarT.f();
                        throw th2;
                    }
                    this.f37394b = bVarT.f();
                    g();
                    throw th;
                }
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f37394b = bVarT.f();
                throw th3;
            }
            this.f37394b = bVarT.f();
            g();
        }

        /* JADX INFO: renamed from: id.a$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0491b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f37400b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f37401c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f37402d;

            public C0491b() {
                t();
            }

            public static C0491b s() {
                return new C0491b();
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
                int i10 = this.f37400b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                bVar.f37396d = this.f37401c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                bVar.f37397e = this.f37402d;
                bVar.f37395c = i11;
                return bVar;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public C0491b e() {
                return s().m(q());
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0491b m(b bVar) {
                if (bVar == b.p()) {
                    return this;
                }
                if (bVar.t()) {
                    x(bVar.r());
                }
                if (bVar.s()) {
                    w(bVar.q());
                }
                n(j().d(bVar.f37394b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public id.AbstractC4376a.b.C0491b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = id.AbstractC4376a.b.f37393i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    id.a$b r3 = (id.AbstractC4376a.b) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                    id.a$b r4 = (id.AbstractC4376a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: id.AbstractC4376a.b.C0491b.v0(md.e, md.g):id.a$b$b");
            }

            public C0491b w(int i10) {
                this.f37400b |= 2;
                this.f37402d = i10;
                return this;
            }

            public C0491b x(int i10) {
                this.f37400b |= 1;
                this.f37401c = i10;
                return this;
            }

            private void t() {
            }
        }
    }

    /* JADX INFO: renamed from: id.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends i implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final c f37403h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static r f37404i = new C0492a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f37405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f37409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f37410g;

        /* JADX INFO: renamed from: id.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0492a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c c(C5051e c5051e, C5053g c5053g) {
                return new c(c5051e, c5053g);
            }
        }

        static {
            c cVar = new c(true);
            f37403h = cVar;
            cVar.u();
        }

        public static c p() {
            return f37403h;
        }

        private void u() {
            this.f37407d = 0;
            this.f37408e = 0;
        }

        public static b v() {
            return b.s();
        }

        public static b w(c cVar) {
            return v().m(cVar);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            if ((this.f37406c & 1) == 1) {
                c5052f.Z(1, this.f37407d);
            }
            if ((this.f37406c & 2) == 2) {
                c5052f.Z(2, this.f37408e);
            }
            c5052f.h0(this.f37405b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f37410g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f37406c & 1) == 1 ? C5052f.o(1, this.f37407d) : 0;
            if ((this.f37406c & 2) == 2) {
                iO += C5052f.o(2, this.f37408e);
            }
            int size = iO + this.f37405b.size();
            this.f37410g = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f37409f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f37409f = (byte) 1;
            return true;
        }

        public int q() {
            return this.f37408e;
        }

        public int r() {
            return this.f37407d;
        }

        public boolean s() {
            return (this.f37406c & 2) == 2;
        }

        public boolean t() {
            return (this.f37406c & 1) == 1;
        }

        @Override // md.p
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return v();
        }

        @Override // md.p
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return w(this);
        }

        public c(i.b bVar) {
            super(bVar);
            this.f37409f = (byte) -1;
            this.f37410g = -1;
            this.f37405b = bVar.j();
        }

        public c(boolean z10) {
            this.f37409f = (byte) -1;
            this.f37410g = -1;
            this.f37405b = AbstractC5050d.f40294a;
        }

        public c(C5051e c5051e, C5053g c5053g) {
            this.f37409f = (byte) -1;
            this.f37410g = -1;
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
                                this.f37406c |= 1;
                                this.f37407d = c5051e.r();
                            } else if (iJ != 16) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                this.f37406c |= 2;
                                this.f37408e = c5051e.r();
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f37405b = bVarT.f();
                        throw th2;
                    }
                    this.f37405b = bVarT.f();
                    g();
                    throw th;
                }
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f37405b = bVarT.f();
                throw th3;
            }
            this.f37405b = bVarT.f();
            g();
        }

        /* JADX INFO: renamed from: id.a$c$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f37411b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f37412c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f37413d;

            public b() {
                t();
            }

            public static b s() {
                return new b();
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
                int i10 = this.f37411b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                cVar.f37407d = this.f37412c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                cVar.f37408e = this.f37413d;
                cVar.f37406c = i11;
                return cVar;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e() {
                return s().m(q());
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public b m(c cVar) {
                if (cVar == c.p()) {
                    return this;
                }
                if (cVar.t()) {
                    x(cVar.r());
                }
                if (cVar.s()) {
                    w(cVar.q());
                }
                n(j().d(cVar.f37405b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public id.AbstractC4376a.c.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = id.AbstractC4376a.c.f37404i     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    id.a$c r3 = (id.AbstractC4376a.c) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                    id.a$c r4 = (id.AbstractC4376a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: id.AbstractC4376a.c.b.v0(md.e, md.g):id.a$c$b");
            }

            public b w(int i10) {
                this.f37411b |= 2;
                this.f37413d = i10;
                return this;
            }

            public b x(int i10) {
                this.f37411b |= 1;
                this.f37412c = i10;
                return this;
            }

            private void t() {
            }
        }
    }

    /* JADX INFO: renamed from: id.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends i implements q {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final d f37414k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static r f37415l = new C0493a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC5050d f37416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b f37418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f37419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f37420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c f37421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c f37422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte f37423i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f37424j;

        /* JADX INFO: renamed from: id.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0493a extends AbstractC5048b {
            @Override // md.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d c(C5051e c5051e, C5053g c5053g) {
                return new d(c5051e, c5053g);
            }
        }

        static {
            d dVar = new d(true);
            f37414k = dVar;
            dVar.D();
        }

        private void D() {
            this.f37418d = b.p();
            this.f37419e = c.p();
            this.f37420f = c.p();
            this.f37421g = c.p();
            this.f37422h = c.p();
        }

        public static b E() {
            return b.s();
        }

        public static b F(d dVar) {
            return E().m(dVar);
        }

        public static d s() {
            return f37414k;
        }

        public boolean A() {
            return (this.f37417c & 4) == 4;
        }

        public boolean B() {
            return (this.f37417c & 8) == 8;
        }

        public boolean C() {
            return (this.f37417c & 2) == 2;
        }

        @Override // md.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b newBuilderForType() {
            return E();
        }

        @Override // md.p
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b toBuilder() {
            return F(this);
        }

        @Override // md.p
        public void a(C5052f c5052f) throws IOException {
            getSerializedSize();
            if ((this.f37417c & 1) == 1) {
                c5052f.c0(1, this.f37418d);
            }
            if ((this.f37417c & 2) == 2) {
                c5052f.c0(2, this.f37419e);
            }
            if ((this.f37417c & 4) == 4) {
                c5052f.c0(3, this.f37420f);
            }
            if ((this.f37417c & 8) == 8) {
                c5052f.c0(4, this.f37421g);
            }
            if ((this.f37417c & 16) == 16) {
                c5052f.c0(5, this.f37422h);
            }
            c5052f.h0(this.f37416b);
        }

        @Override // md.p
        public int getSerializedSize() {
            int i10 = this.f37424j;
            if (i10 != -1) {
                return i10;
            }
            int iR = (this.f37417c & 1) == 1 ? C5052f.r(1, this.f37418d) : 0;
            if ((this.f37417c & 2) == 2) {
                iR += C5052f.r(2, this.f37419e);
            }
            if ((this.f37417c & 4) == 4) {
                iR += C5052f.r(3, this.f37420f);
            }
            if ((this.f37417c & 8) == 8) {
                iR += C5052f.r(4, this.f37421g);
            }
            if ((this.f37417c & 16) == 16) {
                iR += C5052f.r(5, this.f37422h);
            }
            int size = iR + this.f37416b.size();
            this.f37424j = size;
            return size;
        }

        @Override // md.q
        public final boolean isInitialized() {
            byte b10 = this.f37423i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f37423i = (byte) 1;
            return true;
        }

        public c t() {
            return this.f37422h;
        }

        public b u() {
            return this.f37418d;
        }

        public c v() {
            return this.f37420f;
        }

        public c w() {
            return this.f37421g;
        }

        public c x() {
            return this.f37419e;
        }

        public boolean y() {
            return (this.f37417c & 16) == 16;
        }

        public boolean z() {
            return (this.f37417c & 1) == 1;
        }

        public d(i.b bVar) {
            super(bVar);
            this.f37423i = (byte) -1;
            this.f37424j = -1;
            this.f37416b = bVar.j();
        }

        public d(boolean z10) {
            this.f37423i = (byte) -1;
            this.f37424j = -1;
            this.f37416b = AbstractC5050d.f40294a;
        }

        public d(C5051e c5051e, C5053g c5053g) {
            this.f37423i = (byte) -1;
            this.f37424j = -1;
            D();
            AbstractC5050d.b bVarT = AbstractC5050d.t();
            C5052f c5052fI = C5052f.I(bVarT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iJ = c5051e.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                b.C0491b builder = (this.f37417c & 1) == 1 ? this.f37418d.toBuilder() : null;
                                b bVar = (b) c5051e.t(b.f37393i, c5053g);
                                this.f37418d = bVar;
                                if (builder != null) {
                                    builder.m(bVar);
                                    this.f37418d = builder.q();
                                }
                                this.f37417c |= 1;
                            } else if (iJ == 18) {
                                c.b builder2 = (this.f37417c & 2) == 2 ? this.f37419e.toBuilder() : null;
                                c cVar = (c) c5051e.t(c.f37404i, c5053g);
                                this.f37419e = cVar;
                                if (builder2 != null) {
                                    builder2.m(cVar);
                                    this.f37419e = builder2.q();
                                }
                                this.f37417c |= 2;
                            } else if (iJ == 26) {
                                c.b builder3 = (this.f37417c & 4) == 4 ? this.f37420f.toBuilder() : null;
                                c cVar2 = (c) c5051e.t(c.f37404i, c5053g);
                                this.f37420f = cVar2;
                                if (builder3 != null) {
                                    builder3.m(cVar2);
                                    this.f37420f = builder3.q();
                                }
                                this.f37417c |= 4;
                            } else if (iJ == 34) {
                                c.b builder4 = (this.f37417c & 8) == 8 ? this.f37421g.toBuilder() : null;
                                c cVar3 = (c) c5051e.t(c.f37404i, c5053g);
                                this.f37421g = cVar3;
                                if (builder4 != null) {
                                    builder4.m(cVar3);
                                    this.f37421g = builder4.q();
                                }
                                this.f37417c |= 8;
                            } else if (iJ != 42) {
                                if (!j(c5051e, c5052fI, c5053g, iJ)) {
                                }
                            } else {
                                c.b builder5 = (this.f37417c & 16) == 16 ? this.f37422h.toBuilder() : null;
                                c cVar4 = (c) c5051e.t(c.f37404i, c5053g);
                                this.f37422h = cVar4;
                                if (builder5 != null) {
                                    builder5.m(cVar4);
                                    this.f37422h = builder5.q();
                                }
                                this.f37417c |= 16;
                            }
                        }
                        z10 = true;
                    } catch (k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new k(e11.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c5052fI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f37416b = bVarT.f();
                        throw th2;
                    }
                    this.f37416b = bVarT.f();
                    g();
                    throw th;
                }
            }
            try {
                c5052fI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f37416b = bVarT.f();
                throw th3;
            }
            this.f37416b = bVarT.f();
            g();
        }

        /* JADX INFO: renamed from: id.a$d$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends i.b implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f37425b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public b f37426c = b.p();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public c f37427d = c.p();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public c f37428e = c.p();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public c f37429f = c.p();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public c f37430g = c.p();

            public b() {
                t();
            }

            public static b s() {
                return new b();
            }

            public b A(c cVar) {
                if ((this.f37425b & 2) != 2 || this.f37427d == c.p()) {
                    this.f37427d = cVar;
                } else {
                    this.f37427d = c.w(this.f37427d).m(cVar).q();
                }
                this.f37425b |= 2;
                return this;
            }

            @Override // md.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarQ = q();
                if (dVarQ.isInitialized()) {
                    return dVarQ;
                }
                throw AbstractC5047a.AbstractC0530a.i(dVarQ);
            }

            public d q() {
                d dVar = new d(this);
                int i10 = this.f37425b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                dVar.f37418d = this.f37426c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                dVar.f37419e = this.f37427d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                dVar.f37420f = this.f37428e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                dVar.f37421g = this.f37429f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                dVar.f37422h = this.f37430g;
                dVar.f37417c = i11;
                return dVar;
            }

            @Override // md.AbstractC5047a.AbstractC0530a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public b e() {
                return s().m(q());
            }

            public b u(c cVar) {
                if ((this.f37425b & 16) != 16 || this.f37430g == c.p()) {
                    this.f37430g = cVar;
                } else {
                    this.f37430g = c.w(this.f37430g).m(cVar).q();
                }
                this.f37425b |= 16;
                return this;
            }

            public b v(b bVar) {
                if ((this.f37425b & 1) != 1 || this.f37426c == b.p()) {
                    this.f37426c = bVar;
                } else {
                    this.f37426c = b.w(this.f37426c).m(bVar).q();
                }
                this.f37425b |= 1;
                return this;
            }

            @Override // md.i.b
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b m(d dVar) {
                if (dVar == d.s()) {
                    return this;
                }
                if (dVar.z()) {
                    v(dVar.u());
                }
                if (dVar.C()) {
                    A(dVar.x());
                }
                if (dVar.A()) {
                    y(dVar.v());
                }
                if (dVar.B()) {
                    z(dVar.w());
                }
                if (dVar.y()) {
                    u(dVar.t());
                }
                n(j().d(dVar.f37416b));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // md.AbstractC5047a.AbstractC0530a, md.p.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public id.AbstractC4376a.d.b v0(md.C5051e r3, md.C5053g r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    md.r r1 = id.AbstractC4376a.d.f37415l     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf md.k -> L11
                    id.a$d r3 = (id.AbstractC4376a.d) r3     // Catch: java.lang.Throwable -> Lf md.k -> L11
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
                    id.a$d r4 = (id.AbstractC4376a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: id.AbstractC4376a.d.b.v0(md.e, md.g):id.a$d$b");
            }

            public b y(c cVar) {
                if ((this.f37425b & 4) != 4 || this.f37428e == c.p()) {
                    this.f37428e = cVar;
                } else {
                    this.f37428e = c.w(this.f37428e).m(cVar).q();
                }
                this.f37425b |= 4;
                return this;
            }

            public b z(c cVar) {
                if ((this.f37425b & 8) != 8 || this.f37429f == c.p()) {
                    this.f37429f = cVar;
                } else {
                    this.f37429f = c.w(this.f37429f).m(cVar).q();
                }
                this.f37425b |= 8;
                return this;
            }

            private void t() {
            }
        }
    }
}
