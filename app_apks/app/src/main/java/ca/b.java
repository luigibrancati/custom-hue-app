package ca;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Boolean f26431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Boolean f26432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Boolean f26433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Boolean f26434n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f26441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f26442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26444j;

    static {
        Boolean bool = Boolean.FALSE;
        f26431k = bool;
        f26432l = Boolean.TRUE;
        f26433m = bool;
        f26434n = bool;
    }

    public b(Map map) {
        this.f26435a = i(map, "sharedPreferencesName", "FlutterSecureStorage");
        this.f26436b = i(map, "preferencesKeyPrefix", "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg");
        this.f26437c = b(map, "resetOnError", f26431k.booleanValue());
        this.f26438d = b(map, "migrateOnAlgorithmChange", f26432l.booleanValue());
        this.f26439e = b(map, "encryptedSharedPreferences", f26433m.booleanValue());
        this.f26440f = b(map, "enforceBiometrics", f26434n.booleanValue());
        this.f26441g = i(map, "prefOptionBiometricPromptTitle", "Authenticate to access");
        this.f26442h = i(map, "prefOptionBiometricPromptSubtitle", "Use biometrics or device credentials");
        this.f26444j = i(map, "storageCipherAlgorithm", "AES_GCM_NoPadding");
        this.f26443i = i(map, "keyCipherAlgorithm", "RSA_ECB_PKCS1Padding");
    }

    public String a() {
        return this.f26441g;
    }

    public final boolean b(Map map, String str, boolean z10) {
        Object obj = map.get(str);
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
    }

    public boolean c() {
        return this.f26440f;
    }

    public String d() {
        return this.f26442h;
    }

    public String e() {
        return this.f26443i;
    }

    public String f() {
        return this.f26444j;
    }

    public String g() {
        return this.f26436b;
    }

    public String h() {
        return this.f26435a;
    }

    public final String i(Map map, String str, String str2) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!str3.isEmpty()) {
                    return str3;
                }
            }
        }
        return str2;
    }

    public boolean j() {
        return this.f26439e;
    }

    public boolean k() {
        return this.f26437c;
    }

    public boolean l() {
        return this.f26438d;
    }

    public String toString() {
        return "FlutterSecureStorageConfig{sharedPreferencesName='" + this.f26435a + "', sharedPreferencesKeyPrefix='" + this.f26436b + "', deleteOnFailure=" + this.f26437c + ", migrateOnAlgorithmChange=" + this.f26438d + ", enforceBiometrics=" + this.f26440f + '}';
    }
}
