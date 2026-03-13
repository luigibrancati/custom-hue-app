package Q4;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import fc.C4015H;
import gc.C4207u;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import l1.AbstractC4870a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bbflight.background_downloader.a f13900a;

    public u0(com.bbflight.background_downloader.a plugin) {
        AbstractC4862t.e(plugin, "plugin");
        this.f13900a = plugin;
    }

    public final void a(Activity activity, String str, String str2, MethodChannel.Result result) {
        InputStream inputStreamOpenInputStream;
        OutputStream outputStreamOpenOutputStream;
        if (str == null || str2 == null) {
            result.error("INVALID_ARGUMENTS", "Source and destination URI strings are required", null);
            return;
        }
        Uri uri = Uri.parse(str);
        Uri uri2 = Uri.parse(str2);
        try {
            ContentResolver contentResolver = activity.getContentResolver();
            if (contentResolver == null || (inputStreamOpenInputStream = contentResolver.openInputStream(uri)) == null) {
                result.error("COPY_FAILED", "Failed to open input stream for source URI", null);
            } else {
                try {
                    ContentResolver contentResolver2 = activity.getContentResolver();
                    if (contentResolver2 == null || (outputStreamOpenOutputStream = contentResolver2.openOutputStream(uri2)) == null) {
                        result.error("COPY_FAILED", "Failed to open output stream for destination URI", null);
                        C4015H c4015h = C4015H.f34254a;
                    } else {
                        try {
                            sc.b.b(inputStreamOpenInputStream, outputStreamOpenOutputStream, 0, 2, null);
                            sc.c.a(outputStreamOpenOutputStream, null);
                        } finally {
                        }
                    }
                    sc.c.a(inputStreamOpenInputStream, null);
                } finally {
                }
            }
            result.success(str2);
        } catch (Exception e10) {
            result.error("COPY_FAILED", "Error copying file: " + e10.getMessage(), null);
        }
    }

    public final boolean b(Activity activity, Uri uri, Uri uri2, MethodChannel.Result result) {
        ContentResolver contentResolver;
        InputStream inputStreamOpenInputStream;
        OutputStream outputStreamOpenOutputStream;
        try {
            if (AbstractC4862t.a(uri2.getScheme(), Constants.FILE)) {
                String path = uri2.getPath();
                AbstractC4862t.b(path);
                File file = new File(path);
                File parentFile = file.getParentFile();
                AbstractC4862t.b(parentFile);
                if (!parentFile.exists()) {
                    File parentFile2 = file.getParentFile();
                    AbstractC4862t.b(parentFile2);
                    if (!parentFile2.mkdirs()) {
                        File parentFile3 = file.getParentFile();
                        AbstractC4862t.b(parentFile3);
                        result.error("MOVE_FAILED", "Could not create destination directory at " + parentFile3.getAbsolutePath(), null);
                        return false;
                    }
                }
            }
            contentResolver = activity.getContentResolver();
        } catch (Exception e10) {
            result.error("MOVE_FAILED", "Error copying file: " + e10.getMessage(), null);
            return false;
        }
        if (contentResolver == null || (inputStreamOpenInputStream = contentResolver.openInputStream(uri)) == null) {
            result.error("MOVE_FAILED", "Failed to open input stream for source URI", null);
            return false;
        }
        try {
            ContentResolver contentResolver2 = activity.getContentResolver();
            if (contentResolver2 == null || (outputStreamOpenOutputStream = contentResolver2.openOutputStream(uri2)) == null) {
                result.error("MOVE_FAILED", "Failed to open output stream for destination URI", null);
                sc.c.a(inputStreamOpenInputStream, null);
                return false;
            }
            try {
                sc.b.b(inputStreamOpenInputStream, outputStreamOpenOutputStream, 0, 2, null);
                sc.c.a(outputStreamOpenOutputStream, null);
                sc.c.a(inputStreamOpenInputStream, null);
                return true;
            } finally {
            }
        } finally {
        }
        result.error("MOVE_FAILED", "Error copying file: " + e10.getMessage(), null);
        return false;
    }

    public final byte[] c(Context context, Uri uri) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                byte[] bArrC = sc.b.c(inputStreamOpenInputStream);
                sc.c.a(inputStreamOpenInputStream, null);
                return bArrC;
            } finally {
            }
        } catch (IOException e10) {
            Log.e("BackgroundDownloader", "Error reading file: " + uri, e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.app.Activity r23, java.lang.String r24, java.lang.String r25, io.flutter.plugin.common.MethodChannel.Result r26) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.u0.d(android.app.Activity, java.lang.String, java.lang.String, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        MethodChannel.Result result2;
        ArrayList arrayList;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        Activity activity = this.f13900a.getActivity();
        if (activity == null) {
            result.error("NO_ACTIVITY", "No activity found", null);
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1460193578:
                    result2 = result;
                    if (str.equals("pickFiles")) {
                        Object obj = call.arguments;
                        List list = obj instanceof List ? (List) obj : null;
                        Integer num = (Integer) (list != null ? list.get(0) : null);
                        Object obj2 = list != null ? list.get(1) : null;
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        Object obj3 = list != null ? list.get(2) : null;
                        List list2 = obj3 instanceof List ? (List) obj3 : null;
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList(C4207u.v(list2, 10));
                            for (Object obj4 : list2) {
                                AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.String");
                                arrayList2.add((String) obj4);
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        Object obj5 = list != null ? list.get(3) : null;
                        Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
                        Boolean bool2 = Boolean.TRUE;
                        boolean zA = AbstractC4862t.a(bool, bool2);
                        Object obj6 = list != null ? list.get(4) : null;
                        boolean zA2 = AbstractC4862t.a(obj6 instanceof Boolean ? (Boolean) obj6 : null, bool2);
                        P p10 = num != null ? (P) P.b().get(num.intValue()) : null;
                        Uri uri = str2 != null ? Uri.parse(str2) : null;
                        if (p10 == P.images || p10 == P.video) {
                            if (C1904y.f13915a.d(activity, p10, zA, zA2, result2)) {
                                return;
                            }
                            result2.error("PICK_FILES_FAILED", "Failed to launch media picker", null);
                            return;
                        } else {
                            if (C1904y.f13915a.c(activity, p10, uri, arrayList, zA, zA2, result2)) {
                                return;
                            }
                            result2.error("PICK_FILES_FAILED", "Failed to launch file picker", null);
                            return;
                        }
                    }
                    break;
                case -1352509031:
                    result2 = result;
                    if (str.equals("getFileBytes")) {
                        Object obj7 = call.arguments;
                        String str3 = obj7 instanceof String ? (String) obj7 : null;
                        if (str3 == null) {
                            result2.error("INVALID_ARGUMENTS", "URI string is required", null);
                            return;
                        }
                        Uri uri2 = Uri.parse(str3);
                        AbstractC4862t.d(uri2, "parse(...)");
                        byte[] bArrC = c(activity, uri2);
                        if (bArrC != null) {
                            result2.success(bArrC);
                            return;
                        } else {
                            result2.error("GET_FILE_FAILED", "Failed to get file", null);
                            return;
                        }
                    }
                    break;
                case -506374511:
                    result2 = result;
                    if (str.equals("copyFile")) {
                        Object obj8 = call.arguments;
                        List list3 = obj8 instanceof List ? (List) obj8 : null;
                        Object obj9 = list3 != null ? list3.get(0) : null;
                        String str4 = obj9 instanceof String ? (String) obj9 : null;
                        Object obj10 = list3 != null ? list3.get(1) : null;
                        a(activity, str4, obj10 instanceof String ? (String) obj10 : null, result2);
                        return;
                    }
                    break;
                case -505062682:
                    result2 = result;
                    if (str.equals("openFile")) {
                        Object obj11 = call.arguments;
                        List list4 = obj11 instanceof List ? (List) obj11 : null;
                        Object obj12 = list4 != null ? list4.get(0) : null;
                        String str5 = obj12 instanceof String ? (String) obj12 : null;
                        Object obj13 = list4 != null ? list4.get(1) : null;
                        String strB = obj13 instanceof String ? (String) obj13 : null;
                        if (str5 == null) {
                            result2.error("INVALID_ARGUMENTS", "URI string is required", null);
                            return;
                        }
                        if (strB == null) {
                            strB = Q.b(str5);
                        }
                        if (!H.a(activity, str5, strB)) {
                            result2.error("OPEN_FILE_FAILED", "Failed to open file", null);
                        }
                        result2.success(Boolean.TRUE);
                        return;
                    }
                    break;
                case -104835859:
                    result2 = result;
                    if (str.equals("moveFile")) {
                        Object obj14 = call.arguments;
                        List list5 = obj14 instanceof List ? (List) obj14 : null;
                        Object obj15 = list5 != null ? list5.get(0) : null;
                        String str6 = obj15 instanceof String ? (String) obj15 : null;
                        Object obj16 = list5 != null ? list5.get(1) : null;
                        d(activity, str6, obj16 instanceof String ? (String) obj16 : null, result2);
                        return;
                    }
                    break;
                case 1764172231:
                    result2 = result;
                    if (str.equals("deleteFile")) {
                        Object obj17 = call.arguments;
                        String str7 = obj17 instanceof String ? (String) obj17 : null;
                        if (str7 == null) {
                            result2.error("INVALID_ARGUMENTS", "URI string is required", null);
                            return;
                        }
                        Uri uri3 = Uri.parse(str7);
                        if (!AbstractC4862t.a(uri3.getScheme(), "content")) {
                            if (!AbstractC4862t.a(uri3.getScheme(), Constants.FILE)) {
                                result2.error("DELETE_FILE_FAILED", "Invalid URI: " + uri3, null);
                                return;
                            }
                            String path = uri3.getPath();
                            AbstractC4862t.b(path);
                            if (new File(path).delete()) {
                                result2.success(null);
                                return;
                            } else {
                                result2.error("DELETE_FILE_FAILED", "Failed to delete file", null);
                                return;
                            }
                        }
                        AbstractC4870a abstractC4870aF = AbstractC4870a.f(activity, uri3);
                        if (abstractC4870aF != null && abstractC4870aF.c()) {
                            result2.success(null);
                            return;
                        }
                        if (abstractC4870aF != null) {
                            result2.error("DELETE_FILE_FAILED", "Failed to delete file", null);
                            return;
                        }
                        result2.error("DELETE_FILE_FAILED", "File at " + uri3 + " does not exist", null);
                        return;
                    }
                    break;
                case 1852134220:
                    result2 = result;
                    if (str.equals("pickDirectory")) {
                        Object obj18 = call.arguments;
                        List list6 = obj18 instanceof List ? (List) obj18 : null;
                        Integer num2 = (Integer) (list6 != null ? list6.get(0) : null);
                        Object obj19 = list6 != null ? list6.get(1) : null;
                        String str8 = obj19 instanceof String ? (String) obj19 : null;
                        Object obj20 = list6 != null ? list6.get(2) : null;
                        if (C1899t.f13896a.b(activity, num2 != null ? (P) P.b().get(num2.intValue()) : null, str8 != null ? Uri.parse(str8) : null, AbstractC4862t.a(obj20 instanceof Boolean ? (Boolean) obj20 : null, Boolean.TRUE), result2)) {
                            return;
                        }
                        result2.error("PICK_DIRECTORY_FAILED", "Failed to launch directory picker", null);
                        return;
                    }
                    break;
                case 1867249873:
                    if (str.equals("createDirectory")) {
                        Object obj21 = call.arguments;
                        List list7 = obj21 instanceof List ? (List) obj21 : null;
                        Object obj22 = list7 != null ? list7.get(0) : null;
                        String str9 = obj22 instanceof String ? (String) obj22 : null;
                        Object obj23 = list7 != null ? list7.get(1) : null;
                        String str10 = obj23 instanceof String ? (String) obj23 : null;
                        Object obj24 = list7 != null ? list7.get(2) : null;
                        boolean zA3 = AbstractC4862t.a(obj24 instanceof Boolean ? (Boolean) obj24 : null, Boolean.TRUE);
                        if (str9 == null || str10 == null) {
                            result.error("INVALID_ARGUMENTS", "Parent directory URI and new directory name are required", null);
                            return;
                        }
                        Uri uri4 = Uri.parse(str9);
                        C1898s c1898s = C1898s.f13894a;
                        AbstractC4862t.b(uri4);
                        c1898s.a(activity, uri4, str10, zA3, result);
                        return;
                    }
                    result2 = result;
                    break;
                    break;
                default:
                    result2 = result;
                    break;
            }
        } else {
            result2 = result;
        }
        result2.notImplemented();
    }
}
