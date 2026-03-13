package Fc;

import java.util.Comparator;

/* JADX INFO: renamed from: Fc.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0838m implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.p f3955a;

    public C0838m(vc.p pVar) {
        this.f3955a = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return n.x(this.f3955a, obj, obj2);
    }
}
