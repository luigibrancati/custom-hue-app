package jd;

import gc.C4179C;
import gc.U;
import id.AbstractC4376a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: jd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4765f extends AbstractC4766g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC4376a.e f39169h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4765f(AbstractC4376a.e types, String[] strings) {
        Set setZ0;
        AbstractC4862t.e(types, "types");
        AbstractC4862t.e(strings, "strings");
        List _init_$lambda$0 = types.r();
        if (_init_$lambda$0.isEmpty()) {
            setZ0 = U.d();
        } else {
            AbstractC4862t.d(_init_$lambda$0, "_init_$lambda$0");
            setZ0 = C4179C.Z0(_init_$lambda$0);
        }
        List listS = types.s();
        AbstractC4862t.d(listS, "types.recordList");
        super(strings, setZ0, AbstractC4767h.a(listS));
        this.f39169h = types;
    }
}
