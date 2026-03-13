package io.sentry.android.replay.video;

import Od.F;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SimpleVideoEncoder$hasExynosCodec$2 extends v implements InterfaceC6082a {
    public static final SimpleVideoEncoder$hasExynosCodec$2 INSTANCE = new SimpleVideoEncoder$hasExynosCodec$2();

    public SimpleVideoEncoder$hasExynosCodec$2() {
        super(0);
    }

    @Override // vc.InterfaceC6082a
    public final Boolean invoke() {
        boolean z10 = false;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        AbstractC4862t.d(codecInfos, "getCodecInfos(...)");
        int length = codecInfos.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String name = codecInfos[i10].getName();
            AbstractC4862t.d(name, "getName(...)");
            if (F.V(name, "c2.exynos", false, 2, null)) {
                z10 = true;
                break;
            }
            i10++;
        }
        return Boolean.valueOf(z10);
    }
}
