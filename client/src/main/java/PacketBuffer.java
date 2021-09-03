public class PacketBuffer extends Buffer {
   static final int[] field4178 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   IsaacCipher isaacCipher;
   int field4179;

   public PacketBuffer(int var1) {
      super(var1);
   }

   public void newIsaacCipher(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   public void method5886(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   public void method5887(int var1) {
      super.payload[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
   }

   public static ParamComposition method5928(int var0) {
      ParamComposition var2 = (ParamComposition) ParamComposition.field1697.method3880((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = ParamComposition.field1698.method4412(11, var0);
         var2 = new ParamComposition();
         if (var3 != null) {
            var2.method2545(new Buffer(var3));
         }

         var2.method2547();
         ParamComposition.field1697.method3882(var2, (long)var0);
         return var2;
      }
   }

   public int readByteIsaac() {
      return super.payload[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
   }

   public boolean method5889() {
      int var2 = super.payload[super.offset] - this.isaacCipher.method6499() & 255;
      return var2 >= 128;
   }

   public int readSmartByteShortIsaac() {
      int var2 = super.payload[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.payload[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
   }

   public void method5891(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.payload[++super.offset - 1] - this.isaacCipher.nextInt());
      }

   }

   public void switchToBitAccess() {
      this.field4179 = super.offset * 8;
   }

   public int readBits(int var1) {
      int var3 = this.field4179 >> 3;
      int var4 = 8 - (this.field4179 & 7);
      int var5 = 0;

      for(this.field4179 += var1; var1 > var4; var4 = 8) {
         var5 += (super.payload[var3++] & field4178[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.payload[var3] & field4178[var4];
      } else {
         var5 += super.payload[var3] >> var4 - var1 & field4178[var1];
      }

      return var5;
   }

   public void switchToByteMode() {
      super.offset = (this.field4179 + 7) / 8;
   }

   public int readableBytes(int var1) {
      return var1 * 8 - this.field4179;
   }
}
