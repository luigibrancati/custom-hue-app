package Va;

import fc.AbstractC4040w;
import fc.C4022e;
import gc.C4202o;
import gc.Q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0011J\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0011J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0011J\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0011J\u001f\u0010\"\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0011J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0011J\u001f\u0010$\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0011J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0011J\u001f\u0010&\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0011J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0011J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u0011R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010*¨\u0006,"}, d2 = {"LVa/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "b", "c", "", "dartAlgo", "a", "(Ljava/lang/String;)Ljava/lang/String;", "dartMacAlgo", "", "d", "(Ljava/lang/String;)Ljava/lang/Integer;", "e", "m", "f", "g", "h", "i", "j", "k", "l", "p", "q", "n", "o", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "cryptography_flutter_plus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    public final String a(String dartAlgo) {
        if (AbstractC4862t.a(dartAlgo, "AES_GCM")) {
            return "AES/GCM/NoPadding";
        }
        if (AbstractC4862t.a(dartAlgo, "CHACHA20_POLY1305_AEAD")) {
            return "ChaCha20/Poly1305/NoPadding";
        }
        return null;
    }

    public final void b(MethodCall call, MethodChannel.Result result) {
        Provider[] providers = Security.getProviders();
        ArrayList arrayList = new ArrayList();
        Iterator itA = AbstractC4846c.a(providers);
        while (itA.hasNext()) {
            Provider provider = (Provider) itA.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("name", provider.getName());
            linkedHashMap.put("info", provider.getInfo());
            linkedHashMap.put("version", Double.valueOf(provider.getVersion()));
            linkedHashMap.put("className", provider.getClass().getName());
            ArrayList arrayList2 = new ArrayList();
            for (Provider.Service service : provider.getServices()) {
                arrayList2.add(Q.k(AbstractC4040w.a("type", service.getType()), AbstractC4040w.a("name", service.getAlgorithm())));
            }
            linkedHashMap.put("services", arrayList2);
            arrayList.add(linkedHashMap);
        }
        result.success(arrayList);
    }

    public final void c(MethodCall call, MethodChannel.Result result) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object obj = call.arguments;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
        Object objNewInstance = Class.forName((String) obj).getConstructor(null).newInstance(null);
        AbstractC4862t.c(objNewInstance, "null cannot be cast to non-null type java.security.Provider");
        Security.addProvider((Provider) objNewInstance);
    }

    public final Integer d(String dartMacAlgo) {
        return (AbstractC4862t.a(dartMacAlgo, "AES_GCM") || AbstractC4862t.a(dartMacAlgo, "CHACHA20_POLY1305_AEAD")) ? 16 : null;
    }

    public final void e(MethodCall call, MethodChannel.Result result) throws NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str = (String) call.argument("algo");
        String strA = a(str);
        Integer numD = d(str);
        if (strA == null || numD == null) {
            result.error("UNSUPPORTED_ALGORITHM", "cryptography_flutter does not support algorithm " + str + " in Android.", null);
            return;
        }
        try {
            Cipher cipher = Cipher.getInstance(strA);
            AbstractC4862t.d(cipher, "getInstance(...)");
            Object objArgument = call.argument("data");
            AbstractC4862t.b(objArgument);
            byte[] bArr = (byte[]) objArgument;
            Object objArgument2 = call.argument("key");
            AbstractC4862t.b(objArgument2);
            byte[] bArr2 = (byte[]) objArgument2;
            Object objArgument3 = call.argument("nonce");
            AbstractC4862t.b(objArgument3);
            byte[] bArr3 = (byte[]) objArgument3;
            byte[] bArr4 = (byte[]) call.argument("aad");
            byte[] bArr5 = (byte[]) call.argument("mac");
            cipher.init(2, new SecretKeySpec(bArr2, strA), AbstractC4862t.a(str, "AES_GCM") ? new GCMParameterSpec(128, bArr3) : new IvParameterSpec(bArr3));
            if (bArr4 != null) {
                cipher.updateAAD(bArr4);
            }
            cipher.update(bArr);
            try {
                result.success(Q.k(AbstractC4040w.a("clearText", cipher.doFinal(bArr5))));
            } catch (AEADBadTagException e10) {
                result.error("INCORRECT_MAC", "Caught error when decrypting " + strA + ": " + e10.getMessage(), null);
            } catch (BadPaddingException e11) {
                result.error("INCORRECT_PADDING", "Caught error when decrypting " + strA + ": " + e11.getMessage(), null);
            } catch (Throwable th) {
                result.error("CAUGHT_ERROR", "Caught error when decrypting " + strA + ": " + th.getMessage(), null);
            }
        } catch (NoSuchAlgorithmException unused) {
            result.error("UNSUPPORTED_ALGORITHM", "Your version of Android does not support " + strA + '.', null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(io.flutter.plugin.common.MethodCall r4, io.flutter.plugin.common.MethodChannel.Result r5) throws java.security.InvalidAlgorithmParameterException {
        /*
            r3 = this;
            java.lang.String r3 = "curve"
            java.lang.Object r3 = r4.argument(r3)
            kotlin.jvm.internal.AbstractC4862t.b(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r0 = r3.hashCode()
            r1 = 3386339(0x33abe3, float:4.745272E-39)
            r2 = 0
            if (r0 == r1) goto L38
            r1 = 3387391(0x33afff, float:4.746746E-39)
            if (r0 == r1) goto L2c
            r1 = 3389124(0x33b6c4, float:4.749174E-39)
            if (r0 == r1) goto L20
            goto L40
        L20:
            java.lang.String r0 = "p521"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L29
            goto L40
        L29:
            java.lang.String r3 = "secp521r1"
            goto L44
        L2c:
            java.lang.String r0 = "p384"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L35
            goto L40
        L35:
            java.lang.String r3 = "secp384r1"
            goto L44
        L38:
            java.lang.String r0 = "p256"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
        L40:
            r3 = r2
            goto L44
        L42:
            java.lang.String r3 = "prime256v1"
        L44:
            if (r3 != 0) goto L4c
            java.lang.String r3 = "UNSUPPORTED_ALGORITHM"
            r5.error(r3, r2, r2)
            return
        L4c:
            java.lang.String r0 = "androidProvider"
            java.lang.Object r4 = r4.argument(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "EC"
            if (r4 != 0) goto L5d
            java.security.KeyPairGenerator r4 = java.security.KeyPairGenerator.getInstance(r0)
            goto L61
        L5d:
            java.security.KeyPairGenerator r4 = java.security.KeyPairGenerator.getInstance(r0, r4)
        L61:
            java.security.spec.ECGenParameterSpec r0 = new java.security.spec.ECGenParameterSpec
            r0.<init>(r3)
            r4.initialize(r0)
            java.security.KeyPair r3 = r4.generateKeyPair()
            java.security.PrivateKey r4 = r3.getPrivate()
            java.lang.String r0 = "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey"
            kotlin.jvm.internal.AbstractC4862t.c(r4, r0)
            java.security.interfaces.ECPrivateKey r4 = (java.security.interfaces.ECPrivateKey) r4
            java.security.PublicKey r3 = r3.getPublic()
            java.lang.String r0 = "null cannot be cast to non-null type java.security.interfaces.ECPublicKey"
            kotlin.jvm.internal.AbstractC4862t.c(r3, r0)
            java.security.interfaces.ECPublicKey r3 = (java.security.interfaces.ECPublicKey) r3
            java.math.BigInteger r4 = r4.getS()
            byte[] r4 = r4.toByteArray()
            java.lang.String r0 = "d"
            fc.q r4 = fc.AbstractC4040w.a(r0, r4)
            java.security.spec.ECPoint r0 = r3.getW()
            java.math.BigInteger r0 = r0.getAffineX()
            byte[] r0 = r0.toByteArray()
            java.lang.String r1 = "x"
            fc.q r0 = fc.AbstractC4040w.a(r1, r0)
            java.security.spec.ECPoint r3 = r3.getW()
            java.math.BigInteger r3 = r3.getAffineY()
            byte[] r3 = r3.toByteArray()
            java.lang.String r1 = "y"
            fc.q r3 = fc.AbstractC4040w.a(r1, r3)
            fc.q[] r3 = new fc.C4034q[]{r4, r0, r3}
            java.util.HashMap r3 = gc.Q.k(r3)
            r5.success(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.a.f(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(io.flutter.plugin.common.MethodCall r7, io.flutter.plugin.common.MethodChannel.Result r8) throws java.security.spec.InvalidKeySpecException, java.security.spec.InvalidParameterSpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.a.g(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(io.flutter.plugin.common.MethodCall r10, io.flutter.plugin.common.MethodChannel.Result r11) throws java.security.spec.InvalidKeySpecException, java.security.SignatureException, java.security.spec.InvalidParameterSpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.a.h(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(io.flutter.plugin.common.MethodCall r10, io.flutter.plugin.common.MethodChannel.Result r11) throws java.security.spec.InvalidKeySpecException, java.security.SignatureException, java.security.spec.InvalidParameterSpecException, java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.a.i(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public final void j(MethodCall call, MethodChannel.Result result) {
        result.error("UNSUPPORTED_ALGORITHM", null, null);
    }

    public final void k(MethodCall call, MethodChannel.Result result) {
        result.error("UNSUPPORTED_ALGORITHM", null, null);
    }

    public final void l(MethodCall call, MethodChannel.Result result) {
        result.error("UNSUPPORTED_ALGORITHM", null, null);
    }

    public final void m(MethodCall call, MethodChannel.Result result) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str = (String) call.argument("algo");
        String strA = a(str);
        Integer numD = d(str);
        if (strA == null || numD == null) {
            result.error("UNSUPPORTED_ALGORITHM", "cryptography_flutter does not support algorithm " + str + " in Android.", null);
            return;
        }
        try {
            Cipher cipher = Cipher.getInstance(strA);
            AbstractC4862t.d(cipher, "getInstance(...)");
            Object objArgument = call.argument("data");
            AbstractC4862t.b(objArgument);
            byte[] bArr = (byte[]) objArgument;
            byte[] bArr2 = (byte[]) call.argument("key");
            byte[] bArr3 = (byte[]) call.argument("nonce");
            byte[] bArr4 = (byte[]) call.argument("aad");
            cipher.init(1, new SecretKeySpec(bArr2, strA), AbstractC4862t.a(str, "AES_GCM") ? new GCMParameterSpec(numD.intValue() * 8, bArr3) : new IvParameterSpec(bArr3));
            if (bArr4 != null) {
                cipher.updateAAD(bArr4);
            }
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            int length = bArrDoFinal.length - numD.intValue();
            AbstractC4862t.b(bArrDoFinal);
            result.success(Q.k(AbstractC4040w.a("cipherText", C4202o.s(bArrDoFinal, 0, length)), AbstractC4040w.a("mac", C4202o.s(bArrDoFinal, length, bArrDoFinal.length))));
        } catch (NoSuchAlgorithmException unused) {
            result.error("UNSUPPORTED_ALGORITHM", "Your version of Android does not support " + strA + '.', null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(MethodCall call, MethodChannel.Result result) throws NoSuchAlgorithmException, InvalidKeyException {
        String str;
        Object objArgument = call.argument("hash");
        AbstractC4862t.b(objArgument);
        String str2 = (String) objArgument;
        switch (str2.hashCode()) {
            case -1523887821:
                str = !str2.equals("SHA-224") ? null : "HmacSHA224";
                break;
            case -1523887726:
                str = !str2.equals("SHA-256") ? null : "HmacSHA256";
                break;
            case -1523886674:
                str = !str2.equals("SHA-384") ? null : "HmacSHA384";
                break;
            case -1523884971:
                str = !str2.equals("SHA-512") ? null : "HmacSHA512";
                break;
            case 78861104:
                str = !str2.equals("SHA-1") ? null : "HmacSHA1";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            result.error("UNSUPPORTED_ALGORITHM", null, null);
            return;
        }
        Object objArgument2 = call.argument("key");
        AbstractC4862t.b(objArgument2);
        Object objArgument3 = call.argument("data");
        AbstractC4862t.b(objArgument3);
        Mac mac = Mac.getInstance(str);
        mac.init(new SecretKeySpec((byte[]) objArgument2, str));
        result.success(Q.k(AbstractC4040w.a("mac", mac.doFinal((byte[]) objArgument3))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void o(MethodCall call, MethodChannel.Result result) {
        String str;
        Object objArgument = call.argument("mac");
        AbstractC4862t.b(objArgument);
        String str2 = (String) objArgument;
        switch (str2.hashCode()) {
            case -714840245:
                str = !str2.equals("HMAC-SHA1") ? null : "PBKDF2WithHmacSHA1";
                break;
            case 233294478:
                str = !str2.equals("HMAC-SHA224") ? null : "PBKDF2WithHmacSHA224";
                break;
            case 233294573:
                str = !str2.equals("HMAC-SHA256") ? null : "PBKDF2WithHmacSHA256";
                break;
            case 233295625:
                str = !str2.equals("HMAC-SHA384") ? null : "PBKDF2WithHmacSHA384";
                break;
            case 233297328:
                str = !str2.equals("HMAC-SHA512") ? null : "PBKDF2WithHmacSHA512";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            result.error("UNSUPPORTED_ALGORITHM", null, null);
            return;
        }
        Object objArgument2 = call.argument("bits");
        AbstractC4862t.b(objArgument2);
        int iIntValue = ((Number) objArgument2).intValue();
        Object objArgument3 = call.argument("iterations");
        AbstractC4862t.b(objArgument3);
        int iIntValue2 = ((Number) objArgument3).intValue();
        Object objArgument4 = call.argument("password");
        AbstractC4862t.b(objArgument4);
        String str3 = (String) objArgument4;
        Object objArgument5 = call.argument("nonce");
        AbstractC4862t.b(objArgument5);
        byte[] bArr = (byte[]) objArgument5;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(str);
            AbstractC4862t.d(secretKeyFactory, "getInstance(...)");
            char[] charArray = str3.toCharArray();
            AbstractC4862t.d(charArray, "toCharArray(...)");
            result.success(Q.k(AbstractC4040w.a("hash", secretKeyFactory.generateSecret(new PBEKeySpec(charArray, bArr, iIntValue2, iIntValue)).getEncoded())));
        } catch (NoSuchAlgorithmException unused) {
            result.error("UNSUPPORTED_ALGORITHM", null, null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "cryptography_flutter");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        try {
            String str = call.method;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1981324781:
                        if (str.equals("Ecdsa.newKeyPair")) {
                            f(call, result);
                            return;
                        }
                        break;
                    case -1875870779:
                        if (str.equals("Ecdh.newKeyPair")) {
                            f(call, result);
                            return;
                        }
                        break;
                    case -1663927927:
                        if (str.equals("X25519.sign")) {
                            q(call, result);
                            return;
                        }
                        break;
                    case -1607257499:
                        if (str.equals("encrypt")) {
                            m(call, result);
                            return;
                        }
                        break;
                    case -1435734736:
                        if (str.equals("Ed25519.sign")) {
                            k(call, result);
                            return;
                        }
                        break;
                    case -994710377:
                        if (str.equals("pbkdf2")) {
                            o(call, result);
                            return;
                        }
                        break;
                    case -974059732:
                        if (str.equals("Ed25519.verify")) {
                            l(call, result);
                            return;
                        }
                        break;
                    case -830265742:
                        if (str.equals("androidCryptoProviders")) {
                            b(call, result);
                            return;
                        }
                        break;
                    case -82709172:
                        if (str.equals("Ed25519.newKeyPair")) {
                            j(call, result);
                            return;
                        }
                        break;
                    case 3206119:
                        if (str.equals("hmac")) {
                            n(call, result);
                            return;
                        }
                        break;
                    case 270003407:
                        if (str.equals("androidCryptoProvidersAdd")) {
                            c(call, result);
                            return;
                        }
                        break;
                    case 770226999:
                        if (str.equals("Ecdsa.sign")) {
                            h(call, result);
                            return;
                        }
                        break;
                    case 935959269:
                        if (str.equals("X25519.newKeyPair")) {
                            p(call, result);
                            return;
                        }
                        break;
                    case 1536290675:
                        if (str.equals("Ecdsa.verify")) {
                            i(call, result);
                            return;
                        }
                        break;
                    case 1542543757:
                        if (str.equals("decrypt")) {
                            e(call, result);
                            return;
                        }
                        break;
                    case 1886037630:
                        if (str.equals("Ecdh.sharedSecretKey")) {
                            g(call, result);
                            return;
                        }
                        break;
                }
            }
            result.notImplemented();
        } catch (Throwable th) {
            result.error("CAUGHT_ERROR", "Unexpected error " + th + ": " + th.getMessage() + "\nCause: " + th.getCause() + "\nStack stace:\n" + C4022e.b(th), null);
        }
    }

    public final void p(MethodCall call, MethodChannel.Result result) {
        result.error("UNSUPPORTED_ALGORITHM", null, null);
    }

    public final void q(MethodCall call, MethodChannel.Result result) {
        result.error("UNSUPPORTED_ALGORITHM", null, null);
    }
}
