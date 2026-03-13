package dd;

import Lc.a0;
import Lc.b0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3914s implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yc.h f33456b;

    public C3914s(Yc.h packageFragment) {
        AbstractC4862t.e(packageFragment, "packageFragment");
        this.f33456b = packageFragment;
    }

    @Override // Lc.a0
    public b0 b() {
        b0 NO_SOURCE_FILE = b0.f8747a;
        AbstractC4862t.d(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f33456b + ": " + this.f33456b.M0().keySet();
    }
}
