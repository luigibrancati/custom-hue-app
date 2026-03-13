package da;

import P7.e;
import P7.j;
import P7.k;
import P7.m;
import P7.w;
import Q7.AbstractC1906a;
import V7.f;
import Y7.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import b0.C2778b;
import f8.AbstractC4002e;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: da.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesC3844a implements SharedPreferences {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Integer f33175g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Integer f33176h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Integer f33177i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Integer f33178j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f33179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f33180b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P7.a f33183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f33184f;

    /* JADX INFO: renamed from: da.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class SharedPreferencesEditorC0401a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharedPreferencesC3844a f33185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f33186b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f33188d = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f33187c = new CopyOnWriteArrayList();

        public SharedPreferencesEditorC0401a(SharedPreferencesC3844a sharedPreferencesC3844a, SharedPreferences.Editor editor) {
            this.f33185a = sharedPreferencesC3844a;
            this.f33186b = editor;
        }

        public final void a() {
            if (this.f33188d.getAndSet(false)) {
                for (String str : this.f33185a.getAll().keySet()) {
                    if (!this.f33187c.contains(str) && !this.f33185a.k(str)) {
                        this.f33186b.remove(this.f33185a.h(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f33186b.apply();
            b();
            this.f33187c.clear();
        }

        public final void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f33185a.f33180b) {
                Iterator it = this.f33187c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f33185a, (String) it.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.f33185a.k(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f33187c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair pairI = this.f33185a.i(str, bArr);
                this.f33186b.putString((String) pairI.first, (String) pairI.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f33188d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f33186b.commit();
            } finally {
                b();
                this.f33187c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(SharedPreferencesC3844a.f33175g.intValue() + SharedPreferencesC3844a.f33178j.intValue());
            byteBufferAllocate.putInt(b.BOOLEAN.j());
            byteBufferAllocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(SharedPreferencesC3844a.f33175g.intValue() + SharedPreferencesC3844a.f33177i.intValue());
            byteBufferAllocate.putInt(b.FLOAT.j());
            byteBufferAllocate.putFloat(f10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(SharedPreferencesC3844a.f33175g.intValue() + SharedPreferencesC3844a.f33175g.intValue());
            byteBufferAllocate.putInt(b.INT.j());
            byteBufferAllocate.putInt(i10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(SharedPreferencesC3844a.f33175g.intValue() + SharedPreferencesC3844a.f33176h.intValue());
            byteBufferAllocate.putInt(b.LONG.j());
            byteBufferAllocate.putLong(j10);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(SharedPreferencesC3844a.f33175g.intValue() + SharedPreferencesC3844a.f33175g.intValue() + length);
            byteBufferAllocate.putInt(b.STRING.j());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new C2778b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * SharedPreferencesC3844a.f33175g.intValue();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + SharedPreferencesC3844a.f33175g.intValue());
            byteBufferAllocate.putInt(b.STRING_SET.j());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f33185a.k(str)) {
                this.f33186b.remove(this.f33185a.h(str));
                this.f33187c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: renamed from: da.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        b(int i10) {
            this.mId = i10;
        }

        public static b b(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int j() {
            return this.mId;
        }
    }

    /* JADX INFO: renamed from: da.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        AES256_SIV("AES256_SIV");

        private final String mDeterministicAeadKeyTemplateName;

        c(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        public j b() {
            return k.a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* JADX INFO: renamed from: da.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d {
        AES256_GCM("AES256_GCM");

        private final String mAeadKeyTemplateName;

        d(String str) {
            this.mAeadKeyTemplateName = str;
        }

        public j b() {
            return k.a(this.mAeadKeyTemplateName);
        }
    }

    public SharedPreferencesC3844a(String str, String str2, SharedPreferences sharedPreferences, P7.a aVar, e eVar) {
        this.f33181c = str;
        this.f33179a = sharedPreferences;
        this.f33182d = str2;
        this.f33183e = aVar;
        this.f33184f = eVar;
    }

    public static SharedPreferences e(Context context, String str, da.b bVar, c cVar, d dVar) {
        return f(str, bVar.a(), context, cVar, dVar);
    }

    public static SharedPreferences f(String str, String str2, Context context, c cVar, d dVar) {
        f.b();
        AbstractC1906a.c();
        Context applicationContext = context.getApplicationContext();
        m mVarE = new a.b().l(cVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().e();
        m mVarE2 = new a.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().e();
        return new SharedPreferencesC3844a(str, str2, applicationContext.getSharedPreferences(str, 0), (P7.a) mVarE2.x(w.a(), P7.a.class), (e) mVarE.x(w.a(), e.class));
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!k(str)) {
            return this.f33179a.contains(h(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC0401a(this, this.f33179a.edit());
    }

    public String g(String str) {
        try {
            String str2 = new String(this.f33184f.b(AbstractC4002e.a(str, 0), this.f33181c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f33179a.getAll().entrySet()) {
            if (!k(entry.getKey())) {
                String strG = g(entry.getKey());
                map.put(strG, j(strG));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object objJ = j(str);
        return objJ instanceof Boolean ? ((Boolean) objJ).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object objJ = j(str);
        return objJ instanceof Float ? ((Float) objJ).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object objJ = j(str);
        return objJ instanceof Integer ? ((Integer) objJ).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object objJ = j(str);
        return objJ instanceof Long ? ((Long) objJ).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objJ = j(str);
        return objJ instanceof String ? (String) objJ : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object objJ = j(str);
        Set c2778b = objJ instanceof Set ? (Set) objJ : new C2778b();
        return !c2778b.isEmpty() ? c2778b : set;
    }

    public String h(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return AbstractC4002e.d(this.f33184f.a(str.getBytes(StandardCharsets.UTF_8), this.f33181c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    public Pair i(String str, byte[] bArr) {
        String strH = h(str);
        return new Pair(strH, AbstractC4002e.d(this.f33183e.a(bArr, strH.getBytes(StandardCharsets.UTF_8))));
    }

    public final Object j(String str) {
        if (k(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strH = h(str);
            String string = this.f33179a.getString(strH, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = AbstractC4002e.a(string, 0);
            P7.a aVar = this.f33183e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(aVar.b(bArrA, strH.getBytes(charset)));
            byteBufferWrap.position(0);
            int i10 = byteBufferWrap.getInt();
            b bVarB = b.b(i10);
            if (bVarB == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            int iOrdinal = bVarB.ordinal();
            if (iOrdinal == 0) {
                int i11 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i11);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iOrdinal == 1) {
                C2778b c2778b = new C2778b();
                while (byteBufferWrap.hasRemaining()) {
                    int i12 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                    byteBufferSlice2.limit(i12);
                    byteBufferWrap.position(byteBufferWrap.position() + i12);
                    c2778b.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                }
                if (c2778b.size() == 1 && "__NULL__".equals(c2778b.r(0))) {
                    return null;
                }
                return c2778b;
            }
            if (iOrdinal == 2) {
                return Integer.valueOf(byteBufferWrap.getInt());
            }
            if (iOrdinal == 3) {
                return Long.valueOf(byteBufferWrap.getLong());
            }
            if (iOrdinal == 4) {
                return Float.valueOf(byteBufferWrap.getFloat());
            }
            if (iOrdinal == 5) {
                return Boolean.valueOf(byteBufferWrap.get() != 0);
            }
            throw new SecurityException("Unhandled type for encrypted pref value: " + bVarB);
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    public boolean k(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f33180b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f33180b.remove(onSharedPreferenceChangeListener);
    }
}
