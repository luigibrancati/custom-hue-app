package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@UsedByNative("jni_common.cc")
public class OnedRecognitionOptions {

    @UsedByNative("jni_common.cc")
    private int ean13UpcaMinConsistentLines = 1;

    @UsedByNative("jni_common.cc")
    private int ean8MinConsistentLines = 3;

    @UsedByNative("jni_common.cc")
    private int upceMinConsistentLines = 3;

    @UsedByNative("jni_common.cc")
    private int code128MinConsistentLines = 1;

    @UsedByNative("jni_common.cc")
    private int code39MinConsistentLines = 2;

    @UsedByNative("jni_common.cc")
    private int code93MinConsistentLines = 2;

    @UsedByNative("jni_common.cc")
    private int itfMinConsistentLines = 3;

    @UsedByNative("jni_common.cc")
    private int codabarMinConsistentLines = 2;

    @UsedByNative("jni_common.cc")
    private int code128MinCodeLength = 2;

    @UsedByNative("jni_common.cc")
    private int code39MinCodeLength = 2;

    @UsedByNative("jni_common.cc")
    private int code93MinCodeLength = 2;

    @UsedByNative("jni_common.cc")
    private int itfMinCodeLength = 6;

    @UsedByNative("jni_common.cc")
    private int codabarMinCodeLength = 6;

    @UsedByNative("jni_common.cc")
    private boolean code39UseCheckDigit = false;

    @UsedByNative("jni_common.cc")
    private boolean code39UseExtendedMode = false;

    public int getCodabarMinCodeLength() {
        return this.codabarMinCodeLength;
    }

    public int getCodabarMinConsistentLines() {
        return this.codabarMinConsistentLines;
    }

    public int getCode128MinCodeLength() {
        return this.code128MinCodeLength;
    }

    public int getCode128MinConsistentLines() {
        return this.code128MinConsistentLines;
    }

    public int getCode39MinCodeLength() {
        return this.code39MinCodeLength;
    }

    public int getCode39MinConsistentLines() {
        return this.code39MinConsistentLines;
    }

    public boolean getCode39UseCheckDigit() {
        return this.code39UseCheckDigit;
    }

    public boolean getCode39UseExtendedMode() {
        return this.code39UseExtendedMode;
    }

    public int getCode93MinCodeLength() {
        return this.code93MinCodeLength;
    }

    public int getCode93MinConsistentLines() {
        return this.code93MinConsistentLines;
    }

    public int getEan13UpcaMinConsistentLines() {
        return this.ean13UpcaMinConsistentLines;
    }

    public int getEan8MinConsistentLines() {
        return this.ean8MinConsistentLines;
    }

    public int getItfMinCodeLength() {
        return this.itfMinCodeLength;
    }

    public int getItfMinConsistentLines() {
        return this.itfMinConsistentLines;
    }

    public int getUpceMinConsistentLines() {
        return this.upceMinConsistentLines;
    }

    public OnedRecognitionOptions setCodabarMinCodeLength(int i10) {
        this.codabarMinCodeLength = i10;
        return this;
    }

    public OnedRecognitionOptions setCodabarMinConsistentLines(int i10) {
        this.codabarMinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setCode128MinCodeLength(int i10) {
        this.code128MinCodeLength = i10;
        return this;
    }

    public OnedRecognitionOptions setCode128MinConsistentLines(int i10) {
        this.code128MinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setCode39MinCodeLength(int i10) {
        this.code39MinCodeLength = i10;
        return this;
    }

    public OnedRecognitionOptions setCode39MinConsistentLines(int i10) {
        this.code39MinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setCode39UseCheckDigit(boolean z10) {
        this.code39UseCheckDigit = z10;
        return this;
    }

    public OnedRecognitionOptions setCode39UseExtendedMode(boolean z10) {
        this.code39UseExtendedMode = z10;
        return this;
    }

    public OnedRecognitionOptions setCode93MinCodeLength(int i10) {
        this.code93MinCodeLength = i10;
        return this;
    }

    public OnedRecognitionOptions setCode93MinConsistentLines(int i10) {
        this.code93MinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setEan13UpcaMinConsistentLines(int i10) {
        this.ean13UpcaMinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setEan8MinConsistentLines(int i10) {
        this.ean8MinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setItfMinCodeLength(int i10) {
        this.itfMinCodeLength = i10;
        return this;
    }

    public OnedRecognitionOptions setItfMinConsistentLines(int i10) {
        this.itfMinConsistentLines = i10;
        return this;
    }

    public OnedRecognitionOptions setUpceMinConsistentLines(int i10) {
        this.upceMinConsistentLines = i10;
        return this;
    }
}
