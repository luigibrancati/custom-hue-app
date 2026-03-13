package dd;

import Od.F;
import dd.AbstractC3908m;
import fc.C4032o;
import kotlin.jvm.internal.AbstractC4862t;
import td.C5881d;
import td.EnumC5882e;

/* JADX INFO: renamed from: dd.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3910o implements InterfaceC3909n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3910o f33452a = new C3910o();

    /* JADX INFO: renamed from: dd.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33453a;

        static {
            int[] iArr = new int[Ic.h.values().length];
            try {
                iArr[Ic.h.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ic.h.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ic.h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Ic.h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Ic.h.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Ic.h.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Ic.h.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Ic.h.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f33453a = iArr;
        }
    }

    @Override // dd.InterfaceC3909n
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC3908m c(AbstractC3908m possiblyPrimitiveType) {
        AbstractC4862t.e(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (possiblyPrimitiveType instanceof AbstractC3908m.d) {
            AbstractC3908m.d dVar = (AbstractC3908m.d) possiblyPrimitiveType;
            if (dVar.i() != null) {
                String strF = C5881d.c(dVar.i().u()).f();
                AbstractC4862t.d(strF, "byFqNameWithoutInnerClas…apperFqName).internalName");
                return e(strF);
            }
        }
        return possiblyPrimitiveType;
    }

    @Override // dd.InterfaceC3909n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC3908m a(String representation) {
        EnumC5882e enumC5882e;
        AbstractC4862t.e(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        EnumC5882e[] enumC5882eArrValues = EnumC5882e.values();
        int length = enumC5882eArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC5882e = null;
                break;
            }
            enumC5882e = enumC5882eArrValues[i10];
            if (enumC5882e.p().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (enumC5882e != null) {
            return new AbstractC3908m.d(enumC5882e);
        }
        if (cCharAt == 'V') {
            return new AbstractC3908m.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            AbstractC4862t.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new AbstractC3908m.a(a(strSubstring));
        }
        if (cCharAt == 'L') {
            F.Y(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        AbstractC4862t.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new AbstractC3908m.c(strSubstring2);
    }

    @Override // dd.InterfaceC3909n
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC3908m.c e(String internalName) {
        AbstractC4862t.e(internalName, "internalName");
        return new AbstractC3908m.c(internalName);
    }

    @Override // dd.InterfaceC3909n
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC3908m b(Ic.h primitiveType) {
        AbstractC4862t.e(primitiveType, "primitiveType");
        switch (a.f33453a[primitiveType.ordinal()]) {
            case 1:
                return AbstractC3908m.f33440a.a();
            case 2:
                return AbstractC3908m.f33440a.c();
            case 3:
                return AbstractC3908m.f33440a.b();
            case 4:
                return AbstractC3908m.f33440a.h();
            case 5:
                return AbstractC3908m.f33440a.f();
            case 6:
                return AbstractC3908m.f33440a.e();
            case 7:
                return AbstractC3908m.f33440a.g();
            case 8:
                return AbstractC3908m.f33440a.d();
            default:
                throw new C4032o();
        }
    }

    @Override // dd.InterfaceC3909n
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC3908m f() {
        return e("java/lang/Class");
    }

    @Override // dd.InterfaceC3909n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String d(AbstractC3908m type) {
        String strP;
        AbstractC4862t.e(type, "type");
        if (type instanceof AbstractC3908m.a) {
            return '[' + d(((AbstractC3908m.a) type).i());
        }
        if (type instanceof AbstractC3908m.d) {
            EnumC5882e enumC5882eI = ((AbstractC3908m.d) type).i();
            return (enumC5882eI == null || (strP = enumC5882eI.p()) == null) ? "V" : strP;
        }
        if (!(type instanceof AbstractC3908m.c)) {
            throw new C4032o();
        }
        return 'L' + ((AbstractC3908m.c) type).i() + ';';
    }
}
