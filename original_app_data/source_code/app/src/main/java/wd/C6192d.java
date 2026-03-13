package wd;

import Cd.E;
import Lc.InterfaceC1173a;

/* JADX INFO: renamed from: wd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C6192d extends AbstractC6189a implements InterfaceC6195g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1173a f46534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6192d(InterfaceC1173a interfaceC1173a, E e10, InterfaceC6195g interfaceC6195g) {
        super(e10, interfaceC6195g);
        if (interfaceC1173a == null) {
            b(0);
        }
        if (e10 == null) {
            b(1);
        }
        this.f46534c = interfaceC1173a;
    }

    public static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f46534c + "}";
    }
}
