package x;

import E.AbstractC0807p0;
import L.InterfaceC1117p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class K0 implements InterfaceC1117p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f46645d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.X0 f46646e;

    public K0(String str, L.X0 x02) {
        boolean z10;
        int i10;
        this.f46643b = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            AbstractC0807p0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f46642a = z10;
        this.f46644c = i10;
        this.f46646e = x02;
    }
}
