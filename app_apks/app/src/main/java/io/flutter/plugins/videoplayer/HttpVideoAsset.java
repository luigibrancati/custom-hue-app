package io.flutter.plugins.videoplayer;

import D1.r;
import I1.k;
import I1.l;
import a2.InterfaceC2611D;
import android.content.Context;
import io.flutter.plugins.videoplayer.VideoAsset;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class HttpVideoAsset extends VideoAsset {
    private final Map<String, String> httpHeaders;
    private final VideoAsset.StreamingFormat streamingFormat;
    private final String userAgent;

    /* JADX INFO: renamed from: io.flutter.plugins.videoplayer.HttpVideoAsset$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat;

        static {
            int[] iArr = new int[VideoAsset.StreamingFormat.values().length];
            $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat = iArr;
            try {
                iArr[VideoAsset.StreamingFormat.SMOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat[VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat[VideoAsset.StreamingFormat.HTTP_LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HttpVideoAsset(String str, VideoAsset.StreamingFormat streamingFormat, Map<String, String> map, String str2) {
        super(str);
        this.streamingFormat = streamingFormat;
        this.httpHeaders = map;
        this.userAgent = str2;
    }

    private static void unstableUpdateDataSourceFactory(l.b bVar, Map<String, String> map, String str) {
        bVar.e(str).c(true);
        if (map.isEmpty()) {
            return;
        }
        bVar.d(map);
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public D1.r getMediaItem() {
        r.c cVarH = new r.c().h(this.assetUrl);
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat[this.streamingFormat.ordinal()];
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : "application/x-mpegURL" : "application/dash+xml" : "application/vnd.ms-sstr+xml";
        if (str != null) {
            cVarH.d(str);
        }
        return cVarH.a();
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    public InterfaceC2611D.a getMediaSourceFactory(Context context) {
        return getMediaSourceFactory(context, new l.b());
    }

    public InterfaceC2611D.a getMediaSourceFactory(Context context, l.b bVar) {
        unstableUpdateDataSourceFactory(bVar, this.httpHeaders, this.userAgent);
        return new a2.r(context).p(new k.a(context, bVar));
    }
}
