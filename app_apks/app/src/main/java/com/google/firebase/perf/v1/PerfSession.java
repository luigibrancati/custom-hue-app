package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import i9.e;
import i9.f;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class PerfSession extends GeneratedMessageLite implements e {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final N.h.a sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private N.g sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements N.h.a {
        @Override // com.google.protobuf.N.h.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f convert(Integer num) {
            f fVarB = f.b(num.intValue());
            return fVarB == null ? f.SESSION_VERBOSITY_NONE : fVarB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31885a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31885a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31885a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31885a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31885a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31885a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31885a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31885a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends GeneratedMessageLite.b implements e {
        public /* synthetic */ c(a aVar) {
            this();
        }

        public c j(f fVar) {
            copyOnWrite();
            ((PerfSession) this.instance).addSessionVerbosity(fVar);
            return this;
        }

        public c m(String str) {
            copyOnWrite();
            ((PerfSession) this.instance).setSessionId(str);
            return this;
        }

        public c() {
            super(PerfSession.DEFAULT_INSTANCE);
        }
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    private PerfSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends f> iterable) {
        ensureSessionVerbosityIsMutable();
        Iterator<? extends f> it = iterable.iterator();
        while (it.hasNext()) {
            this.sessionVerbosity_.x0(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(f fVar) {
        fVar.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.x0(fVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureSessionVerbosityIsMutable() {
        N.g gVar = this.sessionVerbosity_;
        if (gVar.m()) {
            return;
        }
        this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(AbstractC3722j abstractC3722j) {
        this.sessionId_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i10, f fVar) {
        fVar.getClass();
        ensureSessionVerbosityIsMutable();
        this.sessionVerbosity_.D(i10, fVar.getNumber());
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = b.f31885a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new PerfSession();
            case 2:
                return new c(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", f.j()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (PerfSession.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public AbstractC3722j getSessionIdBytes() {
        return AbstractC3722j.n(this.sessionId_);
    }

    public f getSessionVerbosity(int i10) {
        f fVarB = f.b(this.sessionVerbosity_.getInt(i10));
        return fVarB == null ? f.SESSION_VERBOSITY_NONE : fVarB;
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<f> getSessionVerbosityList() {
        return new N.h(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(PerfSession perfSession) {
        return (c) DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, D d10) {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, D d10) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static PerfSession parseFrom(AbstractC3722j abstractC3722j) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static PerfSession parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static PerfSession parseFrom(byte[] bArr) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, D d10) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static PerfSession parseFrom(InputStream inputStream) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, D d10) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static PerfSession parseFrom(AbstractC3724k abstractC3724k) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static PerfSession parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
