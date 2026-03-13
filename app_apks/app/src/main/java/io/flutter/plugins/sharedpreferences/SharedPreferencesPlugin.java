package io.flutter.plugins.sharedpreferences;

import Od.C;
import Rd.AbstractC2130h;
import Rd.M;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import android.content.Context;
import android.util.Log;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import gc.C4179C;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.AbstractC4789l;
import k1.C4781d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00172\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J'\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020,2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J'\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020/2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b2\u0010+J-\u00103\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b5\u00106J3\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b7\u00108J!\u00109\u001a\u0004\u0018\u00010,2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u0004\u0018\u00010%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u0004\u0018\u00010/2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b?\u0010@J!\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\bF\u0010GR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010L¨\u0006M"}, d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "<init>", "()V", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "listEncoder", "(Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Landroid/content/Context;", "context", "Lfc/H;", "setUp", "(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V", "", "key", "value", "dataStoreSetString", "(Ljava/lang/String;Ljava/lang/String;Llc/e;)Ljava/lang/Object;", "", "allowList", "", "", "getPrefs", "(Ljava/util/List;Llc/e;)Ljava/lang/Object;", "", "Lk1/h$a;", "readAllKeys", "(Llc/e;)Ljava/lang/Object;", "getValueByKey", "(Lk1/h$a;Llc/e;)Ljava/lang/Object;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", RRWebOptionsEvent.EVENT_TAG, "setBool", "(Ljava/lang/String;ZLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "setString", "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "", "setInt", "(Ljava/lang/String;JLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "", "setDouble", "(Ljava/lang/String;DLio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "setEncodedStringList", "setDeprecatedStringList", "(Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "clear", "(Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)V", "getAll", "(Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/util/Map;", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/String;", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getStringList", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Lio/flutter/plugins/sharedpreferences/StringListResult;", "getPlatformEncodedStringList", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/util/List;", "getKeys", "(Ljava/util/List;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/util/List;", "Landroid/content/Context;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "backend", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "shared_preferences_android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private SharedPreferencesBackend backend;
    private Context context;
    private SharedPreferencesListEncoder listEncoder;

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lk1/h;", "<anonymous>", "(LRd/M;)Lk1/h;"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", f = "SharedPreferencesPlugin.kt", l = {134}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends nc.m implements vc.p {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/d;", "preferences", "Lfc/H;", "<anonymous>", "(Lk1/d;)V"}, k = 3, mv = {2, 2, 0})
        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C05001 extends nc.m implements vc.p {
            final /* synthetic */ List<String> $allowList;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05001(List<String> list, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.$allowList = list;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C05001 c05001 = new C05001(this.$allowList, interfaceC4988e);
                c05001.L$0 = obj;
                return c05001;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C4781d c4781d = (C4781d) this.L$0;
                C5046c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                List<String> list = this.$allowList;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        c4781d.k(AbstractC4788k.a((String) it.next()));
                    }
                } else {
                    c4781d.h();
                }
                return C4015H.f34254a;
            }

            @Override // vc.p
            public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
                return ((C05001) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$allowList = list;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return SharedPreferencesPlugin.this.new AnonymousClass1(this.$allowList, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass1) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            Context context = SharedPreferencesPlugin.this.context;
            if (context == null) {
                AbstractC4862t.p("context");
                context = null;
            }
            InterfaceC4099i sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            C05001 c05001 = new C05001(this.$allowList, null);
            this.label = 1;
            Object objA = AbstractC4789l.a(sharedPreferencesDataStore, c05001, this);
            return objA == objF ? objF : objA;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/d;", "preferences", "Lfc/H;", "<anonymous>", "(Lk1/d;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends nc.m implements vc.p {
        final /* synthetic */ AbstractC4785h.a $stringKey;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC4785h.a aVar, String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$stringKey = aVar;
            this.$value = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$stringKey, this.$value, interfaceC4988e);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C4781d c4781d = (C4781d) this.L$0;
            C5046c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            c4781d.l(this.$stringKey, this.$value);
            return C4015H.f34254a;
        }

        @Override // vc.p
        public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
            return ((AnonymousClass2) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LRd/M;", "", "", "", "<anonymous>", "(LRd/M;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", f = "SharedPreferencesPlugin.kt", l = {150}, m = "invokeSuspend")
    public static final class C44491 extends nc.m implements vc.p {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44491(List<String> list, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$allowList = list;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return SharedPreferencesPlugin.this.new C44491(this.$allowList, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44491) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
            List<String> list = this.$allowList;
            this.label = 1;
            Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
            return prefs == objF ? objF : prefs;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", f = "SharedPreferencesPlugin.kt", l = {174}, m = "invokeSuspend")
    public static final class C44501 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ L $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44501(String str, SharedPreferencesPlugin sharedPreferencesPlugin, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44501(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44501) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            L l10;
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                final AbstractC4785h.a aVarA = AbstractC4788k.a(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                final InterfaceC2313e data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC2313e interfaceC2313e = new InterfaceC2313e() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC2314f {
                        final /* synthetic */ AbstractC4785h.a $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC2314f $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC5160d {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
                                super(interfaceC4988e);
                            }

                            @Override // nc.AbstractC5157a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2314f interfaceC2314f, AbstractC4785h.a aVar) {
                            this.$this_unsafeFlow = interfaceC2314f;
                            this.$preferencesKey$inlined = aVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ud.InterfaceC2314f
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = mc.C5046c.f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L39
                                if (r2 != r3) goto L31
                                java.lang.Object r4 = r0.L$3
                                Ud.f r4 = (Ud.InterfaceC2314f) r4
                                java.lang.Object r4 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                fc.AbstractC4036s.b(r6)
                                goto L6b
                            L31:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L39:
                                fc.AbstractC4036s.b(r6)
                                Ud.f r6 = r4.$this_unsafeFlow
                                r2 = r5
                                k1.h r2 = (k1.AbstractC4785h) r2
                                k1.h$a r4 = r4.$preferencesKey$inlined
                                java.lang.Object r4 = r2.c(r4)
                                java.lang.Object r2 = nc.l.a(r5)
                                r0.L$0 = r2
                                java.lang.Object r2 = nc.l.a(r0)
                                r0.L$1 = r2
                                java.lang.Object r5 = nc.l.a(r5)
                                r0.L$2 = r5
                                java.lang.Object r5 = nc.l.a(r6)
                                r0.L$3 = r5
                                r5 = 0
                                r0.I$0 = r5
                                r0.label = r3
                                java.lang.Object r4 = r6.emit(r4, r0)
                                if (r4 != r1) goto L6b
                                return r1
                            L6b:
                                fc.H r4 = fc.C4015H.f34254a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, lc.e):java.lang.Object");
                        }
                    }

                    @Override // Ud.InterfaceC2313e
                    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC2314f, aVarA), interfaceC4988e);
                        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
                    }
                };
                L l11 = this.$value;
                this.L$0 = nc.l.a(aVarA);
                this.L$1 = nc.l.a(interfaceC2313e);
                this.L$2 = l11;
                this.label = 1;
                obj = AbstractC2315g.r(interfaceC2313e, this);
                if (obj == objF) {
                    return objF;
                }
                l10 = l11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l10 = (L) this.L$2;
                AbstractC4036s.b(obj);
            }
            l10.f39776a = obj;
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", f = "SharedPreferencesPlugin.kt", l = {188}, m = "invokeSuspend")
    public static final class C44511 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ L $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44511(String str, SharedPreferencesPlugin sharedPreferencesPlugin, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44511(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44511) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            L l10;
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                final AbstractC4785h.a aVarG = AbstractC4788k.g(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                final InterfaceC2313e data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                final SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
                InterfaceC2313e interfaceC2313e = new InterfaceC2313e() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC2314f {
                        final /* synthetic */ AbstractC4785h.a $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC2314f $this_unsafeFlow;
                        final /* synthetic */ SharedPreferencesPlugin this$0;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC5160d {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
                                super(interfaceC4988e);
                            }

                            @Override // nc.AbstractC5157a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2314f interfaceC2314f, AbstractC4785h.a aVar, SharedPreferencesPlugin sharedPreferencesPlugin) {
                            this.$this_unsafeFlow = interfaceC2314f;
                            this.$preferencesKey$inlined = aVar;
                            this.this$0 = sharedPreferencesPlugin;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ud.InterfaceC2314f
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
                            /*
                                r5 = this;
                                boolean r0 = r7 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r7
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r7)
                            L18:
                                java.lang.Object r7 = r0.result
                                java.lang.Object r1 = mc.C5046c.f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L39
                                if (r2 != r3) goto L31
                                java.lang.Object r5 = r0.L$3
                                Ud.f r5 = (Ud.InterfaceC2314f) r5
                                java.lang.Object r5 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                                fc.AbstractC4036s.b(r7)
                                goto L77
                            L31:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L39:
                                fc.AbstractC4036s.b(r7)
                                Ud.f r7 = r5.$this_unsafeFlow
                                r2 = r6
                                k1.h r2 = (k1.AbstractC4785h) r2
                                k1.h$a r4 = r5.$preferencesKey$inlined
                                java.lang.Object r2 = r2.c(r4)
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r5 = r5.this$0
                                io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder r5 = io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.access$getListEncoder$p(r5)
                                java.lang.Object r5 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.transformPref(r2, r5)
                                java.lang.Double r5 = (java.lang.Double) r5
                                java.lang.Object r2 = nc.l.a(r6)
                                r0.L$0 = r2
                                java.lang.Object r2 = nc.l.a(r0)
                                r0.L$1 = r2
                                java.lang.Object r6 = nc.l.a(r6)
                                r0.L$2 = r6
                                java.lang.Object r6 = nc.l.a(r7)
                                r0.L$3 = r6
                                r6 = 0
                                r0.I$0 = r6
                                r0.label = r3
                                java.lang.Object r5 = r7.emit(r5, r0)
                                if (r5 != r1) goto L77
                                return r1
                            L77:
                                fc.H r5 = fc.C4015H.f34254a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, lc.e):java.lang.Object");
                        }
                    }

                    @Override // Ud.InterfaceC2313e
                    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC2314f, aVarG, sharedPreferencesPlugin), interfaceC4988e);
                        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
                    }
                };
                L l11 = this.$value;
                this.L$0 = nc.l.a(aVarG);
                this.L$1 = nc.l.a(interfaceC2313e);
                this.L$2 = l11;
                this.label = 1;
                obj = AbstractC2315g.r(interfaceC2313e, this);
                if (obj == objF) {
                    return objF;
                }
                l10 = l11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l10 = (L) this.L$2;
                AbstractC4036s.b(obj);
            }
            l10.f39776a = obj;
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", f = "SharedPreferencesPlugin.kt", l = {160}, m = "invokeSuspend")
    public static final class C44521 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ L $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44521(String str, SharedPreferencesPlugin sharedPreferencesPlugin, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44521(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44521) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            L l10;
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                final AbstractC4785h.a aVarF = AbstractC4788k.f(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                final InterfaceC2313e data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC2313e interfaceC2313e = new InterfaceC2313e() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC2314f {
                        final /* synthetic */ AbstractC4785h.a $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC2314f $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC5160d {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
                                super(interfaceC4988e);
                            }

                            @Override // nc.AbstractC5157a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2314f interfaceC2314f, AbstractC4785h.a aVar) {
                            this.$this_unsafeFlow = interfaceC2314f;
                            this.$preferencesKey$inlined = aVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ud.InterfaceC2314f
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = mc.C5046c.f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L39
                                if (r2 != r3) goto L31
                                java.lang.Object r4 = r0.L$3
                                Ud.f r4 = (Ud.InterfaceC2314f) r4
                                java.lang.Object r4 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                fc.AbstractC4036s.b(r6)
                                goto L6b
                            L31:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L39:
                                fc.AbstractC4036s.b(r6)
                                Ud.f r6 = r4.$this_unsafeFlow
                                r2 = r5
                                k1.h r2 = (k1.AbstractC4785h) r2
                                k1.h$a r4 = r4.$preferencesKey$inlined
                                java.lang.Object r4 = r2.c(r4)
                                java.lang.Object r2 = nc.l.a(r5)
                                r0.L$0 = r2
                                java.lang.Object r2 = nc.l.a(r0)
                                r0.L$1 = r2
                                java.lang.Object r5 = nc.l.a(r5)
                                r0.L$2 = r5
                                java.lang.Object r5 = nc.l.a(r6)
                                r0.L$3 = r5
                                r5 = 0
                                r0.I$0 = r5
                                r0.label = r3
                                java.lang.Object r4 = r6.emit(r4, r0)
                                if (r4 != r1) goto L6b
                                return r1
                            L6b:
                                fc.H r4 = fc.C4015H.f34254a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, lc.e):java.lang.Object");
                        }
                    }

                    @Override // Ud.InterfaceC2313e
                    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC2314f, aVarF), interfaceC4988e);
                        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
                    }
                };
                L l11 = this.$value;
                this.L$0 = nc.l.a(aVarF);
                this.L$1 = nc.l.a(interfaceC2313e);
                this.L$2 = l11;
                this.label = 1;
                obj = AbstractC2315g.r(interfaceC2313e, this);
                if (obj == objF) {
                    return objF;
                }
                l10 = l11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l10 = (L) this.L$2;
                AbstractC4036s.b(obj);
            }
            l10.f39776a = obj;
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", l = {256, 258}, m = "getPrefs")
    public static final class C44531 extends AbstractC5160d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C44531(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedPreferencesPlugin.this.getPrefs(null, this);
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", f = "SharedPreferencesPlugin.kt", l = {201}, m = "invokeSuspend")
    public static final class C44541 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ L $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44541(String str, SharedPreferencesPlugin sharedPreferencesPlugin, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44541(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44541) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            L l10;
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                final AbstractC4785h.a aVarG = AbstractC4788k.g(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                final InterfaceC2313e data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC2313e interfaceC2313e = new InterfaceC2313e() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
                    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC2314f {
                        final /* synthetic */ AbstractC4785h.a $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC2314f $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends AbstractC5160d {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
                                super(interfaceC4988e);
                            }

                            @Override // nc.AbstractC5157a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2314f interfaceC2314f, AbstractC4785h.a aVar) {
                            this.$this_unsafeFlow = interfaceC2314f;
                            this.$preferencesKey$inlined = aVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Ud.InterfaceC2314f
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = mc.C5046c.f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L39
                                if (r2 != r3) goto L31
                                java.lang.Object r4 = r0.L$3
                                Ud.f r4 = (Ud.InterfaceC2314f) r4
                                java.lang.Object r4 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                                fc.AbstractC4036s.b(r6)
                                goto L6b
                            L31:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L39:
                                fc.AbstractC4036s.b(r6)
                                Ud.f r6 = r4.$this_unsafeFlow
                                r2 = r5
                                k1.h r2 = (k1.AbstractC4785h) r2
                                k1.h$a r4 = r4.$preferencesKey$inlined
                                java.lang.Object r4 = r2.c(r4)
                                java.lang.Object r2 = nc.l.a(r5)
                                r0.L$0 = r2
                                java.lang.Object r2 = nc.l.a(r0)
                                r0.L$1 = r2
                                java.lang.Object r5 = nc.l.a(r5)
                                r0.L$2 = r5
                                java.lang.Object r5 = nc.l.a(r6)
                                r0.L$3 = r5
                                r5 = 0
                                r0.I$0 = r5
                                r0.label = r3
                                java.lang.Object r4 = r6.emit(r4, r0)
                                if (r4 != r1) goto L6b
                                return r1
                            L6b:
                                fc.H r4 = fc.C4015H.f34254a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, lc.e):java.lang.Object");
                        }
                    }

                    @Override // Ud.InterfaceC2313e
                    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
                        Object objCollect = data.collect(new AnonymousClass2(interfaceC2314f, aVarG), interfaceC4988e);
                        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
                    }
                };
                L l11 = this.$value;
                this.L$0 = nc.l.a(aVarG);
                this.L$1 = nc.l.a(interfaceC2313e);
                this.L$2 = l11;
                this.label = 1;
                obj = AbstractC2315g.r(interfaceC2313e, this);
                if (obj == objF) {
                    return objF;
                }
                l10 = l11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l10 = (L) this.L$2;
                AbstractC4036s.b(obj);
            }
            l10.f39776a = obj;
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", f = "SharedPreferencesPlugin.kt", l = {81}, m = "invokeSuspend")
    public static final class C44551 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/d;", "preferences", "Lfc/H;", "<anonymous>", "(Lk1/d;)V"}, k = 3, mv = {2, 2, 0})
        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C05011 extends nc.m implements vc.p {
            final /* synthetic */ AbstractC4785h.a $boolKey;
            final /* synthetic */ boolean $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05011(AbstractC4785h.a aVar, boolean z10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.$boolKey = aVar;
                this.$value = z10;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C05011 c05011 = new C05011(this.$boolKey, this.$value, interfaceC4988e);
                c05011.L$0 = obj;
                return c05011;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C4781d c4781d = (C4781d) this.L$0;
                C5046c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                c4781d.l(this.$boolKey, AbstractC5158b.a(this.$value));
                return C4015H.f34254a;
            }

            @Override // vc.p
            public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
                return ((C05011) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44551(String str, SharedPreferencesPlugin sharedPreferencesPlugin, boolean z10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = z10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44551(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44551) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                AbstractC4785h.a aVarA = AbstractC4788k.a(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                InterfaceC4099i sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                C05011 c05011 = new C05011(aVarA, this.$value, null);
                this.L$0 = nc.l.a(aVarA);
                this.label = 1;
                if (AbstractC4789l.a(sharedPreferencesDataStore, c05011, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1", f = "SharedPreferencesPlugin.kt", l = {128}, m = "invokeSuspend")
    public static final class C44561 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ String $valueString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44561(String str, String str2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.$valueString = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return SharedPreferencesPlugin.this.new C44561(this.$key, this.$valueString, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44561) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$valueString;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", f = "SharedPreferencesPlugin.kt", l = {107}, m = "invokeSuspend")
    public static final class C44571 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ double $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/d;", "preferences", "Lfc/H;", "<anonymous>", "(Lk1/d;)V"}, k = 3, mv = {2, 2, 0})
        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C05021 extends nc.m implements vc.p {
            final /* synthetic */ AbstractC4785h.a $doubleKey;
            final /* synthetic */ double $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05021(AbstractC4785h.a aVar, double d10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.$doubleKey = aVar;
                this.$value = d10;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C05021 c05021 = new C05021(this.$doubleKey, this.$value, interfaceC4988e);
                c05021.L$0 = obj;
                return c05021;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C4781d c4781d = (C4781d) this.L$0;
                C5046c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                c4781d.l(this.$doubleKey, AbstractC5158b.b(this.$value));
                return C4015H.f34254a;
            }

            @Override // vc.p
            public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
                return ((C05021) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44571(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = d10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44571(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44571) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                AbstractC4785h.a aVarC = AbstractC4788k.c(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                InterfaceC4099i sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                C05021 c05021 = new C05021(aVarC, this.$value, null);
                this.L$0 = nc.l.a(aVarC);
                this.label = 1;
                if (AbstractC4789l.a(sharedPreferencesDataStore, c05021, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1", f = "SharedPreferencesPlugin.kt", l = {117}, m = "invokeSuspend")
    public static final class C44581 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44581(String str, String str2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.$value = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return SharedPreferencesPlugin.this.new C44581(this.$key, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44581) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1", f = "SharedPreferencesPlugin.kt", l = {99}, m = "invokeSuspend")
    public static final class C44591 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ long $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk1/d;", "preferences", "Lfc/H;", "<anonymous>", "(Lk1/d;)V"}, k = 3, mv = {2, 2, 0})
        @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        public static final class C05031 extends nc.m implements vc.p {
            final /* synthetic */ AbstractC4785h.a $intKey;
            final /* synthetic */ long $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05031(AbstractC4785h.a aVar, long j10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.$intKey = aVar;
                this.$value = j10;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                C05031 c05031 = new C05031(this.$intKey, this.$value, interfaceC4988e);
                c05031.L$0 = obj;
                return c05031;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C4781d c4781d = (C4781d) this.L$0;
                C5046c.f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                c4781d.l(this.$intKey, AbstractC5158b.d(this.$value));
                return C4015H.f34254a;
            }

            @Override // vc.p
            public final Object invoke(C4781d c4781d, InterfaceC4988e interfaceC4988e) {
                return ((C05031) create(c4781d, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44591(String str, SharedPreferencesPlugin sharedPreferencesPlugin, long j10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = j10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C44591(this.$key, this.this$0, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44591) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                AbstractC4785h.a aVarF = AbstractC4788k.f(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    AbstractC4862t.p("context");
                    context = null;
                }
                InterfaceC4099i sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                C05031 c05031 = new C05031(aVarF, this.$value, null);
                this.L$0 = nc.l.a(aVarF);
                this.label = 1;
                if (AbstractC4789l.a(sharedPreferencesDataStore, c05031, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRd/M;", "Lfc/H;", "<anonymous>", "(LRd/M;)V"}, k = 3, mv = {2, 2, 0})
    @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", f = "SharedPreferencesPlugin.kt", l = {87}, m = "invokeSuspend")
    public static final class C44601 extends nc.m implements vc.p {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44601(String str, String str2, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.$key = str;
            this.$value = str2;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return SharedPreferencesPlugin.this.new C44601(this.$key, this.$value, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C44601) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dataStoreSetString(String str, String str2, InterfaceC4988e interfaceC4988e) {
        AbstractC4785h.a aVarG = AbstractC4788k.g(str);
        Context context = this.context;
        if (context == null) {
            AbstractC4862t.p("context");
            context = null;
        }
        Object objA = AbstractC4789l.a(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context), new AnonymousClass2(aVarG, str2, null), interfaceC4988e);
        return objA == C5046c.f() ? objA : C4015H.f34254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r15 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d3 -> B:33:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPrefs(java.util.List<java.lang.String> r14, lc.InterfaceC4988e r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getPrefs(java.util.List, lc.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getValueByKey(final AbstractC4785h.a aVar, InterfaceC4988e interfaceC4988e) {
        Context context = this.context;
        if (context == null) {
            AbstractC4862t.p("context");
            context = null;
        }
        final InterfaceC2313e data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
        return AbstractC2315g.r(new InterfaceC2313e() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

            /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements InterfaceC2314f {
                final /* synthetic */ AbstractC4785h.a $key$inlined;
                final /* synthetic */ InterfaceC2314f $this_unsafeFlow;

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends AbstractC5160d {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
                        super(interfaceC4988e);
                    }

                    @Override // nc.AbstractC5157a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2314f interfaceC2314f, AbstractC4785h.a aVar) {
                    this.$this_unsafeFlow = interfaceC2314f;
                    this.$key$inlined = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Ud.InterfaceC2314f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = mc.C5046c.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r4 = r0.L$3
                        Ud.f r4 = (Ud.InterfaceC2314f) r4
                        java.lang.Object r4 = r0.L$1
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                        fc.AbstractC4036s.b(r6)
                        goto L6b
                    L31:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L39:
                        fc.AbstractC4036s.b(r6)
                        Ud.f r6 = r4.$this_unsafeFlow
                        r2 = r5
                        k1.h r2 = (k1.AbstractC4785h) r2
                        k1.h$a r4 = r4.$key$inlined
                        java.lang.Object r4 = r2.c(r4)
                        java.lang.Object r2 = nc.l.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = nc.l.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r5 = nc.l.a(r5)
                        r0.L$2 = r5
                        java.lang.Object r5 = nc.l.a(r6)
                        r0.L$3 = r5
                        r5 = 0
                        r0.I$0 = r5
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L6b
                        return r1
                    L6b:
                        fc.H r4 = fc.C4015H.f34254a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, lc.e):java.lang.Object");
                }
            }

            @Override // Ud.InterfaceC2313e
            public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e2) {
                Object objCollect = data.collect(new AnonymousClass2(interfaceC2314f, aVar), interfaceC4988e2);
                return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
            }
        }, interfaceC4988e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAllKeys(InterfaceC4988e interfaceC4988e) {
        Context context = this.context;
        if (context == null) {
            AbstractC4862t.p("context");
            context = null;
        }
        final InterfaceC2313e data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
        return AbstractC2315g.r(new InterfaceC2313e() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

            /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements InterfaceC2314f {
                final /* synthetic */ InterfaceC2314f $this_unsafeFlow;

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends AbstractC5160d {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC4988e interfaceC4988e) {
                        super(interfaceC4988e);
                    }

                    @Override // nc.AbstractC5157a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2314f interfaceC2314f) {
                    this.$this_unsafeFlow = interfaceC2314f;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // Ud.InterfaceC2314f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = mc.C5046c.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r4 = r0.L$3
                        Ud.f r4 = (Ud.InterfaceC2314f) r4
                        java.lang.Object r4 = r0.L$1
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                        fc.AbstractC4036s.b(r6)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L39:
                        fc.AbstractC4036s.b(r6)
                        Ud.f r4 = r4.$this_unsafeFlow
                        r6 = r5
                        k1.h r6 = (k1.AbstractC4785h) r6
                        java.util.Map r6 = r6.a()
                        java.util.Set r6 = r6.keySet()
                        java.lang.Object r2 = nc.l.a(r5)
                        r0.L$0 = r2
                        java.lang.Object r2 = nc.l.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r5 = nc.l.a(r5)
                        r0.L$2 = r5
                        java.lang.Object r5 = nc.l.a(r4)
                        r0.L$3 = r5
                        r5 = 0
                        r0.I$0 = r5
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r6, r0)
                        if (r4 != r1) goto L6d
                        return r1
                    L6d:
                        fc.H r4 = fc.C4015H.f34254a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, lc.e):java.lang.Object");
                }
            }

            @Override // Ud.InterfaceC2313e
            public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e2) {
                Object objCollect = data.collect(new AnonymousClass2(interfaceC2314f), interfaceC4988e2);
                return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
            }
        }, interfaceC4988e);
    }

    private final void setUp(BinaryMessenger messenger, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.INSTANCE.setUp(messenger, this, "data_store");
            this.backend = new SharedPreferencesBackend(messenger, context, this.listEncoder);
        } catch (Exception e10) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> allowList, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new AnonymousClass1(allowList, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> allowList, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(options, "options");
        return (Map) AbstractC2130h.b(null, new C44491(allowList, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        L l10 = new L();
        AbstractC2130h.b(null, new C44501(key, this, l10, null), 1, null);
        return (Boolean) l10.f39776a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        L l10 = new L();
        AbstractC2130h.b(null, new C44511(key, this, l10, null), 1, null);
        return (Double) l10.f39776a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        L l10 = new L();
        AbstractC2130h.b(null, new C44521(key, this, l10, null), 1, null);
        return (Long) l10.f39776a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> allowList, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(options, "options");
        return C4179C.V0(((Map) AbstractC2130h.b(null, new SharedPreferencesPlugin$getKeys$prefs$1(this, allowList, null), 1, null)).keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) {
        List list;
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        String string = getString(key, options);
        if (string == null || C.P(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, null) || !C.P(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, null) || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        L l10 = new L();
        AbstractC2130h.b(null, new C44541(key, this, l10, null), 1, null);
        return (String) l10.f39776a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        String string = getString(key, options);
        if (string != null) {
            return C.P(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, null) ? new StringListResult(string, StringListLookupResultType.JSON_ENCODED) : C.P(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, null) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.INSTANCE;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        AbstractC4862t.d(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean value, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new C44551(key, this, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new C44561(key, SharedPreferencesPluginKt.LIST_PREFIX + this.listEncoder.encode(value), null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double value, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new C44571(key, this, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new C44581(key, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long value, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new C44591(key, this, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(options, "options");
        AbstractC2130h.b(null, new C44601(key, value, null), 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin(SharedPreferencesListEncoder listEncoder) {
        this();
        AbstractC4862t.e(listEncoder, "listEncoder");
        this.listEncoder = listEncoder;
    }
}
