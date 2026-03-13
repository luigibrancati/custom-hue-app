package T;

import android.util.Size;
import io.flutter.plugin.platform.PlatformPlugin;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f15878a = new Size(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f15879b = new Size(320, 240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f15880c = new Size(640, 480);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Size f15881d = new Size(720, 480);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f15882e = new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f15883f = new Size(1920, 1080);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f15884g = new Size(1920, 1440);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Size f15885h = new Size(2560, 1440);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Size f15886i = new Size(3840, 2160);

    public static int a(int i10, int i11) {
        return i10 * i11;
    }

    public static int b(Size size) {
        return a(size.getWidth(), size.getHeight());
    }

    public static boolean c(Size size, Size size2) {
        return b(size) < b(size2);
    }
}
