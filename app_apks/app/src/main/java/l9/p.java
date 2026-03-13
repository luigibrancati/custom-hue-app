package l9;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f39984c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39986b;

    public p(Context context, String str) {
        this.f39985a = context;
        this.f39986b = str;
    }

    public static synchronized p c(Context context, String str) {
        Map map;
        try {
            map = f39984c;
            if (!map.containsKey(str)) {
                map.put(str, new p(context, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (p) map.get(str);
    }

    public synchronized Void a() {
        this.f39985a.deleteFile(this.f39986b);
        return null;
    }

    public String b() {
        return this.f39986b;
    }

    public synchronized com.google.firebase.remoteconfig.internal.b d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            fileInputStreamOpenFileInput = this.f39985a.openFileInput(this.f39986b);
            try {
                int iAvailable = fileInputStreamOpenFileInput.available();
                byte[] bArr = new byte[iAvailable];
                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                com.google.firebase.remoteconfig.internal.b bVarB = com.google.firebase.remoteconfig.internal.b.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStreamOpenFileInput.close();
                return bVarB;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th3) {
            fileInputStreamOpenFileInput = null;
            th = th3;
        }
    }

    public synchronized Void e(com.google.firebase.remoteconfig.internal.b bVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f39985a.openFileOutput(this.f39986b, 0);
        try {
            fileOutputStreamOpenFileOutput.write(bVar.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
        return null;
    }
}
