package ca;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import com.it_nomads.fluttersecurestorage.ciphers.j;
import com.it_nomads.fluttersecurestorage.ciphers.m;
import da.SharedPreferencesC3844a;
import da.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: renamed from: ca.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3089a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f26394f = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ca.b f26395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f26396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f26397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f26398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f26399e;

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0335a implements ca.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ca.f f26403d;

        public C0335a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, SharedPreferences sharedPreferences3, ca.f fVar) {
            this.f26400a = sharedPreferences;
            this.f26401b = sharedPreferences2;
            this.f26402c = sharedPreferences3;
            this.f26403d = fVar;
        }

        @Override // ca.f
        public void a(Exception exc) {
            Log.e("FlutterSecureStorage", "Cipher initialization failed during migration. Using EncryptedSharedPreferences.", exc);
            C3089a.this.f26397c = this.f26400a;
            this.f26403d.onSuccess(null);
        }

        @Override // ca.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r52) {
            try {
                C3089a.this.K(this.f26400a, this.f26401b);
                C3089a.this.f26397c = this.f26401b;
                Log.i("FlutterSecureStorage", "Migration completed successfully. Now using custom cipher storage.");
                C3089a.this.R(this.f26402c);
                this.f26403d.onSuccess(null);
            } catch (Exception e10) {
                Log.e("FlutterSecureStorage", "Migration failed. Falling back to EncryptedSharedPreferences.", e10);
                C3089a.this.f26397c = this.f26400a;
                this.f26403d.onSuccess(null);
            }
        }
    }

    /* JADX INFO: renamed from: ca.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements ca.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ca.f f26405a;

        public b(ca.f fVar) {
            this.f26405a = fVar;
        }

        @Override // ca.f
        public void a(Exception exc) {
            this.f26405a.a(exc);
        }

        @Override // ca.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            try {
                C3089a c3089a = C3089a.this;
                c3089a.f26398d = c3089a.f26399e.d(C3089a.this.f26396b, authenticationResult.getCryptoObject().getCipher());
                Log.d("FlutterSecureStorage", "Biometric authentication succeeded");
            } catch (Exception e10) {
                Log.e("FlutterSecureStorage", "Failed to initialize storage cipher after authentication", e10);
                this.f26405a.a(e10);
            }
            this.f26405a.onSuccess(null);
        }
    }

    /* JADX INFO: renamed from: ca.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements ca.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Cipher f26407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ca.f f26410d;

        public c(Cipher cipher, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
            this.f26407a = cipher;
            this.f26408b = sharedPreferences;
            this.f26409c = sharedPreferences2;
            this.f26410d = fVar;
        }

        @Override // ca.f
        public void a(Exception exc) {
            Log.e("FlutterSecureStorage", "Biometric authentication failed for migration", exc);
            this.f26410d.a(new Exception("Migration cancelled: Biometric authentication failed", exc));
        }

        @Override // ca.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            try {
                Log.d("FlutterSecureStorage", "Step 2/6: Decrypting all data with saved biometric cipher...");
                j jVarF = C3089a.this.f26399e.f(C3089a.this.f26396b, this.f26407a);
                Map mapQ = C3089a.this.q(this.f26408b, jVarF);
                Log.d("FlutterSecureStorage", "Step 3/6: Deleting old biometric AES key from Android KeyStore...");
                if (C3089a.this.f26399e.a()) {
                    try {
                        C3089a.this.f26399e.e(C3089a.this.f26396b).b();
                        jVarF.c(C3089a.this.f26396b);
                        Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                    } catch (Exception e10) {
                        Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                    }
                }
                Log.d("FlutterSecureStorage", "Step 4/6: Updating algorithm markers to current...");
                C3089a.this.S(this.f26409c);
                Log.d("FlutterSecureStorage", "Step 5/6: Initializing current non-biometric cipher...");
                j jVarD = C3089a.this.f26399e.d(C3089a.this.f26396b, null);
                Log.d("FlutterSecureStorage", "Step 6/6: Encrypting all data with current cipher...");
                C3089a.this.u(mapQ, this.f26408b, jVarD);
                C3089a.this.f26398d = jVarD;
                Log.i("FlutterSecureStorage", "Biometric→Non-biometric migration completed! Data no longer requires biometric authentication.");
                this.f26410d.onSuccess(null);
            } catch (Exception e11) {
                Log.e("FlutterSecureStorage", "Failed to complete migration after authentication", e11);
                this.f26410d.a(e11);
            }
        }
    }

    /* JADX INFO: renamed from: ca.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements ca.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Cipher f26412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f26413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ca.f f26415d;

        public d(Cipher cipher, Map map, SharedPreferences sharedPreferences, ca.f fVar) {
            this.f26412a = cipher;
            this.f26413b = map;
            this.f26414c = sharedPreferences;
            this.f26415d = fVar;
        }

        @Override // ca.f
        public void a(Exception exc) {
            Log.e("FlutterSecureStorage", "Biometric authentication failed for migration", exc);
            this.f26415d.a(new Exception("Migration cancelled: Biometric authentication failed", exc));
        }

        @Override // ca.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            try {
                Log.d("FlutterSecureStorage", "Step 5/6: Initializing current biometric cipher...");
                j jVarD = C3089a.this.f26399e.d(C3089a.this.f26396b, this.f26412a);
                Log.d("FlutterSecureStorage", "Step 6/6: Encrypting all data with current biometric cipher...");
                C3089a.this.u(this.f26413b, this.f26414c, jVarD);
                C3089a.this.f26398d = jVarD;
                Log.i("FlutterSecureStorage", "Non-biometric→Biometric migration completed! Data now requires biometric authentication.");
                this.f26415d.onSuccess(null);
            } catch (Exception e10) {
                Log.e("FlutterSecureStorage", "Failed to complete migration after authentication", e10);
                this.f26415d.a(e10);
            }
        }
    }

    /* JADX INFO: renamed from: ca.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements ca.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Cipher f26417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ca.f f26420d;

        /* JADX INFO: renamed from: ca.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0336a implements ca.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Cipher f26422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Map f26423b;

            public C0336a(Cipher cipher, Map map) {
                this.f26422a = cipher;
                this.f26423b = map;
            }

            @Override // ca.f
            public void a(Exception exc) {
                Log.e("FlutterSecureStorage", "Second biometric authentication failed for migration", exc);
                e.this.f26420d.a(new Exception("Migration cancelled: Second biometric authentication failed", exc));
            }

            @Override // ca.f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
                try {
                    Log.d("FlutterSecureStorage", "Step 6/7: Initializing current biometric cipher...");
                    j jVarD = C3089a.this.f26399e.d(C3089a.this.f26396b, this.f26422a);
                    Log.d("FlutterSecureStorage", "Step 7/7: Encrypting all data with current biometric cipher...");
                    e eVar = e.this;
                    C3089a.this.u(this.f26423b, eVar.f26418b, jVarD);
                    C3089a.this.f26398d = jVarD;
                    Log.i("FlutterSecureStorage", "Biometric→Biometric migration completed! Data now uses new biometric cipher.");
                    e.this.f26420d.onSuccess(null);
                } catch (Exception e10) {
                    Log.e("FlutterSecureStorage", "Failed to complete migration after second authentication", e10);
                    e.this.f26420d.a(e10);
                }
            }
        }

        public e(Cipher cipher, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
            this.f26417a = cipher;
            this.f26418b = sharedPreferences;
            this.f26419c = sharedPreferences2;
            this.f26420d = fVar;
        }

        @Override // ca.f
        public void a(Exception exc) {
            Log.e("FlutterSecureStorage", "First biometric authentication failed for migration", exc);
            this.f26420d.a(new Exception("Migration cancelled: First biometric authentication failed", exc));
        }

        @Override // ca.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            try {
                Log.d("FlutterSecureStorage", "Step 2/7: Decrypting all data with saved biometric cipher...");
                j jVarF = C3089a.this.f26399e.f(C3089a.this.f26396b, this.f26417a);
                Map mapQ = C3089a.this.q(this.f26418b, jVarF);
                Log.d("FlutterSecureStorage", "Step 3/7: Deleting old biometric AES key from Android KeyStore...");
                if (C3089a.this.f26399e.a()) {
                    try {
                        C3089a.this.f26399e.e(C3089a.this.f26396b).b();
                        jVarF.c(C3089a.this.f26396b);
                        Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                    } catch (Exception e10) {
                        Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                    }
                }
                Log.d("FlutterSecureStorage", "Step 4/7: Updating algorithm markers to current...");
                C3089a.this.S(this.f26419c);
                Log.d("FlutterSecureStorage", "Step 5/7: Getting current biometric cipher...");
                Cipher cipherC = C3089a.this.f26399e.c(C3089a.this.f26396b).c(C3089a.this.f26396b);
                if (cipherC == null) {
                    throw new Exception("Failed to get current biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with NEW biometric cipher to encrypt data...");
                C3089a.this.n(cipherC, new C0336a(cipherC, mapQ));
            } catch (Exception e11) {
                Log.e("FlutterSecureStorage", "Failed after first authentication", e11);
                this.f26420d.a(e11);
            }
        }
    }

    /* JADX INFO: renamed from: ca.a$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements ca.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f26425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ca.f f26426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26427c;

        public f(SharedPreferences sharedPreferences, ca.f fVar, String str) {
            this.f26425a = sharedPreferences;
            this.f26426b = fVar;
            this.f26427c = str;
        }

        @Override // ca.f
        public void a(Exception exc) {
            Log.e("FlutterSecureStorage", "Data migration failed: " + exc.getMessage(), exc);
            if (C3089a.this.f26395a.k()) {
                Log.w("FlutterSecureStorage", "resetOnError is enabled. Deleting all data as fallback...");
                C3089a.this.t(this.f26425a, this.f26426b);
                C3089a.this.R(this.f26425a);
            } else {
                Log.e("FlutterSecureStorage", "Set resetOnError=true to automatically delete data after migration failure.");
                this.f26426b.a(new Exception(String.format("Migration failed after algorithm change (%s). Enable resetOnError=true or call deleteAll().", this.f26427c), exc));
            }
        }

        @Override // ca.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            Log.i("FlutterSecureStorage", "Data migration completed successfully!");
            C3089a.this.R(this.f26425a);
            this.f26426b.onSuccess(null);
        }
    }

    /* JADX INFO: renamed from: ca.a$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends BiometricPrompt.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ca.f f26429a;

        public g(ca.f fVar) {
            this.f26429a = fVar;
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            super.onAuthenticationError(i10, charSequence);
            Log.e("FlutterSecureStorage", "Biometric authentication error [" + i10 + "]: " + ((Object) charSequence));
            this.f26429a.a(new Exception("Biometric authentication error [" + i10 + "]: " + ((Object) charSequence)));
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            super.onAuthenticationFailed();
            Log.w("FlutterSecureStorage", "Biometric authentication failed, user not recognized");
            this.f26429a.a(new Exception("Biometric authentication failed, user not recognized"));
        }

        @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            super.onAuthenticationSucceeded(authenticationResult);
            this.f26429a.onSuccess(authenticationResult);
        }
    }

    public C3089a(Context context) {
        this.f26396b = context.getApplicationContext();
    }

    public void A(ca.b bVar, ca.f fVar) {
        C3089a c3089a;
        ca.f fVar2;
        SharedPreferences sharedPreferencesB;
        this.f26395a = bVar;
        if (this.f26397c != null) {
            fVar.onSuccess(null);
            return;
        }
        SharedPreferences sharedPreferences = this.f26396b.getSharedPreferences(bVar.h(), 0);
        SharedPreferences sharedPreferences2 = this.f26396b.getSharedPreferences("FlutterSecureStorageConfiguration", 0);
        Boolean boolW = w(sharedPreferences2);
        if (boolW.booleanValue()) {
            c3089a = this;
            fVar2 = fVar;
        } else {
            try {
                sharedPreferencesB = B(this.f26396b);
            } catch (Exception e10) {
                e = e10;
                c3089a = this;
                fVar2 = fVar;
            }
            try {
                if (z(sharedPreferencesB)) {
                    Log.w("FlutterSecureStorage", "Found data in EncryptedSharedPreferences (deprecated)");
                    Log.w("FlutterSecureStorage", "EncryptedSharedPreferences is DEPRECATED and will be removed in a later version");
                    Log.w("FlutterSecureStorage", "The Jetpack Security library has been deprecated by Google.");
                    if (bVar.l()) {
                        Log.i("FlutterSecureStorage", "Migrating data from EncryptedSharedPreferences to custom cipher storage...");
                        if (bVar.j()) {
                            Log.w("FlutterSecureStorage", "Your data will be automatically migrated. You can safely remove encryptedSharedPreferences from your config after migration.");
                        }
                        Log.i("FlutterSecureStorage", "Migrating data from EncryptedSharedPreferences to selected custom cipher storage...");
                        C(sharedPreferences2, new C0335a(sharedPreferencesB, sharedPreferences, sharedPreferences2, fVar));
                        return;
                    }
                    Log.w("FlutterSecureStorage", "Data found in EncryptedSharedPreferences, but migrateOnAlgorithmChange is set to false.");
                    Log.w("FlutterSecureStorage", "Set migrateOnAlgorithmChange=true to migrate to custom cipher storage.");
                    if (bVar.j()) {
                        Log.i("FlutterSecureStorage", "Using EncryptedSharedPreferences (migration disabled).");
                        this.f26397c = sharedPreferencesB;
                        fVar.onSuccess(null);
                        return;
                    } else {
                        Log.e("FlutterSecureStorage", "Data exists in EncryptedSharedPreferences but encryptedSharedPreferences=false and migrateOnAlgorithmChange=false.");
                        Log.e("FlutterSecureStorage", "Either set encryptedSharedPreferences=true to use the old data, or set migrateOnAlgorithmChange=true to migrate it.");
                        fVar.a(new Exception("EncryptedSharedPreferences data found but migration is disabled. Set migrateOnAlgorithmChange=true to migrate."));
                        return;
                    }
                }
                c3089a = this;
                fVar2 = fVar;
                Log.d("FlutterSecureStorage", "No data found in EncryptedSharedPreferences.");
                if (bVar.j() && !bVar.l()) {
                    Log.w("FlutterSecureStorage", "Using EncryptedSharedPreferences (deprecated). Consider migrating to custom ciphers.");
                    c3089a.f26397c = sharedPreferencesB;
                    fVar2.onSuccess(null);
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                Log.e("FlutterSecureStorage", "EncryptedSharedPreferences initialization failed. Falling back to custom ciphers.", e);
            }
        }
        if (c3089a.f26397c == null) {
            if (bVar.j() && boolW.booleanValue()) {
                Log.i("FlutterSecureStorage", "Data already migrated, encryptedSharedPreferences ignored and can be safely removed.");
            }
            c3089a.f26397c = sharedPreferences;
            c3089a.C(sharedPreferences2, fVar2);
        }
    }

    public final SharedPreferences B(Context context) {
        return SharedPreferencesC3844a.e(context, this.f26395a.h(), new b.a(context).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build()).a(), SharedPreferencesC3844a.c.AES256_SIV, SharedPreferencesC3844a.d.AES256_GCM);
    }

    public final void C(SharedPreferences sharedPreferences, ca.f fVar) {
        try {
            m mVar = new m(sharedPreferences, this.f26395a.e(), this.f26395a.f(), this.f26395a);
            this.f26399e = mVar;
            if (mVar.h()) {
                Log.w("FlutterSecureStorage", "Algorithm changed detected.");
                x(sharedPreferences, fVar, null, "Algorithm changed detected");
                return;
            }
            Cipher cipherC = this.f26399e.c(this.f26396b).c(this.f26396b);
            boolean zC = this.f26395a.c();
            boolean zF = F();
            if (cipherC != null && (zC || zF)) {
                n(cipherC, new b(fVar));
                return;
            }
            this.f26398d = this.f26399e.d(this.f26396b, cipherC);
            fVar.onSuccess(null);
        } catch (InvalidKeyException e10) {
            x(sharedPreferences, fVar, e10, "Invalid key, key type incompatible with cipher");
        } catch (NoSuchAlgorithmException e11) {
            Log.e("FlutterSecureStorage", "Cryptographic algorithm not available on this device", e11);
            fVar.a(new Exception("Required cryptographic algorithm not supported by device.", e11));
        } catch (BadPaddingException e12) {
            x(sharedPreferences, fVar, e12, "Bad padding, wrong key for cipher algorithm");
        } catch (IllegalBlockSizeException e13) {
            x(sharedPreferences, fVar, e13, "Illegal block size, wrong cipher configuration");
        } catch (Exception e14) {
            Log.e("FlutterSecureStorage", "Failed to initialize storage cipher", e14);
            fVar.a(e14);
        }
    }

    public final boolean D(String str) {
        return str != null && str.contains("BIOMETRIC");
    }

    public boolean E() {
        BiometricManager biometricManager = (BiometricManager) this.f26396b.getSystemService(BiometricManager.class);
        return biometricManager != null && biometricManager.canAuthenticate(32783) == 0 && F();
    }

    public boolean F() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f26396b.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }

    public final void G(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, boolean z10, boolean z11, ca.f fVar) {
        Log.i("FlutterSecureStorage", "Starting biometric migration (authentication required)...");
        Log.i("FlutterSecureStorage", "Migration direction: FROM biometric=" + z10 + ", TO biometric=" + z11);
        try {
            if (z10 && !z11) {
                Log.i("FlutterSecureStorage", "You will be prompted to authenticate with your OLD biometric settings to decrypt existing data.");
                J(sharedPreferences, sharedPreferences2, fVar);
            } else if (z10 || !z11) {
                Log.i("FlutterSecureStorage", "You will be prompted to authenticate twice (once for decrypt, once for encrypt).");
                H(sharedPreferences, sharedPreferences2, fVar);
            } else {
                Log.i("FlutterSecureStorage", "You will be prompted to authenticate with your NEW biometric settings to encrypt data.");
                L(sharedPreferences, sharedPreferences2, fVar);
            }
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Biometric migration failed", e10);
            fVar.a(new Exception("Biometric migration failed", e10));
        }
    }

    public final void H(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
        try {
            Log.d("FlutterSecureStorage", "Step 1/7: Getting saved biometric cipher...");
            Cipher cipherC = this.f26399e.e(this.f26396b).c(this.f26396b);
            try {
                if (cipherC == null) {
                    throw new Exception("Failed to get saved biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with OLD biometric cipher to decrypt data...");
                n(cipherC, new e(cipherC, sharedPreferences2, sharedPreferences, fVar));
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric-to-biometric migration", exc);
        fVar.a(exc);
    }

    public final void I(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
        ca.f fVar2;
        Exception exc;
        Log.i("FlutterSecureStorage", "Starting data migration from saved to current cipher algorithms...");
        try {
            String string = this.f26399e.e(this.f26396b).toString();
            String strF = this.f26395a.f();
            boolean zD = D(string);
            boolean zD2 = D(strF);
            if (zD || zD2) {
                Log.i("FlutterSecureStorage", "Detected biometric migration: FROM=" + string + ", TO=" + strF);
                fVar2 = fVar;
                try {
                    G(sharedPreferences, sharedPreferences2, zD, zD2, fVar2);
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } else {
                try {
                    Log.i("FlutterSecureStorage", "Detected non-biometric migration: FROM=" + string + ", TO=" + strF);
                    M(sharedPreferences, sharedPreferences2, fVar);
                    return;
                } catch (Exception e11) {
                    exc = e11;
                    fVar2 = fVar;
                }
            }
        } catch (Exception e12) {
            e = e12;
            fVar2 = fVar;
        }
        exc = e;
        Log.e("FlutterSecureStorage", "Failed to start migration", exc);
        fVar2.a(new Exception("Migration initialization failed", exc));
    }

    public final void J(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
        try {
            Log.d("FlutterSecureStorage", "Step 1/6: Getting saved biometric cipher...");
            Cipher cipherC = this.f26399e.e(this.f26396b).c(this.f26396b);
            try {
                if (cipherC == null) {
                    throw new Exception("Failed to get saved biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with OLD biometric cipher to decrypt data...");
                n(cipherC, new c(cipherC, sharedPreferences2, sharedPreferences, fVar));
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
        }
        Exception exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric migration", exc);
        fVar.a(exc);
    }

    public final void K(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        int i10 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value instanceof String) {
                String str = (String) value;
                if (key.contains(this.f26395a.g())) {
                    sharedPreferences2.edit().putString(key, Base64.encodeToString(this.f26398d.a(str.getBytes(f26394f)), 0)).apply();
                    sharedPreferences.edit().remove(key).apply();
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Migrated key: ");
                    sb2.append(key.replaceFirst(this.f26395a.g() + '_', ""));
                    Log.d("FlutterSecureStorage", sb2.toString());
                }
            }
        }
        Log.i("FlutterSecureStorage", "Migration complete: " + i10 + " items migrated from EncryptedSharedPreferences to custom cipher storage");
    }

    public final void L(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
        ca.f fVar2;
        Exception exc;
        try {
            Log.d("FlutterSecureStorage", "Step 1/6: Decrypting all data with saved non-biometric cipher...");
            j jVarF = this.f26399e.f(this.f26396b, null);
            Map mapQ = q(sharedPreferences2, jVarF);
            Log.d("FlutterSecureStorage", "Step 2/6: Deleting old RSA key from Android KeyStore...");
            if (this.f26399e.a()) {
                try {
                    this.f26399e.e(this.f26396b).b();
                    jVarF.c(this.f26396b);
                    Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                } catch (Exception e10) {
                    try {
                        Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                    } catch (Exception e11) {
                        exc = e11;
                        fVar2 = fVar;
                    }
                }
            }
            Log.d("FlutterSecureStorage", "Step 3/6: Updating algorithm markers to current...");
            S(sharedPreferences);
            Log.d("FlutterSecureStorage", "Step 4/6: Getting current biometric cipher...");
            Cipher cipherC = this.f26399e.c(this.f26396b).c(this.f26396b);
            try {
                if (cipherC == null) {
                    throw new Exception("Failed to get current biometric cipher");
                }
                Log.i("FlutterSecureStorage", "Authenticating with NEW biometric cipher to encrypt data...");
                n(cipherC, new d(cipherC, mapQ, sharedPreferences2, fVar));
                return;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            fVar2 = fVar;
        }
        exc = e;
        Log.e("FlutterSecureStorage", "Failed to initialize biometric migration", exc);
        fVar2.a(exc);
    }

    public final void M(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, ca.f fVar) {
        Log.i("FlutterSecureStorage", "Starting non-biometric migration (no authentication required)...");
        try {
            Log.d("FlutterSecureStorage", "Step 1/6: Initializing saved cipher...");
            j jVarF = this.f26399e.f(this.f26396b, null);
            Log.d("FlutterSecureStorage", "Step 2/6: Decrypting all data with saved cipher...");
            Map mapQ = q(sharedPreferences2, jVarF);
            Log.d("FlutterSecureStorage", "Step 3/6: Deleting old RSA key from Android KeyStore...");
            if (this.f26399e.a()) {
                try {
                    this.f26399e.e(this.f26396b).b();
                    jVarF.c(this.f26396b);
                    Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                } catch (Exception e10) {
                    Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                }
            }
            Log.d("FlutterSecureStorage", "Step 4/6: Updating algorithm markers to current...");
            S(sharedPreferences);
            Log.d("FlutterSecureStorage", "Step 5/6: Initializing current cipher with fresh AES key...");
            j jVarD = this.f26399e.d(this.f26396b, null);
            if (mapQ.isEmpty()) {
                Log.i("FlutterSecureStorage", "Step 6/6: No data to migrate, continuing...");
            } else {
                Log.d("FlutterSecureStorage", "Step 6/6: Encrypting all data with current cipher...");
                u(mapQ, sharedPreferences2, jVarD);
            }
            this.f26398d = jVarD;
            Log.i("FlutterSecureStorage", "Non-biometric migration completed successfully! Migrated " + mapQ.size() + " items.");
            fVar.onSuccess(null);
        } catch (Exception e11) {
            Log.e("FlutterSecureStorage", "Non-biometric migration failed", e11);
            fVar.a(new Exception("Non-biometric migration failed", e11));
        }
    }

    public String N(String str) throws Exception {
        try {
            return Q(str);
        } catch (Exception e10) {
            if (this.y("read", str, e10)) {
                return this.Q(str);
            }
            throw e10;
        }
    }

    public Map O() throws Exception {
        try {
            return P();
        } catch (Exception e10) {
            if (this.y("readAll", null, e10)) {
                return this.P();
            }
            throw e10;
        }
    }

    public final Map P() {
        Map<String, ?> all = this.f26397c.getAll();
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f26395a.g())) {
                String strReplaceFirst = entry.getKey().replaceFirst(this.f26395a.g() + '_', "");
                if (!this.f26395a.j() || this.f26395a.l()) {
                    map.put(strReplaceFirst, p((String) entry.getValue()));
                } else {
                    map.put(strReplaceFirst, (String) entry.getValue());
                }
            }
        }
        return map;
    }

    public final String Q(String str) {
        String string = this.f26397c.getString(str, null);
        return (!this.f26395a.j() || this.f26395a.l()) ? p(string) : string;
    }

    public final void R(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("ENCRYPTED_PREFERENCES_MIGRATED", true);
        editorEdit.commit();
    }

    public final void S(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.f26399e.i(editorEdit);
        editorEdit.commit();
        Log.d("FlutterSecureStorage", "Algorithm markers updated to current");
    }

    public void T(String str, String str2) throws Exception {
        try {
            U(str, str2);
        } catch (Exception e10) {
            if (!y("write", str, e10)) {
                throw e10;
            }
            U(str, str2);
        }
    }

    public final void U(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f26397c.edit();
        if (!this.f26395a.j() || this.f26395a.l()) {
            editorEdit.putString(str, Base64.encodeToString(this.f26398d.a(str2.getBytes(f26394f)), 0));
        } else {
            editorEdit.putString(str, str2);
        }
        editorEdit.apply();
    }

    public String m(String str) {
        return this.f26395a.g() + "_" + str;
    }

    public final void n(Cipher cipher, ca.f fVar) throws Exception {
        v(this.f26395a.c());
        BiometricPrompt.CryptoObject cryptoObject = new BiometricPrompt.CryptoObject(cipher);
        BiometricPrompt.Builder subtitle = new BiometricPrompt.Builder(this.f26396b).setTitle(this.f26395a.a()).setSubtitle(this.f26395a.d());
        subtitle.setAllowedAuthenticators(32783);
        subtitle.build().authenticate(cryptoObject, new CancellationSignal(), Executors.newSingleThreadExecutor(), new g(fVar));
    }

    public boolean o(String str) {
        return this.f26397c.contains(str);
    }

    public final String p(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f26398d.b(Base64.decode(str, 0)), f26394f);
    }

    public final Map q(SharedPreferences sharedPreferences, j jVar) throws Exception {
        HashMap map = new HashMap();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ((value instanceof String) && key.contains(this.f26395a.g())) {
                try {
                    map.put(key, new String(jVar.b(Base64.decode((String) value, 0)), f26394f));
                    i10++;
                } catch (Exception e10) {
                    Log.e("FlutterSecureStorage", "Failed to decrypt key: " + key, e10);
                    throw new Exception("Failed to decrypt existing data with saved cipher for key: " + key, e10);
                }
            }
        }
        Log.d("FlutterSecureStorage", "Successfully decrypted " + i10 + " items with saved cipher");
        return map;
    }

    public void r(String str) {
        SharedPreferences.Editor editorEdit = this.f26397c.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public void s() {
        SharedPreferences.Editor editorEdit = this.f26397c.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final void t(SharedPreferences sharedPreferences, ca.f fVar) {
        try {
            try {
                this.f26399e.c(this.f26396b).b();
                Log.i("FlutterSecureStorage", "Deleted key from AndroidKeyStore");
            } catch (Exception e10) {
                Log.w("FlutterSecureStorage", "Failed to delete key from AndroidKeyStore (may not exist)", e10);
            }
            this.f26396b.getSharedPreferences(this.f26395a.h(), 0).edit().clear().apply();
            Log.d("FlutterSecureStorage", "Deleted all encrypted data");
            this.f26396b.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().clear().apply();
            Log.d("FlutterSecureStorage", "Deleted wrapped keys from SharedPreferences");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f26399e.i(editorEdit);
            editorEdit.apply();
            Log.d("FlutterSecureStorage", "Updated algorithm markers to current");
            Log.w("FlutterSecureStorage", "All data deleted. Reinitializing with new algorithm...");
            C(sharedPreferences, fVar);
        } catch (Exception e11) {
            Log.e("FlutterSecureStorage", "Failed to clean up after key mismatch", e11);
            fVar.a(e11);
        }
    }

    public final void u(Map map, SharedPreferences sharedPreferences, j jVar) throws Exception {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            try {
                editorEdit.putString((String) entry.getKey(), Base64.encodeToString(jVar.a(((String) entry.getValue()).getBytes(f26394f)), 0));
                i10++;
            } catch (Exception e10) {
                Log.e("FlutterSecureStorage", "Failed to encrypt key: " + ((String) entry.getKey()), e10);
                throw new Exception("Failed to encrypt data with current cipher for key: " + ((String) entry.getKey()), e10);
            }
        }
        editorEdit.apply();
        Log.d("FlutterSecureStorage", "Successfully encrypted and saved " + i10 + " items with current cipher");
    }

    public final void v(boolean z10) throws Exception {
        if (!F()) {
            if (z10) {
                throw new Exception("BIOMETRIC_UNAVAILABLE: Device has no PIN, pattern, password, or biometric enrolled. Please secure your device in Settings.");
            }
            Log.w("FlutterSecureStorage", "Device has no security. Biometric authentication will be skipped (enforceBiometrics=false).");
            return;
        }
        BiometricManager biometricManager = (BiometricManager) this.f26396b.getSystemService(BiometricManager.class);
        if (biometricManager == null) {
            if (z10) {
                throw new Exception("BIOMETRIC_UNAVAILABLE: BiometricManager not available on this device");
            }
            return;
        }
        int iCanAuthenticate = biometricManager.canAuthenticate(32783);
        if (iCanAuthenticate != 0) {
            if (iCanAuthenticate != 1) {
                if (iCanAuthenticate != 11) {
                    if (iCanAuthenticate != 12) {
                        if (iCanAuthenticate != 15) {
                            if (z10) {
                                throw new Exception("BIOMETRIC_UNAVAILABLE: Unknown biometric status (code: " + iCanAuthenticate + ")");
                            }
                        } else if (z10) {
                            throw new Exception("BIOMETRIC_UNAVAILABLE: Security update required for biometric authentication");
                        }
                    } else if (z10) {
                        throw new Exception("BIOMETRIC_UNAVAILABLE: No biometric hardware detected on this device");
                    }
                } else if (z10) {
                    throw new Exception("BIOMETRIC_UNAVAILABLE: No fingerprint or face enrolled. Please enroll in Settings.");
                }
            } else if (z10) {
                throw new Exception("BIOMETRIC_UNAVAILABLE: Biometric hardware temporarily unavailable");
            }
            Log.w("FlutterSecureStorage", "Biometric check failed with code " + iCanAuthenticate + ", but continuing (enforceBiometrics=false)");
        }
    }

    public final Boolean w(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean("ENCRYPTED_PREFERENCES_MIGRATED", false));
    }

    public final void x(SharedPreferences sharedPreferences, ca.f fVar, Exception exc, String str) {
        Log.e("FlutterSecureStorage", "Key mismatch detected during cipher initialization: " + str, exc);
        Log.e("FlutterSecureStorage", "This typically occurs after an algorithm change.");
        Log.e("FlutterSecureStorage", "Stored key cannot be decrypted with current algorithm.");
        if (this.f26395a.l()) {
            Log.i("FlutterSecureStorage", "migrateOnAlgorithmChange is enabled. Attempting data migration...");
            I(sharedPreferences, this.f26396b.getSharedPreferences(this.f26395a.h(), 0), new f(sharedPreferences, fVar, str));
            return;
        }
        Log.w("FlutterSecureStorage", "migrateOnAlgorithmChange is disabled. Skipping data migration.");
        if (this.f26395a.k()) {
            Log.w("FlutterSecureStorage", "resetOnError is enabled. Deleting all data and keys to recover.");
            t(sharedPreferences, fVar);
        } else {
            Log.e("FlutterSecureStorage", "Set resetOnError=true to automatically delete data and recover.");
            Log.e("FlutterSecureStorage", "Or set migrateOnAlgorithmChange=true to preserve data during algorithm changes.");
            fVar.a(new Exception(String.format("Key mismatch after algorithm change (%s). Enable migrateOnAlgorithmChange=true to preserve data, or resetOnError=true to delete.", str), exc));
        }
    }

    public final boolean y(String str, String str2, Exception exc) {
        String str3;
        boolean zK = this.f26395a.k();
        if (str2 != null) {
            str3 = "key '" + str2 + "'";
        } else {
            str3 = "all data";
        }
        Log.e("FlutterSecureStorage", String.format("Storage operation '%s' failed for %s. %s", str, str3, zK ? "Attempting to delete corrupted data and retry..." : "Set resetOnError=true to automatically delete corrupted data."), exc);
        if (!zK) {
            return false;
        }
        try {
            if (str2 != null) {
                r(str2);
            } else {
                s();
            }
            Log.w("FlutterSecureStorage", String.format("%s completed. Retrying operation...", str2 != null ? "Data for key has been deleted" : "All data has been deleted"));
            return true;
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", String.format("Failed to %s during error handling.", str2 != null ? "delete data for key" : "delete all data"), e10);
            return false;
        }
    }

    public final boolean z(SharedPreferences sharedPreferences) {
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            if (it.next().contains(this.f26395a.g())) {
                return true;
            }
        }
        return false;
    }
}
