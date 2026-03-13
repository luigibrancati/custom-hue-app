package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import q1.C5477a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class ImageResizer {
    private final Context context;
    private final ExifDataCopier exifDataCopier;

    public ImageResizer(Context context, ExifDataCopier exifDataCopier) {
        this.context = context;
        this.exifDataCopier = exifDataCopier;
    }

    private int calculateSampleSize(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 <= i11 && i13 <= i10) {
            return 1;
        }
        int i15 = i12 / 2;
        int i16 = i13 / 2;
        while (i15 / i14 >= i11 && i16 / i14 >= i10) {
            i14 *= 2;
        }
        return i14;
    }

    private X0.i calculateTargetSize(double d10, double d11, Double d12, Double d13) {
        double d14 = d10 / d11;
        boolean z10 = false;
        boolean z11 = d12 != null;
        boolean z12 = d13 != null;
        double dMin = z11 ? Math.min(d10, Math.round(d12.doubleValue())) : d10;
        double dMin2 = z12 ? Math.min(d11, Math.round(d13.doubleValue())) : d11;
        boolean z13 = z11 && d12.doubleValue() < d10;
        if (z12 && d13.doubleValue() < d11) {
            z10 = true;
        }
        if (z13 || z10) {
            double d15 = dMin2 * d14;
            double d16 = dMin / d14;
            if (d16 > dMin2) {
                dMin = Math.round(d15);
            } else {
                dMin2 = Math.round(d16);
            }
        }
        return new X0.i((float) dMin, (float) dMin2);
    }

    private void copyExif(String str, String str2) throws Throwable {
        try {
            this.exifDataCopier.copyExif(new C5477a(str), new C5477a(str2));
        } catch (Exception e10) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e10);
        }
    }

    private File createFile(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File createImageOnExternalDirectory(String str, Bitmap bitmap, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File fileCreateFile = createFile(this.context.getCacheDir(), str);
        FileOutputStream fileOutputStreamCreateOutputStream = createOutputStream(fileCreateFile);
        fileOutputStreamCreateOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStreamCreateOutputStream.close();
        return fileCreateFile;
    }

    private FileOutputStream createOutputStream(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap createScaledBitmap(Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    private Bitmap decodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private File resizedImage(Bitmap bitmap, Double d10, Double d11, int i10, String str) {
        return createImageOnExternalDirectory("/scaled_" + str, createScaledBitmap(bitmap, d10.intValue(), d11.intValue(), false), i10);
    }

    public X0.i readFileDimensions(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFile(str, options);
        return new X0.i(options.outWidth, options.outHeight);
    }

    public String resizeImageIfNeeded(String str, Double d10, Double d11, int i10) throws Throwable {
        X0.i fileDimensions = readFileDimensions(str);
        if (fileDimensions.b() == -1.0f || fileDimensions.a() == -1.0f) {
            return str;
        }
        if (d10 == null && d11 == null && i10 >= 100) {
            return str;
        }
        try {
            String str2 = str.split("/")[r1.length - 1];
            X0.i iVarCalculateTargetSize = calculateTargetSize(fileDimensions.b(), fileDimensions.a(), d10, d11);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = calculateSampleSize(options, (int) iVarCalculateTargetSize.b(), (int) iVarCalculateTargetSize.a());
            Bitmap bitmapDecodeFile = decodeFile(str, options);
            if (bitmapDecodeFile == null) {
                return str;
            }
            File fileResizedImage = resizedImage(bitmapDecodeFile, Double.valueOf(iVarCalculateTargetSize.b()), Double.valueOf(iVarCalculateTargetSize.a()), i10, str2);
            copyExif(str, fileResizedImage.getPath());
            return fileResizedImage.getPath();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
