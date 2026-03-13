package w3;

import android.net.Uri;
import java.util.WeakHashMap;
import x3.k;
import x3.l;
import x3.m;

/* JADX INFO: renamed from: w3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6122d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f46148a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f46149b = Uri.parse("");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f46150c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f46151d = new WeakHashMap();

    public static m a() {
        return l.d();
    }

    public static boolean b() {
        if (k.f47377S.c()) {
            return a().getStatics().isMultiProcessEnabled();
        }
        throw k.a();
    }
}
