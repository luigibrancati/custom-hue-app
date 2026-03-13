package Vd;

import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.InterfaceC5161e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A implements InterfaceC4988e, InterfaceC5161e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4988e f17508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4992i f17509b;

    public A(InterfaceC4988e interfaceC4988e, InterfaceC4992i interfaceC4992i) {
        this.f17508a = interfaceC4988e;
        this.f17509b = interfaceC4992i;
    }

    @Override // nc.InterfaceC5161e
    public InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.f17508a;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return this.f17509b;
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        this.f17508a.resumeWith(obj);
    }
}
