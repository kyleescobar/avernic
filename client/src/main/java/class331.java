import java.io.IOException;
import java.net.Socket;

public class class331 extends class330 {
   static class191 field3879;
   class332 field3878;
   class333 field3876;
   Socket field3877;

   public class331(Socket var1, int var2, int var3) throws IOException {
      this.field3877 = var1;
      this.field3877.setSoTimeout(30000);
      this.field3877.setTcpNoDelay(true);
      this.field3877.setReceiveBufferSize(65536);
      this.field3877.setSendBufferSize(65536);
      this.field3878 = new class332(this.field3877.getInputStream(), var2);
      this.field3876 = new class333(this.field3877.getOutputStream(), var3);
   }

   public static void method5302(class277 var0) {
      ParamComposition.field1698 = var0;
   }

   public boolean method5294(int var1) throws IOException {
      return this.field3878.method5305(var1);
   }

   public int available() throws IOException {
      return this.field3878.method5325();
   }

   public int readUnsignedByte() throws IOException {
      return this.field3878.method5303();
   }

   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.field3878.method5307(var1, var2, var3);
   }

   public void write(byte[] var1, int var2, int var3) throws IOException {
      this.field3876.method5344(var1, var2, var3);
   }

   public void method5279() {
      this.field3876.method5331();

      try {
         this.field3877.close();
      } catch (IOException var3) {
      }

      this.field3878.method5310();
   }

   protected void finalize() {
      this.method5279();
   }
}
