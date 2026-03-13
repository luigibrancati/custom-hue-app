package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$FileOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FileOptions, a> implements InterfaceC3719h0 {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile t0 PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean phpGenericServices_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private String javaPackage_ = "";
    private String javaOuterClassname_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private N.j uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.d implements InterfaceC3719h0 {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$FileOptions.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b implements N.c {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);

        public static final int CODE_SIZE_VALUE = 2;
        public static final int LITE_RUNTIME_VALUE = 3;
        public static final int SPEED_VALUE = 1;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b findValueByNumber(int i10) {
                return b.b(i10);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FileOptions$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0379b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f32075a = new C0379b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return b.b(i10) != null;
            }
        }

        b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            if (i10 == 1) {
                return SPEED;
            }
            if (i10 == 2) {
                return CODE_SIZE;
            }
            if (i10 != 3) {
                return null;
            }
            return LITE_RUNTIME;
        }

        public static N.e j() {
            return C0379b.f32075a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = new DescriptorProtos$FileOptions();
        DEFAULT_INSTANCE = descriptorProtos$FileOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileOptions.class, descriptorProtos$FileOptions);
    }

    private DescriptorProtos$FileOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcEnableArenas() {
        this.bitField0_ &= -4097;
        this.ccEnableArenas_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcGenericServices() {
        this.bitField0_ &= -129;
        this.ccGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCsharpNamespace() {
        this.bitField0_ &= -16385;
        this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2049;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoPackage() {
        this.bitField0_ &= -65;
        this.goPackage_ = getDefaultInstance().getGoPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenerateEqualsAndHash() {
        this.bitField0_ &= -9;
        this.javaGenerateEqualsAndHash_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenericServices() {
        this.bitField0_ &= -257;
        this.javaGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMultipleFiles() {
        this.bitField0_ &= -5;
        this.javaMultipleFiles_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaOuterClassname() {
        this.bitField0_ &= -3;
        this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaPackage() {
        this.bitField0_ &= -2;
        this.javaPackage_ = getDefaultInstance().getJavaPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaStringCheckUtf8() {
        this.bitField0_ &= -17;
        this.javaStringCheckUtf8_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjcClassPrefix() {
        this.bitField0_ &= -8193;
        this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptimizeFor() {
        this.bitField0_ &= -33;
        this.optimizeFor_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpClassPrefix() {
        this.bitField0_ &= -65537;
        this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpGenericServices() {
        this.bitField0_ &= -1025;
        this.phpGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpMetadataNamespace() {
        this.bitField0_ &= -262145;
        this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpNamespace() {
        this.bitField0_ &= -131073;
        this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPyGenericServices() {
        this.bitField0_ &= -513;
        this.pyGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRubyPackage() {
        this.bitField0_ &= -524289;
        this.rubyPackage_ = getDefaultInstance().getRubyPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwiftPrefix() {
        this.bitField0_ &= -32769;
        this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        N.j jVar = this.uninterpretedOption_;
        if (jVar.m()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcEnableArenas(boolean z10) {
        this.bitField0_ |= RecognitionOptions.AZTEC;
        this.ccEnableArenas_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcGenericServices(boolean z10) {
        this.bitField0_ |= 128;
        this.ccGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.csharpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespaceBytes(AbstractC3722j abstractC3722j) {
        this.csharpNamespace_ = abstractC3722j.J();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= RecognitionOptions.PDF417;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackage(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.goPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackageBytes(AbstractC3722j abstractC3722j) {
        this.goPackage_ = abstractC3722j.J();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenerateEqualsAndHash(boolean z10) {
        this.bitField0_ |= 8;
        this.javaGenerateEqualsAndHash_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenericServices(boolean z10) {
        this.bitField0_ |= 256;
        this.javaGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFiles(boolean z10) {
        this.bitField0_ |= 4;
        this.javaMultipleFiles_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassname(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.javaOuterClassname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameBytes(AbstractC3722j abstractC3722j) {
        this.javaOuterClassname_ = abstractC3722j.J();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.javaPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackageBytes(AbstractC3722j abstractC3722j) {
        this.javaPackage_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaStringCheckUtf8(boolean z10) {
        this.bitField0_ |= 16;
        this.javaStringCheckUtf8_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.objcClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefixBytes(AbstractC3722j abstractC3722j) {
        this.objcClassPrefix_ = abstractC3722j.J();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptimizeFor(b bVar) {
        this.optimizeFor_ = bVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        this.phpClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefixBytes(AbstractC3722j abstractC3722j) {
        this.phpClassPrefix_ = abstractC3722j.J();
        this.bitField0_ |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpGenericServices(boolean z10) {
        this.bitField0_ |= RecognitionOptions.UPC_E;
        this.phpGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 262144;
        this.phpMetadataNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespaceBytes(AbstractC3722j abstractC3722j) {
        this.phpMetadataNamespace_ = abstractC3722j.J();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.phpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespaceBytes(AbstractC3722j abstractC3722j) {
        this.phpNamespace_ = abstractC3722j.J();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPyGenericServices(boolean z10) {
        this.bitField0_ |= 512;
        this.pyGenericServices_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackage(String str) {
        str.getClass();
        this.bitField0_ |= ImageMetadata.LENS_APERTURE;
        this.rubyPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackageBytes(AbstractC3722j abstractC3722j) {
        this.rubyPackage_ = abstractC3722j.J();
        this.bitField0_ |= ImageMetadata.LENS_APERTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.swiftPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefixBytes(AbstractC3722j abstractC3722j) {
        this.swiftPrefix_ = abstractC3722j.J();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileOptions();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000b\u001bဇ\u0004\u001fဇ\f$ဈ\r%ဈ\u000e'ဈ\u000f(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", b.j(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$FileOptions.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    public String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    public AbstractC3722j getCsharpNamespaceBytes() {
        return AbstractC3722j.n(this.csharpNamespace_);
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public String getGoPackage() {
        return this.goPackage_;
    }

    public AbstractC3722j getGoPackageBytes() {
        return AbstractC3722j.n(this.goPackage_);
    }

    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    public String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    public AbstractC3722j getJavaOuterClassnameBytes() {
        return AbstractC3722j.n(this.javaOuterClassname_);
    }

    public String getJavaPackage() {
        return this.javaPackage_;
    }

    public AbstractC3722j getJavaPackageBytes() {
        return AbstractC3722j.n(this.javaPackage_);
    }

    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    public String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    public AbstractC3722j getObjcClassPrefixBytes() {
        return AbstractC3722j.n(this.objcClassPrefix_);
    }

    public b getOptimizeFor() {
        b bVarB = b.b(this.optimizeFor_);
        return bVarB == null ? b.SPEED : bVarB;
    }

    public String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    public AbstractC3722j getPhpClassPrefixBytes() {
        return AbstractC3722j.n(this.phpClassPrefix_);
    }

    public boolean getPhpGenericServices() {
        return this.phpGenericServices_;
    }

    public String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    public AbstractC3722j getPhpMetadataNamespaceBytes() {
        return AbstractC3722j.n(this.phpMetadataNamespace_);
    }

    public String getPhpNamespace() {
        return this.phpNamespace_;
    }

    public AbstractC3722j getPhpNamespaceBytes() {
        return AbstractC3722j.n(this.phpNamespace_);
    }

    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    public String getRubyPackage() {
        return this.rubyPackage_;
    }

    public AbstractC3722j getRubyPackageBytes() {
        return AbstractC3722j.n(this.rubyPackage_);
    }

    public String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    public AbstractC3722j getSwiftPrefixBytes() {
        return AbstractC3722j.n(this.swiftPrefix_);
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i10);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public InterfaceC3744x getUninterpretedOptionOrBuilder(int i10) {
        return (InterfaceC3744x) this.uninterpretedOption_.get(i10);
    }

    public List<? extends InterfaceC3744x> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean hasCcEnableArenas() {
        return (this.bitField0_ & RecognitionOptions.AZTEC) != 0;
    }

    public boolean hasCcGenericServices() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCsharpNamespace() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & RecognitionOptions.PDF417) != 0;
    }

    public boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasJavaGenericServices() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPhpClassPrefix() {
        return (this.bitField0_ & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0;
    }

    public boolean hasPhpGenericServices() {
        return (this.bitField0_ & RecognitionOptions.UPC_E) != 0;
    }

    public boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasPhpNamespace() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasPyGenericServices() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasRubyPackage() {
        return (this.bitField0_ & ImageMetadata.LENS_APERTURE) != 0;
    }

    public boolean hasSwiftPrefix() {
        return (this.bitField0_ & 32768) != 0;
    }

    public static a newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$FileOptions parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
