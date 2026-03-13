package z3;

import fc.C4032o;
import gc.C4204q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f48723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f48724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f48725g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48726a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48726a = iArr;
        }
    }

    public f(Object value, String tag, String message, g logger, j verificationMode) {
        AbstractC4862t.e(value, "value");
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(verificationMode, "verificationMode");
        this.f48720b = value;
        this.f48721c = tag;
        this.f48722d = message;
        this.f48723e = logger;
        this.f48724f = verificationMode;
        m mVar = new m(b(value, message));
        StackTraceElement[] stackTrace = mVar.getStackTrace();
        AbstractC4862t.d(stackTrace, "getStackTrace(...)");
        mVar.setStackTrace((StackTraceElement[]) C4204q.R(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f48725g = mVar;
    }

    @Override // z3.h
    public Object a() throws m {
        int i10 = a.f48726a[this.f48724f.ordinal()];
        if (i10 == 1) {
            throw this.f48725g;
        }
        if (i10 == 2) {
            this.f48723e.a(this.f48721c, b(this.f48720b, this.f48722d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new C4032o();
    }

    @Override // z3.h
    public h c(String message, vc.l condition) {
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(condition, "condition");
        return this;
    }
}
