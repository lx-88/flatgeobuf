package flatgeobuf.generated;
// automatically generated by the FlatBuffers compiler, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Feature extends Table {
  public static Feature getRootAsFeature(ByteBuffer _bb) { return getRootAsFeature(_bb, new Feature()); }
  public static Feature getRootAsFeature(ByteBuffer _bb, Feature obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Feature __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long fid() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public long ends(int j) { int o = __offset(6); return o != 0 ? (long)bb.getInt(__vector(o) + j * 4) & 0xFFFFFFFFL : 0; }
  public int endsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer endsAsByteBuffer() { return __vector_as_bytebuffer(6, 4); }
  public ByteBuffer endsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 4); }
  public long endss(int j) { int o = __offset(8); return o != 0 ? (long)bb.getInt(__vector(o) + j * 4) & 0xFFFFFFFFL : 0; }
  public int endssLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer endssAsByteBuffer() { return __vector_as_bytebuffer(8, 4); }
  public ByteBuffer endssInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 4); }
  public double coords(int j) { int o = __offset(10); return o != 0 ? bb.getDouble(__vector(o) + j * 8) : 0; }
  public int coordsLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer coordsAsByteBuffer() { return __vector_as_bytebuffer(10, 8); }
  public ByteBuffer coordsInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 8); }
  public int properties(int j) { int o = __offset(12); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int propertiesLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer propertiesAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public ByteBuffer propertiesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 12, 1); }

  public static int createFeature(FlatBufferBuilder builder,
      long fid,
      int endsOffset,
      int endssOffset,
      int coordsOffset,
      int propertiesOffset) {
    builder.startObject(5);
    Feature.addFid(builder, fid);
    Feature.addProperties(builder, propertiesOffset);
    Feature.addCoords(builder, coordsOffset);
    Feature.addEndss(builder, endssOffset);
    Feature.addEnds(builder, endsOffset);
    return Feature.endFeature(builder);
  }

  public static void startFeature(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addFid(FlatBufferBuilder builder, long fid) { builder.addLong(0, fid, 0L); }
  public static void addEnds(FlatBufferBuilder builder, int endsOffset) { builder.addOffset(1, endsOffset, 0); }
  public static int createEndsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startEndsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addEndss(FlatBufferBuilder builder, int endssOffset) { builder.addOffset(2, endssOffset, 0); }
  public static int createEndssVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addInt(data[i]); return builder.endVector(); }
  public static void startEndssVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addCoords(FlatBufferBuilder builder, int coordsOffset) { builder.addOffset(3, coordsOffset, 0); }
  public static int createCoordsVector(FlatBufferBuilder builder, double[] data) { builder.startVector(8, data.length, 8); for (int i = data.length - 1; i >= 0; i--) builder.addDouble(data[i]); return builder.endVector(); }
  public static void startCoordsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(8, numElems, 8); }
  public static void addProperties(FlatBufferBuilder builder, int propertiesOffset) { builder.addOffset(4, propertiesOffset, 0); }
  public static int createPropertiesVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startPropertiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endFeature(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishFeatureBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedFeatureBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }
}

