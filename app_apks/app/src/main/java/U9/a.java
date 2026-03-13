package U9;

import H7.C0867a;
import H7.C0870d;
import H7.e;
import H7.f;
import H7.g;
import H7.i;
import H7.j;
import H7.l;
import H7.m;
import H7.o;
import aa.C2661B;
import aa.C2663a;
import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.B;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3385d0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3439o;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.D;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.F;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbm;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends zzbm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f16801d = {5, 7, 7, 7, 5, 5};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final double[][] f16802v = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f16804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BarhopperV3 f16805c;

    public a(Context context, B b10) {
        this.f16803a = context;
        this.f16804b = b10;
    }

    public static C3439o X(C2661B c2661b, String str, String str2) {
        if (c2661b == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        return new C3439o(c2661b.O(), c2661b.M(), c2661b.J(), c2661b.K(), c2661b.L(), c2661b.N(), c2661b.R(), matcher.find() ? matcher.group(1) : null);
    }

    public final C2663a I6(ByteBuffer byteBuffer, C3385d0 c3385d0, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC6056k.l(this.f16805c);
        if (((ByteBuffer) AbstractC6056k.l(byteBuffer)).isDirect()) {
            return barhopperV3.recognize(c3385d0.h(), c3385d0.d(), byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(c3385d0.h(), c3385d0.d(), byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(c3385d0.h(), c3385d0.d(), bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final java.util.List J6(com.google.android.gms.dynamic.IObjectWrapper r48, com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3385d0 r49, com.google.android.libraries.barhopper.RecognitionOptions r50) {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U9.a.J6(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode_bundled.d0, com.google.android.libraries.barhopper.RecognitionOptions):java.util.List");
    }

    public final RecognitionOptions K() {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        recognitionOptions.setBarcodeFormats(this.f16804b.d());
        recognitionOptions.setOutputUnrecognizedBarcodes(this.f16804b.e());
        recognitionOptions.setEnableQrAlignmentGrid(true);
        recognitionOptions.setEnableUseKeypointAsFinderPattern(true);
        return recognitionOptions;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final void P1(F f10) {
        c();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final List S1(IObjectWrapper iObjectWrapper, C3385d0 c3385d0, D d10) {
        RecognitionOptions recognitionOptionsK = K();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.setExtraScales(d10.d().f());
        multiScaleDecodingOptions.setMinimumDetectedDimension(d10.d().d());
        multiScaleDecodingOptions.setSkipProcessingIfBarcodeFound(d10.d().e());
        recognitionOptionsK.setMultiScaleDecodingOptions(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.setExtraScales(d10.d().f());
        recognitionOptionsK.setMultiScaleDetectionOptions(multiScaleDetectionOptions);
        recognitionOptionsK.setQrEnableFourthCornerApproximation(d10.e());
        return J6(iObjectWrapper, c3385d0, recognitionOptionsK);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final void c() {
        if (this.f16805c != null) {
            return;
        }
        this.f16805c = new BarhopperV3();
        l lVarJ = m.J();
        i iVarJ = j.J();
        int i10 = 16;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            f fVarJ = g.J();
            fVarJ.y(i10);
            fVarJ.z(i10);
            for (int i13 = 0; i13 < f16801d[i12]; i13++) {
                double[] dArr = f16802v[i11];
                double d10 = dArr[0] * 320.0d;
                float fSqrt = (float) Math.sqrt(dArr[1]);
                float f10 = (float) d10;
                fVarJ.r(f10 / fSqrt);
                fVarJ.u(f10 * fSqrt);
                i11++;
            }
            i10 += i10;
            iVarJ.r(fVarJ);
        }
        lVarJ.r(iVarJ);
        try {
            InputStream inputStreamOpen = this.f16803a.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream inputStreamOpen2 = this.f16803a.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream inputStreamOpen3 = this.f16803a.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV3 = (BarhopperV3) AbstractC6056k.l(this.f16805c);
                        o oVarJ = C0867a.J();
                        lVarJ.u(G0.A(inputStreamOpen));
                        oVarJ.r(lVarJ);
                        C0870d c0870dJ = e.J();
                        c0870dJ.r(G0.A(inputStreamOpen2));
                        c0870dJ.u(G0.A(inputStreamOpen3));
                        oVarJ.u(c0870dJ);
                        barhopperV3.create((C0867a) oVarJ.k());
                        if (inputStreamOpen3 != null) {
                            inputStreamOpen3.close();
                        }
                        if (inputStreamOpen2 != null) {
                            inputStreamOpen2.close();
                        }
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed to open Barcode models", e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final void e() {
        BarhopperV3 barhopperV3 = this.f16805c;
        if (barhopperV3 != null) {
            barhopperV3.close();
            this.f16805c = null;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N
    public final List i4(IObjectWrapper iObjectWrapper, C3385d0 c3385d0) {
        return J6(iObjectWrapper, c3385d0, K());
    }
}
