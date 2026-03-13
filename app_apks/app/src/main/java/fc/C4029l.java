package fc;

import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: fc.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4029l {

    /* JADX INFO: renamed from: fc.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34271a;

        static {
            int[] iArr = new int[EnumC4031n.values().length];
            try {
                iArr[EnumC4031n.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4031n.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4031n.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34271a = iArr;
        }
    }

    public static InterfaceC4028k a(EnumC4031n mode, InterfaceC6082a initializer) {
        AbstractC4862t.e(mode, "mode");
        AbstractC4862t.e(initializer, "initializer");
        int i10 = a.f34271a[mode.ordinal()];
        if (i10 == 1) {
            return new C4038u(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new C4037t(initializer);
        }
        if (i10 == 3) {
            return new C4016I(initializer);
        }
        throw new C4032o();
    }

    public static InterfaceC4028k b(InterfaceC6082a initializer) {
        AbstractC4862t.e(initializer, "initializer");
        return new C4038u(initializer, null, 2, null);
    }
}
