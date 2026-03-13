package kd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39563b;

    public f(String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f39562a = str;
        this.f39563b = z10;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static f q(String str) {
        if (str == null) {
            a(8);
        }
        return str.startsWith("<") ? w(str) : s(str);
    }

    public static f s(String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean v(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f w(String str) {
        if (str == null) {
            a(7);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String b() {
        String str = this.f39562a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f39563b == fVar.f39563b && this.f39562a.equals(fVar.f39562a);
    }

    public int hashCode() {
        return (this.f39562a.hashCode() * 31) + (this.f39563b ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f39562a.compareTo(fVar.f39562a);
    }

    public String p() {
        if (this.f39563b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strB = b();
        if (strB == null) {
            a(2);
        }
        return strB;
    }

    public String toString() {
        return this.f39562a;
    }

    public boolean u() {
        return this.f39563b;
    }
}
