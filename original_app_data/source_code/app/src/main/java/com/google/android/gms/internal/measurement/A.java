package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3223j f29134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T1 f29135b;

    public A(AbstractC3223j abstractC3223j, T1 t12) {
        this.f29134a = abstractC3223j;
        this.f29135b = t12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC3277p interfaceC3277p = (InterfaceC3277p) obj;
        InterfaceC3277p interfaceC3277p2 = (InterfaceC3277p) obj2;
        if (interfaceC3277p instanceof C3321u) {
            return !(interfaceC3277p2 instanceof C3321u) ? 1 : 0;
        }
        if (interfaceC3277p2 instanceof C3321u) {
            return -1;
        }
        AbstractC3223j abstractC3223j = this.f29134a;
        return abstractC3223j == null ? interfaceC3277p.b().compareTo(interfaceC3277p2.b()) : (int) AbstractC3324u2.i(abstractC3223j.a(this.f29135b, Arrays.asList(interfaceC3277p, interfaceC3277p2)).c().doubleValue());
    }
}
