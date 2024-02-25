// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueAreaInfoOuterClass {
  /**
   * Protobuf type {@code RogueAreaInfo}
   */
  public static final class RogueAreaInfo extends ProtoMessage<RogueAreaInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     */
    private final RepeatedMessage<RogueAreaOuterClass.RogueArea> rogueArea = RepeatedMessage.newEmptyInstance(RogueAreaOuterClass.RogueArea.getFactory());

    private RogueAreaInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueAreaInfo}
     */
    public static RogueAreaInfo newInstance() {
      return new RogueAreaInfo();
    }

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     * @return whether the rogueArea field is set
     */
    public boolean hasRogueArea() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     * @return this
     */
    public RogueAreaInfo clearRogueArea() {
      bitField0_ &= ~0x00000001;
      rogueArea.clear();
      return this;
    }

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueArea()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueAreaOuterClass.RogueArea> getRogueArea() {
      return rogueArea;
    }

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueAreaOuterClass.RogueArea> getMutableRogueArea() {
      bitField0_ |= 0x00000001;
      return rogueArea;
    }

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     * @param value the rogueArea to add
     * @return this
     */
    public RogueAreaInfo addRogueArea(final RogueAreaOuterClass.RogueArea value) {
      bitField0_ |= 0x00000001;
      rogueArea.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueArea rogue_area = 7;</code>
     * @param values the rogueArea to add
     * @return this
     */
    public RogueAreaInfo addAllRogueArea(final RogueAreaOuterClass.RogueArea... values) {
      bitField0_ |= 0x00000001;
      rogueArea.addAll(values);
      return this;
    }

    @Override
    public RogueAreaInfo copyFrom(final RogueAreaInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueArea.copyFrom(other.rogueArea);
      }
      return this;
    }

    @Override
    public RogueAreaInfo mergeFrom(final RogueAreaInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueArea()) {
        getMutableRogueArea().addAll(other.rogueArea);
      }
      return this;
    }

    @Override
    public RogueAreaInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueArea.clear();
      return this;
    }

    @Override
    public RogueAreaInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueArea.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueAreaInfo)) {
        return false;
      }
      RogueAreaInfo other = (RogueAreaInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueArea() || rogueArea.equals(other.rogueArea));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < rogueArea.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(rogueArea.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * rogueArea.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(rogueArea);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueAreaInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 58: {
            // rogueArea
            tag = input.readRepeatedMessage(rogueArea, tag);
            bitField0_ |= 0x00000001;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedMessage(FieldNames.rogueArea, rogueArea);
      }
      output.endObject();
    }

    @Override
    public RogueAreaInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 655574407:
          case -1124817966: {
            if (input.isAtField(FieldNames.rogueArea)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(rogueArea);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueAreaInfo clone() {
      return new RogueAreaInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueAreaInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueAreaInfo(), data).checkInitialized();
    }

    public static RogueAreaInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueAreaInfo(), input).checkInitialized();
    }

    public static RogueAreaInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueAreaInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueAreaInfo messages
     */
    public static MessageFactory<RogueAreaInfo> getFactory() {
      return RogueAreaInfoFactory.INSTANCE;
    }

    private enum RogueAreaInfoFactory implements MessageFactory<RogueAreaInfo> {
      INSTANCE;

      @Override
      public RogueAreaInfo create() {
        return RogueAreaInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueArea = FieldName.forField("rogueArea", "rogue_area");
    }
  }
}
