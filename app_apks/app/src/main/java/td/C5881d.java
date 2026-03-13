package td;

import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: renamed from: td.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5881d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kd.c f44921b;

    public C5881d(String str) {
        if (str == null) {
            a(5);
        }
        this.f44920a = str;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static C5881d b(kd.b bVar) {
        if (bVar == null) {
            a(1);
        }
        kd.c cVarH = bVar.h();
        String strReplace = bVar.i().b().replace('.', '$');
        if (cVarH.d()) {
            return new C5881d(strReplace);
        }
        return new C5881d(cVarH.b().replace('.', JsonPointer.SEPARATOR) + "/" + strReplace);
    }

    public static C5881d c(kd.c cVar) {
        if (cVar == null) {
            a(2);
        }
        C5881d c5881d = new C5881d(cVar.b().replace('.', JsonPointer.SEPARATOR));
        c5881d.f44921b = cVar;
        return c5881d;
    }

    public static C5881d d(String str) {
        if (str == null) {
            a(0);
        }
        return new C5881d(str);
    }

    public kd.c e() {
        return new kd.c(this.f44920a.replace(JsonPointer.SEPARATOR, '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f44920a.equals(((C5881d) obj).f44920a);
    }

    public String f() {
        String str = this.f44920a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    public kd.c g() {
        int iLastIndexOf = this.f44920a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new kd.c(this.f44920a.substring(0, iLastIndexOf).replace(JsonPointer.SEPARATOR, '.'));
        }
        kd.c cVar = kd.c.f39551c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f44920a.hashCode();
    }

    public String toString() {
        return this.f44920a;
    }
}
