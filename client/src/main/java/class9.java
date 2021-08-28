public class class9 {
   final int field28;
   final int field29;
   final String field30;

   class9(int var1, int var2, String var3) {
      this.field29 = var1;
      this.field28 = var2;
      this.field30 = var3;
   }

   class9(Buffer var1) {
      this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringNullTerminated());
   }

   String method52() {
      return Integer.toHexString(this.field29) + Integer.toHexString(this.field28) + this.field30;
   }

   int method58() {
      return this.field28;
   }
}
