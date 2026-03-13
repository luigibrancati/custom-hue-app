package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3565l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30195a = new ArrayList();

    public final C3565l0 a(A0 a02) {
        if (a02.d()) {
            throw new IllegalArgumentException(AbstractC3635x.a("range must not be empty, but was %s", a02));
        }
        this.f30195a.add(a02);
        return this;
    }

    public final C3565l0 b(C3565l0 c3565l0) {
        Iterator it = c3565l0.f30195a.iterator();
        while (it.hasNext()) {
            a((A0) it.next());
        }
        return this;
    }

    public final C3571m0 c() {
        C3517d0 c3517d0 = new C3517d0(this.f30195a.size());
        Collections.sort(this.f30195a, C3648z0.f30274a);
        Iterator it = this.f30195a.iterator();
        C3600r0 c3600r0 = it instanceof C3600r0 ? (C3600r0) it : new C3600r0(it);
        while (c3600r0.hasNext()) {
            A0 a0C = (A0) c3600r0.next();
            while (c3600r0.hasNext()) {
                A0 a02 = (A0) c3600r0.zza();
                if (a0C.f29991a.a(a02.f29992b) > 0 || a02.f29991a.a(a0C.f29992b) > 0) {
                    break;
                }
                AbstractC3629w.d(a0C.b(a02).d(), "Overlapping ranges not permitted but found %s overlapping %s", a0C, a02);
                a0C = a0C.c((A0) c3600r0.next());
            }
            c3517d0.e(a0C);
        }
        AbstractC3541h0 abstractC3541h0F = c3517d0.f();
        if (abstractC3541h0F.isEmpty()) {
            return C3571m0.c();
        }
        if (abstractC3541h0F.size() == 1) {
            Q0 q0ListIterator = abstractC3541h0F.listIterator(0);
            Object next = q0ListIterator.next();
            if (q0ListIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("expected one element but was: <");
                sb2.append(next);
                for (int i10 = 0; i10 < 4 && q0ListIterator.hasNext(); i10++) {
                    sb2.append(", ");
                    sb2.append(q0ListIterator.next());
                }
                if (q0ListIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            if (((A0) next).equals(A0.a())) {
                return C3571m0.a();
            }
        }
        return new C3571m0(abstractC3541h0F);
    }
}
