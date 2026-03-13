package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.C2747c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class A implements InterfaceC2756l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2747c.a f23387b;

    public A(Object obj) {
        this.f23386a = obj;
        this.f23387b = C2747c.f23446c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC2756l
    public void d(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar) {
        this.f23387b.a(interfaceC2758n, aVar, this.f23386a);
    }
}
