package Od;

import Od.k;
import Od.l;
import gc.AbstractC4189b;
import gc.AbstractC4191d;
import gc.C4179C;
import gc.C4206t;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f12450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f12451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12452d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4191d {
        public a() {
        }

        @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return f((String) obj);
            }
            return false;
        }

        @Override // gc.AbstractC4189b
        public int d() {
            return l.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean f(String str) {
            return super.contains(str);
        }

        @Override // gc.AbstractC4191d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = l.this.f().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return k((String) obj);
            }
            return -1;
        }

        public /* bridge */ int k(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int l(String str) {
            return super.lastIndexOf(str);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return l((String) obj);
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC4189b implements j {
        public b() {
        }

        public static final C1829i k(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C1829i) {
                return h((C1829i) obj);
            }
            return false;
        }

        @Override // gc.AbstractC4189b
        public int d() {
            return l.this.f().groupCount() + 1;
        }

        @Override // Od.j
        public C1829i get(int i10) {
            Bc.f fVarH = p.h(l.this.f(), i10);
            if (fVarH.n().intValue() < 0) {
                return null;
            }
            String strGroup = l.this.f().group(i10);
            AbstractC4862t.d(strGroup, "group(...)");
            return new C1829i(strGroup, fVarH);
        }

        public /* bridge */ boolean h(C1829i c1829i) {
            return super.contains(c1829i);
        }

        @Override // gc.AbstractC4189b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Nd.t.I(C4179C.X(C4206t.l(this)), new vc.l() { // from class: Od.m
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return l.b.k(this.f12455a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public l(Matcher matcher, CharSequence input) {
        AbstractC4862t.e(matcher, "matcher");
        AbstractC4862t.e(input, "input");
        this.f12449a = matcher;
        this.f12450b = input;
        this.f12451c = new b();
    }

    @Override // Od.k
    public /* bridge */ k.b a() {
        return k.a.a(this);
    }

    @Override // Od.k
    public List b() {
        if (this.f12452d == null) {
            this.f12452d = new a();
        }
        List list = this.f12452d;
        AbstractC4862t.b(list);
        return list;
    }

    @Override // Od.k
    public Bc.f c() {
        return p.g(f());
    }

    @Override // Od.k
    public j d() {
        return this.f12451c;
    }

    public final MatchResult f() {
        return this.f12449a;
    }

    @Override // Od.k
    public String getValue() {
        String strGroup = f().group();
        AbstractC4862t.d(strGroup, "group(...)");
        return strGroup;
    }

    @Override // Od.k
    public k next() {
        int iEnd = f().end() + (f().end() == f().start() ? 1 : 0);
        if (iEnd > this.f12450b.length()) {
            return null;
        }
        Matcher matcher = this.f12449a.pattern().matcher(this.f12450b);
        AbstractC4862t.d(matcher, "matcher(...)");
        return p.e(matcher, iEnd, this.f12450b);
    }
}
