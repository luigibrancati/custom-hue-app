package j1;

import Rd.C2123d0;
import Rd.M;
import Rd.N;
import Rd.U0;
import android.content.Context;
import gc.C4206t;
import h1.C4268b;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;
import yc.InterfaceC6461c;

/* JADX INFO: renamed from: j1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4670b {
    public static final InterfaceC6461c b(String name, C4268b c4268b, l produceMigrations, M scope) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(produceMigrations, "produceMigrations");
        AbstractC4862t.e(scope, "scope");
        return new C4673e(name, c4268b, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC6461c c(String str, C4268b c4268b, l lVar, M m10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c4268b = null;
        }
        if ((i10 & 4) != 0) {
            lVar = new l() { // from class: j1.a
                @Override // vc.l
                public final Object invoke(Object obj2) {
                    return AbstractC4670b.d((Context) obj2);
                }
            };
        }
        if ((i10 & 8) != 0) {
            m10 = N.a(C2123d0.b().plus(U0.b(null, 1, null)));
        }
        return b(str, c4268b, lVar, m10);
    }

    public static final List d(Context it) {
        AbstractC4862t.e(it, "it");
        return C4206t.k();
    }
}
