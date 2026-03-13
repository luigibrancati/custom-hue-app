package Wd;

import Rd.V0;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f17913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f17914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V0[] f17915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17916d;

    public S(InterfaceC4992i interfaceC4992i, int i10) {
        this.f17913a = interfaceC4992i;
        this.f17914b = new Object[i10];
        this.f17915c = new V0[i10];
    }

    public final void a(V0 v02, Object obj) {
        Object[] objArr = this.f17914b;
        int i10 = this.f17916d;
        objArr[i10] = obj;
        V0[] v0Arr = this.f17915c;
        this.f17916d = i10 + 1;
        AbstractC4862t.c(v02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        v0Arr[i10] = v02;
    }

    public final void b(InterfaceC4992i interfaceC4992i) {
        int length = this.f17915c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            V0 v02 = this.f17915c[length];
            AbstractC4862t.b(v02);
            v02.Y(interfaceC4992i, this.f17914b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
