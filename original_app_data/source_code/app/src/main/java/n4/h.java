package n4;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import d4.InterfaceC3824g;
import fc.C4032o;
import fc.C4034q;
import j4.C4682a;
import j4.EnumC4685d;
import j4.InterfaceC4691j;
import k4.InterfaceC4798d;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40561a;

        static {
            int[] iArr = new int[EnumC4685d.values().length];
            iArr[EnumC4685d.EXACT.ordinal()] = 1;
            iArr[EnumC4685d.INEXACT.ordinal()] = 2;
            iArr[EnumC4685d.AUTOMATIC.ordinal()] = 3;
            f40561a = iArr;
        }
    }

    public static final InterfaceC3824g a(i4.i iVar, Object data) {
        AbstractC4862t.e(iVar, "<this>");
        AbstractC4862t.e(data, "data");
        C4034q c4034qU = iVar.u();
        if (c4034qU == null) {
            return null;
        }
        InterfaceC3824g interfaceC3824g = (InterfaceC3824g) c4034qU.a();
        if (((Class) c4034qU.b()).isAssignableFrom(data.getClass())) {
            return interfaceC3824g;
        }
        throw new IllegalStateException((((Object) interfaceC3824g.getClass().getName()) + " cannot handle data with type " + ((Object) data.getClass().getName()) + '.').toString());
    }

    public static final boolean b(i4.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        int i10 = a.f40561a[iVar.E().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 != 3) {
            throw new C4032o();
        }
        if ((iVar.I() instanceof InterfaceC4798d) && (((InterfaceC4798d) iVar.I()).getView() instanceof ImageView) && (iVar.H() instanceof InterfaceC4691j) && ((InterfaceC4691j) iVar.H()).getView() == ((InterfaceC4798d) iVar.I()).getView()) {
            return true;
        }
        return iVar.p().k() == null && (iVar.H() instanceof C4682a);
    }

    public static final Drawable c(i4.i iVar, Drawable drawable, Integer num, Drawable drawable2) {
        AbstractC4862t.e(iVar, "<this>");
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return AbstractC5087c.a(iVar.l(), num.intValue());
    }
}
