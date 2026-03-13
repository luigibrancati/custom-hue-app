package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f29819a = new ArrayDeque();

    public /* synthetic */ W1(V1 v12) {
    }

    public static /* bridge */ /* synthetic */ G0 a(W1 w12, G0 g02, G0 g03) {
        w12.b(g02);
        w12.b(g03);
        G0 c3377b2 = (G0) w12.f29819a.pop();
        while (!w12.f29819a.isEmpty()) {
            c3377b2 = new C3377b2((G0) w12.f29819a.pop(), c3377b2);
        }
        return c3377b2;
    }

    public static final int c(int i10) {
        int iBinarySearch = Arrays.binarySearch(C3377b2.f29833h, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public final void b(G0 g02) {
        AbstractC3372a2 abstractC3372a2;
        if (!g02.l()) {
            if (!(g02 instanceof C3377b2)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(g02.getClass())));
            }
            C3377b2 c3377b2 = (C3377b2) g02;
            b(c3377b2.f29835d);
            b(c3377b2.f29836e);
            return;
        }
        int iC = c(g02.f());
        ArrayDeque arrayDeque = this.f29819a;
        int iL = C3377b2.L(iC + 1);
        if (arrayDeque.isEmpty() || ((G0) this.f29819a.peek()).f() >= iL) {
            this.f29819a.push(g02);
            return;
        }
        int iL2 = C3377b2.L(iC);
        G0 c3377b22 = (G0) this.f29819a.pop();
        while (true) {
            abstractC3372a2 = null;
            if (this.f29819a.isEmpty() || ((G0) this.f29819a.peek()).f() >= iL2) {
                break;
            } else {
                c3377b22 = new C3377b2((G0) this.f29819a.pop(), c3377b22);
            }
        }
        C3377b2 c3377b23 = new C3377b2(c3377b22, g02);
        while (!this.f29819a.isEmpty()) {
            int iC2 = c(c3377b23.f()) + 1;
            ArrayDeque arrayDeque2 = this.f29819a;
            if (((G0) arrayDeque2.peek()).f() >= C3377b2.L(iC2)) {
                break;
            } else {
                c3377b23 = new C3377b2((G0) this.f29819a.pop(), c3377b23);
            }
        }
        this.f29819a.push(c3377b23);
    }
}
