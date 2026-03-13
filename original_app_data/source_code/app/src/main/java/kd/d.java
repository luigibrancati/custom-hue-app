package kd;

import gc.C4204q;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f39554e = f.w("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f39555f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f39556g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f39558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d f39559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient f f39560d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements l {
        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.q(str);
        }
    }

    public d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f39557a = str;
        this.f39558b = cVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.b(), c.f39551c.j(), fVar);
    }

    public String b() {
        String str = this.f39557a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String strB;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strB = fVar.b();
        } else {
            strB = this.f39557a + "." + fVar.b();
        }
        return new d(strB, this, fVar);
    }

    public final void d() {
        int iLastIndexOf = this.f39557a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f39560d = f.q(this.f39557a.substring(iLastIndexOf + 1));
            this.f39559c = new d(this.f39557a.substring(0, iLastIndexOf));
        } else {
            this.f39560d = f.q(this.f39557a);
            this.f39559c = c.f39551c.j();
        }
    }

    public boolean e() {
        return this.f39557a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f39557a.equals(((d) obj).f39557a);
    }

    public boolean f() {
        return this.f39558b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f39559c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f39559c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    public List h() {
        List listW0 = e() ? Collections.EMPTY_LIST : C4204q.w0(f39555f.split(this.f39557a), f39556g);
        if (listW0 == null) {
            a(14);
        }
        return listW0;
    }

    public int hashCode() {
        return this.f39557a.hashCode();
    }

    public f i() {
        f fVar = this.f39560d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f39560d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    public f j() {
        if (e()) {
            f fVar = f39554e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f39557a.indexOf(46);
        String str = this.f39557a;
        String strB = fVar.b();
        if (iIndexOf == -1) {
            iIndexOf = this.f39557a.length();
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public c l() {
        c cVar = this.f39558b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f39558b = cVar2;
        return cVar2;
    }

    public String toString() {
        String strB = e() ? f39554e.b() : this.f39557a;
        if (strB == null) {
            a(17);
        }
        return strB;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f39557a = str;
    }

    public d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f39557a = str;
        this.f39559c = dVar;
        this.f39560d = fVar;
    }
}
