package app.rive.rive_native;

import android.view.Surface;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/view/Surface;", "surface", "", "width", "height", "", "createRiveRenderer", "(Landroid/view/Surface;II)J", "renderer", "Lfc/H;", "destroyRiveRenderer", "(J)V", "markDestroyedRiveRenderer", "rive_native_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public abstract class RiveNativePluginKt {
    public static final native long createRiveRenderer(Surface surface, int i10, int i11);

    public static final native void destroyRiveRenderer(long j10);

    public static final native void markDestroyedRiveRenderer(long j10);
}
