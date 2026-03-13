package io.sentry.util;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class FileUtils {
    public static boolean deleteRecursively(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!deleteRecursively(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static byte[] readBytesFromFile(String str, long j10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        File file = new File(str);
        if (!file.exists()) {
            throw new IOException(String.format("File '%s' doesn't exists", file.getName()));
        }
        if (!file.isFile()) {
            throw new IOException(String.format("Reading path %s failed, because it's not a file.", str));
        }
        if (!file.canRead()) {
            throw new IOException(String.format("Reading the item %s failed, because can't read the file.", str));
        }
        if (file.length() > j10) {
            throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", str, Long.valueOf(file.length()), Long.valueOf(j10)));
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bArr = new byte[RecognitionOptions.UPC_E];
                } finally {
                }
            } finally {
            }
            while (true) {
                int i10 = bufferedInputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    fileInputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String readText(File file) throws IOException {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb2.append(line);
            }
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    bufferedReader.close();
                    return sb2.toString();
                }
                sb2.append("\n");
                sb2.append(line2);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
