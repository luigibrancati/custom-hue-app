package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class FileUtils {
    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[RecognitionOptions.AZTEC];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, i10);
        }
    }

    private static String getBaseName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    private static String getImageExtension(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType != null && !extensionFromMimeType.isEmpty()) {
                return "." + sanitizeFilename(extensionFromMimeType);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String getImageName(Context context, Uri uri) {
        Cursor cursorQueryImageName = queryImageName(context, uri);
        if (cursorQueryImageName != null) {
            try {
                if (cursorQueryImageName.moveToFirst() && cursorQueryImageName.getColumnCount() >= 1) {
                    String strSanitizeFilename = sanitizeFilename(cursorQueryImageName.getString(0));
                    cursorQueryImageName.close();
                    return strSanitizeFilename;
                }
            } catch (Throwable th) {
                try {
                    cursorQueryImageName.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (cursorQueryImageName != null) {
            cursorQueryImageName.close();
        }
        return null;
    }

    private static Cursor queryImageName(Context context, Uri uri) {
        return context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
    }

    public static File saferOpenFile(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String sanitizeFilename(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String strReplace = str.split("/")[r4.length - 1];
        for (int i10 = 0; i10 < 2; i10++) {
            strReplace = strReplace.replace(strArr[i10], "_");
        }
        return strReplace;
    }

    public String getPathFromUri(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                String imageName = getImageName(context, uri);
                String imageExtension = getImageExtension(context, uri);
                if (imageName == null) {
                    Log.w("FileUtils", "Cannot get file name for " + uri);
                    if (imageExtension == null) {
                        imageExtension = ".jpg";
                    }
                    imageName = "image_picker" + imageExtension;
                } else if (imageExtension != null) {
                    imageName = getBaseName(imageName) + imageExtension;
                }
                File fileSaferOpenFile = saferOpenFile(new File(file, imageName).getPath(), file.getCanonicalPath());
                FileOutputStream fileOutputStream = new FileOutputStream(fileSaferOpenFile);
                try {
                    copy(inputStreamOpenInputStream, fileOutputStream);
                    String path = fileSaferOpenFile.getPath();
                    fileOutputStream.close();
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    return path;
                } finally {
                }
            } catch (Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return null;
        }
    }
}
