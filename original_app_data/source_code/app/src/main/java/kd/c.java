package kd;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f39551c = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f39552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f39553b;

    public c(String str) {
        if (str == null) {
            a(1);
        }
        this.f39552a = new d(str, this);
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static c k(f fVar) {
        if (fVar == null) {
            a(13);
        }
        return new c(d.m(fVar));
    }

    public String b() {
        String strB = this.f39552a.b();
        if (strB == null) {
            a(4);
        }
        return strB;
    }

    public c c(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f39552a.c(fVar), this);
    }

    public boolean d() {
        return this.f39552a.e();
    }

    public c e() {
        c cVar = this.f39553b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(this.f39552a.g());
        this.f39553b = cVar2;
        return cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f39552a.equals(((c) obj).f39552a);
    }

    public List f() {
        List listH = this.f39552a.h();
        if (listH == null) {
            a(11);
        }
        return listH;
    }

    public f g() {
        f fVarI = this.f39552a.i();
        if (fVarI == null) {
            a(9);
        }
        return fVarI;
    }

    public f h() {
        f fVarJ = this.f39552a.j();
        if (fVarJ == null) {
            a(10);
        }
        return fVarJ;
    }

    public int hashCode() {
        return this.f39552a.hashCode();
    }

    public boolean i(f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f39552a.k(fVar);
    }

    public d j() {
        d dVar = this.f39552a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f39552a.toString();
    }

    public c(d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f39552a = dVar;
    }

    public c(d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f39552a = dVar;
        this.f39553b = cVar;
    }
}
