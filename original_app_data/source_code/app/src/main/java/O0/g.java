package O0;

import N0.d;
import V0.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f10755a = new ConcurrentHashMap();

    public abstract Typeface a(Context context, d.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10);

    public abstract Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10);

    public abstract Typeface d(Context context, Resources resources, int i10, String str, int i11);
}
