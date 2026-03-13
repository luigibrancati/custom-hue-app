package sc;

import java.io.File;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(File file, File file2, String str) {
        super(file, file2, str);
        AbstractC4862t.e(file, "file");
    }

    public /* synthetic */ n(File file, File file2, String str, int i10, AbstractC4854k abstractC4854k) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
