package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class TorchIsClosedAfterImageCapturingQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f21966a = Arrays.asList("mi a1", "mi a2", "mi a2 lite", "redmi 4x", "redmi 5a", "redmi note 5", "redmi note 5 pro", "redmi 6 pro", "redmi note 6 pro");

    public static boolean d() {
        return f21966a.contains(Build.MODEL.toLowerCase(Locale.US));
    }
}
