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

public final class ChessRogueCellInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueCellInfo}
   */
  public static final class ChessRogueCellInfo extends ProtoMessage<ChessRogueCellInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  61
     * </pre>
     *
     * <code>optional uint32 BIEJGDGAOBL = 1;</code>
     */
    private int bIEJGDGAOBL;

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     */
    private final RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> query = RepeatedMessage.newEmptyInstance(ChessRogueCellOuterClass.ChessRogueCell.getFactory());

    private ChessRogueCellInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueCellInfo}
     */
    public static ChessRogueCellInfo newInstance() {
      return new ChessRogueCellInfo();
    }

    /**
     * <pre>
     *  61
     * </pre>
     *
     * <code>optional uint32 BIEJGDGAOBL = 1;</code>
     * @return whether the bIEJGDGAOBL field is set
     */
    public boolean hasBIEJGDGAOBL() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  61
     * </pre>
     *
     * <code>optional uint32 BIEJGDGAOBL = 1;</code>
     * @return this
     */
    public ChessRogueCellInfo clearBIEJGDGAOBL() {
      bitField0_ &= ~0x00000001;
      bIEJGDGAOBL = 0;
      return this;
    }

    /**
     * <pre>
     *  61
     * </pre>
     *
     * <code>optional uint32 BIEJGDGAOBL = 1;</code>
     * @return the bIEJGDGAOBL
     */
    public int getBIEJGDGAOBL() {
      return bIEJGDGAOBL;
    }

    /**
     * <pre>
     *  61
     * </pre>
     *
     * <code>optional uint32 BIEJGDGAOBL = 1;</code>
     * @param value the bIEJGDGAOBL to set
     * @return this
     */
    public ChessRogueCellInfo setBIEJGDGAOBL(final int value) {
      bitField0_ |= 0x00000001;
      bIEJGDGAOBL = value;
      return this;
    }

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     * @return whether the query field is set
     */
    public boolean hasQuery() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     * @return this
     */
    public ChessRogueCellInfo clearQuery() {
      bitField0_ &= ~0x00000002;
      query.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableQuery()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> getQuery() {
      return query;
    }

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueCellOuterClass.ChessRogueCell> getMutableQuery() {
      bitField0_ |= 0x00000002;
      return query;
    }

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     * @param value the query to add
     * @return this
     */
    public ChessRogueCellInfo addQuery(final ChessRogueCellOuterClass.ChessRogueCell value) {
      bitField0_ |= 0x00000002;
      query.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueCell query = 7;</code>
     * @param values the query to add
     * @return this
     */
    public ChessRogueCellInfo addAllQuery(final ChessRogueCellOuterClass.ChessRogueCell... values) {
      bitField0_ |= 0x00000002;
      query.addAll(values);
      return this;
    }

    @Override
    public ChessRogueCellInfo copyFrom(final ChessRogueCellInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        bIEJGDGAOBL = other.bIEJGDGAOBL;
        query.copyFrom(other.query);
      }
      return this;
    }

    @Override
    public ChessRogueCellInfo mergeFrom(final ChessRogueCellInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBIEJGDGAOBL()) {
        setBIEJGDGAOBL(other.bIEJGDGAOBL);
      }
      if (other.hasQuery()) {
        getMutableQuery().addAll(other.query);
      }
      return this;
    }

    @Override
    public ChessRogueCellInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      bIEJGDGAOBL = 0;
      query.clear();
      return this;
    }

    @Override
    public ChessRogueCellInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      query.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueCellInfo)) {
        return false;
      }
      ChessRogueCellInfo other = (ChessRogueCellInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBIEJGDGAOBL() || bIEJGDGAOBL == other.bIEJGDGAOBL)
        && (!hasQuery() || query.equals(other.query));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(bIEJGDGAOBL);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < query.length(); i++) {
          output.writeRawByte((byte) 58);
          output.writeMessageNoTag(query.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bIEJGDGAOBL);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * query.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(query);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueCellInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // bIEJGDGAOBL
            bIEJGDGAOBL = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // query
            tag = input.readRepeatedMessage(query, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.bIEJGDGAOBL, bIEJGDGAOBL);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.query, query);
      }
      output.endObject();
    }

    @Override
    public ChessRogueCellInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 760968790: {
            if (input.isAtField(FieldNames.bIEJGDGAOBL)) {
              if (!input.trySkipNullValue()) {
                bIEJGDGAOBL = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 107944136: {
            if (input.isAtField(FieldNames.query)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(query);
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
    public ChessRogueCellInfo clone() {
      return new ChessRogueCellInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueCellInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueCellInfo(), data).checkInitialized();
    }

    public static ChessRogueCellInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueCellInfo(), input).checkInitialized();
    }

    public static ChessRogueCellInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueCellInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueCellInfo messages
     */
    public static MessageFactory<ChessRogueCellInfo> getFactory() {
      return ChessRogueCellInfoFactory.INSTANCE;
    }

    private enum ChessRogueCellInfoFactory implements MessageFactory<ChessRogueCellInfo> {
      INSTANCE;

      @Override
      public ChessRogueCellInfo create() {
        return ChessRogueCellInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName bIEJGDGAOBL = FieldName.forField("BIEJGDGAOBL");

      static final FieldName query = FieldName.forField("query");
    }
  }
}
