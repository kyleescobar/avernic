import java.nio.ByteBuffer;

public class class255 extends class253 {
   static String[] field3127;
   ByteBuffer field3126;

   byte[] method4314() {
      byte[] var2 = new byte[this.field3126.capacity()];
      this.field3126.position(0);
      this.field3126.get(var2);
      return var2;
   }

   public void method4303(byte[] var1) {
      this.field3126 = ByteBuffer.allocateDirect(var1.length);
      this.field3126.position(0);
      this.field3126.put(var1);
   }
}
