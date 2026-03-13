package ab;

import Od.C;
import Od.F;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import com.google.ar.core.ImageMetadata;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4206t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.mime.MimeTypes;
import sc.l;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: ab.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2682d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f21211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dev.fluttercommunity.plus.share.a f21212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f21213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f21214e;

    public C2682d(Context context, Activity activity, dev.fluttercommunity.plus.share.a manager) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(manager, "manager");
        this.f21210a = context;
        this.f21211b = activity;
        this.f21212c = manager;
        this.f21213d = C4029l.b(new InterfaceC6082a() { // from class: ab.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C2682d.m(this.f21209a);
            }
        });
        this.f21214e = C4029l.b(new InterfaceC6082a() { // from class: ab.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Integer.valueOf(C2682d.l());
            }
        });
    }

    public static final int l() {
        return 33554432;
    }

    public static final String m(C2682d c2682d) {
        return c2682d.f().getPackageName() + ".flutter.share_provider";
    }

    public final void c() {
        File fileJ = j();
        File[] fileArrListFiles = fileJ.listFiles();
        if (!fileJ.exists() || fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
        fileJ.delete();
    }

    public final File d(File file) {
        File fileJ = j();
        if (!fileJ.exists()) {
            fileJ.mkdirs();
        }
        File file2 = new File(fileJ, file.getName());
        l.m(file, file2, true, 0, 4, null);
        return file2;
    }

    public final boolean e(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            AbstractC4862t.b(canonicalPath);
            String canonicalPath2 = j().getCanonicalPath();
            AbstractC4862t.d(canonicalPath2, "getCanonicalPath(...)");
            return C.P(canonicalPath, canonicalPath2, false, 2, null);
        } catch (IOException unused) {
            return false;
        }
    }

    public final Context f() {
        Activity activity = this.f21211b;
        if (activity == null) {
            return this.f21210a;
        }
        AbstractC4862t.b(activity);
        return activity;
    }

    public final int g() {
        return ((Number) this.f21214e.getValue()).intValue();
    }

    public final String h(String str) {
        if (str == null || !F.V(str, "/", false, 2, null)) {
            return "*";
        }
        String strSubstring = str.substring(0, F.i0(str, "/", 0, false, 6, null));
        AbstractC4862t.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String i() {
        return (String) this.f21213d.getValue();
    }

    public final File j() {
        return new File(f().getCacheDir(), "share_plus");
    }

    public final ArrayList k(List list) throws IOException {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (e(file)) {
                throw new IOException("Shared file can not be located in '" + j().getCanonicalPath() + "'");
            }
            arrayList.add(L0.b.getUriForFile(f(), i(), d(file)));
        }
        return arrayList;
    }

    public final String n(List list) {
        if (list == null || list.isEmpty()) {
            return "*/*";
        }
        int i10 = 1;
        if (list.size() == 1) {
            return (String) C4179C.h0(list);
        }
        String str = (String) C4179C.h0(list);
        int iM = C4206t.m(list);
        if (1 <= iM) {
            while (true) {
                if (!AbstractC4862t.a(str, list.get(i10))) {
                    if (!AbstractC4862t.a(h(str), h((String) list.get(i10)))) {
                        return "*/*";
                    }
                    str = h((String) list.get(i10)) + "/*";
                }
                if (i10 == iM) {
                    break;
                }
                i10++;
            }
        }
        return str;
    }

    public final void o(Activity activity) {
        this.f21211b = activity;
    }

    public final void p(Map arguments, boolean z10) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC4862t.e(arguments, "arguments");
        c();
        String str = (String) arguments.get("text");
        String str2 = (String) arguments.get("uri");
        String str3 = (String) arguments.get("subject");
        String str4 = (String) arguments.get("title");
        List list = (List) arguments.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) arguments.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        ArrayList<? extends Parcelable> arrayListK = arrayList != null ? k(arrayList) : null;
        Intent intent = new Intent();
        if (arrayListK == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType(MimeTypes.PLAIN_TEXT);
            if (str2 != null) {
                str = str2;
            }
            intent.putExtra("android.intent.extra.TEXT", str);
            if (str3 != null && !F.k0(str3)) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            if (str4 != null && !F.k0(str4)) {
                intent.putExtra("android.intent.extra.TITLE", str4);
            }
        } else {
            if (arrayListK.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            if (arrayListK.size() == 1) {
                String str5 = (arrayList2 == null || arrayList2.isEmpty()) ? "*/*" : (String) C4179C.h0(arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str5);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) C4179C.h0(arrayListK));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.setType(n(arrayList2));
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListK);
            }
            if (str != null && !F.k0(str)) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (str3 != null && !F.k0(str3)) {
                intent.putExtra("android.intent.extra.SUBJECT", str3);
            }
            if (str4 != null && !F.k0(str4)) {
                intent.putExtra("android.intent.extra.TITLE", str4);
            }
            intent.addFlags(1);
        }
        Intent intentCreateChooser = z10 ? Intent.createChooser(intent, str4, PendingIntent.getBroadcast(this.f21210a, 0, new Intent(this.f21210a, (Class<?>) SharePlusPendingIntent.class), 134217728 | g()).getIntentSender()) : Intent.createChooser(intent, str4);
        if (arrayListK != null) {
            List<ResolveInfo> listQueryIntentActivities = f().getPackageManager().queryIntentActivities(intentCreateChooser, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
            AbstractC4862t.d(listQueryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                String str6 = ((ResolveInfo) it.next()).activityInfo.packageName;
                Iterator<T> it2 = arrayListK.iterator();
                while (it2.hasNext()) {
                    f().grantUriPermission(str6, (Uri) it2.next(), 3);
                }
            }
        }
        AbstractC4862t.b(intentCreateChooser);
        q(intentCreateChooser, z10);
    }

    public final void q(Intent intent, boolean z10) {
        Activity activity = this.f21211b;
        if (activity == null) {
            intent.addFlags(268435456);
            if (z10) {
                this.f21212c.d();
            }
            this.f21210a.startActivity(intent);
            return;
        }
        if (z10) {
            AbstractC4862t.b(activity);
            activity.startActivityForResult(intent, 22643);
        } else {
            AbstractC4862t.b(activity);
            activity.startActivity(intent);
        }
    }
}
