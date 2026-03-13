package Fa;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3790d;

    public a(int i10, int i11, int i12, List planes) {
        AbstractC4862t.e(planes, "planes");
        this.f3787a = i10;
        this.f3788b = i11;
        this.f3789c = i12;
        this.f3790d = planes;
    }

    public final int a() {
        return this.f3787a;
    }

    public final int b() {
        return this.f3789c;
    }

    public final List c() {
        return this.f3790d;
    }

    public final int d() {
        return this.f3788b;
    }
}
