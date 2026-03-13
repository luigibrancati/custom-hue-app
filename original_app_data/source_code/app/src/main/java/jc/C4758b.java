package jc;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: jc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4758b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4758b f39151a = new C4758b();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C4759c.f39152a;
    }
}
