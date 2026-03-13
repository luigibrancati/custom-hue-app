package Q4;

import Rd.AbstractC2128g;
import Rd.C2123d0;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4032o;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import org.apache.tika.mime.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Od.o f13795a = new Od.o("^/+");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Od.o f13796b = new Od.o("/$");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13797a;

        static {
            int[] iArr = new int[P.values().length];
            try {
                iArr[P.files.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[P.downloads.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[P.images.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[P.video.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[P.audio.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[P.external.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f13797a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13798j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f13799k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Uri f13800l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Uri uri, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f13799k = context;
            this.f13800l = uri;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(this.f13799k, this.f13800l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f13798j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Cursor cursorQuery = this.f13799k.getContentResolver().query(this.f13800l, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        sc.c.a(cursorQuery, null);
                        return string;
                    }
                    C4015H c4015h = C4015H.f34254a;
                    sc.c.a(cursorQuery, null);
                } finally {
                }
            }
            return null;
        }
    }

    public static final Uri a(P destination) {
        AbstractC4862t.e(destination, "destination");
        switch (a.f13797a[destination.ordinal()]) {
            case 1:
                Uri contentUri = MediaStore.Files.getContentUri("external_primary");
                AbstractC4862t.d(contentUri, "getContentUri(...)");
                return contentUri;
            case 2:
                Uri contentUri2 = MediaStore.Downloads.getContentUri("external_primary");
                AbstractC4862t.d(contentUri2, "getContentUri(...)");
                return contentUri2;
            case 3:
                Uri contentUri3 = MediaStore.Images.Media.getContentUri("external_primary");
                AbstractC4862t.d(contentUri3, "getContentUri(...)");
                return contentUri3;
            case 4:
                Uri contentUri4 = MediaStore.Video.Media.getContentUri("external_primary");
                AbstractC4862t.d(contentUri4, "getContentUri(...)");
                return contentUri4;
            case 5:
                Uri contentUri5 = MediaStore.Audio.Media.getContentUri("external_primary");
                AbstractC4862t.d(contentUri5, "getContentUri(...)");
                return contentUri5;
            case 6:
                Uri contentUri6 = MediaStore.Files.getContentUri("external");
                AbstractC4862t.d(contentUri6, "getContentUri(...)");
                return contentUri6;
            default:
                throw new C4032o();
        }
    }

    public static final String b(String fileNameOrUriString) {
        AbstractC4862t.e(fileNameOrUriString, "fileNameOrUriString");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(Od.F.T0(fileNameOrUriString, ".", ""));
        return mimeTypeFromExtension == null ? MimeTypes.OCTET_STREAM : mimeTypeFromExtension;
    }

    public static final String c(P p10, String str) {
        String str2;
        switch (a.f13797a[p10.ordinal()]) {
            case 1:
                str2 = Environment.DIRECTORY_DOCUMENTS;
                break;
            case 2:
                str2 = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 3:
                str2 = Environment.DIRECTORY_PICTURES;
                break;
            case 4:
                str2 = Environment.DIRECTORY_MOVIES;
                break;
            case 5:
                str2 = Environment.DIRECTORY_MUSIC;
                break;
            case 6:
                str2 = "";
                break;
            default:
                throw new C4032o();
        }
        if (str.length() == 0) {
            AbstractC4862t.b(str2);
            return str2;
        }
        return str2 + "/" + str;
    }

    public static final Object d(Context context, String str, P p10, String str2, String str3, boolean z10, InterfaceC4988e interfaceC4988e) {
        File file;
        String strB;
        int i10;
        int i11 = 0;
        if (Od.C.P(str, "file://", false, 2, null)) {
            String path = Uri.parse(str).getPath();
            AbstractC4862t.b(path);
            file = new File(path);
        } else {
            file = new File(str);
        }
        File file2 = file;
        if (!file2.exists()) {
            Log.i("BackgroundDownloader", "File " + str + " does not exist -> cannot move to shared storage");
            return null;
        }
        String strJ = f13796b.j(f13795a.j(str2, ""), "");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file2.getName());
        if (str3 == null) {
            String name = file2.getName();
            AbstractC4862t.d(name, "getName(...)");
            strB = b(name);
        } else {
            strB = str3;
        }
        contentValues.put("mime_type", strB);
        contentValues.put("relative_path", c(p10, strJ));
        contentValues.put("is_pending", AbstractC5158b.c(1));
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Uri uriInsert = contentResolver.insert(a(p10), contentValues);
            try {
                if (uriInsert != null) {
                    try {
                        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        if (outputStreamOpenOutputStream != null) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    sc.b.b(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                                    sc.c.a(fileInputStream, null);
                                    sc.c.a(outputStreamOpenOutputStream, null);
                                    i10 = 1;
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    sc.c.a(outputStreamOpenOutputStream, th);
                                    throw th2;
                                }
                            }
                        } else {
                            i10 = 0;
                        }
                        contentValues.clear();
                        contentValues.put("is_pending", AbstractC5158b.c(0));
                        try {
                            contentResolver.update(uriInsert, contentValues, null, null);
                        } catch (Exception e10) {
                            Log.i("BackgroundDownloader", "Failed to reset IS_PENDING: " + e10);
                        }
                        i11 = i10;
                    } catch (Exception e11) {
                        AbstractC5158b.c(Log.i("BackgroundDownloader", "Error moving file " + str + " to shared storage: " + e11));
                        contentValues.clear();
                        contentValues.put("is_pending", AbstractC5158b.c(0));
                        try {
                            contentResolver.update(uriInsert, contentValues, null, null);
                        } catch (Exception e12) {
                            Log.i("BackgroundDownloader", "Failed to reset IS_PENDING: " + e12);
                        }
                    }
                }
                if (i11 == 0) {
                    return null;
                }
                file2.delete();
                AbstractC4862t.b(uriInsert);
                return z10 ? uriInsert.toString() : e(context, uriInsert, interfaceC4988e);
            } finally {
            }
        } catch (Exception e13) {
            Log.i("BackgroundDownloader", "Cannot insert " + str + " in MediaStore: " + e13);
            return null;
        }
    }

    public static final Object e(Context context, Uri uri, InterfaceC4988e interfaceC4988e) {
        return AbstractC2128g.g(C2123d0.b(), new b(context, uri, null), interfaceC4988e);
    }

    public static final String f(Context context, String filePathOrUriString, P destination, String directory, boolean z10) throws IOException {
        String name;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(filePathOrUriString, "filePathOrUriString");
        AbstractC4862t.e(destination, "destination");
        AbstractC4862t.e(directory, "directory");
        Uri uri = Uri.parse(filePathOrUriString);
        if (AbstractC4862t.a(uri.getScheme(), Constants.FILE)) {
            String path = uri.getPath();
            AbstractC4862t.b(path);
            name = new File(path).getName();
        } else {
            name = new File(filePathOrUriString).getName();
        }
        Cursor cursorQuery = context.getContentResolver().query(a(destination), new String[]{"_data", "_id"}, "_display_name = ?", new String[]{name}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = z10 ? Uri.withAppendedPath(a(destination), String.valueOf(cursorQuery.getLong(1))).toString() : cursorQuery.getString(0);
                    sc.c.a(cursorQuery, null);
                    return string;
                }
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(cursorQuery, null);
            } finally {
            }
        }
        return null;
    }
}
