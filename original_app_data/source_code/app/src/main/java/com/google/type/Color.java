package com.google.type;

import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Color extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile t0 PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private int bitField0_;
    private float blue_;
    private float green_;
    private float red_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32359a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f32359a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32359a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32359a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32359a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32359a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32359a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32359a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(Color.DEFAULT_INSTANCE);
        }
    }

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        GeneratedMessageLite.registerDefaultInstance(Color.class, color);
    }

    private Color() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlpha() {
        this.alpha_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlue() {
        this.blue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGreen() {
        this.green_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRed() {
        this.red_ = 0.0f;
    }

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlpha(FloatValue floatValue) {
        floatValue.getClass();
        FloatValue floatValue2 = this.alpha_;
        if (floatValue2 == null || floatValue2 == FloatValue.getDefaultInstance()) {
            this.alpha_ = floatValue;
        } else {
            this.alpha_ = (FloatValue) ((FloatValue.b) FloatValue.newBuilder(this.alpha_).mergeFrom((GeneratedMessageLite) floatValue)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Color parseDelimitedFrom(InputStream inputStream) {
        return (Color) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(ByteBuffer byteBuffer) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlpha(FloatValue floatValue) {
        floatValue.getClass();
        this.alpha_ = floatValue;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlue(float f10) {
        this.blue_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGreen(float f10) {
        this.green_ = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRed(float f10) {
        this.red_ = f10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f32359a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new Color();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"bitField0_", "red_", "green_", "blue_", "alpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (Color.class) {
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

    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
    }

    public float getBlue() {
        return this.blue_;
    }

    public float getGreen() {
        return this.green_;
    }

    public float getRed() {
        return this.red_;
    }

    public boolean hasAlpha() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(Color color) {
        return (b) DEFAULT_INSTANCE.createBuilder(color);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, D d10) {
        return (Color) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Color parseFrom(ByteBuffer byteBuffer, D d10) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static Color parseFrom(AbstractC3722j abstractC3722j) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static Color parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static Color parseFrom(byte[] bArr) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Color parseFrom(byte[] bArr, D d10) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static Color parseFrom(InputStream inputStream) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(InputStream inputStream, D d10) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Color parseFrom(AbstractC3724k abstractC3724k) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static Color parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
