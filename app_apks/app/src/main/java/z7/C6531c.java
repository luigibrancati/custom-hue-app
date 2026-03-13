package z7;

import B7.AbstractC0717z;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: z7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6531c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6535g f48804a;

    public C6531c(C6535g c6535g) {
        this.f48804a = c6535g;
    }

    public static final int b(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) AbstractC0717z.d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + iIntValue);
        return iIntValue;
    }

    public final synchronized void a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b(assets, (File) it.next());
        }
    }
}
