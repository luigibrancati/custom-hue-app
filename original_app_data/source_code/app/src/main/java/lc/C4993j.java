package lc;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.p;

/* JADX INFO: renamed from: lc.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4993j implements InterfaceC4992i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4993j f40088a = new C4993j();

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, p operation) {
        AbstractC4862t.e(operation, "operation");
        return obj;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c key) {
        AbstractC4862t.e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c key) {
        AbstractC4862t.e(key, "key");
        return this;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i plus(InterfaceC4992i context) {
        AbstractC4862t.e(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
