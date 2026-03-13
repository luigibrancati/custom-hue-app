package com.braze.support;

import Od.C;
import Od.F;
import android.util.Log;
import com.braze.support.BrazeLogger;
import fc.C4029l;
import fc.C4032o;
import fc.InterfaceC4028k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\r2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u0017\u001a\u00020\r*\u00020\r¢\u0006\u0004\b\u0017\u0010\u001cJ?\u0010!\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b!\u0010\"JC\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0019¢\u0006\u0004\b!\u0010#J\u0011\u0010$\u001a\u00020\r*\u00020\u0001¢\u0006\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'RD\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\u0003\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RD\u00102\u001a$\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R0\u00108\u001a\u00020\t2\u0006\u00108\u001a\u00020\t8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b=\u0010\u0003\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\f¨\u0006?"}, d2 = {"Lcom/braze/support/BrazeLogger;", "", "<init>", "()V", "", "returnOnDebug", "Lfc/H;", "checkForSystemLogLevelProperty", "(Z)V", "", "initialLogLevel", "setInitialLogLevelFromConfiguration", "(I)V", "", "tag", "msg", "", "tr", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "Ljava/lang/Class;", "classForTag", "getBrazeLogTag", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/Function0;", "toStringSafe", "(Lvc/a;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/braze/support/BrazeLogger$Priority;", "priority", "skipSdkDebug", "message", "brazelog", "(Ljava/lang/Object;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLvc/a;)V", "(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/Throwable;ZLvc/a;)V", "brazeLogTag", "(Ljava/lang/Object;)Ljava/lang/String;", "isSystemPropLogLevelSet", "Z", "hasLogLevelBeenSetForAppRun", "Lkotlin/Function3;", "onLoggedCallback", "Lvc/q;", "getOnLoggedCallback", "()Lvc/q;", "setOnLoggedCallback", "(Lvc/q;)V", "getOnLoggedCallback$annotations", "Lkotlin/Function4;", "sdkDebuggerCallback", "Lvc/r;", "getSdkDebuggerCallback$android_sdk_base_release", "()Lvc/r;", "setSdkDebuggerCallback$android_sdk_base_release", "(Lvc/r;)V", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "getLogLevel$annotations", "Priority", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeLogger {
    private static boolean hasLogLevelBeenSetForAppRun;
    private static boolean isSystemPropLogLevelSet;
    private static vc.q onLoggedCallback;
    private static vc.r sdkDebuggerCallback;
    public static final BrazeLogger INSTANCE = new BrazeLogger();
    private static int logLevel = 4;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/braze/support/BrazeLogger$Priority;", "", "logLevel", "", "<init>", "(Ljava/lang/String;II)V", "getLogLevel", "()I", "D", "I", "E", "V", "W", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Priority {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        private final int logLevel;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final Priority f28624D = new Priority("D", 0, 3);

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final Priority f28626I = new Priority("I", 1, 4);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final Priority f28625E = new Priority("E", 2, 6);

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final Priority f28627V = new Priority("V", 3, 2);

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public static final Priority f28628W = new Priority("W", 4, 5);

        private static final /* synthetic */ Priority[] $values() {
            return new Priority[]{f28624D, f28626I, f28625E, f28627V, f28628W};
        }

        static {
            Priority[] priorityArr$values = $values();
            $VALUES = priorityArr$values;
            $ENTRIES = AbstractC5277b.a(priorityArr$values);
        }

        private Priority(String str, int i10, int i11) {
            this.logLevel = i11;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public final int getLogLevel() {
            return this.logLevel;
        }
    }

    private BrazeLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_logLevel_$lambda$0(int i10) {
        return "Log level already set via system property. BrazeLogger.setLogLevel() ignored for level: " + i10;
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, Object obj, Priority priority, Throwable th, boolean z10, InterfaceC6082a interfaceC6082a, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            priority = Priority.f28624D;
        }
        Priority priority2 = priority;
        if ((i10 & 2) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        brazeLogger.brazelog(obj, priority2, th2, z10, interfaceC6082a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String brazelog$lambda$7(InterfaceC6082a interfaceC6082a) {
        return INSTANCE.toStringSafe(interfaceC6082a);
    }

    public static final void checkForSystemLogLevelProperty(boolean returnOnDebug) {
        String strA = x.a("log.tag.BRAZE");
        if (C.E("verbose", F.e1(x.a("log.tag.APPBOY")).toString(), true) || C.E("verbose", F.e1(strA).toString(), true)) {
            setLogLevel(2);
            isSystemPropLogLevelSet = true;
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.M
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeLogger.checkForSystemLogLevelProperty$lambda$1();
                }
            }, 6, (Object) null);
        }
    }

    public static /* synthetic */ void checkForSystemLogLevelProperty$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        checkForSystemLogLevelProperty(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String checkForSystemLogLevelProperty$lambda$1() {
        return "BrazeLogger log level set to VERBOSE via device system property for BRAZE/APPBOY. Note that subsequent calls to BrazeLogger.setLogLevel() will have no effect.";
    }

    public static final String getBrazeLogTag(Class<?> classForTag) {
        AbstractC4862t.e(classForTag, "classForTag");
        String name = classForTag.getName();
        int length = name.length();
        if (length <= 65) {
            AbstractC4862t.b(name);
        } else {
            AbstractC4862t.b(name);
            name = name.substring(length - 65);
            AbstractC4862t.d(name, "substring(...)");
        }
        return "Braze v41.0.0 ." + name;
    }

    public static final void setInitialLogLevelFromConfiguration(int initialLogLevel) {
        if (hasLogLevelBeenSetForAppRun) {
            return;
        }
        setLogLevel(initialLogLevel);
    }

    public static final void setLogLevel(final int i10) {
        if (isSystemPropLogLevelSet) {
            BrazeLogger brazeLogger = INSTANCE;
            brazelog$default(brazeLogger, (Object) brazeLogger, Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.J
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return BrazeLogger._set_logLevel_$lambda$0(i10);
                }
            }, 6, (Object) null);
        } else {
            hasLogLevelBeenSetForAppRun = true;
            logLevel = i10;
        }
    }

    private final String toStringSafe(InterfaceC6082a interfaceC6082a) {
        try {
            return String.valueOf(interfaceC6082a.invoke());
        } catch (Exception unused) {
            return "";
        }
    }

    public static final void w(String tag, String msg) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(msg, "msg");
        w$default(tag, msg, null, 4, null);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public final String brazeLogTag(Object obj) {
        AbstractC4862t.e(obj, "<this>");
        String name = obj.getClass().getName();
        AbstractC4862t.b(name);
        String strU0 = F.U0(F.X0(name, '$', null, 2, null), '.', null, 2, null);
        return strU0.length() == 0 ? getBrazeLogTag(name) : getBrazeLogTag(strU0);
    }

    public final void brazelog(Object obj, Priority priority, Throwable th, boolean z10, InterfaceC6082a message) {
        AbstractC4862t.e(obj, "<this>");
        AbstractC4862t.e(priority, "priority");
        AbstractC4862t.e(message, "message");
        if (logLevel <= priority.getLogLevel() || sdkDebuggerCallback != null) {
            brazelog(brazeLogTag(obj), priority, th, z10, message);
        }
    }

    public final void setSdkDebuggerCallback$android_sdk_base_release(vc.r rVar) {
        sdkDebuggerCallback = rVar;
    }

    public static final void e(String tag, final String msg, Throwable tr) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(msg, "msg");
        AbstractC4862t.e(tr, "tr");
        brazelog$default(INSTANCE, tag, Priority.f28624D, tr, false, new InterfaceC6082a() { // from class: s5.K
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeLogger.e$lambda$6(msg);
            }
        }, 8, (Object) null);
    }

    public static final void w(String tag, final String msg, Throwable tr) {
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(msg, "msg");
        brazelog$default(INSTANCE, tag, Priority.f28628W, tr, false, new InterfaceC6082a() { // from class: s5.L
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeLogger.w$lambda$5(msg);
            }
        }, 8, (Object) null);
    }

    public static /* synthetic */ void brazelog$default(BrazeLogger brazeLogger, String str, Priority priority, Throwable th, boolean z10, InterfaceC6082a interfaceC6082a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            priority = Priority.f28624D;
        }
        Priority priority2 = priority;
        if ((i10 & 4) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        brazeLogger.brazelog(str, priority2, th2, z10, interfaceC6082a);
    }

    public final void brazelog(String tag, Priority priority, Throwable tr, boolean skipSdkDebug, final InterfaceC6082a message) {
        vc.r rVar;
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(priority, "priority");
        AbstractC4862t.e(message, "message");
        InterfaceC4028k interfaceC4028kB = C4029l.b(new InterfaceC6082a() { // from class: s5.I
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeLogger.brazelog$lambda$7(message);
            }
        });
        vc.q qVar = onLoggedCallback;
        if (qVar != null) {
            qVar.invoke(priority, interfaceC4028kB.getValue(), tr);
        }
        if (!skipSdkDebug && (rVar = sdkDebuggerCallback) != null) {
            rVar.invoke(tag, priority, interfaceC4028kB.getValue(), tr);
        }
        if (logLevel <= priority.getLogLevel()) {
            int i10 = b.f28631a[priority.ordinal()];
            if (i10 == 1) {
                if (tr == null) {
                    Log.d(tag, (String) interfaceC4028kB.getValue());
                    return;
                } else {
                    Log.d(tag, (String) interfaceC4028kB.getValue(), tr);
                    return;
                }
            }
            if (i10 == 2) {
                if (tr == null) {
                    Log.i(tag, (String) interfaceC4028kB.getValue());
                    return;
                } else {
                    Log.i(tag, (String) interfaceC4028kB.getValue(), tr);
                    return;
                }
            }
            if (i10 == 3) {
                if (tr == null) {
                    Log.w(tag, (String) interfaceC4028kB.getValue());
                    return;
                } else {
                    Log.e(tag, (String) interfaceC4028kB.getValue(), tr);
                    return;
                }
            }
            if (i10 == 4) {
                if (tr == null) {
                    Log.w(tag, (String) interfaceC4028kB.getValue());
                    return;
                } else {
                    Log.w(tag, (String) interfaceC4028kB.getValue(), tr);
                    return;
                }
            }
            if (i10 != 5) {
                throw new C4032o();
            }
            if (tr == null) {
                Log.v(tag, (String) interfaceC4028kB.getValue());
            } else {
                Log.v(tag, (String) interfaceC4028kB.getValue(), tr);
            }
        }
    }

    public final String getBrazeLogTag(String str) {
        AbstractC4862t.e(str, "<this>");
        return "Braze v41.0.0 ." + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e$lambda$6(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w$lambda$5(String str) {
        return str;
    }
}
