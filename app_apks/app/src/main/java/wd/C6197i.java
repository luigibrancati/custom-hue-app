package wd;

import Cd.E;

/* JADX INFO: renamed from: wd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6197i extends AbstractC6189a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6197i(E e10) {
        this(e10, null);
        if (e10 == null) {
            b(0);
        }
    }

    private static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6197i(E e10, InterfaceC6195g interfaceC6195g) {
        super(e10, interfaceC6195g);
        if (e10 == null) {
            b(1);
        }
    }
}
