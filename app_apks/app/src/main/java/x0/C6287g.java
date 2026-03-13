package x0;

import fc.InterfaceC4023f;
import kotlin.jvm.internal.v;
import vc.p;

/* JADX INFO: renamed from: x0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6287g extends v implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6287g f47330a = new C6287g();

    public C6287g() {
        super(2);
    }

    @Override // vc.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C6281a invoke(C6281a c6281a, C6281a c6281a2) {
        String strB;
        InterfaceC4023f interfaceC4023fA;
        if (c6281a == null || (strB = c6281a.b()) == null) {
            strB = c6281a2.b();
        }
        if (c6281a == null || (interfaceC4023fA = c6281a.a()) == null) {
            interfaceC4023fA = c6281a2.a();
        }
        return new C6281a(strB, interfaceC4023fA);
    }
}
