import java.util.zip.Inflater;

public class class403 {
   Inflater field4302;

   public class403() {
      this(-1, 1000000);
   }

   class403(int var1, int var2) {
   }

   public void method6512(Buffer var1, byte[] var2) {
      if (31 == var1.payload[var1.offset] && var1.payload[1 + var1.offset] == -117) {
         if (this.field4302 == null) {
            this.field4302 = new Inflater(true);
         }

         try {
            this.field4302.setInput(var1.payload, 10 + var1.offset, var1.payload.length - (var1.offset + 10 + 8));
            this.field4302.inflate(var2);
         } catch (Exception var5) {
            this.field4302.reset();
            throw new RuntimeException("");
         }

         this.field4302.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
