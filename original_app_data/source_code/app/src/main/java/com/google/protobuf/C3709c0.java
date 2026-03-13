package com.google.protobuf;

import com.google.protobuf.Z;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3709c0 implements InterfaceC3707b0 {
    public static int i(int i10, Object obj, Object obj2) {
        C3705a0 c3705a0 = (C3705a0) obj;
        Z z10 = (Z) obj2;
        int iA = 0;
        if (c3705a0.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c3705a0.entrySet()) {
            iA += z10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static C3705a0 j(Object obj, Object obj2) {
        C3705a0 c3705a0R = (C3705a0) obj;
        C3705a0 c3705a0 = (C3705a0) obj2;
        if (!c3705a0.isEmpty()) {
            if (!c3705a0R.o()) {
                c3705a0R = c3705a0R.r();
            }
            c3705a0R.q(c3705a0);
        }
        return c3705a0R;
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public Z.a b(Object obj) {
        return ((Z) obj).c();
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public Map c(Object obj) {
        return (C3705a0) obj;
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public Object d(Object obj) {
        return C3705a0.i().r();
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public Map e(Object obj) {
        return (C3705a0) obj;
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public Object f(Object obj) {
        ((C3705a0) obj).p();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC3707b0
    public boolean h(Object obj) {
        return !((C3705a0) obj).o();
    }
}
