package hd;

import com.fasterxml.jackson.core.JsonPointer;
import fc.C4039v;
import fd.o;
import fd.p;
import gc.C4179C;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f36567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f36568b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36569a;

        static {
            int[] iArr = new int[o.c.EnumC0447c.values().length];
            try {
                iArr[o.c.EnumC0447c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.c.EnumC0447c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.c.EnumC0447c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36569a = iArr;
        }
    }

    public d(p strings, o qualifiedNames) {
        AbstractC4862t.e(strings, "strings");
        AbstractC4862t.e(qualifiedNames, "qualifiedNames");
        this.f36567a = strings;
        this.f36568b = qualifiedNames;
    }

    @Override // hd.c
    public boolean a(int i10) {
        return ((Boolean) c(i10).f()).booleanValue();
    }

    @Override // hd.c
    public String b(int i10) {
        C4039v c4039vC = c(i10);
        List list = (List) c4039vC.a();
        String strQ0 = C4179C.q0((List) c4039vC.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strQ0;
        }
        return C4179C.q0(list, "/", null, null, 0, null, null, 62, null) + JsonPointer.SEPARATOR + strQ0;
    }

    public final C4039v c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            o.c cVarP = this.f36568b.p(i10);
            String strP = this.f36567a.p(cVarP.t());
            o.c.EnumC0447c enumC0447cR = cVarP.r();
            AbstractC4862t.b(enumC0447cR);
            int i11 = a.f36569a[enumC0447cR.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strP);
            } else if (i11 == 2) {
                linkedList.addFirst(strP);
            } else if (i11 == 3) {
                linkedList2.addFirst(strP);
                z10 = true;
            }
            i10 = cVarP.s();
        }
        return new C4039v(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // hd.c
    public String getString(int i10) {
        String strP = this.f36567a.p(i10);
        AbstractC4862t.d(strP, "strings.getString(index)");
        return strP;
    }
}
