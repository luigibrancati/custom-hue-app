package od;

import Lc.InterfaceC1174b;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: od.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5288j {
    public abstract void a(InterfaceC1174b interfaceC1174b);

    public abstract void b(InterfaceC1174b interfaceC1174b, InterfaceC1174b interfaceC1174b2);

    public abstract void c(InterfaceC1174b interfaceC1174b, InterfaceC1174b interfaceC1174b2);

    public void d(InterfaceC1174b member, Collection overridden) {
        AbstractC4862t.e(member, "member");
        AbstractC4862t.e(overridden, "overridden");
        member.C0(overridden);
    }
}
