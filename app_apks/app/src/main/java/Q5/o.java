package Q5;

import android.annotation.TargetApi;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import fc.C4032o;
import gc.C4179C;
import gc.C4202o;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.protocol.App;
import io.sentry.protocol.FeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J7\u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0007J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0012J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0012J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u0012J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0007J!\u0010-\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0007J\u000f\u00105\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u0007J\u0015\u00107\u001a\u0004\u0018\u000106*\u00020\bH\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010:\u001a\u0002092\u0006\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010\u0007J\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u001aH\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020\u001aH\u0002¢\u0006\u0004\bD\u0010BJ\u0019\u0010G\u001a\u00020\f2\b\b\u0001\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\f2\b\b\u0001\u0010I\u001a\u00020EH\u0016¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010\u0007J\u0017\u0010M\u001a\u00020\f2\u0006\u0010I\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010I\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010NJ\u000f\u0010P\u001a\u00020\fH\u0016¢\u0006\u0004\bP\u0010\u0007J#\u0010T\u001a\u00020\f2\b\b\u0001\u0010R\u001a\u00020Q2\b\b\u0001\u0010S\u001a\u00020\u000fH\u0016¢\u0006\u0004\bT\u0010UJ/\u0010[\u001a\u00020\u00142\u0006\u0010V\u001a\u00020\u001d2\u000e\u0010X\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010^\u001a\u00020\f2\b\u0010]\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b^\u0010_J\u0019\u0010`\u001a\u00020\f2\b\u0010]\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020\fH\u0016¢\u0006\u0004\ba\u0010\u0007J\u0017\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020\u001dH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u0019\u0010j\u001a\u00020\f2\b\u0010i\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\bj\u0010_J\u0019\u0010l\u001a\u00020\f2\b\u0010i\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ!\u0010o\u001a\u00020\f2\u0006\u0010i\u001a\u00020\u001d2\b\u0010n\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\fH\u0016¢\u0006\u0004\bq\u0010\u0007R\u0018\u0010t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010z\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\by\u0010\u0015R\u0014\u0010|\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b{\u0010\u0015R\u0014\u0010~\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b}\u0010\u0015R\u0015\u0010\u0080\u0001\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u007f\u0010\u0015R\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010'R\u0018\u0010\u0085\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0015R\u0017\u0010\u0088\u0001\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b$\u0010\u008a\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008a\u0001R\u0018\u0010\u0096\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b4\u0010\u008a\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u008a\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008a\u0001R\u0018\u0010\u009a\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u008a\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u008a\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008a\u0001R\u0018\u0010\u009e\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010\u008a\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u008a\u0001R\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010¡\u0001R\u001b\u0010¥\u0001\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010¤\u0001R\u001b\u0010¨\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b/\u0010§\u0001R\"\u0010¬\u0001\u001a\f\u0012\u0005\u0012\u00030ª\u0001\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010«\u0001R\u001b\u0010®\u0001\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010°\u0001R\u001a\u0010²\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0087\u0001R\u0018\u0010³\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u008a\u0001R\u0018\u0010µ\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010´\u0001R\u0019\u0010¸\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010DR\u0018\u0010¹\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010DR\u0018\u0010º\u0001\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010·\u0001R\u0018\u0010»\u0001\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010·\u0001R\u0017\u0010¾\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010½\u0001R\u0017\u0010À\u0001\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010\u0087\u0001¨\u0006Á\u0001"}, d2 = {"LQ5/o;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Landroid/speech/RecognitionListener;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Lfc/H;", "E", "(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "v", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "", "I", "()Z", "A", "z", "B", "", "languageTag", "partialResults", "", "listenModeIndex", "onDevice", "O", "(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;ZIZ)V", "G", "Q", "m", "C", "isRecording", "D", "(Z)V", "H", "Landroid/os/Bundle;", "speechBundle", "isFinal", "S", "(Landroid/os/Bundle;Z)V", "y", "(Z)Z", "context", "x", "(Landroid/content/Context;)V", "o", "L", "Landroid/content/ComponentName;", "u", "(Landroid/content/Context;)Landroid/content/ComponentName;", "LQ5/f;", "listenMode", "p", "(ZLQ5/f;)V", "M", "(Ljava/lang/String;ZLQ5/f;Z)V", "s", "msg", "r", "(Ljava/lang/String;)V", "errorMsg", "J", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "onDetachedFromActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onReattachedToActivityForConfigChanges", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "Lio/flutter/plugin/common/MethodCall;", "call", "rawrResult", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "requestCode", "", App.JsonKeys.APP_PERMISSIONS, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "results", "onPartialResults", "(Landroid/os/Bundle;)V", "onResults", "onEndOfSpeech", "errorCode", "onError", "(I)V", "", "rmsdB", "onRmsChanged", "(F)V", "p0", "onReadyForSpeech", "", "onBufferReceived", "([B)V", "p1", "onEvent", "(ILandroid/os/Bundle;)V", "onBeginningOfSpeech", "a", "Landroid/content/Context;", "pluginContext", "Lio/flutter/plugin/common/MethodChannel;", "b", "Lio/flutter/plugin/common/MethodChannel;", "channel", "c", "minSdkForSpeechSupport", "d", "brokenStopSdk", "e", "minSdkForOnDeviceSpeechSupport", "f", "speechToTextPermissionCode", "", "g", "missingConfidence", "h", "speechThresholdRms", "i", "Ljava/lang/String;", "logTag", "j", "Z", "recognizerStops", "Landroid/app/Activity;", "k", "Landroid/app/Activity;", "currentActivity", "l", "Lio/flutter/plugin/common/MethodChannel$Result;", "activeResult", "initializedSuccessfully", "n", "permissionToRecordAudio", "listening", "debugLogging", "q", "alwaysUseStop", "intentLookup", "noBluetoothOpt", "t", "bluetoothDisabled", "resultSent", "lastOnDevice", "Landroid/speech/SpeechRecognizer;", "Landroid/speech/SpeechRecognizer;", "speechRecognizer", "Landroid/content/Intent;", "Landroid/content/Intent;", "recognizerIntent", "Landroid/bluetooth/BluetoothAdapter;", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "", "Landroid/bluetooth/BluetoothDevice;", "Ljava/util/Set;", "pairedDevices", "Landroid/bluetooth/BluetoothDevice;", "activeBluetooth", "Landroid/bluetooth/BluetoothHeadset;", "Landroid/bluetooth/BluetoothHeadset;", "bluetoothHeadset", "previousRecognizerLang", "previousPartialResults", "LQ5/f;", "previousListenMode", "", "F", "lastFinalTime", "speechStartTime", "minRms", "maxRms", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "P", "defaultLanguageTag", "speech_to_text_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@TargetApi(8)
public final class o implements MethodChannel.MethodCallHandler, RecognitionListener, PluginRegistry.RequestPermissionsResultListener, FlutterPlugin, ActivityAware {

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public BluetoothDevice activeBluetooth;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public BluetoothHeadset bluetoothHeadset;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public String previousRecognizerLang;

    /* JADX INFO: renamed from: F, reason: collision with root package name and from kotlin metadata */
    public long lastFinalTime;

    /* JADX INFO: renamed from: G, reason: collision with root package name and from kotlin metadata */
    public long speechStartTime;

    /* JADX INFO: renamed from: P, reason: collision with root package name and from kotlin metadata */
    public final String defaultLanguageTag;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Context pluginContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public Activity currentActivity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public MethodChannel.Result activeResult;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean initializedSuccessfully;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean permissionToRecordAudio;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean listening;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean debugLogging;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean alwaysUseStop;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean intentLookup;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean noBluetoothOpt;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public boolean resultSent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean lastOnDevice;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public SpeechRecognizer speechRecognizer;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Intent recognizerIntent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Set pairedDevices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int minSdkForSpeechSupport = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int brokenStopSdk = 29;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int minSdkForOnDeviceSpeechSupport = 31;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int speechToTextPermissionCode = 28521;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final double missingConfidence = -1.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int speechThresholdRms = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String logTag = "SpeechToTextPlugin";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean recognizerStops = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean bluetoothDisabled = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    public boolean previousPartialResults = true;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    public f previousListenMode = f.deviceDefault;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public float minRms = 1000.0f;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    public float maxRms = -100.0f;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements RecognitionSupportCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f13986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f13987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ L f13988c;

        public a(MethodChannel.Result result, o oVar, L l10) {
            this.f13986a = result;
            this.f13987b = oVar;
            this.f13988c = l10;
        }

        public void onError(int i10) {
            this.f13987b.r("error from checkRecognitionSupport: " + i10);
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.f13988c.f39776a;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
        }

        public void onSupportResult(RecognitionSupport recognitionSupport) {
            AbstractC4862t.e(recognitionSupport, "recognitionSupport");
            new e(this.f13986a, this.f13987b.debugLogging).b(recognitionSupport.getSupportedOnDeviceLanguages());
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) this.f13988c.f39776a;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements BluetoothProfile.ServiceListener {
        public b() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile proxy) {
            AbstractC4862t.e(proxy, "proxy");
            if (i10 == 1) {
                o.this.bluetoothHeadset = (BluetoothHeadset) proxy;
                o oVar = o.this;
                oVar.r("Found a headset: " + oVar.bluetoothHeadset);
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 == 1) {
                o.this.r("Clearing headset: ");
                o.this.bluetoothHeadset = null;
            }
        }
    }

    public o() {
        String languageTag = Locale.getDefault().toLanguageTag();
        AbstractC4862t.d(languageTag, "toLanguageTag(...)");
        this.defaultLanguageTag = languageTag;
    }

    public static final void F(o oVar, float f10) {
        MethodChannel methodChannel = oVar.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("soundLevelChange", Float.valueOf(f10));
        }
    }

    public static final void K(o oVar, JSONObject jSONObject) {
        MethodChannel methodChannel = oVar.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("notifyError", jSONObject.toString());
        }
    }

    public static final void N(o oVar, f fVar, boolean z10, String str, boolean z11) {
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        oVar.r("In RecognizerIntent apply");
        if (fVar == f.search) {
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        } else {
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        }
        oVar.r("put model");
        Context context = oVar.pluginContext;
        if (context != null) {
            intent.putExtra("calling_package", context.getApplicationInfo().packageName);
        }
        oVar.r("put package");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", z10);
        oVar.r("put partial");
        if (!AbstractC4862t.a(str, Locale.getDefault().toLanguageTag())) {
            intent.putExtra("android.speech.extra.LANGUAGE", str);
            oVar.r("put languageTag");
        }
        if (z11) {
            intent.putExtra("android.speech.extra.PREFER_OFFLINE", z11);
        }
        intent.putExtra("android.speech.extra.MAX_RESULTS", 10);
        oVar.recognizerIntent = intent;
    }

    public static final void P(o oVar) {
        SpeechRecognizer speechRecognizer = oVar.speechRecognizer;
        if (speechRecognizer != null) {
            speechRecognizer.startListening(oVar.recognizerIntent);
        }
    }

    public static final void R(o oVar) {
        SpeechRecognizer speechRecognizer = oVar.speechRecognizer;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
    }

    public static final void n(o oVar) {
        SpeechRecognizer speechRecognizer = oVar.speechRecognizer;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
    }

    public static final void q(o oVar, boolean z10) {
        oVar.r("Creating recognizer");
        if (oVar.intentLookup) {
            Context context = oVar.pluginContext;
            SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(context, context != null ? oVar.u(context) : null);
            oVar.r("Setting listener after intent lookup");
            speechRecognizerCreateSpeechRecognizer.setRecognitionListener(oVar);
            oVar.speechRecognizer = speechRecognizerCreateSpeechRecognizer;
        } else {
            if (z10) {
                Context context2 = oVar.pluginContext;
                AbstractC4862t.b(context2);
                if (SpeechRecognizer.isOnDeviceRecognitionAvailable(context2)) {
                    Context context3 = oVar.pluginContext;
                    AbstractC4862t.b(context3);
                    SpeechRecognizer speechRecognizerCreateOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context3);
                    oVar.r("Setting on device listener");
                    speechRecognizerCreateOnDeviceSpeechRecognizer.setRecognitionListener(oVar);
                    oVar.speechRecognizer = speechRecognizerCreateOnDeviceSpeechRecognizer;
                }
            }
            if (oVar.speechRecognizer == null) {
                SpeechRecognizer speechRecognizerCreateSpeechRecognizer2 = SpeechRecognizer.createSpeechRecognizer(oVar.pluginContext);
                oVar.r("Setting default listener");
                speechRecognizerCreateSpeechRecognizer2.setRecognitionListener(oVar);
                oVar.speechRecognizer = speechRecognizerCreateSpeechRecognizer2;
            }
        }
        if (oVar.speechRecognizer == null) {
            Log.e(oVar.logTag, "Speech recognizer null");
            MethodChannel.Result result = oVar.activeResult;
            if (result != null) {
                result.error("recognizerNotAvailable", "Speech recognizer null", "");
            }
            oVar.activeResult = null;
        }
    }

    public static final void t(o oVar) {
        oVar.r("Recognizer destroy");
        SpeechRecognizer speechRecognizer = oVar.speechRecognizer;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        oVar.speechRecognizer = null;
    }

    public final boolean A() {
        return !this.initializedSuccessfully;
    }

    public final boolean B() {
        return !this.listening;
    }

    public final void C(MethodChannel.Result result) {
        if (I()) {
            result.success(Boolean.FALSE);
            return;
        }
        Context context = this.pluginContext;
        AbstractC4862t.b(context);
        boolean z10 = L0.a.a(context, "android.permission.RECORD_AUDIO") == 0;
        if (Build.VERSION.SDK_INT < 33 || !z10) {
            Intent voiceDetailsIntent = RecognizerIntent.getVoiceDetailsIntent(this.pluginContext);
            if (voiceDetailsIntent == null) {
                voiceDetailsIntent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
                voiceDetailsIntent.setPackage("com.google.android.googlequicksearchbox");
            }
            Intent intent = voiceDetailsIntent;
            Context context2 = this.pluginContext;
            if (context2 != null) {
                context2.sendOrderedBroadcast(intent, null, new e(result, this.debugLogging), null, -1, null, null);
                return;
            }
            return;
        }
        Context context3 = this.pluginContext;
        AbstractC4862t.b(context3);
        if (SpeechRecognizer.isOnDeviceRecognitionAvailable(context3)) {
            L l10 = new L();
            Context context4 = this.pluginContext;
            AbstractC4862t.b(context4);
            SpeechRecognizer speechRecognizerCreateOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context4);
            AbstractC4862t.d(speechRecognizerCreateOnDeviceSpeechRecognizer, "createOnDeviceSpeechRecognizer(...)");
            l10.f39776a = speechRecognizerCreateOnDeviceSpeechRecognizer;
            Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) l10.f39776a;
            if (speechRecognizer != null) {
                speechRecognizer.checkRecognitionSupport(intent2, Executors.newSingleThreadExecutor(), new a(result, this, l10));
            }
        }
    }

    public final void D(boolean isRecording) {
        String str;
        if (this.listening == isRecording) {
            return;
        }
        this.listening = isRecording;
        if (isRecording) {
            str = "listening";
        } else {
            if (isRecording) {
                throw new C4032o();
            }
            str = "notListening";
        }
        r("Notify status:" + str);
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("notifyStatus", str);
        }
        if (isRecording) {
            return;
        }
        String str2 = !this.resultSent ? "doneNoResult" : "done";
        r("Notify status:" + str2);
        H();
        MethodChannel methodChannel2 = this.channel;
        if (methodChannel2 != null) {
            methodChannel2.invokeMethod("notifyStatus", str2);
        }
    }

    public final void E(Context applicationContext, BinaryMessenger messenger) {
        this.pluginContext = applicationContext;
        MethodChannel methodChannel = new MethodChannel(messenger, "plugin.csdcorp.com/speech_to_text");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public final void G() {
        if (this.bluetoothDisabled) {
            return;
        }
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        Set<BluetoothDevice> set = this.pairedDevices;
        BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
        if (bluetoothAdapter == null || bluetoothHeadset == null || set == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : set) {
            if (bluetoothHeadset.startVoiceRecognition(bluetoothDevice)) {
                r("Starting bluetooth voice recognition");
                this.activeBluetooth = bluetoothDevice;
                return;
            }
        }
    }

    public final void H() {
        if (this.bluetoothDisabled) {
            return;
        }
        BluetoothDevice bluetoothDevice = this.activeBluetooth;
        BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
        if (bluetoothDevice == null || bluetoothHeadset == null) {
            return;
        }
        r("Stopping bluetooth voice recognition");
        bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
        this.activeBluetooth = null;
    }

    public final boolean I() {
        return Build.VERSION.SDK_INT < this.minSdkForSpeechSupport;
    }

    public final void J(String errorMsg) throws JSONException {
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", errorMsg);
        jSONObject.put("permanent", true);
        this.handler.post(new Runnable() { // from class: Q5.k
            @Override // java.lang.Runnable
            public final void run() {
                o.K(this.f13939a, jSONObject);
            }
        });
    }

    public final void L() {
        if (this.bluetoothDisabled) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.bluetoothAdapter = defaultAdapter;
        this.pairedDevices = defaultAdapter != null ? defaultAdapter.getBondedDevices() : null;
        b bVar = new b();
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.getProfileProxy(this.pluginContext, bVar, 1);
        }
    }

    public final void M(final String languageTag, final boolean partialResults, final f listenMode, final boolean onDevice) {
        r("setupRecognizerIntent");
        String str = this.previousRecognizerLang;
        if (str != null && AbstractC4862t.a(str, languageTag) && partialResults == this.previousPartialResults && this.previousListenMode == listenMode) {
            return;
        }
        this.previousRecognizerLang = languageTag;
        this.previousPartialResults = partialResults;
        this.previousListenMode = listenMode;
        this.handler.post(new Runnable() { // from class: Q5.m
            @Override // java.lang.Runnable
            public final void run() {
                o.N(this.f13943a, listenMode, partialResults, languageTag, onDevice);
            }
        });
    }

    public final void O(MethodChannel.Result result, String languageTag, boolean partialResults, int listenModeIndex, boolean onDevice) {
        if (I() || A() || getListening()) {
            result.success(Boolean.FALSE);
            return;
        }
        f fVar = f.values()[listenModeIndex];
        this.resultSent = false;
        p(onDevice, fVar);
        this.minRms = 1000.0f;
        this.maxRms = -100.0f;
        r("Start listening");
        G();
        M(languageTag, partialResults, fVar, onDevice);
        this.handler.post(new Runnable() { // from class: Q5.h
            @Override // java.lang.Runnable
            public final void run() {
                o.P(this.f13936a);
            }
        });
        this.speechStartTime = System.currentTimeMillis();
        D(true);
        result.success(Boolean.TRUE);
        r("Start listening done");
    }

    public final void Q(MethodChannel.Result result) {
        if (I() || A() || B()) {
            result.success(Boolean.FALSE);
            return;
        }
        r("Stop listening");
        this.handler.post(new Runnable() { // from class: Q5.j
            @Override // java.lang.Runnable
            public final void run() {
                o.R(this.f13938a);
            }
        });
        if (!this.recognizerStops) {
            s();
        }
        D(false);
        result.success(Boolean.TRUE);
        r("Stop listening done");
    }

    public final void S(Bundle speechBundle, boolean isFinal) throws JSONException {
        if (y(isFinal)) {
            r("Discarding duplicate final");
            return;
        }
        ArrayList<String> stringArrayList = speechBundle != null ? speechBundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            r("Results null or empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finalResult", isFinal);
        float[] floatArray = speechBundle.getFloatArray("confidence_scores");
        JSONArray jSONArray = new JSONArray();
        int size = stringArrayList.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("recognizedWords", stringArrayList.get(i10));
                if (floatArray == null || floatArray.length < stringArrayList.size()) {
                    jSONObject2.put("confidence", this.missingConfidence);
                } else {
                    jSONObject2.put("confidence", Float.valueOf(floatArray[i10]));
                }
                jSONArray.put(jSONObject2);
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        jSONObject.put("alternates", jSONArray);
        String string = jSONObject.toString();
        AbstractC4862t.d(string, "toString(...)");
        r("Calling results callback");
        this.resultSent = true;
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("textRecognition", string);
        }
    }

    public final void m(MethodChannel.Result result) {
        if (I() || A() || B()) {
            result.success(Boolean.FALSE);
            return;
        }
        r("Cancel listening");
        this.handler.post(new Runnable() { // from class: Q5.i
            @Override // java.lang.Runnable
            public final void run() {
                o.n(this.f13937a);
            }
        });
        if (!this.recognizerStops) {
            s();
        }
        D(false);
        result.success(Boolean.TRUE);
        r("Cancel listening done");
    }

    public final void o() {
        r("completeInitialize");
        if (this.permissionToRecordAudio) {
            r("Testing recognition availability");
            Context context = this.pluginContext;
            if (context == null) {
                r("null context during initialization");
                MethodChannel.Result result = this.activeResult;
                if (result != null) {
                    result.success(Boolean.FALSE);
                }
                MethodChannel.Result result2 = this.activeResult;
                if (result2 != null) {
                    result2.error("missingContext", "context unexpectedly null, initialization failed", "");
                }
                this.activeResult = null;
                return;
            }
            if (!SpeechRecognizer.isRecognitionAvailable(context) && !SpeechRecognizer.isOnDeviceRecognitionAvailable(context)) {
                Log.e(this.logTag, "Speech recognition not available on this device");
                MethodChannel.Result result3 = this.activeResult;
                if (result3 != null) {
                    result3.error("recognizerNotAvailable", "Speech recognition not available on this device", "");
                }
                this.activeResult = null;
                return;
            }
            L();
        }
        this.initializedSuccessfully = this.permissionToRecordAudio;
        r("sending result");
        MethodChannel.Result result4 = this.activeResult;
        if (result4 != null) {
            result4.success(Boolean.valueOf(this.permissionToRecordAudio));
        }
        r("leaving complete");
        this.activeResult = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.currentActivity = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        E(applicationContext, binaryMessenger);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.currentActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.currentActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.pluginContext = null;
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.channel = null;
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
        D(false);
    }

    @Override // android.speech.RecognitionListener
    public void onError(int errorCode) throws JSONException {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.speechStartTime;
        int i10 = (7 != errorCode || this.maxRms >= ((float) this.speechThresholdRms)) ? errorCode : 6;
        r("Error " + errorCode + " after start at " + jCurrentTimeMillis + StringUtils.SPACE + this.minRms + " / " + this.maxRms);
        switch (i10) {
            case 1:
                str = "error_network_timeout";
                break;
            case 2:
                str = "error_network";
                break;
            case 3:
                str = "error_audio_error";
                break;
            case 4:
                str = "error_server";
                break;
            case 5:
                str = "error_client";
                break;
            case 6:
                str = "error_speech_timeout";
                break;
            case 7:
                str = "error_no_match";
                break;
            case 8:
                str = "error_busy";
                break;
            case 9:
                str = "error_permission";
                break;
            case 10:
                str = "error_too_many_requests";
                break;
            case 11:
                str = "error_server_disconnected";
                break;
            case 12:
                str = "error_language_not_supported";
                break;
            case 13:
                str = "error_language_unavailable";
                break;
            default:
                str = "error_unknown (" + errorCode + ")";
                break;
        }
        J(str);
        if (getListening()) {
            D(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r10, io.flutter.plugin.common.MethodChannel.Result r11) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.o.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle results) throws JSONException {
        S(results, false);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.currentActivity = binding.getActivity();
        binding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC4862t.e(permissions, "permissions");
        AbstractC4862t.e(grantResults, "grantResults");
        if (requestCode != this.speechToTextPermissionCode) {
            return false;
        }
        this.permissionToRecordAudio = !(grantResults.length == 0) && grantResults[0] == 0;
        this.bluetoothDisabled = grantResults.length == 0 || grantResults.length == 1 || grantResults[1] != 0 || this.noBluetoothOpt;
        o();
        return true;
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle results) throws JSONException {
        S(results, true);
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(final float rmsdB) {
        if (rmsdB < this.minRms) {
            this.minRms = rmsdB;
        }
        if (rmsdB > this.maxRms) {
            this.maxRms = rmsdB;
        }
        r("rmsDB " + this.minRms + " / " + this.maxRms);
        this.handler.post(new Runnable() { // from class: Q5.g
            @Override // java.lang.Runnable
            public final void run() {
                o.F(this.f13934a, rmsdB);
            }
        });
    }

    public final void p(final boolean onDevice, f listenMode) {
        SpeechRecognizer speechRecognizer = this.speechRecognizer;
        if (speechRecognizer == null || onDevice != this.lastOnDevice) {
            this.lastOnDevice = onDevice;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            this.speechRecognizer = null;
            this.handler.post(new Runnable() { // from class: Q5.l
                @Override // java.lang.Runnable
                public final void run() {
                    o.q(this.f13941a, onDevice);
                }
            });
            r("before setup intent");
            M(this.defaultLanguageTag, true, listenMode, false);
            r("after setup intent");
        }
    }

    public final void r(String msg) {
        if (this.debugLogging) {
            Log.d(this.logTag, msg);
        }
    }

    public final void s() {
        this.handler.postDelayed(new Runnable() { // from class: Q5.n
            @Override // java.lang.Runnable
            public final void run() {
                o.t(this.f13948a);
            }
        }, 50L);
    }

    public final ComponentName u(Context context) {
        ServiceInfo serviceInfo;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
        AbstractC4862t.d(listQueryIntentServices, "queryIntentServices(...)");
        r("RecognitionService, found: " + listQueryIntentServices.size());
        Iterator<T> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo2 = ((ResolveInfo) it.next()).serviceInfo;
            if (serviceInfo2 != null) {
                r("RecognitionService: packageName: " + serviceInfo2.packageName + ", name: " + serviceInfo2.name);
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) C4179C.j0(listQueryIntentServices);
        if (resolveInfo == null || (serviceInfo = resolveInfo.serviceInfo) == null) {
            return null;
        }
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    public final void v(MethodChannel.Result result) {
        if (I()) {
            result.success(Boolean.FALSE);
            return;
        }
        r("Start has_permission");
        Context context = this.pluginContext;
        if (context != null) {
            result.success(Boolean.valueOf(L0.a.a(context, "android.permission.RECORD_AUDIO") == 0));
        }
    }

    public final void w(MethodChannel.Result result) {
        if (I()) {
            result.success(Boolean.FALSE);
            return;
        }
        this.recognizerStops = Build.VERSION.SDK_INT != this.brokenStopSdk || this.alwaysUseStop;
        r("Start initialize");
        if (this.activeResult != null) {
            result.error("multipleRequests", "Only one initialize at a time", null);
        } else {
            this.activeResult = result;
            x(this.pluginContext);
        }
    }

    public final void x(Context context) {
        if (context == null) {
            o();
            return;
        }
        this.permissionToRecordAudio = L0.a.a(context, "android.permission.RECORD_AUDIO") == 0;
        this.bluetoothDisabled = L0.a.a(context, "android.permission.BLUETOOTH_CONNECT") != 0 || this.noBluetoothOpt;
        r("Checked permission");
        if (this.permissionToRecordAudio) {
            r("has permission, completing");
            o();
        } else {
            Activity activity = this.currentActivity;
            if (activity != null) {
                r("Requesting permission");
                String[] strArr = {"android.permission.RECORD_AUDIO"};
                if (!this.noBluetoothOpt) {
                    strArr = (String[]) C4202o.D(strArr, "android.permission.BLUETOOTH_CONNECT");
                }
                androidx.core.app.a.v(activity, strArr, this.speechToTextPermissionCode);
            } else {
                r("no permission, no activity, completing");
                o();
            }
        }
        r("leaving initializeIfPermitted");
    }

    public final boolean y(boolean isFinal) {
        if (!isFinal) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.lastFinalTime;
        this.lastFinalTime = System.currentTimeMillis();
        return jCurrentTimeMillis >= 0 && jCurrentTimeMillis < 100;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getListening() {
        return this.listening;
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] p02) {
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle p02) {
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int p02, Bundle p12) {
    }
}
