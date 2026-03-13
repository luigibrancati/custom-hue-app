package sc;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f44435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f44436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(File file, File file2, String str) {
        super(d.b(file, file2, str));
        AbstractC4862t.e(file, "file");
        this.f44435a = file;
        this.f44436b = file2;
        this.f44437c = str;
    }
}
