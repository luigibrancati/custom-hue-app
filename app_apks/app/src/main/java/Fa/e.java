package Fa;

import Db.InterfaceC0765l;
import Db.InterfaceC0767n;
import Db.InterfaceC0769p;
import Db.U;
import Od.C;
import Od.F;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fc.C4015H;
import gc.C4179C;
import gc.C4202o;
import io.lindstrom.m3u8.parser.C4579i;
import io.lindstrom.m3u8.parser.C4584n;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kc.AbstractC4837a;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.K;
import org.apache.tika.fork.ForkServer;
import vc.InterfaceC6082a;
import vc.l;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaCodec f3801c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fa.a f3802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaExtractor f3803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f3804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ J f3805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ K f3806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ I f3807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ K f3808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ J f3809h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l f3810i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ q f3811j;

        public a(MediaExtractor mediaExtractor, e eVar, J j10, K k10, I i10, K k11, J j11, l lVar, q qVar) {
            this.f3803b = mediaExtractor;
            this.f3804c = eVar;
            this.f3805d = j10;
            this.f3806e = k10;
            this.f3807f = i10;
            this.f3808g = k11;
            this.f3809h = j11;
            this.f3810i = lVar;
            this.f3811j = qVar;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec codec, MediaCodec.CodecException e10) {
            AbstractC4862t.e(codec, "codec");
            AbstractC4862t.e(e10, "e");
            this.f3811j.invoke("Codec error", String.valueOf(e10.getErrorCode()), e10.getDiagnosticInfo());
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec codec, int i10) {
            MediaCodec mediaCodec;
            MediaCodec mediaCodec2;
            AbstractC4862t.e(codec, "codec");
            ByteBuffer inputBuffer = codec.getInputBuffer(i10);
            AbstractC4862t.b(inputBuffer);
            int sampleData = this.f3803b.readSampleData(inputBuffer, 0);
            if (sampleData < 0) {
                MediaCodec mediaCodec3 = this.f3804c.f3801c;
                if (mediaCodec3 == null) {
                    AbstractC4862t.p("decoder");
                    mediaCodec2 = null;
                } else {
                    mediaCodec2 = mediaCodec3;
                }
                mediaCodec2.queueInputBuffer(i10, 0, 0, 0L, 4);
                Log.d("VideoScreenshot", "sent input EOS");
                return;
            }
            long sampleTime = this.f3803b.getSampleTime();
            MediaCodec mediaCodec4 = this.f3804c.f3801c;
            if (mediaCodec4 == null) {
                AbstractC4862t.p("decoder");
                mediaCodec = null;
            } else {
                mediaCodec = mediaCodec4;
            }
            mediaCodec.queueInputBuffer(i10, 0, sampleData, sampleTime, 0);
            Log.d("VideoScreenshot", "submitted frame " + this.f3805d.f39774a + " to dec, size=" + sampleData);
            J j10 = this.f3805d;
            j10.f39774a = j10.f39774a + 1;
            this.f3803b.advance();
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec codec, int i10, MediaCodec.BufferInfo bufferInfo) {
            AbstractC4862t.e(codec, "codec");
            AbstractC4862t.e(bufferInfo, "bufferInfo");
            Log.d("VideoScreenshot", "outputBuffer " + i10 + " available, bufferInfo.size: " + bufferInfo.size);
            long j10 = this.f3806e.f39775a + bufferInfo.presentationTimeUs;
            boolean z10 = (bufferInfo.flags & 4) != 0;
            I i11 = this.f3807f;
            if (!i11.f39773a && (j10 > this.f3808g.f39775a || z10)) {
                i11.f39773a = true;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    e eVar = this.f3804c;
                    Fa.a aVar = this.f3802a;
                    AbstractC4862t.b(aVar);
                    Bitmap bitmapI = eVar.i(aVar);
                    bitmapI.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                    bitmapI.recycle();
                    Log.d("VideoScreenshot", "screenshot saved. segmentIndex: " + this.f3809h.f39774a + ", presentationTimeUs: " + bufferInfo.presentationTimeUs);
                    l lVar = this.f3810i;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    AbstractC4862t.d(byteArray, "toByteArray(...)");
                    lVar.invoke(byteArray);
                } catch (Exception e10) {
                    this.f3811j.invoke("exception when saving image", e10.getClass().getName(), e10.getMessage());
                }
            }
            Image outputImage = codec.getOutputImage(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image.timestamp = ");
            sb2.append(outputImage != null ? Long.valueOf(outputImage.getTimestamp()) : null);
            Log.d("VideoScreenshot", sb2.toString());
            if (outputImage != null) {
                int format = outputImage.getFormat();
                int width = outputImage.getWidth();
                int height = outputImage.getHeight();
                Image.Plane[] planes = outputImage.getPlanes();
                AbstractC4862t.d(planes, "getPlanes(...)");
                ArrayList arrayList = new ArrayList(planes.length);
                for (Image.Plane plane : planes) {
                    int rowStride = plane.getRowStride();
                    int pixelStride = plane.getPixelStride();
                    ByteBuffer buffer = plane.getBuffer();
                    AbstractC4862t.d(buffer, "getBuffer(...)");
                    arrayList.add(new Fa.b(rowStride, pixelStride, f.b(buffer)));
                }
                this.f3802a = new Fa.a(format, width, height, arrayList);
            }
            codec.releaseOutputBuffer(i10, false);
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec p02, MediaFormat p12) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            Log.d("VideoScreenshot", "output format changed to: " + p12);
        }
    }

    public e(String url, HashMap map) {
        AbstractC4862t.e(url, "url");
        this.f3799a = url;
        this.f3800b = map;
    }

    public static final C4015H g(long j10, e eVar, q qVar, l lVar) {
        K k10;
        String strSubstring;
        final List listE;
        J j11;
        String strA;
        K k11;
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        try {
            k10 = new K();
            k10.f39775a = j10 + ((long) 100000);
            List listF = ((InterfaceC0765l) new C4579i().g(eVar.e(eVar.f3799a).getInputStream())).f();
            AbstractC4862t.d(listF, "variants(...)");
            String strA2 = ((U) C4179C.h0(listF)).a();
            String str = eVar.f3799a;
            int iC0 = F.c0(str);
            while (true) {
                if (-1 >= iC0) {
                    strSubstring = "";
                    break;
                }
                if (str.charAt(iC0) == '/') {
                    strSubstring = str.substring(0, iC0 + 1);
                    AbstractC4862t.d(strSubstring, "substring(...)");
                    break;
                }
                iC0--;
            }
            listE = ((InterfaceC0767n) new C4584n().g(eVar.e(strSubstring + strA2).getInputStream())).e();
            AbstractC4862t.b(listE);
            String strA3 = ((Db.J) ((InterfaceC0769p) C4179C.h0(listE)).d().get()).a();
            j11 = new J();
            strA = strA3;
            k11 = new K();
            l lVar2 = new l() { // from class: Fa.d
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return Long.valueOf(e.h(listE, ((Integer) obj).intValue()));
                }
            };
            while (j11.f39774a < listE.size()) {
                long jLongValue = k11.f39775a + ((Number) lVar2.invoke(Integer.valueOf(j11.f39774a))).longValue();
                Optional optionalD = ((InterfaceC0769p) listE.get(j11.f39774a)).d();
                if (optionalD.isPresent()) {
                    strA = ((Db.J) optionalD.get()).a();
                }
                if (jLongValue > k10.f39775a) {
                    break;
                }
                j11.f39774a++;
                k11.f39775a = jLongValue;
            }
            if (j11.f39774a == listE.size()) {
                k10.f39775a = Math.min(k10.f39775a, k11.f39775a);
                int i10 = j11.f39774a - 1;
                j11.f39774a = i10;
                k11.f39775a -= ((Number) lVar2.invoke(Integer.valueOf(i10))).longValue();
            }
            mediaCodec = null;
        } catch (Exception e10) {
            qVar.invoke("exception", e10.getClass().getName(), e10.getMessage());
        }
        if (strA == null) {
            qVar.invoke("Invalid hls file", "Could not find a segment map (EXT-X-MAP) for the requested segment", null);
            return C4015H.f34254a;
        }
        InputStream inputStream = eVar.e(strSubstring + strA).getInputStream();
        AbstractC4862t.d(inputStream, "getInputStream(...)");
        byte[] bArrC = sc.b.c(inputStream);
        InputStream inputStream2 = eVar.e(strSubstring + ((InterfaceC0769p) listE.get(j11.f39774a)).a()).getInputStream();
        AbstractC4862t.d(inputStream2, "getInputStream(...)");
        b bVar = new b(C4202o.C(bArrC, sc.b.c(inputStream2)));
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(bVar);
        int i11 = 0;
        while (i11 < mediaExtractor.getTrackCount()) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i11);
            AbstractC4862t.d(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string != null && C.P(string, "video/", false, 2, null)) {
                break;
            }
            i11++;
        }
        if (i11 == mediaExtractor.getTrackCount()) {
            throw new Exception("video track not found");
        }
        mediaExtractor.selectTrack(i11);
        MediaFormat trackFormat2 = mediaExtractor.getTrackFormat(i11);
        AbstractC4862t.d(trackFormat2, "getTrackFormat(...)");
        String string2 = trackFormat2.getString("mime");
        AbstractC4862t.b(string2);
        MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string2);
        AbstractC4862t.d(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
        eVar.f3801c = mediaCodecCreateDecoderByType;
        J j12 = new J();
        I i12 = new I();
        MediaCodec mediaCodec3 = eVar.f3801c;
        if (mediaCodec3 == null) {
            AbstractC4862t.p("decoder");
            mediaCodec2 = null;
        } else {
            mediaCodec2 = mediaCodec3;
        }
        mediaCodec2.setCallback(new a(mediaExtractor, eVar, j12, k11, i12, k10, j11, lVar, qVar));
        MediaCodec mediaCodec4 = eVar.f3801c;
        if (mediaCodec4 == null) {
            AbstractC4862t.p("decoder");
            mediaCodec4 = null;
        }
        mediaCodec4.configure(trackFormat2, (Surface) null, (MediaCrypto) null, 0);
        MediaCodec mediaCodec5 = eVar.f3801c;
        if (mediaCodec5 == null) {
            AbstractC4862t.p("decoder");
        } else {
            mediaCodec = mediaCodec5;
        }
        mediaCodec.start();
        return C4015H.f34254a;
    }

    public static final long h(List list, int i10) {
        return (long) (((InterfaceC0769p) list.get(i10)).e() * ((double) 1000000));
    }

    public final URLConnection e(String str) {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        HashMap map = this.f3800b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                uRLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        AbstractC4862t.b(uRLConnection);
        return uRLConnection;
    }

    public final void f(final long j10, final l onSuccess, final q onFailure) {
        AbstractC4862t.e(onSuccess, "onSuccess");
        AbstractC4862t.e(onFailure, "onFailure");
        AbstractC4837a.b(false, false, null, "screenshot/thread", 0, new InterfaceC6082a() { // from class: Fa.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return e.g(j10, this, onFailure, onSuccess);
            }
        }, 23, null);
    }

    public final Bitmap i(Fa.a aVar) {
        if (aVar.a() != 35) {
            throw new IllegalArgumentException("Invalid image format");
        }
        int iD = aVar.d();
        int iB = aVar.b();
        int[] iArr = new int[iD * iB];
        int i10 = 0;
        ByteBuffer byteBufferA = ((Fa.b) aVar.c().get(0)).a();
        byteBufferA.position(0);
        ByteBuffer byteBufferA2 = ((Fa.b) aVar.c().get(1)).a();
        byteBufferA2.position(0);
        ((Fa.b) aVar.c().get(2)).a().position(0);
        int iC = ((Fa.b) aVar.c().get(0)).c();
        int iB2 = ((Fa.b) aVar.c().get(0)).b();
        int iC2 = ((Fa.b) aVar.c().get(1)).c();
        int iB3 = ((Fa.b) aVar.c().get(1)).b();
        int i11 = 0;
        while (i11 < iB) {
            int i12 = i10;
            while (i12 < iD) {
                int i13 = byteBufferA.get((i11 * iC) + (i12 * iB2)) & ForkServer.ERROR;
                int i14 = (byteBufferA2.get(((i11 / 2) * iC2) + ((i12 / 2) * iB3)) & ForkServer.ERROR) - 128;
                float f10 = i13;
                float f11 = (r7.get(r15) & ForkServer.ERROR) - 128;
                float f12 = i14;
                int i15 = iD;
                iArr[(i11 * i15) + i12] = (S0.a.c((int) (f10 + (f12 * 1.732446f)), 0, 255) & 255) | ((S0.a.c((int) (f10 + (1.370705f * f11)), 0, 255) & 255) << 16) | (-16777216) | ((S0.a.c((int) ((f10 - (f11 * 0.698001f)) - (0.337633f * f12)), 0, 255) & 255) << 8);
                i12++;
                i10 = 0;
                iD = i15;
            }
            i11++;
            iD = iD;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, aVar.d(), aVar.b(), Bitmap.Config.ARGB_8888);
        AbstractC4862t.d(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f3812a;

        public b(byte[] bArr) {
            this.f3812a = bArr;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return this.f3812a.length;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] buffer, int i10, int i11) {
            AbstractC4862t.e(buffer, "buffer");
            byte[] bArr = this.f3812a;
            int length = bArr.length;
            if (j10 >= length) {
                return -1;
            }
            int i12 = (int) j10;
            int i13 = i12 + i11;
            if (i13 > length) {
                i11 -= i13 - length;
            }
            System.arraycopy(bArr, i12, buffer, i10, i11);
            return i11;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
