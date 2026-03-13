package wd;

import Cd.E;

/* JADX INFO: renamed from: wd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6189a implements InterfaceC6195g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f46528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6195g f46529b;

    public AbstractC6189a(E e10, InterfaceC6195g interfaceC6195g) {
        if (e10 == null) {
            b(0);
        }
        this.f46528a = e10;
        this.f46529b = interfaceC6195g == null ? this : interfaceC6195g;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // wd.InterfaceC6195g
    public E getType() {
        E e10 = this.f46528a;
        if (e10 == null) {
            b(1);
        }
        return e10;
    }
}
