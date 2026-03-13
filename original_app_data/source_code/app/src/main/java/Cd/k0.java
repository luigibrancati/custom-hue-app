package Cd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class k0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f1378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f1379b;

    public k0(u0 u0Var, E e10) {
        if (u0Var == null) {
            c(0);
        }
        if (e10 == null) {
            c(1);
        }
        this.f1378a = u0Var;
        this.f1379b = e10;
    }

    public static /* synthetic */ void c(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Cd.i0
    public boolean a() {
        return false;
    }

    @Override // Cd.i0
    public u0 b() {
        u0 u0Var = this.f1378a;
        if (u0Var == null) {
            c(4);
        }
        return u0Var;
    }

    @Override // Cd.i0
    public E getType() {
        E e10 = this.f1379b;
        if (e10 == null) {
            c(5);
        }
        return e10;
    }

    @Override // Cd.i0
    public i0 p(Dd.g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new k0(this.f1378a, gVar.a(this.f1379b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(E e10) {
        this(u0.INVARIANT, e10);
        if (e10 == null) {
            c(2);
        }
    }
}
