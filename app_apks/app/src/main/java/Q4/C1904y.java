package Q4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Log;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1904y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1904y f13915a = new C1904y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MethodChannel.Result f13916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13918d;

    public final String[] a(List list) {
        String strB;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Od.F.L0(str, '.', false, 2, null)) {
                strB = Q.b(str);
            } else {
                strB = Q.b("file." + str);
            }
            arrayList.add(strB);
        }
        return (String[]) C4179C.Z0(arrayList).toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.content.Context r6, int r7, int r8, android.content.Intent r9) {
        /*
            r5 = this;
            java.lang.String r5 = "context"
            kotlin.jvm.internal.AbstractC4862t.e(r6, r5)
            r5 = 36546510(0x22da7ce, float:1.275819E-37)
            r0 = 0
            if (r7 == r5) goto L11
            r5 = 265465106(0xfd2ad12, float:2.0774263E-29)
            if (r7 == r5) goto L11
            return r0
        L11:
            r5 = -1
            r7 = 1
            r1 = 0
            if (r8 != r5) goto L86
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r8 = Q4.C1904y.f13917c
            java.lang.String r2 = "toString(...)"
            if (r8 == 0) goto L58
            if (r9 == 0) goto L28
            android.content.ClipData r8 = r9.getClipData()
            goto L29
        L28:
            r8 = r1
        L29:
            if (r8 == 0) goto L58
            android.content.ClipData r8 = r9.getClipData()
            kotlin.jvm.internal.AbstractC4862t.b(r8)
            int r9 = r8.getItemCount()
        L36:
            if (r0 >= r9) goto L7e
            android.content.ClipData$Item r3 = r8.getItemAt(r0)
            android.net.Uri r3 = r3.getUri()
            boolean r4 = Q4.C1904y.f13918d
            if (r4 == 0) goto L4b
            android.content.ContentResolver r4 = r6.getContentResolver()
            r4.takePersistableUriPermission(r3, r7)
        L4b:
            java.lang.String r3 = r3.toString()
            kotlin.jvm.internal.AbstractC4862t.d(r3, r2)
            r5.add(r3)
            int r0 = r0 + 1
            goto L36
        L58:
            if (r9 == 0) goto L5f
            android.net.Uri r8 = r9.getData()
            goto L60
        L5f:
            r8 = r1
        L60:
            if (r8 == 0) goto L7e
            android.net.Uri r8 = r9.getData()
            kotlin.jvm.internal.AbstractC4862t.b(r8)
            boolean r9 = Q4.C1904y.f13918d
            if (r9 == 0) goto L74
            android.content.ContentResolver r6 = r6.getContentResolver()
            r6.takePersistableUriPermission(r8, r7)
        L74:
            java.lang.String r6 = r8.toString()
            kotlin.jvm.internal.AbstractC4862t.d(r6, r2)
            r5.add(r6)
        L7e:
            io.flutter.plugin.common.MethodChannel$Result r6 = Q4.C1904y.f13916b
            if (r6 == 0) goto L8d
            r6.success(r5)
            goto L8d
        L86:
            io.flutter.plugin.common.MethodChannel$Result r5 = Q4.C1904y.f13916b
            if (r5 == 0) goto L8d
            r5.success(r1)
        L8d:
            Q4.C1904y.f13916b = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.C1904y.b(android.content.Context, int, int, android.content.Intent):boolean");
    }

    public final boolean c(Activity activity, P p10, Uri uri, List list, boolean z10, boolean z11, MethodChannel.Result result) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(result, "result");
        if (f13916b != null) {
            Log.w("FilePicker", "File picker already in progress");
            return false;
        }
        f13917c = z10;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        intent.setFlags(1);
        if (z11) {
            intent.setFlags(intent.getFlags() | 64);
        }
        if (list == null || list.isEmpty()) {
            intent.setType("*/*");
        } else {
            String[] strArrA = f13915a.a(list);
            if (strArrA.length == 1) {
                intent.setType(strArrA[0]);
            } else {
                intent.setType("*/*");
                AbstractC4862t.b(intent.putExtra("android.intent.extra.MIME_TYPES", strArrA));
            }
        }
        if (p10 != null || uri != null) {
            if (uri == null) {
                AbstractC4862t.b(p10);
                uri = t0.b(p10);
            }
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        f13918d = z11;
        f13917c = z10;
        f13916b = result;
        activity.startActivityForResult(intent, 265465106);
        return true;
    }

    public final boolean d(Activity activity, P startLocation, boolean z10, boolean z11, MethodChannel.Result result) {
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(startLocation, "startLocation");
        AbstractC4862t.e(result, "result");
        if (f13916b != null) {
            Log.w("FilePicker", "Media picker already in progress");
            return false;
        }
        if (SdkExtensions.getExtensionVersion(30) < 2) {
            return c(activity, startLocation, null, startLocation == P.images ? C4206t.n("jpg", "jpeg", "png", "gif", "webp", "bmp", "heic", "heif", "svg") : C4206t.n(RRWebVideoEvent.REPLAY_CONTAINER, "webm", "ogg", "webm", "mov", "avi", "mkv"), z10, z11, result);
        }
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        if (z10) {
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", MediaStore.getPickImagesMaxLimit());
        }
        if (startLocation == P.images) {
            intent.setType("image/*");
        } else if (startLocation == P.video) {
            intent.setType("video/*");
        }
        f13918d = z11;
        f13917c = z10;
        f13916b = result;
        activity.startActivityForResult(intent, 36546510);
        return true;
    }
}
