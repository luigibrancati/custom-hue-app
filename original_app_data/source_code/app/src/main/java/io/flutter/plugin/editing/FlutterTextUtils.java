package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0135 A[PHI: r2 r4
      0x0135: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:59:0x00b8, B:83:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:59:0x00b8, B:83:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getOffsetAfter(java.lang.CharSequence r10, int r11) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.FlutterTextUtils.getOffsetAfter(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0148 A[PHI: r2 r4
      0x0148: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:81:0x0116, B:83:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:81:0x0116, B:83:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getOffsetBefore(java.lang.CharSequence r9, int r10) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.FlutterTextUtils.getOffsetBefore(java.lang.CharSequence, int):int");
    }

    public boolean isEmoji(int i10) {
        return this.flutterJNI.isCodePointEmoji(i10);
    }

    public boolean isEmojiModifier(int i10) {
        return this.flutterJNI.isCodePointEmojiModifier(i10);
    }

    public boolean isEmojiModifierBase(int i10) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i10);
    }

    public boolean isKeycapBase(int i10) {
        return (48 <= i10 && i10 <= 57) || i10 == 35 || i10 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i10) {
        return this.flutterJNI.isCodePointRegionalIndicator(i10);
    }

    public boolean isTagSpecChar(int i10) {
        return 917536 <= i10 && i10 <= 917630;
    }

    public boolean isVariationSelector(int i10) {
        return this.flutterJNI.isCodePointVariantSelector(i10);
    }
}
