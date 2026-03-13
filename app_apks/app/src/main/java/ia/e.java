package ia;

import Od.C;
import Od.F;
import Od.H;
import Od.o;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import Rd.N;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.fasterxml.jackson.core.JsonPointer;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import ia.C4370a;
import io.flutter.plugin.common.MethodChannel;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypes;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f37359a = new e();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37360a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37360a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f37361j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Intent f37362k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f37363l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Activity f37364m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f37365n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f37366o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f37367p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, c cVar, Activity activity, int i10, boolean z10, String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f37362k = intent;
            this.f37363l = cVar;
            this.f37364m = activity;
            this.f37365n = i10;
            this.f37366o = z10;
            this.f37367p = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(this.f37362k, this.f37363l, this.f37364m, this.f37365n, this.f37366o, this.f37367p, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f37361j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            if (this.f37362k == null) {
                this.f37363l.g("unknown_activity", "Unknown activity error, please fill an issue.");
                return C4015H.f34254a;
            }
            ArrayList arrayList = new ArrayList();
            if (this.f37362k.getClipData() != null) {
                ClipData clipData = this.f37362k.getClipData();
                AbstractC4862t.b(clipData);
                int itemCount = clipData.getItemCount();
                for (int i10 = 0; i10 < itemCount; i10++) {
                    ClipData clipData2 = this.f37362k.getClipData();
                    AbstractC4862t.b(clipData2);
                    Uri uri = clipData2.getItemAt(i10).getUri();
                    e eVar = e.f37359a;
                    Activity activity = this.f37364m;
                    AbstractC4862t.b(uri);
                    eVar.e(this.f37364m, eVar.y(activity, uri, this.f37365n), this.f37366o, arrayList);
                }
                this.f37363l.h(arrayList);
            } else if (this.f37362k.getData() != null) {
                e eVar2 = e.f37359a;
                Activity activity2 = this.f37364m;
                Uri data = this.f37362k.getData();
                AbstractC4862t.b(data);
                Uri uriY = eVar2.y(activity2, data, this.f37365n);
                if (AbstractC4862t.a(this.f37367p, "dir")) {
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriY, DocumentsContract.getTreeDocumentId(uriY));
                    AbstractC4862t.d(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
                    String strO = e.o(uriBuildDocumentUriUsingTree, this.f37364m);
                    if (strO != null) {
                        this.f37363l.h(strO);
                    } else {
                        this.f37363l.g("unknown_path", "Failed to retrieve directory path.");
                    }
                } else {
                    eVar2.e(this.f37364m, uriY, this.f37366o, arrayList);
                    eVar2.t(this.f37363l, arrayList);
                }
            } else {
                Bundle extras = this.f37362k.getExtras();
                if (extras == null || !extras.containsKey("selectedItems")) {
                    this.f37363l.g("unknown_activity", "Unknown activity error, please fill an issue.");
                } else {
                    e eVar3 = e.f37359a;
                    Bundle extras2 = this.f37362k.getExtras();
                    AbstractC4862t.b(extras2);
                    ArrayList arrayListS = eVar3.s(extras2);
                    if (arrayListS != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayListS) {
                            if (obj2 instanceof Uri) {
                                arrayList2.add(obj2);
                            }
                        }
                        Activity activity3 = this.f37364m;
                        boolean z10 = this.f37366o;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            e.f37359a.e(activity3, (Uri) it.next(), z10, arrayList);
                        }
                    }
                    this.f37363l.h(arrayList);
                }
            }
            return C4015H.f34254a;
        }
    }

    public static final boolean f(Context context) {
        AbstractC4862t.e(context, "context");
        try {
            f37359a.z(new File(context.getCacheDir() + "/file_picker/"));
            return true;
        } catch (Exception e10) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e10);
            return false;
        }
    }

    public static final Uri g(Uri originalImageUri, int i10, Context context) {
        AbstractC4862t.e(originalImageUri, "originalImageUri");
        AbstractC4862t.e(context, "context");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(originalImageUri);
            try {
                e eVar = f37359a;
                Bitmap.CompressFormat compressFormatI = eVar.i(context, originalImageUri);
                File fileH = eVar.h(context, compressFormatI);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(fileH);
                bitmapDecodeStream.compress(compressFormatI, i10, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriFromFile = Uri.fromFile(fileH);
                AbstractC4862t.d(uriFromFile, "fromFile(...)");
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(inputStreamOpenInputStream, null);
                return uriFromFile;
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String n(Uri uri, Context context) {
        Exception exc;
        Uri uri2;
        String string;
        AbstractC4862t.e(uri, "uri");
        AbstractC4862t.e(context, "context");
        String str = null;
        try {
            if (AbstractC4862t.a(uri.getScheme(), "content")) {
                uri2 = uri;
                Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                try {
                    try {
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                                }
                                C4015H c4015h = C4015H.f34254a;
                                sc.c.a(cursorQuery, null);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                        sc.c.a(cursorQuery, null);
                    } catch (Exception e10) {
                        exc = e10;
                        str = string;
                        Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
                        return str;
                    }
                    C4015H c4015h2 = C4015H.f34254a;
                } catch (Throwable th2) {
                    th = th2;
                    str = string;
                    throw th;
                }
                string = null;
            } else {
                uri2 = uri;
                string = null;
            }
            if (string != null) {
                return string;
            }
            String path = uri2.getPath();
            if (path != null) {
                return F.U0(path, JsonPointer.SEPARATOR, null, 2, null);
            }
            return null;
        } catch (Exception e11) {
            exc = e11;
            Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
            return str;
        }
    }

    public static final String o(Uri uri, Context context) {
        AbstractC4862t.e(context, "context");
        if (uri == null) {
            return null;
        }
        e eVar = f37359a;
        String strR = eVar.r(uri);
        String separator = File.separator;
        AbstractC4862t.d(separator, "separator");
        if (C.D(strR, separator, false, 2, null)) {
            strR = H.j1(strR, 1);
        }
        String strK = eVar.k(uri);
        AbstractC4862t.d(separator, "separator");
        if (C.D(strK, separator, false, 2, null)) {
            strK = H.j1(strK, 1);
        }
        if (strK.length() <= 0 || C.D(strR, strK, false, 2, null)) {
            return strR;
        }
        AbstractC4862t.d(separator, "separator");
        if (C.P(strK, separator, false, 2, null)) {
            return strR + strK;
        }
        return strR + separator + strK;
    }

    public static final boolean u(Context context, Uri uri) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        String strL = f37359a.l(context, uri);
        if (strL == null) {
            return false;
        }
        return strL.contentEquals("jpg") || strL.contentEquals("jpeg") || strL.contentEquals("png") || strL.contentEquals("webp") || strL.contentEquals("heic") || strL.contentEquals("heif");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0128 A[Catch: IOException -> 0x0124, TryCatch #4 {IOException -> 0x0124, blocks: (B:57:0x011a, B:59:0x0120, B:63:0x0128, B:65:0x012d), top: B:75:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d A[Catch: IOException -> 0x0124, TRY_LEAVE, TryCatch #4 {IOException -> 0x0124, blocks: (B:57:0x011a, B:59:0x0120, B:63:0x0128, B:65:0x012d), top: B:75:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ia.C4370a w(android.content.Context r13, android.net.Uri r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.e.w(android.content.Context, android.net.Uri, boolean):ia.a");
    }

    public final void A(c cVar, String str, String str2, String str3, byte[] bArr, MethodChannel.Result result) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(result, "result");
        if (!cVar.v(result)) {
            c.f37335j.a(result);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null && str.length() != 0) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        cVar.q(bArr);
        if (!AbstractC4862t.a("dir", str2)) {
            try {
                intent.setType(p(str, bArr));
            } catch (Throwable th) {
                intent.setType("*/*");
                Log.e("FilePickerDelegate", "Failed to detect mime type. " + th);
            }
        }
        if (str3 != null && str3.length() != 0) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str3));
        }
        if (intent.resolveActivity(cVar.i().getPackageManager()) != null) {
            cVar.i().startActivityForResult(intent, c.f37335j.c());
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            cVar.g("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public final void B(c cVar) {
        Intent intent;
        List listI0;
        AbstractC4862t.e(cVar, "<this>");
        if (cVar.k() == null) {
            return;
        }
        if (AbstractC4862t.a(cVar.k(), "dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else if (AbstractC4862t.a(cVar.k(), "image/*")) {
            intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), cVar.k());
            intent.setType(cVar.k());
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.n());
            intent.putExtra("multi-pick", cVar.n());
            String strK = cVar.k();
            if (strK != null) {
                String str = F.V(strK, ",", false, 2, null) ? strK : null;
                if (str != null && (listI0 = F.I0(str, new String[]{","}, false, 0, 6, null)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listI0) {
                        if (((String) obj).length() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    cVar.p(new ArrayList(arrayList));
                }
            }
            if (cVar.j() != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", cVar.j());
            }
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(cVar.k());
            ArrayList arrayListJ = cVar.j();
            if (arrayListJ == null || arrayListJ.isEmpty()) {
                intent.putExtra("android.intent.extra.MIME_TYPES", intent.getType());
            } else {
                ArrayList arrayListJ2 = cVar.j();
                AbstractC4862t.b(arrayListJ2);
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayListJ2.toArray(new String[0]));
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.n());
            intent.putExtra("multi-pick", cVar.n());
        }
        if (intent.resolveActivity(cVar.i().getPackageManager()) != null) {
            cVar.i().startActivityForResult(intent, c.f37335j.b());
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            cVar.g("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public final void C(c cVar, String str, Boolean bool, Boolean bool2, ArrayList allowedExtensions, Integer num, MethodChannel.Result result) {
        AbstractC4862t.e(allowedExtensions, "allowedExtensions");
        AbstractC4862t.e(result, "result");
        if (cVar != null && !cVar.v(result)) {
            c.f37335j.a(result);
            return;
        }
        if (cVar != null) {
            cVar.w(str);
        }
        if (bool != null && cVar != null) {
            cVar.u(bool.booleanValue());
        }
        if (bool2 != null && cVar != null) {
            cVar.t(bool2.booleanValue());
        }
        if (cVar != null) {
            cVar.p(allowedExtensions);
        }
        if (num != null && cVar != null) {
            cVar.r(num.intValue());
        }
        if (cVar != null) {
            B(cVar);
        }
    }

    public final Uri D(Context context, Uri uri, byte[] bArr) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(uri, "uri");
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
        if (outputStreamOpenOutputStream != null) {
            if (bArr != null) {
                try {
                    outputStreamOpenOutputStream.write(bArr);
                    C4015H c4015h = C4015H.f34254a;
                } finally {
                }
            }
            sc.c.a(outputStreamOpenOutputStream, null);
        }
        return uri;
    }

    public final void e(Activity activity, Uri uri, boolean z10, List list) throws Throwable {
        C4370a c4370aW = w(activity, uri, z10);
        if (c4370aW != null) {
            list.add(c4370aW);
        }
    }

    public final File h(Context context, Bitmap.CompressFormat compressFormat) throws IOException {
        File fileCreateTempFile = File.createTempFile("IMAGE_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + "_", "." + j(compressFormat), context.getCacheDir());
        AbstractC4862t.d(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public final Bitmap.CompressFormat i(Context context, Uri uri) {
        String strL = l(context, uri);
        AbstractC4862t.b(strL);
        Locale locale = Locale.getDefault();
        AbstractC4862t.d(locale, "getDefault(...)");
        String upperCase = strL.toUpperCase(locale);
        AbstractC4862t.d(upperCase, "toUpperCase(...)");
        return AbstractC4862t.a(upperCase, "PNG") ? Bitmap.CompressFormat.PNG : AbstractC4862t.a(upperCase, "WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    public final String j(Bitmap.CompressFormat compressFormat) {
        int i10 = a.f37360a[compressFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? "jpeg" : "webp" : "png";
    }

    public final String k(Uri uri) {
        List listK;
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        AbstractC4862t.b(treeDocumentId);
        List listM = new o(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).m(treeDocumentId, 0);
        if (listM.isEmpty()) {
            listK = C4206t.k();
        } else {
            ListIterator listIterator = listM.listIterator(listM.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listK = C4179C.M0(listM, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listK = C4206t.k();
        }
        String[] strArr = (String[]) listK.toArray(new String[0]);
        if (strArr.length >= 2) {
            return strArr[1];
        }
        String separator = File.separator;
        AbstractC4862t.d(separator, "separator");
        return separator;
    }

    public final String l(Context context, Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
    }

    public final String m(byte[] bArr) {
        String strDetect = new Tika().detect(bArr);
        AbstractC4862t.b(strDetect);
        return F.R0(strDetect, "/", null, 2, null);
    }

    public final String p(String str, byte[] bArr) {
        String strDetect;
        Tika tika = new Tika();
        if (str == null || str.length() == 0) {
            strDetect = tika.detect(bArr);
        } else {
            Detector detector = tika.getDetector();
            TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
            Metadata metadata = new Metadata();
            metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, str);
            strDetect = detector.detect(tikaInputStream, metadata).toString();
        }
        if (AbstractC4862t.a(strDetect, MimeTypes.PLAIN_TEXT)) {
            return "*/*";
        }
        AbstractC4862t.b(strDetect);
        return strDetect;
    }

    public final ArrayList q(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return new ArrayList(C4205s.d("*/*"));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i10));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type '" + arrayList.get(i10) + "' is unsupported and will not be filtered.");
                return new ArrayList(C4205s.d("*/*"));
            }
            arrayList2.add(mimeTypeFromExtension);
            if (AbstractC4862t.a(arrayList.get(i10), "csv")) {
                arrayList2.add("text/csv");
            }
        }
        Log.d("FilePickerUtils", "Custom file types are " + arrayList + ". The mime types were detected as " + arrayList2 + ".");
        return arrayList2;
    }

    public final String r(Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        AbstractC4862t.b(treeDocumentId);
        List listI0 = F.I0(treeDocumentId, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER}, false, 0, 6, null);
        if (listI0.size() <= 1) {
            return Environment.getExternalStorageDirectory() + "/" + C4179C.s0(listI0);
        }
        String str = (String) listI0.get(0);
        String str2 = (String) listI0.get(1);
        if (C.E("primary", str, true)) {
            return Environment.getExternalStorageDirectory() + "/" + str2;
        }
        return "/storage/" + str + "/" + str2;
    }

    public final ArrayList s(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    public final void t(c cVar, List list) {
        if (list.isEmpty()) {
            cVar.g("unknown_path", "Failed to retrieve path.");
        } else {
            cVar.h(list);
        }
    }

    public final void v(File file, C4370a.C0488a c0488a) {
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e10) {
                Log.e("FilePickerUtils", "File not found: " + e10.getMessage(), null);
            } catch (IOException e11) {
                Log.e("FilePickerUtils", "Failed to close file streams: " + e11.getMessage(), null);
            }
            c0488a.b(bArr);
        } catch (Exception e12) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e12 + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    public final void x(c cVar, Activity activity, Intent intent, int i10, boolean z10, String type) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(type, "type");
        AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(intent, cVar, activity, i10, z10, type, null), 3, null);
    }

    public final Uri y(Activity activity, Uri uri, int i10) {
        if (i10 > 0) {
            Context applicationContext = activity.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            if (u(applicationContext, uri)) {
                Context applicationContext2 = activity.getApplicationContext();
                AbstractC4862t.d(applicationContext2, "getApplicationContext(...)");
                return g(uri, i10, applicationContext2);
            }
        }
        return uri;
    }

    public final void z(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.listFiles() != null && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file2 : fileArrListFiles) {
                z(file2);
            }
        }
        file.delete();
    }
}
