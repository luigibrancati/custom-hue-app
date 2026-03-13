package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.C4034q;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.J;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "(Landroid/content/Context;)I", "getDensityDpi", "dpi", "dp", "getPixelsFromDensityAndDp", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "Lfc/H;", "resizeImageViewToBitmapDimensions", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "resizeToBitmapDimensions", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "getImageLoaderCacheSize", "()I", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "(Ljava/io/InputStream;)Landroid/graphics/BitmapFactory$Options;", RRWebOptionsEvent.EVENT_TAG, "destinationWidth", "destinationHeight", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lcom/braze/support/a;", "getBitmap", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lcom/braze/support/a;", "getLocalBitmap", "(Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "getRemoteBitmap", "(Landroid/net/Uri;II)Lcom/braze/support/a;", "imageMetadata", "decodeSampledBitmapFromStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;II)Landroid/graphics/Bitmap;", "Lfc/q;", "getDestinationHeightAndWidthPixels", "(Landroid/content/Context;Lcom/braze/enums/BrazeViewBounds;)Lfc/q;", "getDisplayHeightAndWidthPixels", "(Landroid/content/Context;)Lfc/q;", "", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class BrazeImageUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(final BitmapFactory.Options options, int i10, final int i11) {
        int i12;
        final int i13 = i10;
        AbstractC4862t.e(options, "options");
        if (i11 == 0 || i13 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.z
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeImageUtils.calculateInSampleSize$lambda$4();
                }
            }, 14, (Object) null);
            return 1;
        }
        final long j10 = options.outHeight;
        final long j11 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.x
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeImageUtils.calculateInSampleSize$lambda$5(options, i13, i11);
            }
        }, 14, (Object) null);
        final J j12 = new J();
        j12.f39774a = 1;
        long j13 = i11;
        if (j10 > j13 || j11 > i13) {
            long j14 = 2;
            long j15 = j10 / j14;
            long j16 = j11 / j14;
            while (true) {
                int i14 = j12.f39774a;
                long j17 = i14;
                if (j15 / j17 < j13 && j16 / j17 < i13) {
                    i12 = i14;
                    if ((j11 * j10) / ((long) (i14 * i14)) <= 4194304) {
                        break;
                    }
                } else {
                    i12 = i14;
                }
                j12.f39774a = i12 * 2;
                i13 = i10;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.y
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeImageUtils.calculateInSampleSize$lambda$6(j12, j11, j10);
            }
        }, 14, (Object) null);
        return j12.f39774a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$4() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$5(BitmapFactory.Options options, int i10, int i11) {
        return "Calculating sample size for source image bounds: (width " + options.outWidth + " height " + options.outHeight + ") and destination image bounds: (width " + i10 + " height " + i11 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$6(J j10, long j11, long j12) {
        int i10 = j10.f39774a;
        long j13 = i10;
        return "Using image sample size of " + i10 + ". Image will be scaled to width: " + (j11 / j13) + " and height: " + (j12 / j13);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i10, int i11) {
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final a getBitmap(Context context, final Uri uri, BrazeViewBounds viewBounds) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        AbstractC4862t.e(viewBounds, "viewBounds");
        C4034q destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, viewBounds);
        int iIntValue = ((Number) destinationHeightAndWidthPixels.a()).intValue();
        int iIntValue2 = ((Number) destinationHeightAndWidthPixels.b()).intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new a(getLocalBitmap(uri, iIntValue2, iIntValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, iIntValue2, iIntValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.C
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeImageUtils.getBitmap$lambda$7(uri);
            }
        }, 12, (Object) null);
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$7(Uri uri) {
        return "Uri with unknown scheme received. Not getting image. Uri: " + uri;
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        AbstractC4862t.e(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        AbstractC4862t.e(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final C4034q getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        C4034q displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        final int iIntValue = ((Number) displayHeightAndWidthPixels.a()).intValue();
        final int iIntValue2 = ((Number) displayHeightAndWidthPixels.b()).intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.D
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$23(iIntValue2, iIntValue);
            }
        }, 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new C4034q(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new C4034q(Integer.valueOf(Math.min(iIntValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(iIntValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$23(int i10, int i11) {
        return "Display width: " + i10 + " and height " + i11;
    }

    public static final C4034q getDisplayHeightAndWidthPixels(Context context) {
        AbstractC4862t.e(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new C4034q(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        AbstractC4862t.e(context, "context");
        return ((Number) getDisplayHeightAndWidthPixels(context).f()).intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(RecognitionOptions.UPC_E, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / ((long) 8), 2147483647L), 33554432));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Bitmap getLocalBitmap(final android.net.Uri r23, final int r24, final int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getLocalBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$10(File file) {
        return "Retrieving image from local path: " + file.getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$11() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$12(int i10, int i11) {
        return "Sampling bitmap with destination image bounds: (width " + i10 + " height " + i11 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$13(Uri uri, BitmapFactory.Options options) {
        return "The bitmap metadata with image uri " + uri + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$14() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$15(Exception exc) {
        return "Exception occurred when attempting to retrieve local bitmap. " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$16() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8(Uri uri) {
        return "Local bitmap path is null. URI: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$9(Uri uri) {
        return "Local bitmap file does not exist. URI: " + uri;
    }

    public static final int getPixelsFromDensityAndDp(int i10, int i11) {
        return Math.abs((i10 * i11) / 160);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final com.braze.support.a getRemoteBitmap(android.net.Uri r21, final int r22, final int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getRemoteBitmap(android.net.Uri, int, int):com.braze.support.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$17(String str) {
        return "SDK is in offline mode, not downloading remote bitmap with uri: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$18(int i10, URL url) {
        return "HTTP response code was " + i10 + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$19(int i10, int i11) {
        return "Sampling bitmap with destination image bounds: (height " + i10 + " width " + i11 + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$20(URL url, BitmapFactory.Options options) {
        return "The bitmap metadata with image url " + url + " had bounds: (height " + options.outHeight + " width " + options.outWidth + "). Returning a bitmap with no sampling.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$21(String str, Exception exc) {
        return "Exception in image bitmap download for Uri: " + str + org.apache.tika.utils.StringUtils.SPACE + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$22() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        AbstractC4862t.e(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        AbstractC4862t.e(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.k
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeImageUtils.resizeToBitmapDimensions$lambda$0();
                }
            }, 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.B
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView);
                }
            }, 12, (Object) null);
            return;
        }
        if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.A
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView);
                }
            }, 12, (Object) null);
            return;
        }
        final float width = bitmap.getWidth() / bitmap.getHeight();
        imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.v
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeImageUtils.resizeToBitmapDimensions$lambda$3(width, imageView);
            }
        }, 12, (Object) null);
        imageView.setLayoutParams(imageView.getLayoutParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$0() {
        return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$1(ImageView imageView) {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$2(ImageView imageView) {
        return "ImageView dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$3(float f10, ImageView imageView) {
        return "Resizing ImageView to aspect ratio " + f10 + " based on width: " + imageView.getWidth() + " trueWidth: " + imageView.getLayoutParams().width + " height: " + imageView.getLayoutParams().height + " layoutParams: " + imageView.getLayoutParams() + org.apache.tika.utils.StringUtils.SPACE + imageView;
    }
}
