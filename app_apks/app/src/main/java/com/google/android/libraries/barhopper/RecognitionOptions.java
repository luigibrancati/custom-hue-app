package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("jni_common.cc")
public class RecognitionOptions {
    public static final int AZTEC = 4096;
    public static final int CODABAR = 8;
    public static final int CODE_128 = 1;
    public static final int CODE_39 = 2;
    public static final int CODE_93 = 4;
    public static final int DATA_MATRIX = 16;
    public static final int EAN_13 = 32;
    public static final int EAN_8 = 64;
    public static final int ITF = 128;
    public static final int PDF417 = 2048;
    public static final int QR_CODE = 256;
    public static final int TEZ_CODE = 32768;
    public static final int UNRECOGNIZED = 0;
    public static final int UPC_A = 512;
    public static final int UPC_E = 1024;

    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;

    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    @UsedByNative("jni_common.cc")
    private boolean useQrMobilenetV3 = false;

    @UsedByNative("jni_common.cc")
    private boolean enableQrAlignmentGrid = true;

    @UsedByNative("jni_common.cc")
    private boolean enableUseKeypointAsFinderPattern = true;

    @UsedByNative("jni_common.cc")
    private boolean useHalideAffineCrop = false;

    @UsedByNative("jni_common.cc")
    private MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();

    @UsedByNative("jni_common.cc")
    private MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();

    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    @UsedByNative("jni_common.cc")
    private boolean qrEnableFourthCornerApproximation = false;

    public int getBarcodeFormats() {
        return this.barcodeFormats;
    }

    public boolean getEnableQrAlignmentGrid() {
        return this.enableQrAlignmentGrid;
    }

    public boolean getEnableUseKeypointAsFinderPattern() {
        return this.enableUseKeypointAsFinderPattern;
    }

    public MultiScaleDecodingOptions getMultiScaleDecodingOptions() {
        return this.multiScaleDecodingOptions;
    }

    public MultiScaleDetectionOptions getMultiScaleDetectionOptions() {
        return this.multiScaleDetectionOptions;
    }

    public OnedRecognitionOptions getOnedRecognitionOptions() {
        return this.onedRecognitionOptions;
    }

    public boolean getOutputUnrecognizedBarcodes() {
        return this.outputUnrecognizedBarcodes;
    }

    public boolean getQrEnableFourthCornerApproximation() {
        return this.qrEnableFourthCornerApproximation;
    }

    public boolean getUseHalideAffineCrop() {
        return this.useHalideAffineCrop;
    }

    public boolean getUseQrMobilenetV3() {
        return this.useQrMobilenetV3;
    }

    public void setBarcodeFormats(int i10) {
        this.barcodeFormats = i10;
    }

    public void setEnableQrAlignmentGrid(boolean z10) {
        this.enableQrAlignmentGrid = z10;
    }

    public void setEnableUseKeypointAsFinderPattern(boolean z10) {
        this.enableUseKeypointAsFinderPattern = z10;
    }

    public void setMultiScaleDecodingOptions(MultiScaleDecodingOptions multiScaleDecodingOptions) {
        this.multiScaleDecodingOptions = multiScaleDecodingOptions;
    }

    public void setMultiScaleDetectionOptions(MultiScaleDetectionOptions multiScaleDetectionOptions) {
        this.multiScaleDetectionOptions = multiScaleDetectionOptions;
    }

    public void setOnedRecognitionOptions(OnedRecognitionOptions onedRecognitionOptions) {
        this.onedRecognitionOptions = onedRecognitionOptions;
    }

    public void setOutputUnrecognizedBarcodes(boolean z10) {
        this.outputUnrecognizedBarcodes = z10;
    }

    public void setQrEnableFourthCornerApproximation(boolean z10) {
        this.qrEnableFourthCornerApproximation = z10;
    }

    public void setUseHalideAffineCrop(boolean z10) {
        this.useHalideAffineCrop = z10;
    }

    public void setUseQrMobilenetV3(boolean z10) {
        this.useQrMobilenetV3 = z10;
    }
}
