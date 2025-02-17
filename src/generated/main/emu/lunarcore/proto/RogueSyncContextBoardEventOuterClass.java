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

public final class RogueSyncContextBoardEventOuterClass {
  /**
   * Protobuf type {@code RogueSyncContextBoardEvent}
   */
  public static final class RogueSyncContextBoardEvent extends ProtoMessage<RogueSyncContextBoardEvent> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 board_event_id = 7;</code>
     */
    private int boardEventId;

    /**
     * <code>optional uint32 modifier_effect_type = 9;</code>
     */
    private int modifierEffectType;

    private RogueSyncContextBoardEvent() {
    }

    /**
     * @return a new empty instance of {@code RogueSyncContextBoardEvent}
     */
    public static RogueSyncContextBoardEvent newInstance() {
      return new RogueSyncContextBoardEvent();
    }

    /**
     * <code>optional uint32 board_event_id = 7;</code>
     * @return whether the boardEventId field is set
     */
    public boolean hasBoardEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 board_event_id = 7;</code>
     * @return this
     */
    public RogueSyncContextBoardEvent clearBoardEventId() {
      bitField0_ &= ~0x00000001;
      boardEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 board_event_id = 7;</code>
     * @return the boardEventId
     */
    public int getBoardEventId() {
      return boardEventId;
    }

    /**
     * <code>optional uint32 board_event_id = 7;</code>
     * @param value the boardEventId to set
     * @return this
     */
    public RogueSyncContextBoardEvent setBoardEventId(final int value) {
      bitField0_ |= 0x00000001;
      boardEventId = value;
      return this;
    }

    /**
     * <code>optional uint32 modifier_effect_type = 9;</code>
     * @return whether the modifierEffectType field is set
     */
    public boolean hasModifierEffectType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 modifier_effect_type = 9;</code>
     * @return this
     */
    public RogueSyncContextBoardEvent clearModifierEffectType() {
      bitField0_ &= ~0x00000002;
      modifierEffectType = 0;
      return this;
    }

    /**
     * <code>optional uint32 modifier_effect_type = 9;</code>
     * @return the modifierEffectType
     */
    public int getModifierEffectType() {
      return modifierEffectType;
    }

    /**
     * <code>optional uint32 modifier_effect_type = 9;</code>
     * @param value the modifierEffectType to set
     * @return this
     */
    public RogueSyncContextBoardEvent setModifierEffectType(final int value) {
      bitField0_ |= 0x00000002;
      modifierEffectType = value;
      return this;
    }

    @Override
    public RogueSyncContextBoardEvent copyFrom(final RogueSyncContextBoardEvent other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        boardEventId = other.boardEventId;
        modifierEffectType = other.modifierEffectType;
      }
      return this;
    }

    @Override
    public RogueSyncContextBoardEvent mergeFrom(final RogueSyncContextBoardEvent other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBoardEventId()) {
        setBoardEventId(other.boardEventId);
      }
      if (other.hasModifierEffectType()) {
        setModifierEffectType(other.modifierEffectType);
      }
      return this;
    }

    @Override
    public RogueSyncContextBoardEvent clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      boardEventId = 0;
      modifierEffectType = 0;
      return this;
    }

    @Override
    public RogueSyncContextBoardEvent clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueSyncContextBoardEvent)) {
        return false;
      }
      RogueSyncContextBoardEvent other = (RogueSyncContextBoardEvent) o;
      return bitField0_ == other.bitField0_
        && (!hasBoardEventId() || boardEventId == other.boardEventId)
        && (!hasModifierEffectType() || modifierEffectType == other.modifierEffectType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(boardEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(modifierEffectType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(boardEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(modifierEffectType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueSyncContextBoardEvent mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // boardEventId
            boardEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // modifierEffectType
            modifierEffectType = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
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
        output.writeUInt32(FieldNames.boardEventId, boardEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.modifierEffectType, modifierEffectType);
      }
      output.endObject();
    }

    @Override
    public RogueSyncContextBoardEvent mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1130727537:
          case -1668848103: {
            if (input.isAtField(FieldNames.boardEventId)) {
              if (!input.trySkipNullValue()) {
                boardEventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1445000542:
          case -145180736: {
            if (input.isAtField(FieldNames.modifierEffectType)) {
              if (!input.trySkipNullValue()) {
                modifierEffectType = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public RogueSyncContextBoardEvent clone() {
      return new RogueSyncContextBoardEvent().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueSyncContextBoardEvent parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueSyncContextBoardEvent(), data).checkInitialized();
    }

    public static RogueSyncContextBoardEvent parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueSyncContextBoardEvent(), input).checkInitialized();
    }

    public static RogueSyncContextBoardEvent parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueSyncContextBoardEvent(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueSyncContextBoardEvent messages
     */
    public static MessageFactory<RogueSyncContextBoardEvent> getFactory() {
      return RogueSyncContextBoardEventFactory.INSTANCE;
    }

    private enum RogueSyncContextBoardEventFactory implements MessageFactory<RogueSyncContextBoardEvent> {
      INSTANCE;

      @Override
      public RogueSyncContextBoardEvent create() {
        return RogueSyncContextBoardEvent.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName boardEventId = FieldName.forField("boardEventId", "board_event_id");

      static final FieldName modifierEffectType = FieldName.forField("modifierEffectType", "modifier_effect_type");
    }
  }
}
