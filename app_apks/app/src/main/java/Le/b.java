package Le;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OpenOption[] f8793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final OpenOption[] f8794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CopyOption[] f8795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a[] f8796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FileAttribute[] f8797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FileVisitOption[] f8798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkOption[] f8799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LinkOption[] f8800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkOption f8801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final OpenOption[] f8802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Path[] f8803k;

    static {
        StandardOpenOption standardOpenOption = StandardOpenOption.CREATE;
        f8793a = new OpenOption[]{standardOpenOption, StandardOpenOption.TRUNCATE_EXISTING};
        f8794b = new OpenOption[]{standardOpenOption, StandardOpenOption.APPEND};
        f8795c = new CopyOption[0];
        f8796d = new a[0];
        f8797e = new FileAttribute[0];
        f8798f = new FileVisitOption[0];
        f8799g = new LinkOption[0];
        f8800h = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        f8801i = null;
        f8802j = new OpenOption[0];
        f8803k = new Path[0];
    }
}
