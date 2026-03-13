package io.sentry.android.core.internal.tombstone;

import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryStackTraceFactory;
import io.sentry.android.core.internal.tombstone.TombstoneProtos;
import io.sentry.android.core.internal.util.NativeEventUtils;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TombstoneParser implements Closeable {
    private final Map<String, String> excTypeValueMap;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final String nativeLibraryDir;
    private final InputStream tombstoneStream;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ModuleAccumulator {
        long beginAddress;
        String buildId;
        long endAddress;
        String mappingName;

        public ModuleAccumulator(TombstoneProtos.MemoryMapping memoryMapping) {
            this.mappingName = memoryMapping.getMappingName();
            this.buildId = memoryMapping.getBuildId();
            this.beginAddress = memoryMapping.getBeginAddress();
            this.endAddress = memoryMapping.getEndAddress();
        }

        public void extendTo(long j10) {
            this.endAddress = j10;
        }

        public DebugImage toDebugImage() {
            if (this.buildId.isEmpty()) {
                return null;
            }
            DebugImage debugImage = new DebugImage();
            debugImage.setCodeId(this.buildId);
            debugImage.setCodeFile(this.mappingName);
            String strBuildIdToDebugId = NativeEventUtils.buildIdToDebugId(this.buildId);
            if (strBuildIdToDebugId == null) {
                strBuildIdToDebugId = this.buildId;
            }
            debugImage.setDebugId(strBuildIdToDebugId);
            debugImage.setImageAddr(TombstoneParser.formatHex(this.beginAddress));
            debugImage.setImageSize(this.endAddress - this.beginAddress);
            debugImage.setType("elf");
            return debugImage;
        }
    }

    public TombstoneParser(InputStream inputStream, List<String> list, List<String> list2, String str) {
        HashMap map = new HashMap();
        this.excTypeValueMap = map;
        this.tombstoneStream = inputStream;
        this.inAppIncludes = list;
        this.inAppExcludes = list2;
        this.nativeLibraryDir = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    private Message constructMessage(TombstoneProtos.Tombstone tombstone) {
        String str;
        Message message = new Message();
        TombstoneProtos.Signal signalInfo = tombstone.getSignalInfo();
        String strJoin = String.join(StringUtils.SPACE, tombstone.getCommandLineList());
        if (!tombstone.hasSignalInfo()) {
            message.setFormatted(String.format(Locale.ROOT, "Fatal exit pid = %d (%s)", Integer.valueOf(tombstone.getPid()), strJoin));
            return message;
        }
        String abortMessage = tombstone.getAbortMessage();
        Locale locale = Locale.ROOT;
        if (abortMessage.isEmpty()) {
            str = "";
        } else {
            str = abortMessage + ": ";
        }
        message.setFormatted(String.format(locale, "%sFatal signal %s (%d), %s (%d), pid = %d (%s)", str, signalInfo.getName(), Integer.valueOf(signalInfo.getNumber()), signalInfo.getCodeName(), Integer.valueOf(signalInfo.getCode()), Integer.valueOf(tombstone.getPid()), strJoin));
        return message;
    }

    private DebugMeta createDebugMeta(TombstoneProtos.Tombstone tombstone) {
        DebugImage debugImage;
        DebugImage debugImage2;
        ArrayList arrayList = new ArrayList();
        ModuleAccumulator moduleAccumulator = null;
        for (TombstoneProtos.MemoryMapping memoryMapping : tombstone.getMemoryMappingsList()) {
            if (memoryMapping.getRead()) {
                String mappingName = memoryMapping.getMappingName();
                if (!mappingName.isEmpty() && !mappingName.startsWith("/dev/")) {
                    boolean zIsEmpty = memoryMapping.getBuildId().isEmpty();
                    boolean z10 = memoryMapping.getOffset() == 0;
                    if (zIsEmpty || !z10) {
                        if (moduleAccumulator != null && mappingName.equals(moduleAccumulator.mappingName)) {
                            moduleAccumulator.extendTo(memoryMapping.getEndAddress());
                        }
                    } else if (moduleAccumulator == null || !mappingName.equals(moduleAccumulator.mappingName)) {
                        if (moduleAccumulator != null && (debugImage2 = moduleAccumulator.toDebugImage()) != null) {
                            arrayList.add(debugImage2);
                        }
                        moduleAccumulator = new ModuleAccumulator(memoryMapping);
                    } else {
                        moduleAccumulator.extendTo(memoryMapping.getEndAddress());
                    }
                }
            }
        }
        if (moduleAccumulator != null && (debugImage = moduleAccumulator.toDebugImage()) != null) {
            arrayList.add(debugImage);
        }
        DebugMeta debugMeta = new DebugMeta();
        debugMeta.setImages(arrayList);
        return debugMeta;
    }

    private List<SentryException> createException(TombstoneProtos.Tombstone tombstone) {
        SentryException sentryException = new SentryException();
        if (tombstone.hasSignalInfo()) {
            TombstoneProtos.Signal signalInfo = tombstone.getSignalInfo();
            sentryException.setType(signalInfo.getName());
            sentryException.setValue(this.excTypeValueMap.get(signalInfo.getName()));
            sentryException.setMechanism(createMechanismFromSignalInfo(signalInfo));
        }
        sentryException.setThreadId(Long.valueOf(tombstone.getTid()));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sentryException);
        return arrayList;
    }

    private static Mechanism createMechanismFromSignalInfo(TombstoneProtos.Signal signal) {
        Mechanism mechanism = new Mechanism();
        mechanism.setType(NativeExceptionMechanism.TOMBSTONE.getValue());
        mechanism.setHandled(Boolean.FALSE);
        mechanism.setSynthetic(Boolean.TRUE);
        HashMap map = new HashMap();
        map.put("number", Integer.valueOf(signal.getNumber()));
        map.put("name", signal.getName());
        map.put("code", Integer.valueOf(signal.getCode()));
        map.put("code_name", signal.getCodeName());
        mechanism.setMeta(map);
        return mechanism;
    }

    private SentryStackTrace createStackTrace(TombstoneProtos.Thread thread) {
        ArrayList arrayList = new ArrayList();
        for (TombstoneProtos.BacktraceFrame backtraceFrame : thread.getCurrentBacktraceList()) {
            if (!backtraceFrame.getFileName().endsWith("libart.so") && (!backtraceFrame.getFileName().startsWith("<anonymous") || !backtraceFrame.getFunctionName().isEmpty())) {
                SentryStackFrame sentryStackFrame = new SentryStackFrame();
                sentryStackFrame.setPackage(backtraceFrame.getFileName());
                sentryStackFrame.setFunction(backtraceFrame.getFunctionName());
                sentryStackFrame.setInstructionAddr(formatHex(backtraceFrame.getPc()));
                String functionName = backtraceFrame.getFunctionName();
                Boolean boolIsInApp = functionName.isEmpty() ? Boolean.FALSE : SentryStackTraceFactory.isInApp(functionName, this.inAppIncludes, this.inAppExcludes);
                boolean z10 = true;
                boolean z11 = this.nativeLibraryDir != null && backtraceFrame.getFileName().startsWith(this.nativeLibraryDir);
                if ((boolIsInApp == null || !boolIsInApp.booleanValue()) && !z11) {
                    z10 = false;
                }
                sentryStackFrame.setInApp(Boolean.valueOf(z10));
                arrayList.add(0, sentryStackFrame);
            }
        }
        SentryStackTrace sentryStackTrace = new SentryStackTrace();
        sentryStackTrace.setFrames(arrayList);
        sentryStackTrace.setInstructionAddressAdjustment(SentryStackTrace.InstructionAddressAdjustment.NONE);
        HashMap map = new HashMap();
        for (TombstoneProtos.Register register : thread.getRegistersList()) {
            map.put(register.getName(), formatHex(register.getU64()));
        }
        sentryStackTrace.setRegisters(map);
        return sentryStackTrace;
    }

    private List<SentryThread> createThreads(TombstoneProtos.Tombstone tombstone, SentryException sentryException) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, TombstoneProtos.Thread>> it = tombstone.getThreadsMap().entrySet().iterator();
        while (it.hasNext()) {
            TombstoneProtos.Thread value = it.next().getValue();
            SentryThread sentryThread = new SentryThread();
            sentryThread.setId(Long.valueOf(r2.getKey().intValue()));
            sentryThread.setName(value.getName());
            SentryStackTrace sentryStackTraceCreateStackTrace = createStackTrace(value);
            sentryThread.setStacktrace(sentryStackTraceCreateStackTrace);
            if (tombstone.getTid() == value.getId()) {
                sentryThread.setCrashed(Boolean.TRUE);
                sentryException.setStacktrace(sentryStackTraceCreateStackTrace);
            }
            arrayList.add(sentryThread);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatHex(long j10) {
        return String.format("0x%x", Long.valueOf(j10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.tombstoneStream.close();
    }

    public SentryEvent parse() {
        TombstoneProtos.Tombstone from = TombstoneProtos.Tombstone.parseFrom(this.tombstoneStream);
        SentryEvent sentryEvent = new SentryEvent();
        sentryEvent.setLevel(SentryLevel.FATAL);
        sentryEvent.setPlatform(SentryStackFrame.JsonKeys.NATIVE);
        sentryEvent.setMessage(constructMessage(from));
        sentryEvent.setDebugMeta(createDebugMeta(from));
        sentryEvent.setExceptions(createException(from));
        List<SentryException> exceptions = sentryEvent.getExceptions();
        Objects.requireNonNull(exceptions);
        sentryEvent.setThreads(createThreads(from, exceptions.get(0)));
        return sentryEvent;
    }
}
