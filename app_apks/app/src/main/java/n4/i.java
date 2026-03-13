package n4;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5467c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f40562a = new i();

    public static final C5467c a(Context context) {
        AbstractC4862t.e(context, "context");
        n nVar = n.f40574a;
        File fileG = nVar.g(context);
        return new C5467c(fileG, nVar.c(fileG));
    }
}
