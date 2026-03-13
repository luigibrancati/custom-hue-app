package C8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import u8.C5992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f1166a;

    public a(A8.g gVar) {
        this.f1166a = gVar.g("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.f1166a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject b() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        r8.g.f().b("Checking for cached settings...");
        C9.a aVar = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(C5992i.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        r8.g.f().e("Failed to fetch cached settings", e);
                        C5992i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    r8.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                C5992i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                C5992i.f(aVar, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            aVar = "Checking for cached settings...";
            C5992i.f(aVar, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) throws Throwable {
        r8.g.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C5992i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    r8.g.f().e("Failed to cache settings", e);
                    C5992i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    C5992i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
