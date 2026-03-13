package w8;

import io.flutter.plugins.firebase.analytics.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u8.C5992i;

/* JADX INFO: renamed from: w8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6170g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f46344b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8.g f46345a;

    /* JADX INFO: renamed from: w8.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f46346a;

        public a(String str) throws JSONException {
            this.f46346a = str;
            put(Constants.USER_ID, str);
        }
    }

    public C6170g(A8.g gVar) {
        this.f46345a = gVar;
    }

    public static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    public static List f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                r8.g.f().l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String h(Map map) {
        return new JSONObject(map).toString();
    }

    public static String l(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f46372a.b(list.get(i10))));
            } catch (JSONException e10) {
                r8.g.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void m(File file) {
        if (file.exists() && file.delete()) {
            r8.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            r8.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    public static String o(String str) {
        return new a(str).toString();
    }

    public static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f46345a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f46345a.q(str, "keys");
    }

    public File c(String str) {
        return this.f46345a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f46345a.q(str, "user-data");
    }

    public final String g(String str) {
        return p(new JSONObject(str), Constants.USER_ID);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    public Map i(String str, boolean z10) throws Throwable {
        ?? r82;
        FileInputStream fileInputStream;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        ?? r72 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
            } catch (Exception e11) {
                fileInputStream = null;
                e10 = e11;
            } catch (Throwable th) {
                th = th;
                C5992i.f(r72, "Failed to close user metadata file.");
                throw th;
            }
            try {
                Map mapE = e(C5992i.B(fileInputStream));
                C5992i.f(fileInputStream, "Failed to close user metadata file.");
                return mapE;
            } catch (Exception e12) {
                e10 = e12;
                r8.g.f().l("Error deserializing user metadata.", e10);
                m(fileA);
                C5992i.f(fileInputStream, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } catch (Throwable th2) {
            th = th2;
            r72 = r82;
            C5992i.f(r72, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List j(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List listF = f(C5992i.B(fileInputStream2));
                    r8.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    C5992i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    r8.g.f().l("Error deserializing rollouts state.", e);
                    m(fileC);
                    C5992i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C5992i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            r8.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            C5992i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String strG = g(C5992i.B(fileInputStream));
                r8.g.f().b("Loaded userId " + strG + " for session " + str);
                C5992i.f(fileInputStream, "Failed to close user metadata file.");
                return strG;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                C5992i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            r8.g.f().l("Error deserializing user metadata.", e);
            m(fileD);
            C5992i.f(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public void q(String str, Map map) {
        r(str, map, false);
    }

    public void r(String str, Map map, boolean z10) {
        BufferedWriter bufferedWriter;
        Exception e10;
        String strH;
        File fileA = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            strH = h(map);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f46344b));
        } catch (Exception e11) {
            bufferedWriter = null;
            e10 = e11;
        } catch (Throwable th) {
            th = th;
            C5992i.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
        try {
            try {
                bufferedWriter.write(strH);
                bufferedWriter.flush();
                C5992i.f(bufferedWriter, "Failed to close key/value metadata file.");
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                C5992i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            r8.g.f().l("Error serializing key/value metadata.", e10);
            m(fileA);
            C5992i.f(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public void s(String str, List list) {
        BufferedWriter bufferedWriter;
        Exception e10;
        String strL;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        ?? r62 = 0;
        try {
            try {
                strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f46344b));
            } catch (Exception e11) {
                bufferedWriter = null;
                e10 = e11;
            } catch (Throwable th) {
                th = th;
                C5992i.f(r62, "Failed to close rollouts state file.");
                throw th;
            }
            try {
                bufferedWriter.write(strL);
                bufferedWriter.flush();
                C5992i.f(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e12) {
                e10 = e12;
                r8.g.f().l("Error serializing rollouts state.", e10);
                m(fileC);
                C5992i.f(bufferedWriter, "Failed to close rollouts state file.");
            }
        } catch (Throwable th2) {
            th = th2;
            r62 = IsEmpty;
            C5992i.f(r62, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void t(String str, String str2) {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strO = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f46344b));
                try {
                    bufferedWriter2.write(strO);
                    bufferedWriter2.flush();
                    C5992i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    r8.g.f().l("Error serializing user metadata.", e);
                    C5992i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C5992i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
