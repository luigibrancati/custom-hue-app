package z3;

import Od.F;
import fc.C4029l;
import fc.InterfaceC4028k;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48733f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f48734g = new l(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f48735h = new l(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f48736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f48737j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f48742e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final l a() {
            return l.f48735h;
        }

        public final l b(String str) {
            String strGroup;
            if (str != null && !F.k0(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i11 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i12 = Integer.parseInt(strGroup3);
                            String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                            AbstractC4862t.b(strGroup4);
                            return new l(i10, i11, i12, strGroup4, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        l lVar = new l(1, 0, 0, "");
        f48736i = lVar;
        f48737j = lVar;
    }

    public /* synthetic */ l(int i10, int i11, int i12, String str, AbstractC4854k abstractC4854k) {
        this(i10, i11, i12, str);
    }

    public static final BigInteger j(l lVar) {
        return BigInteger.valueOf(lVar.f48738a).shiftLeft(32).or(BigInteger.valueOf(lVar.f48739b)).shiftLeft(32).or(BigInteger.valueOf(lVar.f48740c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f48738a == lVar.f48738a && this.f48739b == lVar.f48739b && this.f48740c == lVar.f48740c;
    }

    public int hashCode() {
        return ((((527 + this.f48738a) * 31) + this.f48739b) * 31) + this.f48740c;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(l other) {
        AbstractC4862t.e(other, "other");
        return q().compareTo(other.q());
    }

    public final BigInteger q() {
        Object value = this.f48742e.getValue();
        AbstractC4862t.d(value, "getValue(...)");
        return (BigInteger) value;
    }

    public String toString() {
        String str;
        if (F.k0(this.f48741d)) {
            str = "";
        } else {
            str = '-' + this.f48741d;
        }
        return this.f48738a + '.' + this.f48739b + '.' + this.f48740c + str;
    }

    public l(int i10, int i11, int i12, String str) {
        this.f48738a = i10;
        this.f48739b = i11;
        this.f48740c = i12;
        this.f48741d = str;
        this.f48742e = C4029l.b(new InterfaceC6082a() { // from class: z3.k
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return l.j(this.f48732a);
            }
        });
    }
}
