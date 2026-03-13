package je;

import ce.InterfaceC3118a;
import ce.g;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: je.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4771b {
    public /* synthetic */ AbstractC4771b(AbstractC4854k abstractC4854k) {
        this();
    }

    public static /* synthetic */ ce.b b(AbstractC4771b abstractC4771b, Cc.d dVar, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = C4206t.k();
        }
        return abstractC4771b.a(dVar, list);
    }

    public abstract ce.b a(Cc.d dVar, List list);

    public abstract InterfaceC3118a c(Cc.d dVar, String str);

    public abstract g d(Cc.d dVar, Object obj);

    public AbstractC4771b() {
    }
}
