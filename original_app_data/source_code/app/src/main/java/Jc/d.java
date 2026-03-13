package Jc;

import Bd.n;
import Lc.InterfaceC1177e;
import gc.C4205s;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vd.AbstractC6096e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC6096e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6392a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Function.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SuspendFunction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6392a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n storageManager, b containingClass) {
        super(storageManager, containingClass);
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(containingClass, "containingClass");
    }

    @Override // vd.AbstractC6096e
    public List i() {
        InterfaceC1177e interfaceC1177eL = l();
        AbstractC4862t.c(interfaceC1177eL, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i10 = a.f6392a[((b) interfaceC1177eL).U0().ordinal()];
        return i10 != 1 ? i10 != 2 ? C4206t.k() : C4205s.d(e.f6393E.a((b) l(), true)) : C4205s.d(e.f6393E.a((b) l(), false));
    }
}
