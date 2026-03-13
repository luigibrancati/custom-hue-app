package Q4;

import io.sentry.protocol.DebugMeta;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ P[] $VALUES;
    public static final P downloads = new P("downloads", 0);
    public static final P images = new P(DebugMeta.JsonKeys.IMAGES, 1);
    public static final P video = new P("video", 2);
    public static final P audio = new P(MediaStreamTrack.AUDIO_TRACK_KIND, 3);
    public static final P files = new P("files", 4);
    public static final P external = new P("external", 5);

    static {
        P[] pArrA = a();
        $VALUES = pArrA;
        $ENTRIES = AbstractC5277b.a(pArrA);
    }

    public P(String str, int i10) {
    }

    public static final /* synthetic */ P[] a() {
        return new P[]{downloads, images, video, audio, files, external};
    }

    public static InterfaceC5276a b() {
        return $ENTRIES;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}
